/**
 * Autogenerated by Thrift Compiler (0.7.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.pocketcampus.platform.sdk.shared.common;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum Rating implements org.apache.thrift.TEnum {
  UNKNOWN(0),
  ZERO(1),
  HALF(2),
  ONE(3),
  ONE_AND_A_HALF(4),
  TWO(5),
  TWO_AND_A_HALF(6),
  THREE(7),
  THREE_AND_A_HALF(8),
  FOUR(9),
  FOUR_AND_A_HALF(10),
  FIVE(11);

  private final int value;

  private Rating(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static Rating findByValue(int value) { 
    switch (value) {
      case 0:
        return UNKNOWN;
      case 1:
        return ZERO;
      case 2:
        return HALF;
      case 3:
        return ONE;
      case 4:
        return ONE_AND_A_HALF;
      case 5:
        return TWO;
      case 6:
        return TWO_AND_A_HALF;
      case 7:
        return THREE;
      case 8:
        return THREE_AND_A_HALF;
      case 9:
        return FOUR;
      case 10:
        return FOUR_AND_A_HALF;
      case 11:
        return FIVE;
      default:
        return null;
    }
  }
}