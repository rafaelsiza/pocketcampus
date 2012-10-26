/**
 * Autogenerated by Thrift Compiler (0.7.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.pocketcampus.plugin.camipro.shared;

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

public class CamiproRequest implements org.apache.thrift.TBase<CamiproRequest, CamiproRequest._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CamiproRequest");

  private static final org.apache.thrift.protocol.TField I_SESSION_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("iSessionId", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField I_LANGUAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("iLanguage", org.apache.thrift.protocol.TType.STRING, (short)2);

  public SessionId iSessionId; // required
  public String iLanguage; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    I_SESSION_ID((short)1, "iSessionId"),
    I_LANGUAGE((short)2, "iLanguage");

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
        case 1: // I_SESSION_ID
          return I_SESSION_ID;
        case 2: // I_LANGUAGE
          return I_LANGUAGE;
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

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.I_SESSION_ID, new org.apache.thrift.meta_data.FieldMetaData("iSessionId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SessionId.class)));
    tmpMap.put(_Fields.I_LANGUAGE, new org.apache.thrift.meta_data.FieldMetaData("iLanguage", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CamiproRequest.class, metaDataMap);
  }

  public CamiproRequest() {
  }

  public CamiproRequest(
    SessionId iSessionId,
    String iLanguage)
  {
    this();
    this.iSessionId = iSessionId;
    this.iLanguage = iLanguage;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CamiproRequest(CamiproRequest other) {
    if (other.isSetISessionId()) {
      this.iSessionId = new SessionId(other.iSessionId);
    }
    if (other.isSetILanguage()) {
      this.iLanguage = other.iLanguage;
    }
  }

  public CamiproRequest deepCopy() {
    return new CamiproRequest(this);
  }

  @Override
  public void clear() {
    this.iSessionId = null;
    this.iLanguage = null;
  }

  public SessionId getISessionId() {
    return this.iSessionId;
  }

  public CamiproRequest setISessionId(SessionId iSessionId) {
    this.iSessionId = iSessionId;
    return this;
  }

  public void unsetISessionId() {
    this.iSessionId = null;
  }

  /** Returns true if field iSessionId is set (has been assigned a value) and false otherwise */
  public boolean isSetISessionId() {
    return this.iSessionId != null;
  }

  public void setISessionIdIsSet(boolean value) {
    if (!value) {
      this.iSessionId = null;
    }
  }

  public String getILanguage() {
    return this.iLanguage;
  }

  public CamiproRequest setILanguage(String iLanguage) {
    this.iLanguage = iLanguage;
    return this;
  }

  public void unsetILanguage() {
    this.iLanguage = null;
  }

  /** Returns true if field iLanguage is set (has been assigned a value) and false otherwise */
  public boolean isSetILanguage() {
    return this.iLanguage != null;
  }

  public void setILanguageIsSet(boolean value) {
    if (!value) {
      this.iLanguage = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case I_SESSION_ID:
      if (value == null) {
        unsetISessionId();
      } else {
        setISessionId((SessionId)value);
      }
      break;

    case I_LANGUAGE:
      if (value == null) {
        unsetILanguage();
      } else {
        setILanguage((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case I_SESSION_ID:
      return getISessionId();

    case I_LANGUAGE:
      return getILanguage();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case I_SESSION_ID:
      return isSetISessionId();
    case I_LANGUAGE:
      return isSetILanguage();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CamiproRequest)
      return this.equals((CamiproRequest)that);
    return false;
  }

  public boolean equals(CamiproRequest that) {
    if (that == null)
      return false;

    boolean this_present_iSessionId = true && this.isSetISessionId();
    boolean that_present_iSessionId = true && that.isSetISessionId();
    if (this_present_iSessionId || that_present_iSessionId) {
      if (!(this_present_iSessionId && that_present_iSessionId))
        return false;
      if (!this.iSessionId.equals(that.iSessionId))
        return false;
    }

    boolean this_present_iLanguage = true && this.isSetILanguage();
    boolean that_present_iLanguage = true && that.isSetILanguage();
    if (this_present_iLanguage || that_present_iLanguage) {
      if (!(this_present_iLanguage && that_present_iLanguage))
        return false;
      if (!this.iLanguage.equals(that.iLanguage))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_iSessionId = true && (isSetISessionId());
    builder.append(present_iSessionId);
    if (present_iSessionId)
      builder.append(iSessionId);

    boolean present_iLanguage = true && (isSetILanguage());
    builder.append(present_iLanguage);
    if (present_iLanguage)
      builder.append(iLanguage);

    return builder.toHashCode();
  }

  public int compareTo(CamiproRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    CamiproRequest typedOther = (CamiproRequest)other;

    lastComparison = Boolean.valueOf(isSetISessionId()).compareTo(typedOther.isSetISessionId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetISessionId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.iSessionId, typedOther.iSessionId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetILanguage()).compareTo(typedOther.isSetILanguage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetILanguage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.iLanguage, typedOther.iLanguage);
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
        case 1: // I_SESSION_ID
          if (field.type == org.apache.thrift.protocol.TType.STRUCT) {
            this.iSessionId = new SessionId();
            this.iSessionId.read(iprot);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // I_LANGUAGE
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.iLanguage = iprot.readString();
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
    validate();
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.iSessionId != null) {
      oprot.writeFieldBegin(I_SESSION_ID_FIELD_DESC);
      this.iSessionId.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.iLanguage != null) {
      oprot.writeFieldBegin(I_LANGUAGE_FIELD_DESC);
      oprot.writeString(this.iLanguage);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("CamiproRequest(");
    boolean first = true;

    sb.append("iSessionId:");
    if (this.iSessionId == null) {
      sb.append("null");
    } else {
      sb.append(this.iSessionId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("iLanguage:");
    if (this.iLanguage == null) {
      sb.append("null");
    } else {
      sb.append(this.iLanguage);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (iSessionId == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'iSessionId' was not present! Struct: " + toString());
    }
    if (iLanguage == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'iLanguage' was not present! Struct: " + toString());
    }
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

}

