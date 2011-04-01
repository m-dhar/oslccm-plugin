package jenkins.plugins.oslccm;

import hudson.model.Action;
import hudson.model.AbstractProject;

public class OslccmProjectAction implements Action {
	private AbstractProject<?, ?> project;

	public OslccmProjectAction(AbstractProject<?, ?> project) {
		this.project = project;
	}

        public String getDisplayName() {
            return "Delegated Bug Report";
        }

        public String getIconFileName() {
            return null;
        }

        public String getUrlName() {
            return null;
    }
}