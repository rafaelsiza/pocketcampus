/**
 * Autogenerated by Thrift Compiler (0.7.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.pocketcampus.platform.sdk.shared.common;

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

public class MultiChoiceOption implements org.apache.thrift.TBase<MultiChoiceOption, MultiChoiceOption._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("MultiChoiceOption");

  private static final org.apache.thrift.protocol.TField MULTI_CHOICE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("multiChoiceId", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField CHOICES_FIELD_DESC = new org.apache.thrift.protocol.TField("choices", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField DEFAULT_CHOICES_FIELD_DESC = new org.apache.thrift.protocol.TField("defaultChoices", org.apache.thrift.protocol.TType.LIST, (short)4);

  public long multiChoiceId; // required
  public String name; // required
  public List<Choice> choices; // required
  public List<Choice> defaultChoices; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    MULTI_CHOICE_ID((short)1, "multiChoiceId"),
    NAME((short)2, "name"),
    CHOICES((short)3, "choices"),
    DEFAULT_CHOICES((short)4, "defaultChoices");

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
        case 1: // MULTI_CHOICE_ID
          return MULTI_CHOICE_ID;
        case 2: // NAME
          return NAME;
        case 3: // CHOICES
          return CHOICES;
        case 4: // DEFAULT_CHOICES
          return DEFAULT_CHOICES;
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
  private static final int __MULTICHOICEID_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.MULTI_CHOICE_ID, new org.apache.thrift.meta_data.FieldMetaData("multiChoiceId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64        , "Id")));
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CHOICES, new org.apache.thrift.meta_data.FieldMetaData("choices", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Choice.class))));
    tmpMap.put(_Fields.DEFAULT_CHOICES, new org.apache.thrift.meta_data.FieldMetaData("defaultChoices", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Choice.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(MultiChoiceOption.class, metaDataMap);
  }

  public MultiChoiceOption() {
  }

  public MultiChoiceOption(
    long multiChoiceId,
    String name,
    List<Choice> choices,
    List<Choice> defaultChoices)
  {
    this();
    this.multiChoiceId = multiChoiceId;
    setMultiChoiceIdIsSet(true);
    this.name = name;
    this.choices = choices;
    this.defaultChoices = defaultChoices;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MultiChoiceOption(MultiChoiceOption other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.multiChoiceId = other.multiChoiceId;
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetChoices()) {
      List<Choice> __this__choices = new ArrayList<Choice>();
      for (Choice other_element : other.choices) {
        __this__choices.add(new Choice(other_element));
      }
      this.choices = __this__choices;
    }
    if (other.isSetDefaultChoices()) {
      List<Choice> __this__defaultChoices = new ArrayList<Choice>();
      for (Choice other_element : other.defaultChoices) {
        __this__defaultChoices.add(new Choice(other_element));
      }
      this.defaultChoices = __this__defaultChoices;
    }
  }

  public MultiChoiceOption deepCopy() {
    return new MultiChoiceOption(this);
  }

  @Override
  public void clear() {
    setMultiChoiceIdIsSet(false);
    this.multiChoiceId = 0;
    this.name = null;
    this.choices = null;
    this.defaultChoices = null;
  }

  public long getMultiChoiceId() {
    return this.multiChoiceId;
  }

  public MultiChoiceOption setMultiChoiceId(long multiChoiceId) {
    this.multiChoiceId = multiChoiceId;
    setMultiChoiceIdIsSet(true);
    return this;
  }

  public void unsetMultiChoiceId() {
    __isset_bit_vector.clear(__MULTICHOICEID_ISSET_ID);
  }

  /** Returns true if field multiChoiceId is set (has been assigned a value) and false otherwise */
  public boolean isSetMultiChoiceId() {
    return __isset_bit_vector.get(__MULTICHOICEID_ISSET_ID);
  }

  public void setMultiChoiceIdIsSet(boolean value) {
    __isset_bit_vector.set(__MULTICHOICEID_ISSET_ID, value);
  }

  public String getName() {
    return this.name;
  }

  public MultiChoiceOption setName(String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public int getChoicesSize() {
    return (this.choices == null) ? 0 : this.choices.size();
  }

  public java.util.Iterator<Choice> getChoicesIterator() {
    return (this.choices == null) ? null : this.choices.iterator();
  }

  public void addToChoices(Choice elem) {
    if (this.choices == null) {
      this.choices = new ArrayList<Choice>();
    }
    this.choices.add(elem);
  }

  public List<Choice> getChoices() {
    return this.choices;
  }

  public MultiChoiceOption setChoices(List<Choice> choices) {
    this.choices = choices;
    return this;
  }

  public void unsetChoices() {
    this.choices = null;
  }

  /** Returns true if field choices is set (has been assigned a value) and false otherwise */
  public boolean isSetChoices() {
    return this.choices != null;
  }

  public void setChoicesIsSet(boolean value) {
    if (!value) {
      this.choices = null;
    }
  }

  public int getDefaultChoicesSize() {
    return (this.defaultChoices == null) ? 0 : this.defaultChoices.size();
  }

  public java.util.Iterator<Choice> getDefaultChoicesIterator() {
    return (this.defaultChoices == null) ? null : this.defaultChoices.iterator();
  }

  public void addToDefaultChoices(Choice elem) {
    if (this.defaultChoices == null) {
      this.defaultChoices = new ArrayList<Choice>();
    }
    this.defaultChoices.add(elem);
  }

  public List<Choice> getDefaultChoices() {
    return this.defaultChoices;
  }

  public MultiChoiceOption setDefaultChoices(List<Choice> defaultChoices) {
    this.defaultChoices = defaultChoices;
    return this;
  }

  public void unsetDefaultChoices() {
    this.defaultChoices = null;
  }

  /** Returns true if field defaultChoices is set (has been assigned a value) and false otherwise */
  public boolean isSetDefaultChoices() {
    return this.defaultChoices != null;
  }

  public void setDefaultChoicesIsSet(boolean value) {
    if (!value) {
      this.defaultChoices = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case MULTI_CHOICE_ID:
      if (value == null) {
        unsetMultiChoiceId();
      } else {
        setMultiChoiceId((Long)value);
      }
      break;

    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    case CHOICES:
      if (value == null) {
        unsetChoices();
      } else {
        setChoices((List<Choice>)value);
      }
      break;

    case DEFAULT_CHOICES:
      if (value == null) {
        unsetDefaultChoices();
      } else {
        setDefaultChoices((List<Choice>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case MULTI_CHOICE_ID:
      return Long.valueOf(getMultiChoiceId());

    case NAME:
      return getName();

    case CHOICES:
      return getChoices();

    case DEFAULT_CHOICES:
      return getDefaultChoices();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case MULTI_CHOICE_ID:
      return isSetMultiChoiceId();
    case NAME:
      return isSetName();
    case CHOICES:
      return isSetChoices();
    case DEFAULT_CHOICES:
      return isSetDefaultChoices();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof MultiChoiceOption)
      return this.equals((MultiChoiceOption)that);
    return false;
  }

  public boolean equals(MultiChoiceOption that) {
    if (that == null)
      return false;

    boolean this_present_multiChoiceId = true;
    boolean that_present_multiChoiceId = true;
    if (this_present_multiChoiceId || that_present_multiChoiceId) {
      if (!(this_present_multiChoiceId && that_present_multiChoiceId))
        return false;
      if (this.multiChoiceId != that.multiChoiceId)
        return false;
    }

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_choices = true && this.isSetChoices();
    boolean that_present_choices = true && that.isSetChoices();
    if (this_present_choices || that_present_choices) {
      if (!(this_present_choices && that_present_choices))
        return false;
      if (!this.choices.equals(that.choices))
        return false;
    }

    boolean this_present_defaultChoices = true && this.isSetDefaultChoices();
    boolean that_present_defaultChoices = true && that.isSetDefaultChoices();
    if (this_present_defaultChoices || that_present_defaultChoices) {
      if (!(this_present_defaultChoices && that_present_defaultChoices))
        return false;
      if (!this.defaultChoices.equals(that.defaultChoices))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_multiChoiceId = true;
    builder.append(present_multiChoiceId);
    if (present_multiChoiceId)
      builder.append(multiChoiceId);

    boolean present_name = true && (isSetName());
    builder.append(present_name);
    if (present_name)
      builder.append(name);

    boolean present_choices = true && (isSetChoices());
    builder.append(present_choices);
    if (present_choices)
      builder.append(choices);

    boolean present_defaultChoices = true && (isSetDefaultChoices());
    builder.append(present_defaultChoices);
    if (present_defaultChoices)
      builder.append(defaultChoices);

    return builder.toHashCode();
  }

  public int compareTo(MultiChoiceOption other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    MultiChoiceOption typedOther = (MultiChoiceOption)other;

    lastComparison = Boolean.valueOf(isSetMultiChoiceId()).compareTo(typedOther.isSetMultiChoiceId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMultiChoiceId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.multiChoiceId, typedOther.multiChoiceId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetName()).compareTo(typedOther.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, typedOther.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetChoices()).compareTo(typedOther.isSetChoices());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetChoices()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.choices, typedOther.choices);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDefaultChoices()).compareTo(typedOther.isSetDefaultChoices());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDefaultChoices()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.defaultChoices, typedOther.defaultChoices);
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
        case 1: // MULTI_CHOICE_ID
          if (field.type == org.apache.thrift.protocol.TType.I64) {
            this.multiChoiceId = iprot.readI64();
            setMultiChoiceIdIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // NAME
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.name = iprot.readString();
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // CHOICES
          if (field.type == org.apache.thrift.protocol.TType.LIST) {
            {
              org.apache.thrift.protocol.TList _list4 = iprot.readListBegin();
              this.choices = new ArrayList<Choice>(_list4.size);
              for (int _i5 = 0; _i5 < _list4.size; ++_i5)
              {
                Choice _elem6; // required
                _elem6 = new Choice();
                _elem6.read(iprot);
                this.choices.add(_elem6);
              }
              iprot.readListEnd();
            }
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // DEFAULT_CHOICES
          if (field.type == org.apache.thrift.protocol.TType.LIST) {
            {
              org.apache.thrift.protocol.TList _list7 = iprot.readListBegin();
              this.defaultChoices = new ArrayList<Choice>(_list7.size);
              for (int _i8 = 0; _i8 < _list7.size; ++_i8)
              {
                Choice _elem9; // required
                _elem9 = new Choice();
                _elem9.read(iprot);
                this.defaultChoices.add(_elem9);
              }
              iprot.readListEnd();
            }
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
    if (!isSetMultiChoiceId()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'multiChoiceId' was not found in serialized data! Struct: " + toString());
    }
    validate();
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    oprot.writeFieldBegin(MULTI_CHOICE_ID_FIELD_DESC);
    oprot.writeI64(this.multiChoiceId);
    oprot.writeFieldEnd();
    if (this.name != null) {
      oprot.writeFieldBegin(NAME_FIELD_DESC);
      oprot.writeString(this.name);
      oprot.writeFieldEnd();
    }
    if (this.choices != null) {
      oprot.writeFieldBegin(CHOICES_FIELD_DESC);
      {
        oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, this.choices.size()));
        for (Choice _iter10 : this.choices)
        {
          _iter10.write(oprot);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.defaultChoices != null) {
      oprot.writeFieldBegin(DEFAULT_CHOICES_FIELD_DESC);
      {
        oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, this.defaultChoices.size()));
        for (Choice _iter11 : this.defaultChoices)
        {
          _iter11.write(oprot);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("MultiChoiceOption(");
    boolean first = true;

    sb.append("multiChoiceId:");
    sb.append(this.multiChoiceId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("choices:");
    if (this.choices == null) {
      sb.append("null");
    } else {
      sb.append(this.choices);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("defaultChoices:");
    if (this.defaultChoices == null) {
      sb.append("null");
    } else {
      sb.append(this.defaultChoices);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'multiChoiceId' because it's a primitive and you chose the non-beans generator.
    if (name == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'name' was not present! Struct: " + toString());
    }
    if (choices == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'choices' was not present! Struct: " + toString());
    }
    if (defaultChoices == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'defaultChoices' was not present! Struct: " + toString());
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bit_vector = new BitSet(1);
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

}
