/**
 * This file is (c) Copyright 2011 by Madhumita DHAR, Institut TELECOM
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 *
 * This program has been developed in the frame of the COCLICO
 * project with financial support of its funders.
 *
 */

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