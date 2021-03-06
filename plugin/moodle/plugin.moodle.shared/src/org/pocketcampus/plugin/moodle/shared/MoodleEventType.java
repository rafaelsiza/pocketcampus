/**
 * Autogenerated by Thrift Compiler (0.7.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.pocketcampus.plugin.moodle.shared;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum MoodleEventType implements org.apache.thrift.TEnum {
  MOODLE_EVENT_UNKNOWN(0),
  MOODLE_EVENT_ASSIGNMENT(1),
  MOODLE_EVENT_USEREVENT(2);

  private final int value;

  private MoodleEventType(int value) {
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
  public static MoodleEventType findByValue(int value) { 
    switch (value) {
      case 0:
        return MOODLE_EVENT_UNKNOWN;
      case 1:
        return MOODLE_EVENT_ASSIGNMENT;
      case 2:
        return MOODLE_EVENT_USEREVENT;
      default:
        return null;
    }
  }
}
