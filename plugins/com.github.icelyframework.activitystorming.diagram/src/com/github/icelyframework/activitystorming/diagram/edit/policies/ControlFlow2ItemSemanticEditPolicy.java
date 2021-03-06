/*
* 
*/
package com.github.icelyframework.activitystorming.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import com.github.icelyframework.activitystorming.diagram.providers.ActivitystormingElementTypes;

/**
 * @generated
 */
public class ControlFlow2ItemSemanticEditPolicy extends ActivitystormingBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ControlFlow2ItemSemanticEditPolicy() {
		super(ActivitystormingElementTypes.ControlFlow_4004);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
