package org.eclipse.xtext.ui.rename;

import org.eclipse.core.runtime.preferences.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.service.AbstractGenericModule;
import org.eclipse.xtext.ui.refactoring.ui.SyncUtil;

import com.google.inject.Binder;
import com.google.inject.Inject;
import com.google.inject.Module; //recomended
import com.google.inject.Scope;

public class MyModule extends AbstractGenericModule {

//	@SuppressWarnings("restriction")
//	@Inject(optional = true)
//	private SyncUtil syncUtil;
	
//	@SuppressWarnings("restriction")
	@SuppressWarnings("restriction")
	@Override
	public void configure(Binder binder) {
		System.out.println("My configure "+ binder);
		binder.bind(SyncUtil.class).to(MySyncUtil.class);
	}

//	@SuppressWarnings("restriction")
//	public void configureIBuilderState(Binder binder) {
//		System.out.println("My configureIBuilderState " + binder);
//		binder.bind(SyncUtil.class).to(UpdatedSyncUtil.class);
//	}

}