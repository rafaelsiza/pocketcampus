/**
 * Autogenerated by Thrift Compiler (0.7.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.pocketcampus.platform.sdk.shared.restaurant;

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

public class MenuSubCategory implements org.apache.thrift.TBase<MenuSubCategory, MenuSubCategory._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("MenuSubCategory");

  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField ITEMS_FIELD_DESC = new org.apache.thrift.protocol.TField("items", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField SUB_CATEGORY_DESCRIPTION_FIELD_DESC = new org.apache.thrift.protocol.TField("subCategoryDescription", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField SUB_CATEGORY_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("subCategoryId", org.apache.thrift.protocol.TType.I64, (short)4);

  public String name; // required
  public List<MenuItem> items; // required
  public String subCategoryDescription; // required
  public long subCategoryId; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NAME((short)1, "name"),
    ITEMS((short)2, "items"),
    SUB_CATEGORY_DESCRIPTION((short)3, "subCategoryDescription"),
    SUB_CATEGORY_ID((short)4, "subCategoryId");

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
        case 1: // NAME
          return NAME;
        case 2: // ITEMS
          return ITEMS;
        case 3: // SUB_CATEGORY_DESCRIPTION
          return SUB_CATEGORY_DESCRIPTION;
        case 4: // SUB_CATEGORY_ID
          return SUB_CATEGORY_ID;
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
  private static final int __SUBCATEGORYID_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ITEMS, new org.apache.thrift.meta_data.FieldMetaData("items", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, MenuItem.class))));
    tmpMap.put(_Fields.SUB_CATEGORY_DESCRIPTION, new org.apache.thrift.meta_data.FieldMetaData("subCategoryDescription", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SUB_CATEGORY_ID, new org.apache.thrift.meta_data.FieldMetaData("subCategoryId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64        , "Id")));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(MenuSubCategory.class, metaDataMap);
  }

  public MenuSubCategory() {
  }

  public MenuSubCategory(
    String name,
    List<MenuItem> items,
    long subCategoryId)
  {
    this();
    this.name = name;
    this.items = items;
    this.subCategoryId = subCategoryId;
    setSubCategoryIdIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MenuSubCategory(MenuSubCategory other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetItems()) {
      List<MenuItem> __this__items = new ArrayList<MenuItem>();
      for (MenuItem other_element : other.items) {
        __this__items.add(new MenuItem(other_element));
      }
      this.items = __this__items;
    }
    if (other.isSetSubCategoryDescription()) {
      this.subCategoryDescription = other.subCategoryDescription;
    }
    this.subCategoryId = other.subCategoryId;
  }

  public MenuSubCategory deepCopy() {
    return new MenuSubCategory(this);
  }

  @Override
  public void clear() {
    this.name = null;
    this.items = null;
    this.subCategoryDescription = null;
    setSubCategoryIdIsSet(false);
    this.subCategoryId = 0;
  }

  public String getName() {
    return this.name;
  }

  public MenuSubCategory setName(String name) {
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

  public int getItemsSize() {
    return (this.items == null) ? 0 : this.items.size();
  }

  public java.util.Iterator<MenuItem> getItemsIterator() {
    return (this.items == null) ? null : this.items.iterator();
  }

  public void addToItems(MenuItem elem) {
    if (this.items == null) {
      this.items = new ArrayList<MenuItem>();
    }
    this.items.add(elem);
  }

  public List<MenuItem> getItems() {
    return this.items;
  }

  public MenuSubCategory setItems(List<MenuItem> items) {
    this.items = items;
    return this;
  }

  public void unsetItems() {
    this.items = null;
  }

  /** Returns true if field items is set (has been assigned a value) and false otherwise */
  public boolean isSetItems() {
    return this.items != null;
  }

  public void setItemsIsSet(boolean value) {
    if (!value) {
      this.items = null;
    }
  }

  public String getSubCategoryDescription() {
    return this.subCategoryDescription;
  }

  public MenuSubCategory setSubCategoryDescription(String subCategoryDescription) {
    this.subCategoryDescription = subCategoryDescription;
    return this;
  }

  public void unsetSubCategoryDescription() {
    this.subCategoryDescription = null;
  }

  /** Returns true if field subCategoryDescription is set (has been assigned a value) and false otherwise */
  public boolean isSetSubCategoryDescription() {
    return this.subCategoryDescription != null;
  }

  public void setSubCategoryDescriptionIsSet(boolean value) {
    if (!value) {
      this.subCategoryDescription = null;
    }
  }

  public long getSubCategoryId() {
    return this.subCategoryId;
  }

  public MenuSubCategory setSubCategoryId(long subCategoryId) {
    this.subCategoryId = subCategoryId;
    setSubCategoryIdIsSet(true);
    return this;
  }

  public void unsetSubCategoryId() {
    __isset_bit_vector.clear(__SUBCATEGORYID_ISSET_ID);
  }

  /** Returns true if field subCategoryId is set (has been assigned a value) and false otherwise */
  public boolean isSetSubCategoryId() {
    return __isset_bit_vector.get(__SUBCATEGORYID_ISSET_ID);
  }

  public void setSubCategoryIdIsSet(boolean value) {
    __isset_bit_vector.set(__SUBCATEGORYID_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    case ITEMS:
      if (value == null) {
        unsetItems();
      } else {
        setItems((List<MenuItem>)value);
      }
      break;

    case SUB_CATEGORY_DESCRIPTION:
      if (value == null) {
        unsetSubCategoryDescription();
      } else {
        setSubCategoryDescription((String)value);
      }
      break;

    case SUB_CATEGORY_ID:
      if (value == null) {
        unsetSubCategoryId();
      } else {
        setSubCategoryId((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case NAME:
      return getName();

    case ITEMS:
      return getItems();

    case SUB_CATEGORY_DESCRIPTION:
      return getSubCategoryDescription();

    case SUB_CATEGORY_ID:
      return Long.valueOf(getSubCategoryId());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case NAME:
      return isSetName();
    case ITEMS:
      return isSetItems();
    case SUB_CATEGORY_DESCRIPTION:
      return isSetSubCategoryDescription();
    case SUB_CATEGORY_ID:
      return isSetSubCategoryId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof MenuSubCategory)
      return this.equals((MenuSubCategory)that);
    return false;
  }

  public boolean equals(MenuSubCategory that) {
    if (that == null)
      return false;

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_items = true && this.isSetItems();
    boolean that_present_items = true && that.isSetItems();
    if (this_present_items || that_present_items) {
      if (!(this_present_items && that_present_items))
        return false;
      if (!this.items.equals(that.items))
        return false;
    }

    boolean this_present_subCategoryDescription = true && this.isSetSubCategoryDescription();
    boolean that_present_subCategoryDescription = true && that.isSetSubCategoryDescription();
    if (this_present_subCategoryDescription || that_present_subCategoryDescription) {
      if (!(this_present_subCategoryDescription && that_present_subCategoryDescription))
        return false;
      if (!this.subCategoryDescription.equals(that.subCategoryDescription))
        return false;
    }

    boolean this_present_subCategoryId = true;
    boolean that_present_subCategoryId = true;
    if (this_present_subCategoryId || that_present_subCategoryId) {
      if (!(this_present_subCategoryId && that_present_subCategoryId))
        return false;
      if (this.subCategoryId != that.subCategoryId)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_name = true && (isSetName());
    builder.append(present_name);
    if (present_name)
      builder.append(name);

    boolean present_items = true && (isSetItems());
    builder.append(present_items);
    if (present_items)
      builder.append(items);

    boolean present_subCategoryDescription = true && (isSetSubCategoryDescription());
    builder.append(present_subCategoryDescription);
    if (present_subCategoryDescription)
      builder.append(subCategoryDescription);

    boolean present_subCategoryId = true;
    builder.append(present_subCategoryId);
    if (present_subCategoryId)
      builder.append(subCategoryId);

    return builder.toHashCode();
  }

  public int compareTo(MenuSubCategory other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    MenuSubCategory typedOther = (MenuSubCategory)other;

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
    lastComparison = Boolean.valueOf(isSetItems()).compareTo(typedOther.isSetItems());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetItems()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.items, typedOther.items);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSubCategoryDescription()).compareTo(typedOther.isSetSubCategoryDescription());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSubCategoryDescription()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.subCategoryDescription, typedOther.subCategoryDescription);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSubCategoryId()).compareTo(typedOther.isSetSubCategoryId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSubCategoryId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.subCategoryId, typedOther.subCategoryId);
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
        case 1: // NAME
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.name = iprot.readString();
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // ITEMS
          if (field.type == org.apache.thrift.protocol.TType.LIST) {
            {
              org.apache.thrift.protocol.TList _list8 = iprot.readListBegin();
              this.items = new ArrayList<MenuItem>(_list8.size);
              for (int _i9 = 0; _i9 < _list8.size; ++_i9)
              {
                MenuItem _elem10; // required
                _elem10 = new MenuItem();
                _elem10.read(iprot);
                this.items.add(_elem10);
              }
              iprot.readListEnd();
            }
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // SUB_CATEGORY_DESCRIPTION
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.subCategoryDescription = iprot.readString();
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // SUB_CATEGORY_ID
          if (field.type == org.apache.thrift.protocol.TType.I64) {
            this.subCategoryId = iprot.readI64();
            setSubCategoryIdIsSet(true);
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
    if (!isSetSubCategoryId()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'subCategoryId' was not found in serialized data! Struct: " + toString());
    }
    validate();
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.name != null) {
      oprot.writeFieldBegin(NAME_FIELD_DESC);
      oprot.writeString(this.name);
      oprot.writeFieldEnd();
    }
    if (this.items != null) {
      oprot.writeFieldBegin(ITEMS_FIELD_DESC);
      {
        oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, this.items.size()));
        for (MenuItem _iter11 : this.items)
        {
          _iter11.write(oprot);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.subCategoryDescription != null) {
      if (isSetSubCategoryDescription()) {
        oprot.writeFieldBegin(SUB_CATEGORY_DESCRIPTION_FIELD_DESC);
        oprot.writeString(this.subCategoryDescription);
        oprot.writeFieldEnd();
      }
    }
    oprot.writeFieldBegin(SUB_CATEGORY_ID_FIELD_DESC);
    oprot.writeI64(this.subCategoryId);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("MenuSubCategory(");
    boolean first = true;

    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("items:");
    if (this.items == null) {
      sb.append("null");
    } else {
      sb.append(this.items);
    }
    first = false;
    if (isSetSubCategoryDescription()) {
      if (!first) sb.append(", ");
      sb.append("subCategoryDescription:");
      if (this.subCategoryDescription == null) {
        sb.append("null");
      } else {
        sb.append(this.subCategoryDescription);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("subCategoryId:");
    sb.append(this.subCategoryId);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (name == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'name' was not present! Struct: " + toString());
    }
    if (items == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'items' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'subCategoryId' because it's a primitive and you chose the non-beans generator.
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

