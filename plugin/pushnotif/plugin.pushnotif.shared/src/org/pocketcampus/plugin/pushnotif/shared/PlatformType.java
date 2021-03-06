/**
 * Autogenerated by Thrift Compiler (0.7.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.pocketcampus.plugin.pushnotif.shared;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum PlatformType implements org.apache.thrift.TEnum {
  PC_PLATFORM_ANDROID(0),
  PC_PLATFORM_IOS(1);

  private final int value;

  private PlatformType(int value) {
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
  public static PlatformType findByValue(int value) { 
    switch (value) {
      case 0:
        return PC_PLATFORM_ANDROID;
      case 1:
        return PC_PLATFORM_IOS;
      default:
        return null;
    }
  }
}
