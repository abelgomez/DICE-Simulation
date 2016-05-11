/**
 */
package es.unizar.disco.simulation.models.toolresult;

import es.unizar.disco.simulation.models.datatypes.Unit;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analyzable Element Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.simulation.models.toolresult.AnalyzableElementInfo#getValue <em>Value</em>}</li>
 *   <li>{@link es.unizar.disco.simulation.models.toolresult.AnalyzableElementInfo#getAnalyzedElement <em>Analyzed Element</em>}</li>
 *   <li>{@link es.unizar.disco.simulation.models.toolresult.AnalyzableElementInfo#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see es.unizar.disco.simulation.models.toolresult.ToolresultPackage#getAnalyzableElementInfo()
 * @model abstract="true"
 * @generated
 */
public interface AnalyzableElementInfo extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Number)
	 * @see es.unizar.disco.simulation.models.toolresult.ToolresultPackage#getAnalyzableElementInfo_Value()
	 * @model dataType="es.unizar.disco.simulation.models.datatypes.Number" required="true" derived="true"
	 * @generated
	 */
	Number getValue();

	/**
	 * Sets the value of the '{@link es.unizar.disco.simulation.models.toolresult.AnalyzableElementInfo#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Number value);

	/**
	 * Returns the value of the '<em><b>Analyzed Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Analyzed Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Analyzed Element</em>' reference.
	 * @see #setAnalyzedElement(EObject)
	 * @see es.unizar.disco.simulation.models.toolresult.ToolresultPackage#getAnalyzableElementInfo_AnalyzedElement()
	 * @model required="true"
	 * @generated
	 */
	EObject getAnalyzedElement();

	/**
	 * Sets the value of the '{@link es.unizar.disco.simulation.models.toolresult.AnalyzableElementInfo#getAnalyzedElement <em>Analyzed Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Analyzed Element</em>' reference.
	 * @see #getAnalyzedElement()
	 * @generated
	 */
	void setAnalyzedElement(EObject value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link es.unizar.disco.simulation.models.datatypes.Unit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see es.unizar.disco.simulation.models.datatypes.Unit
	 * @see #setUnit(Unit)
	 * @see es.unizar.disco.simulation.models.toolresult.ToolresultPackage#getAnalyzableElementInfo_Unit()
	 * @model required="true"
	 * @generated
	 */
	Unit getUnit();

	/**
	 * Sets the value of the '{@link es.unizar.disco.simulation.models.toolresult.AnalyzableElementInfo#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see es.unizar.disco.simulation.models.datatypes.Unit
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(Unit value);

} // AnalyzableElementInfo
