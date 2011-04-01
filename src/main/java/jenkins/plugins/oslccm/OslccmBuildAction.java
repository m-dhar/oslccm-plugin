package jenkins.plugins.oslccm;

import java.io.IOException;

import hudson.model.Action;
import hudson.model.AbstractBuild;

import org.kohsuke.stapler.StaplerRequest;
import org.kohsuke.stapler.StaplerResponse;

public class OslccmBuildAction implements Action {

	private AbstractBuild<?, ?> build;
	
	public OslccmBuildAction(AbstractBuild<?, ?> build) {
		this.build = build;
		
	}

	public AbstractBuild<?, ?> getBuild() {
		return build;
	}

	public void doDynamic(StaplerRequest req, StaplerResponse res)
			throws IOException {
		res.sendRedirect2("DelegatedBugReport");
		return;
		
	}

	public String getIconFileName() {
		return "document.gif";
	}

	public String getDisplayName() {
		
		return "Delegated OSLC Bug Report";
	}

	public String getUrlName() {
		return "OSLC-CM";
	}
	
	
}