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
public class ActivityEdgeItemSemanticEditPolicy extends ActivitystormingBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ActivityEdgeItemSemanticEditPolicy() {
		super(ActivitystormingElementTypes.ActivityEdge_4005);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
