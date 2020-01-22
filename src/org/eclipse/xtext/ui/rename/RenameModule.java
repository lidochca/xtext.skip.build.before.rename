package org.eclipse.xtext.ui.rename;

import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.service.AbstractGenericModule;
import org.eclipse.xtext.ui.DefaultUiModule;
import org.eclipse.xtext.ui.refactoring.ui.SyncUtil;
//import org.eclipselabs.spray.runtime.xtext.ui.ToBeBuiltComputer;
//import org.eclipselabs.spray.runtime.xtext.ui.builder.JdtToBeBuiltComputerExt;

import com.google.inject.AbstractModule;
import com.google.inject.Binder;
import com.google.inject.Module;

//import com.google.inject.Binder;
//import com.google.inject.Module;

public class RenameModule extends DefaultUiModule {// DefaultUiModule {

	 //extends AbstractGenericModule { //DefaultUiModule { //AbstractGenericModule { //DefaultUiModule {

	
	public RenameModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
//	
//	@SuppressWarnings("restriction")
//	@Override
//	public void configure(Binder binder) {
//		 super.configure(binder);
////		 binder.bind(AbstractUIPlugin.class).toInstance(plugin);
////		 binder.bind(IDialogSettings.class).toInstance(plugin.getDialogSettings());
//	     binder.bind(SyncUtil.class).to(renameSyncUtil.class);
//	    
//	}
//	@Override
//	public void configure(Binder binder) {
//		super.configure(binder);
////		binder.bind(AbstractUIPlugin.class).toInstance(plugin);
////		binder.bind(IDialogSettings.class).toInstance(plugin.getDialogSettings());
//		binder.bind(SyncUtil.class).to(this.bindIClass());
//	}

//	@Override
//	protected void configure() {
//		 bind(SyncUtil.class).to(renameSyncUtil.class);
//	}

	// contributed by org.eclipse.xtext.ui.generator.compare.CompareFragment
//	public Class<? extends SyncUtil> bindIViewerCreator() {
//			return org.eclipse.xtext.ui.compare.DefaultViewerCreator.class;
//	}
		
//	@SuppressWarnings("restriction")
//	public Class<? extends SyncUtil> waitForBuild() {
//		System.out.println("rename waitForBuild");
//		return renameSyncUtil.class;
//	}
	
//	@Override
//	public void configure(Binder binder) {
//		Module compound = getBindings();
//		compound.configure(binder);
//	}
	
//	@Override
//    protected void configure() {
//        bind(SyncUtil.class).to(renameSyncUtil.class);
//    }
}
