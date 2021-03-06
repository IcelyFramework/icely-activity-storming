/*
* 
*/
package com.github.icelyframework.activitystorming.diagram.edit.policies;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.commands.DeferredLayoutCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.SetViewMutabilityCommand;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

import com.github.icelyframework.activitystorming.ActivitystormingPackage;
import com.github.icelyframework.activitystorming.diagram.edit.parts.Aggregate2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.CommandAction2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ConstraintPin3EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ControlNode2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.DecisionNode2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.DomainEvent2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.DomainObject3EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.Entity3EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ExternalSystem2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.FinalNode2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ForkNode2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.InitialNode2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.JoinNode2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.MergeNode2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.QueryAction2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ReadModel2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ValueObject3EditPart;
import com.github.icelyframework.activitystorming.diagram.part.ActivitystormingDiagramUpdater;
import com.github.icelyframework.activitystorming.diagram.part.ActivitystormingNodeDescriptor;
import com.github.icelyframework.activitystorming.diagram.part.ActivitystormingVisualIDRegistry;

/**
 * @generated
 */
public class ActorActorActivitynodeCompartmentCanonicalEditPolicy extends CanonicalEditPolicy {

	/**
	* @generated
	*/
	protected void refreshOnActivate() {
		// Need to activate editpart children before invoking the canonical refresh for EditParts to add event listeners
		List<?> c = getHost().getChildren();
		for (int i = 0; i < c.size(); i++) {
			((EditPart) c.get(i)).activate();
		}
		super.refreshOnActivate();
	}

	/**
	* @generated
	*/
	protected EStructuralFeature getFeatureToSynchronize() {
		return ActivitystormingPackage.eINSTANCE.getActivityPartition_Activitynode();
	}

	/**
	* @generated
	*/
	@SuppressWarnings("rawtypes")

	protected List getSemanticChildrenList() {
		View viewObject = (View) getHost().getModel();
		LinkedList<EObject> result = new LinkedList<EObject>();
		List<ActivitystormingNodeDescriptor> childDescriptors = ActivitystormingDiagramUpdater
				.getActorActorActivitynodeCompartment_7002SemanticChildren(viewObject);
		for (ActivitystormingNodeDescriptor d : childDescriptors) {
			result.add(d.getModelElement());
		}
		return result;
	}

	/**
	* @generated
	*/
	protected boolean isOrphaned(Collection<EObject> semanticChildren, final View view) {
		return isMyDiagramElement(view) && !semanticChildren.contains(view.getElement());
	}

	/**
	* @generated
	*/
	private boolean isMyDiagramElement(View view) {
		int visualID = ActivitystormingVisualIDRegistry.getVisualID(view);
		switch (visualID) {
		case CommandAction2EditPart.VISUAL_ID:
		case Aggregate2EditPart.VISUAL_ID:
		case QueryAction2EditPart.VISUAL_ID:
		case ValueObject3EditPart.VISUAL_ID:
		case Entity3EditPart.VISUAL_ID:
		case ExternalSystem2EditPart.VISUAL_ID:
		case ConstraintPin3EditPart.VISUAL_ID:
		case InitialNode2EditPart.VISUAL_ID:
		case ForkNode2EditPart.VISUAL_ID:
		case JoinNode2EditPart.VISUAL_ID:
		case DecisionNode2EditPart.VISUAL_ID:
		case MergeNode2EditPart.VISUAL_ID:
		case FinalNode2EditPart.VISUAL_ID:
		case DomainObject3EditPart.VISUAL_ID:
		case ReadModel2EditPart.VISUAL_ID:
		case DomainEvent2EditPart.VISUAL_ID:
		case ControlNode2EditPart.VISUAL_ID:
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected void refreshSemantic() {
		if (resolveSemanticElement() == null) {
			return;
		}
		LinkedList<IAdaptable> createdViews = new LinkedList<IAdaptable>();
		List<ActivitystormingNodeDescriptor> childDescriptors = ActivitystormingDiagramUpdater
				.getActorActorActivitynodeCompartment_7002SemanticChildren((View) getHost().getModel());
		LinkedList<View> orphaned = new LinkedList<View>();
		// we care to check only views we recognize as ours
		LinkedList<View> knownViewChildren = new LinkedList<View>();
		for (View v : getViewChildren()) {
			if (isMyDiagramElement(v)) {
				knownViewChildren.add(v);
			}
		}
		// alternative to #cleanCanonicalSemanticChildren(getViewChildren(), semanticChildren)
		//
		// iteration happens over list of desired semantic elements, trying to find best matching View, while original CEP
		// iterates views, potentially losing view (size/bounds) information - i.e. if there are few views to reference same EObject, only last one 
		// to answer isOrphaned == true will be used for the domain element representation, see #cleanCanonicalSemanticChildren()
		for (Iterator<ActivitystormingNodeDescriptor> descriptorsIterator = childDescriptors
				.iterator(); descriptorsIterator.hasNext();) {
			ActivitystormingNodeDescriptor next = descriptorsIterator.next();
			String hint = ActivitystormingVisualIDRegistry.getType(next.getVisualID());
			LinkedList<View> perfectMatch = new LinkedList<View>(); // both semanticElement and hint match that of NodeDescriptor
			for (View childView : getViewChildren()) {
				EObject semanticElement = childView.getElement();
				if (next.getModelElement().equals(semanticElement)) {
					if (hint.equals(childView.getType())) {
						perfectMatch.add(childView);
						// actually, can stop iteration over view children here, but
						// may want to use not the first view but last one as a 'real' match (the way original CEP does
						// with its trick with viewToSemanticMap inside #cleanCanonicalSemanticChildren
					}
				}
			}
			if (perfectMatch.size() > 0) {
				descriptorsIterator.remove(); // precise match found no need to create anything for the NodeDescriptor
				// use only one view (first or last?), keep rest as orphaned for further consideration
				knownViewChildren.remove(perfectMatch.getFirst());
			}
		}
		// those left in knownViewChildren are subject to removal - they are our diagram elements we didn't find match to,
		// or those we have potential matches to, and thus need to be recreated, preserving size/location information.
		orphaned.addAll(knownViewChildren);
		//
		ArrayList<CreateViewRequest.ViewDescriptor> viewDescriptors = new ArrayList<CreateViewRequest.ViewDescriptor>(
				childDescriptors.size());
		for (ActivitystormingNodeDescriptor next : childDescriptors) {
			String hint = ActivitystormingVisualIDRegistry.getType(next.getVisualID());
			IAdaptable elementAdapter = new CanonicalElementAdapter(next.getModelElement(), hint);
			CreateViewRequest.ViewDescriptor descriptor = new CreateViewRequest.ViewDescriptor(elementAdapter,
					Node.class, hint, ViewUtil.APPEND, false, host().getDiagramPreferencesHint());
			viewDescriptors.add(descriptor);
		}

		boolean changed = deleteViews(orphaned.iterator());
		//
		CreateViewRequest request = getCreateViewRequest(viewDescriptors);
		Command cmd = getCreateViewCommand(request);
		if (cmd != null && cmd.canExecute()) {
			SetViewMutabilityCommand.makeMutable(new EObjectAdapter(host().getNotationView())).execute();
			executeCommand(cmd);
			@SuppressWarnings("unchecked")

			List<IAdaptable> nl = (List<IAdaptable>) request.getNewObject();
			createdViews.addAll(nl);
		}
		if (changed || createdViews.size() > 0) {
			postProcessRefreshSemantic(createdViews);
		}
		if (createdViews.size() > 1) {
			// perform a layout of the container
			DeferredLayoutCommand layoutCmd = new DeferredLayoutCommand(host().getEditingDomain(), createdViews,
					host());
			executeCommand(new ICommandProxy(layoutCmd));
		}

		makeViewsImmutable(createdViews);
	}
}
