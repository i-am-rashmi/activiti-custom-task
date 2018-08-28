package org.activiti.engine.impl.bpmn.behavior;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.Expression;

public class CustomAddActivityBehaviour extends AbstractBpmnActivityBehavior
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected Expression fieldOne;
	protected Expression fieldTwo;
	
	@Override
	public void execute(DelegateExecution execution) {
		
		String fieldOneStr =  getStringFromField(fieldOne, execution);
		String fieldTwoStr =  getStringFromField(fieldTwo, execution);
		Integer numOne = Integer.parseInt(fieldOneStr);
		Integer numTwo = Integer.parseInt(fieldTwoStr);
		Integer sum = numOne + numTwo;
		System.out.println("sum:"+sum);

		leave(execution);
		
		
	}
	
	  protected String getStringFromField(Expression expression, DelegateExecution execution) {
		    if (expression != null) {
		      Object value = expression.getValue(execution);
		      if (value != null) {
		        return value.toString();
		      }
		    }
		    return null;
		  }

}
