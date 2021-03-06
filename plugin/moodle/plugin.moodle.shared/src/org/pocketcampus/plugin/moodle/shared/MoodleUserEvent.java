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

public class MoodleUserEvent implements org.apache.thrift.TBase<MoodleUserEvent, MoodleUserEvent._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("MoodleUserEvent");

  private static final org.apache.thrift.protocol.TField I_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("iId", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField I_TITLE_FIELD_DESC = new org.apache.thrift.protocol.TField("iTitle", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField I_DESC_FIELD_DESC = new org.apache.thrift.protocol.TField("iDesc", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField I_START_DATE_FIELD_DESC = new org.apache.thrift.protocol.TField("iStartDate", org.apache.thrift.protocol.TType.I64, (short)4);
  private static final org.apache.thrift.protocol.TField I_END_DATE_FIELD_DESC = new org.apache.thrift.protocol.TField("iEndDate", org.apache.thrift.protocol.TType.I64, (short)5);

  public int iId; // required
  public String iTitle; // required
  public String iDesc; // required
  public long iStartDate; // required
  public long iEndDate; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    I_ID((short)1, "iId"),
    I_TITLE((short)2, "iTitle"),
    I_DESC((short)3, "iDesc"),
    I_START_DATE((short)4, "iStartDate"),
    I_END_DATE((short)5, "iEndDate");

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
        case 1: // I_ID
          return I_ID;
        case 2: // I_TITLE
          return I_TITLE;
        case 3: // I_DESC
          return I_DESC;
        case 4: // I_START_DATE
          return I_START_DATE;
        case 5: // I_END_DATE
          return I_END_DATE;
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
  private static final int __IID_ISSET_ID = 0;
  private static final int __ISTARTDATE_ISSET_ID = 1;
  private static final int __IENDDATE_ISSET_ID = 2;
  private BitSet __isset_bit_vector = new BitSet(3);

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.I_ID, new org.apache.thrift.meta_data.FieldMetaData("iId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.I_TITLE, new org.apache.thrift.meta_data.FieldMetaData("iTitle", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.I_DESC, new org.apache.thrift.meta_data.FieldMetaData("iDesc", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.I_START_DATE, new org.apache.thrift.meta_data.FieldMetaData("iStartDate", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.I_END_DATE, new org.apache.thrift.meta_data.FieldMetaData("iEndDate", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(MoodleUserEvent.class, metaDataMap);
  }

  public MoodleUserEvent() {
  }

  public MoodleUserEvent(
    int iId,
    String iTitle,
    String iDesc,
    long iStartDate)
  {
    this();
    this.iId = iId;
    setIIdIsSet(true);
    this.iTitle = iTitle;
    this.iDesc = iDesc;
    this.iStartDate = iStartDate;
    setIStartDateIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MoodleUserEvent(MoodleUserEvent other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.iId = other.iId;
    if (other.isSetITitle()) {
      this.iTitle = other.iTitle;
    }
    if (other.isSetIDesc()) {
      this.iDesc = other.iDesc;
    }
    this.iStartDate = other.iStartDate;
    this.iEndDate = other.iEndDate;
  }

  public MoodleUserEvent deepCopy() {
    return new MoodleUserEvent(this);
  }

  @Override
  public void clear() {
    setIIdIsSet(false);
    this.iId = 0;
    this.iTitle = null;
    this.iDesc = null;
    setIStartDateIsSet(false);
    this.iStartDate = 0;
    setIEndDateIsSet(false);
    this.iEndDate = 0;
  }

  public int getIId() {
    return this.iId;
  }

  public MoodleUserEvent setIId(int iId) {
    this.iId = iId;
    setIIdIsSet(true);
    return this;
  }

  public void unsetIId() {
    __isset_bit_vector.clear(__IID_ISSET_ID);
  }

  /** Returns true if field iId is set (has been assigned a value) and false otherwise */
  public boolean isSetIId() {
    return __isset_bit_vector.get(__IID_ISSET_ID);
  }

  public void setIIdIsSet(boolean value) {
    __isset_bit_vector.set(__IID_ISSET_ID, value);
  }

  public String getITitle() {
    return this.iTitle;
  }

  public MoodleUserEvent setITitle(String iTitle) {
    this.iTitle = iTitle;
    return this;
  }

  public void unsetITitle() {
    this.iTitle = null;
  }

  /** Returns true if field iTitle is set (has been assigned a value) and false otherwise */
  public boolean isSetITitle() {
    return this.iTitle != null;
  }

  public void setITitleIsSet(boolean value) {
    if (!value) {
      this.iTitle = null;
    }
  }

  public String getIDesc() {
    return this.iDesc;
  }

  public MoodleUserEvent setIDesc(String iDesc) {
    this.iDesc = iDesc;
    return this;
  }

  public void unsetIDesc() {
    this.iDesc = null;
  }

  /** Returns true if field iDesc is set (has been assigned a value) and false otherwise */
  public boolean isSetIDesc() {
    return this.iDesc != null;
  }

  public void setIDescIsSet(boolean value) {
    if (!value) {
      this.iDesc = null;
    }
  }

  public long getIStartDate() {
    return this.iStartDate;
  }

  public MoodleUserEvent setIStartDate(long iStartDate) {
    this.iStartDate = iStartDate;
    setIStartDateIsSet(true);
    return this;
  }

  public void unsetIStartDate() {
    __isset_bit_vector.clear(__ISTARTDATE_ISSET_ID);
  }

  /** Returns true if field iStartDate is set (has been assigned a value) and false otherwise */
  public boolean isSetIStartDate() {
    return __isset_bit_vector.get(__ISTARTDATE_ISSET_ID);
  }

  public void setIStartDateIsSet(boolean value) {
    __isset_bit_vector.set(__ISTARTDATE_ISSET_ID, value);
  }

  public long getIEndDate() {
    return this.iEndDate;
  }

  public MoodleUserEvent setIEndDate(long iEndDate) {
    this.iEndDate = iEndDate;
    setIEndDateIsSet(true);
    return this;
  }

  public void unsetIEndDate() {
    __isset_bit_vector.clear(__IENDDATE_ISSET_ID);
  }

  /** Returns true if field iEndDate is set (has been assigned a value) and false otherwise */
  public boolean isSetIEndDate() {
    return __isset_bit_vector.get(__IENDDATE_ISSET_ID);
  }

  public void setIEndDateIsSet(boolean value) {
    __isset_bit_vector.set(__IENDDATE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case I_ID:
      if (value == null) {
        unsetIId();
      } else {
        setIId((Integer)value);
      }
      break;

    case I_TITLE:
      if (value == null) {
        unsetITitle();
      } else {
        setITitle((String)value);
      }
      break;

    case I_DESC:
      if (value == null) {
        unsetIDesc();
      } else {
        setIDesc((String)value);
      }
      break;

    case I_START_DATE:
      if (value == null) {
        unsetIStartDate();
      } else {
        setIStartDate((Long)value);
      }
      break;

    case I_END_DATE:
      if (value == null) {
        unsetIEndDate();
      } else {
        setIEndDate((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case I_ID:
      return Integer.valueOf(getIId());

    case I_TITLE:
      return getITitle();

    case I_DESC:
      return getIDesc();

    case I_START_DATE:
      return Long.valueOf(getIStartDate());

    case I_END_DATE:
      return Long.valueOf(getIEndDate());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case I_ID:
      return isSetIId();
    case I_TITLE:
      return isSetITitle();
    case I_DESC:
      return isSetIDesc();
    case I_START_DATE:
      return isSetIStartDate();
    case I_END_DATE:
      return isSetIEndDate();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof MoodleUserEvent)
      return this.equals((MoodleUserEvent)that);
    return false;
  }

  public boolean equals(MoodleUserEvent that) {
    if (that == null)
      return false;

    boolean this_present_iId = true;
    boolean that_present_iId = true;
    if (this_present_iId || that_present_iId) {
      if (!(this_present_iId && that_present_iId))
        return false;
      if (this.iId != that.iId)
        return false;
    }

    boolean this_present_iTitle = true && this.isSetITitle();
    boolean that_present_iTitle = true && that.isSetITitle();
    if (this_present_iTitle || that_present_iTitle) {
      if (!(this_present_iTitle && that_present_iTitle))
        return false;
      if (!this.iTitle.equals(that.iTitle))
        return false;
    }

    boolean this_present_iDesc = true && this.isSetIDesc();
    boolean that_present_iDesc = true && that.isSetIDesc();
    if (this_present_iDesc || that_present_iDesc) {
      if (!(this_present_iDesc && that_present_iDesc))
        return false;
      if (!this.iDesc.equals(that.iDesc))
        return false;
    }

    boolean this_present_iStartDate = true;
    boolean that_present_iStartDate = true;
    if (this_present_iStartDate || that_present_iStartDate) {
      if (!(this_present_iStartDate && that_present_iStartDate))
        return false;
      if (this.iStartDate != that.iStartDate)
        return false;
    }

    boolean this_present_iEndDate = true && this.isSetIEndDate();
    boolean that_present_iEndDate = true && that.isSetIEndDate();
    if (this_present_iEndDate || that_present_iEndDate) {
      if (!(this_present_iEndDate && that_present_iEndDate))
        return false;
      if (this.iEndDate != that.iEndDate)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_iId = true;
    builder.append(present_iId);
    if (present_iId)
      builder.append(iId);

    boolean present_iTitle = true && (isSetITitle());
    builder.append(present_iTitle);
    if (present_iTitle)
      builder.append(iTitle);

    boolean present_iDesc = true && (isSetIDesc());
    builder.append(present_iDesc);
    if (present_iDesc)
      builder.append(iDesc);

    boolean present_iStartDate = true;
    builder.append(present_iStartDate);
    if (present_iStartDate)
      builder.append(iStartDate);

    boolean present_iEndDate = true && (isSetIEndDate());
    builder.append(present_iEndDate);
    if (present_iEndDate)
      builder.append(iEndDate);

    return builder.toHashCode();
  }

  public int compareTo(MoodleUserEvent other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    MoodleUserEvent typedOther = (MoodleUserEvent)other;

    lastComparison = Boolean.valueOf(isSetIId()).compareTo(typedOther.isSetIId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.iId, typedOther.iId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetITitle()).compareTo(typedOther.isSetITitle());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetITitle()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.iTitle, typedOther.iTitle);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIDesc()).compareTo(typedOther.isSetIDesc());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIDesc()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.iDesc, typedOther.iDesc);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIStartDate()).compareTo(typedOther.isSetIStartDate());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIStartDate()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.iStartDate, typedOther.iStartDate);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIEndDate()).compareTo(typedOther.isSetIEndDate());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIEndDate()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.iEndDate, typedOther.iEndDate);
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
        case 1: // I_ID
          if (field.type == org.apache.thrift.protocol.TType.I32) {
            this.iId = iprot.readI32();
            setIIdIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // I_TITLE
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.iTitle = iprot.readString();
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // I_DESC
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.iDesc = iprot.readString();
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // I_START_DATE
          if (field.type == org.apache.thrift.protocol.TType.I64) {
            this.iStartDate = iprot.readI64();
            setIStartDateIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // I_END_DATE
          if (field.type == org.apache.thrift.protocol.TType.I64) {
            this.iEndDate = iprot.readI64();
            setIEndDateIsSet(true);
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
    if (!isSetIId()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'iId' was not found in serialized data! Struct: " + toString());
    }
    if (!isSetIStartDate()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'iStartDate' was not found in serialized data! Struct: " + toString());
    }
    validate();
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    oprot.writeFieldBegin(I_ID_FIELD_DESC);
    oprot.writeI32(this.iId);
    oprot.writeFieldEnd();
    if (this.iTitle != null) {
      oprot.writeFieldBegin(I_TITLE_FIELD_DESC);
      oprot.writeString(this.iTitle);
      oprot.writeFieldEnd();
    }
    if (this.iDesc != null) {
      oprot.writeFieldBegin(I_DESC_FIELD_DESC);
      oprot.writeString(this.iDesc);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(I_START_DATE_FIELD_DESC);
    oprot.writeI64(this.iStartDate);
    oprot.writeFieldEnd();
    if (isSetIEndDate()) {
      oprot.writeFieldBegin(I_END_DATE_FIELD_DESC);
      oprot.writeI64(this.iEndDate);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("MoodleUserEvent(");
    boolean first = true;

    sb.append("iId:");
    sb.append(this.iId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("iTitle:");
    if (this.iTitle == null) {
      sb.append("null");
    } else {
      sb.append(this.iTitle);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("iDesc:");
    if (this.iDesc == null) {
      sb.append("null");
    } else {
      sb.append(this.iDesc);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("iStartDate:");
    sb.append(this.iStartDate);
    first = false;
    if (isSetIEndDate()) {
      if (!first) sb.append(", ");
      sb.append("iEndDate:");
      sb.append(this.iEndDate);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'iId' because it's a primitive and you chose the non-beans generator.
    if (iTitle == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'iTitle' was not present! Struct: " + toString());
    }
    if (iDesc == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'iDesc' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'iStartDate' because it's a primitive and you chose the non-beans generator.
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

