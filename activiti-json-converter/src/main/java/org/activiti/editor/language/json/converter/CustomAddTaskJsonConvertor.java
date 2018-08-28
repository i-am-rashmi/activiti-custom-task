package org.activiti.editor.language.json.converter;

import java.util.Map;

import org.activiti.bpmn.model.BaseElement;
import org.activiti.bpmn.model.FlowElement;
import org.activiti.bpmn.model.ServiceTask;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class CustomAddTaskJsonConvertor extends BaseBpmnJsonConverter{


	  public static void fillTypes(Map<String, Class<? extends BaseBpmnJsonConverter>> convertersToBpmnMap, Map<Class<? extends BaseElement>, Class<? extends BaseBpmnJsonConverter>> convertersToJsonMap) {

	    fillJsonTypes(convertersToBpmnMap);
	    fillBpmnTypes(convertersToJsonMap);
	  }

	  public static void fillJsonTypes(Map<String, Class<? extends BaseBpmnJsonConverter>> convertersToBpmnMap) {
	    convertersToBpmnMap.put(STENCIL_TASK_CUSTOM_ADD, CustomAddTaskJsonConvertor.class);
	  }

	  public static void fillBpmnTypes(Map<Class<? extends BaseElement>, Class<? extends BaseBpmnJsonConverter>> convertersToJsonMap) {
	    // will be handled by ServiceTaskJsonConverter
	  }

	  protected String getStencilId(BaseElement baseElement) {
	    return STENCIL_TASK_CUSTOM_ADD;
	  }

	  protected void convertElementToJson(ObjectNode propertiesNode, BaseElement baseElement) {
	    // will be handled by ServiceTaskJsonConverter
	  }

	  protected FlowElement convertJsonToElement(JsonNode elementNode, JsonNode modelNode, Map<String, JsonNode> shapeMap) {
	    ServiceTask task = new ServiceTask();
	    task.setType(ServiceTask.CUSTOM_ADD_TASK);
	    addField(PROPERTY_ADDTASK_FIELD_ONE, elementNode, task);
	    addField(PROPERTY_ADDTASK_FIELD_TWO, elementNode, task);

	    return task;
	  }

}
