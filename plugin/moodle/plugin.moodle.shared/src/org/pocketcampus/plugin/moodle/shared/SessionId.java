/**
 * Autogenerated by Thrift Compiler (0.7.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.pocketcampus.plugin.moodle.shared;

import org.apache.commons.lang.builder.HashCodeBuilder;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SessionId implements org.apache.thrift.TBase<SessionId, SessionId._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SessionId");

  private static final org.apache.thrift.protocol.TField TOS_FIELD_DESC = new org.apache.thrift.protocol.TField("tos", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField MOODLE_COOKIE_FIELD_DESC = new org.apache.thrift.protocol.TField("moodleCookie", org.apache.thrift.protocol.TType.STRING, (short)3);

  public int tos; // required
  public String moodleCookie; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TOS((short)1, "tos"),
    MOODLE_COOKIE((short)3, "moodleCookie");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TOS
          return TOS;
        case 3: // MOODLE_COOKIE
          return MOODLE_COOKIE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __TOS_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TOS, new org.apache.thrift.meta_data.FieldMetaData("tos", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.MOODLE_COOKIE, new org.apache.thrift.meta_data.FieldMetaData("moodleCookie", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SessionId.class, metaDataMap);
  }

  public SessionId() {
  }

  public SessionId(
    int tos)
  {
    this();
    this.tos = tos;
    setTosIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SessionId(SessionId other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.tos = other.tos;
    if (other.isSetMoodleCookie()) {
      this.moodleCookie = other.moodleCookie;
    }
  }

  public SessionId deepCopy() {
    return new SessionId(this);
  }

  @Override
  public void clear() {
    setTosIsSet(false);
    this.tos = 0;
    this.moodleCookie = null;
  }

  public int getTos() {
    return this.tos;
  }

  public SessionId setTos(int tos) {
    this.tos = tos;
    setTosIsSet(true);
    return this;
  }

  public void unsetTos() {
    __isset_bit_vector.clear(__TOS_ISSET_ID);
  }

  /** Returns true if field tos is set (has been assigned a value) and false otherwise */
  public boolean isSetTos() {
    return __isset_bit_vector.get(__TOS_ISSET_ID);
  }

  public void setTosIsSet(boolean value) {
    __isset_bit_vector.set(__TOS_ISSET_ID, value);
  }

  public String getMoodleCookie() {
    return this.moodleCookie;
  }

  public SessionId setMoodleCookie(String moodleCookie) {
    this.moodleCookie = moodleCookie;
    return this;
  }

  public void unsetMoodleCookie() {
    this.moodleCookie = null;
  }

  /** Returns true if field moodleCookie is set (has been assigned a value) and false otherwise */
  public boolean isSetMoodleCookie() {
    return this.moodleCookie != null;
  }

  public void setMoodleCookieIsSet(boolean value) {
    if (!value) {
      this.moodleCookie = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TOS:
      if (value == null) {
        unsetTos();
      } else {
        setTos((Integer)value);
      }
      break;

    case MOODLE_COOKIE:
      if (value == null) {
        unsetMoodleCookie();
      } else {
        setMoodleCookie((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TOS:
      return Integer.valueOf(getTos());

    case MOODLE_COOKIE:
      return getMoodleCookie();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TOS:
      return isSetTos();
    case MOODLE_COOKIE:
      return isSetMoodleCookie();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SessionId)
      return this.equals((SessionId)that);
    return false;
  }

  public boolean equals(SessionId that) {
    if (that == null)
      return false;

    boolean this_present_tos = true;
    boolean that_present_tos = true;
    if (this_present_tos || that_present_tos) {
      if (!(this_present_tos && that_present_tos))
        return false;
      if (this.tos != that.tos)
        return false;
    }

    boolean this_present_moodleCookie = true && this.isSetMoodleCookie();
    boolean that_present_moodleCookie = true && that.isSetMoodleCookie();
    if (this_present_moodleCookie || that_present_moodleCookie) {
      if (!(this_present_moodleCookie && that_present_moodleCookie))
        return false;
      if (!this.moodleCookie.equals(that.moodleCookie))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_tos = true;
    builder.append(present_tos);
    if (present_tos)
      builder.append(tos);

    boolean present_moodleCookie = true && (isSetMoodleCookie());
    builder.append(present_moodleCookie);
    if (present_moodleCookie)
      builder.append(moodleCookie);

    return builder.toHashCode();
  }

  public int compareTo(SessionId other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    SessionId typedOther = (SessionId)other;

    lastComparison = Boolean.valueOf(isSetTos()).compareTo(typedOther.isSetTos());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTos()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tos, typedOther.tos);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMoodleCookie()).compareTo(typedOther.isSetMoodleCookie());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMoodleCookie()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.moodleCookie, typedOther.moodleCookie);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    org.apache.thrift.protocol.TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == org.apache.thrift.protocol.TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // TOS
          if (field.type == org.apache.thrift.protocol.TType.I32) {
            this.tos = iprot.readI32();
            setTosIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // MOODLE_COOKIE
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.moodleCookie = iprot.readString();
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    if (!isSetTos()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'tos' was not found in serialized data! Struct: " + toString());
    }
    validate();
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    oprot.writeFieldBegin(TOS_FIELD_DESC);
    oprot.writeI32(this.tos);
    oprot.writeFieldEnd();
    if (this.moodleCookie != null) {
      if (isSetMoodleCookie()) {
        oprot.writeFieldBegin(MOODLE_COOKIE_FIELD_DESC);
        oprot.writeString(this.moodleCookie);
        oprot.writeFieldEnd();
      }
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("SessionId(");
    boolean first = true;

    sb.append("tos:");
    sb.append(this.tos);
    first = false;
    if (isSetMoodleCookie()) {
      if (!first) sb.append(", ");
      sb.append("moodleCookie:");
      if (this.moodleCookie == null) {
        sb.append("null");
      } else {
        sb.append(this.moodleCookie);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'tos' because it's a primitive and you chose the non-beans generator.
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bit_vector = new BitSet(1);
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

}
