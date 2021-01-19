/**
 */
package fsmTrace.States.fsm;

import fsmTrace.States.SpecificDimension;

import org.eclipse.emf.common.util.EList;

import org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.fsm.State;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fsmTrace.States.fsm.TracedState#getOriginalObject <em>Original Object</em>}</li>
 * </ul>
 *
 * @see fsmTrace.States.fsm.FsmPackage#getTracedState()
 * @model
 * @generated
 */
public interface TracedState extends TracedNamedElement {
	/**
	 * Returns the value of the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Object</em>' reference.
	 * @see #setOriginalObject(State)
	 * @see fsmTrace.States.fsm.FsmPackage#getTracedState_OriginalObject()
	 * @model
	 * @generated
	 */
	State getOriginalObject();

	/**
	 * Sets the value of the '{@link fsmTrace.States.fsm.TracedState#getOriginalObject <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Object</em>' reference.
	 * @see #getOriginalObject()
	 * @generated
	 */
	void setOriginalObject(State value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<SpecificDimension<?>> getDimensionsInternal();

} // TracedState
