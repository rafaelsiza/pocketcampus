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

public class AvailableRestaurants implements org.apache.thrift.TBase<AvailableRestaurants, AvailableRestaurants._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("AvailableRestaurants");

  private static final org.apache.thrift.protocol.TField RESTAURANTS_FIELD_DESC = new org.apache.thrift.protocol.TField("restaurants", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField AREA_FIELD_DESC = new org.apache.thrift.protocol.TField("area", org.apache.thrift.protocol.TType.STRING, (short)2);

  public List<org.pocketcampus.platform.sdk.shared.common.TakeoutServerAddress> restaurants; // required
  public String area; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    RESTAURANTS((short)1, "restaurants"),
    AREA((short)2, "area");

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
        case 1: // RESTAURANTS
          return RESTAURANTS;
        case 2: // AREA
          return AREA;
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
    tmpMap.put(_Fields.RESTAURANTS, new org.apache.thrift.meta_data.FieldMetaData("restaurants", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.pocketcampus.platform.sdk.shared.common.TakeoutServerAddress.class))));
    tmpMap.put(_Fields.AREA, new org.apache.thrift.meta_data.FieldMetaData("area", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(AvailableRestaurants.class, metaDataMap);
  }

  public AvailableRestaurants() {
  }

  public AvailableRestaurants(
    List<org.pocketcampus.platform.sdk.shared.common.TakeoutServerAddress> restaurants)
  {
    this();
    this.restaurants = restaurants;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AvailableRestaurants(AvailableRestaurants other) {
    if (other.isSetRestaurants()) {
      List<org.pocketcampus.platform.sdk.shared.common.TakeoutServerAddress> __this__restaurants = new ArrayList<org.pocketcampus.platform.sdk.shared.common.TakeoutServerAddress>();
      for (org.pocketcampus.platform.sdk.shared.common.TakeoutServerAddress other_element : other.restaurants) {
        __this__restaurants.add(new org.pocketcampus.platform.sdk.shared.common.TakeoutServerAddress(other_element));
      }
      this.restaurants = __this__restaurants;
    }
    if (other.isSetArea()) {
      this.area = other.area;
    }
  }

  public AvailableRestaurants deepCopy() {
    return new AvailableRestaurants(this);
  }

  @Override
  public void clear() {
    this.restaurants = null;
    this.area = null;
  }

  public int getRestaurantsSize() {
    return (this.restaurants == null) ? 0 : this.restaurants.size();
  }

  public java.util.Iterator<org.pocketcampus.platform.sdk.shared.common.TakeoutServerAddress> getRestaurantsIterator() {
    return (this.restaurants == null) ? null : this.restaurants.iterator();
  }

  public void addToRestaurants(org.pocketcampus.platform.sdk.shared.common.TakeoutServerAddress elem) {
    if (this.restaurants == null) {
      this.restaurants = new ArrayList<org.pocketcampus.platform.sdk.shared.common.TakeoutServerAddress>();
    }
    this.restaurants.add(elem);
  }

  public List<org.pocketcampus.platform.sdk.shared.common.TakeoutServerAddress> getRestaurants() {
    return this.restaurants;
  }

  public AvailableRestaurants setRestaurants(List<org.pocketcampus.platform.sdk.shared.common.TakeoutServerAddress> restaurants) {
    this.restaurants = restaurants;
    return this;
  }

  public void unsetRestaurants() {
    this.restaurants = null;
  }

  /** Returns true if field restaurants is set (has been assigned a value) and false otherwise */
  public boolean isSetRestaurants() {
    return this.restaurants != null;
  }

  public void setRestaurantsIsSet(boolean value) {
    if (!value) {
      this.restaurants = null;
    }
  }

  public String getArea() {
    return this.area;
  }

  public AvailableRestaurants setArea(String area) {
    this.area = area;
    return this;
  }

  public void unsetArea() {
    this.area = null;
  }

  /** Returns true if field area is set (has been assigned a value) and false otherwise */
  public boolean isSetArea() {
    return this.area != null;
  }

  public void setAreaIsSet(boolean value) {
    if (!value) {
      this.area = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case RESTAURANTS:
      if (value == null) {
        unsetRestaurants();
      } else {
        setRestaurants((List<org.pocketcampus.platform.sdk.shared.common.TakeoutServerAddress>)value);
      }
      break;

    case AREA:
      if (value == null) {
        unsetArea();
      } else {
        setArea((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case RESTAURANTS:
      return getRestaurants();

    case AREA:
      return getArea();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case RESTAURANTS:
      return isSetRestaurants();
    case AREA:
      return isSetArea();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof AvailableRestaurants)
      return this.equals((AvailableRestaurants)that);
    return false;
  }

  public boolean equals(AvailableRestaurants that) {
    if (that == null)
      return false;

    boolean this_present_restaurants = true && this.isSetRestaurants();
    boolean that_present_restaurants = true && that.isSetRestaurants();
    if (this_present_restaurants || that_present_restaurants) {
      if (!(this_present_restaurants && that_present_restaurants))
        return false;
      if (!this.restaurants.equals(that.restaurants))
        return false;
    }

    boolean this_present_area = true && this.isSetArea();
    boolean that_present_area = true && that.isSetArea();
    if (this_present_area || that_present_area) {
      if (!(this_present_area && that_present_area))
        return false;
      if (!this.area.equals(that.area))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_restaurants = true && (isSetRestaurants());
    builder.append(present_restaurants);
    if (present_restaurants)
      builder.append(restaurants);

    boolean present_area = true && (isSetArea());
    builder.append(present_area);
    if (present_area)
      builder.append(area);

    return builder.toHashCode();
  }

  public int compareTo(AvailableRestaurants other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    AvailableRestaurants typedOther = (AvailableRestaurants)other;

    lastComparison = Boolean.valueOf(isSetRestaurants()).compareTo(typedOther.isSetRestaurants());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRestaurants()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.restaurants, typedOther.restaurants);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetArea()).compareTo(typedOther.isSetArea());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetArea()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.area, typedOther.area);
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
        case 1: // RESTAURANTS
          if (field.type == org.apache.thrift.protocol.TType.LIST) {
            {
              org.apache.thrift.protocol.TList _list62 = iprot.readListBegin();
              this.restaurants = new ArrayList<org.pocketcampus.platform.sdk.shared.common.TakeoutServerAddress>(_list62.size);
              for (int _i63 = 0; _i63 < _list62.size; ++_i63)
              {
                org.pocketcampus.platform.sdk.shared.common.TakeoutServerAddress _elem64; // required
                _elem64 = new org.pocketcampus.platform.sdk.shared.common.TakeoutServerAddress();
                _elem64.read(iprot);
                this.restaurants.add(_elem64);
              }
              iprot.readListEnd();
            }
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // AREA
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.area = iprot.readString();
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
    if (this.restaurants != null) {
      oprot.writeFieldBegin(RESTAURANTS_FIELD_DESC);
      {
        oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, this.restaurants.size()));
        for (org.pocketcampus.platform.sdk.shared.common.TakeoutServerAddress _iter65 : this.restaurants)
        {
          _iter65.write(oprot);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.area != null) {
      if (isSetArea()) {
        oprot.writeFieldBegin(AREA_FIELD_DESC);
        oprot.writeString(this.area);
        oprot.writeFieldEnd();
      }
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("AvailableRestaurants(");
    boolean first = true;

    sb.append("restaurants:");
    if (this.restaurants == null) {
      sb.append("null");
    } else {
      sb.append(this.restaurants);
    }
    first = false;
    if (isSetArea()) {
      if (!first) sb.append(", ");
      sb.append("area:");
      if (this.area == null) {
        sb.append("null");
      } else {
        sb.append(this.area);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (restaurants == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'restaurants' was not present! Struct: " + toString());
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

