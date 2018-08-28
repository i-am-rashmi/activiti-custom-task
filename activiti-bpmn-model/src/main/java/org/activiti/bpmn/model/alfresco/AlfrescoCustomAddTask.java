package org.activiti.bpmn.model.alfresco;

import org.activiti.bpmn.model.ServiceTask;

public class AlfrescoCustomAddTask extends ServiceTask {

	  public AlfrescoCustomAddTask clone() {
		AlfrescoCustomAddTask clone = new AlfrescoCustomAddTask();
	    clone.setValues(this);
	    return clone;
	  }
	  
	  public void setValues(AlfrescoCustomAddTask otherElement) {
		    super.setValues(otherElement);
		  } 

}
