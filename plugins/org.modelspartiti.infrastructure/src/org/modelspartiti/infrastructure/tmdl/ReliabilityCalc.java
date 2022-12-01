/**
 */
package org.modelspartiti.infrastructure.tmdl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Reliability Calc</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getReliabilityCalc()
 * @model
 * @generated
 */
public enum ReliabilityCalc implements Enumerator {
	/**
	 * The '<em><b>Instant Of Time</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSTANT_OF_TIME_VALUE
	 * @generated
	 * @ordered
	 */
	INSTANT_OF_TIME(0, "instantOfTime", "instantOfTime");

	/**
	 * The '<em><b>Instant Of Time</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSTANT_OF_TIME
	 * @model name="instantOfTime"
	 * @generated
	 * @ordered
	 */
	public static final int INSTANT_OF_TIME_VALUE = 0;

	/**
	 * An array of all the '<em><b>Reliability Calc</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ReliabilityCalc[] VALUES_ARRAY =
		new ReliabilityCalc[] {
			INSTANT_OF_TIME,
		};

	/**
	 * A public read-only list of all the '<em><b>Reliability Calc</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ReliabilityCalc> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Reliability Calc</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ReliabilityCalc get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReliabilityCalc result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Reliability Calc</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ReliabilityCalc getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReliabilityCalc result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Reliability Calc</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ReliabilityCalc get(int value) {
		switch (value) {
			case INSTANT_OF_TIME_VALUE: return INSTANT_OF_TIME;
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
	private ReliabilityCalc(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	
} //ReliabilityCalc
