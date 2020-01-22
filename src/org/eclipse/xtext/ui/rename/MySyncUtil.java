package org.eclipse.xtext.ui.rename;

import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.xtext.ui.refactoring.ui.SyncUtil;

import com.google.inject.Inject;

public class MySyncUtil extends SyncUtil {

	@Inject(optional = true)
	private IWorkspace workspace;
	
	private static final boolean SKIP_WAIT_FOR_BUILD = Boolean.getBoolean("my.xtext.skipWaitForBuild");
	
	
	@Override
	public void waitForBuild(IProgressMonitor monitor) {
		try {
			System.out.println("My waitForBuild ");
			if ( !SKIP_WAIT_FOR_BUILD) {
				workspace.build(IncrementalProjectBuilder.INCREMENTAL_BUILD, monitor);
			}
		} catch (CoreException e) {
			throw new OperationCanceledException(e.getMessage());
		}
	}
}
