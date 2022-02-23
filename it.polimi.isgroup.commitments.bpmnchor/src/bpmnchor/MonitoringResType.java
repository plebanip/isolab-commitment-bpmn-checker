/**
 */
package bpmnchor;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Monitoring Res Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see bpmnchor.BpmnchorPackage#getMonitoringResType()
 * @model
 * @generated
 */
public enum MonitoringResType implements Enumerator {
	/**
	 * The '<em><b>Smart Object</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMART_OBJECT_VALUE
	 * @generated
	 * @ordered
	 */
	SMART_OBJECT(0, "SmartObject", "SmartObject"),

	/**
	 * The '<em><b>API</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #API_VALUE
	 * @generated
	 * @ordered
	 */
	API(1, "API", "API");

	/**
	 * The '<em><b>Smart Object</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Smart Object</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SMART_OBJECT
	 * @model name="SmartObject"
	 * @generated
	 * @ordered
	 */
	public static final int SMART_OBJECT_VALUE = 0;

	/**
	 * The '<em><b>API</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>API</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #API
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int API_VALUE = 1;

	/**
	 * An array of all the '<em><b>Monitoring Res Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MonitoringResType[] VALUES_ARRAY =
		new MonitoringResType[] {
			SMART_OBJECT,
			API,
		};

	/**
	 * A public read-only list of all the '<em><b>Monitoring Res Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MonitoringResType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Monitoring Res Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MonitoringResType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MonitoringResType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Monitoring Res Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MonitoringResType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MonitoringResType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Monitoring Res Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MonitoringResType get(int value) {
		switch (value) {
			case SMART_OBJECT_VALUE: return SMART_OBJECT;
			case API_VALUE: return API;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private MonitoringResType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //MonitoringResType
