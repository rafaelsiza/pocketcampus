/**
 * Autogenerated by Thrift Compiler (0.7.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.pocketcampus.plugin.transport.shared;

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

public class TransportStation implements org.apache.thrift.TBase<TransportStation, TransportStation._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TransportStation");

  private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("type", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField LATITUDE_FIELD_DESC = new org.apache.thrift.protocol.TField("latitude", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField LONGITUDE_FIELD_DESC = new org.apache.thrift.protocol.TField("longitude", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField PLACE_FIELD_DESC = new org.apache.thrift.protocol.TField("place", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)6);

  /**
   * 
   * @see TransportStationType
   */
  public TransportStationType type; // required
  public int id; // required
  public int latitude; // required
  public int longitude; // required
  public String place; // required
  public String name; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see TransportStationType
     */
    TYPE((short)1, "type"),
    ID((short)2, "id"),
    LATITUDE((short)3, "latitude"),
    LONGITUDE((short)4, "longitude"),
    PLACE((short)5, "place"),
    NAME((short)6, "name");

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
        case 1: // TYPE
          return TYPE;
        case 2: // ID
          return ID;
        case 3: // LATITUDE
          return LATITUDE;
        case 4: // LONGITUDE
          return LONGITUDE;
        case 5: // PLACE
          return PLACE;
        case 6: // NAME
          return NAME;
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
  private static final int __ID_ISSET_ID = 0;
  private static final int __LATITUDE_ISSET_ID = 1;
  private static final int __LONGITUDE_ISSET_ID = 2;
  private BitSet __isset_bit_vector = new BitSet(3);

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TYPE, new org.apache.thrift.meta_data.FieldMetaData("type", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TransportStationType.class)));
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.LATITUDE, new org.apache.thrift.meta_data.FieldMetaData("latitude", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.LONGITUDE, new org.apache.thrift.meta_data.FieldMetaData("longitude", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.PLACE, new org.apache.thrift.meta_data.FieldMetaData("place", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TransportStation.class, metaDataMap);
  }

  public TransportStation() {
  }

  public TransportStation(
    TransportStationType type,
    int id,
    int latitude,
    int longitude,
    String place,
    String name)
  {
    this();
    this.type = type;
    this.id = id;
    setIdIsSet(true);
    this.latitude = latitude;
    setLatitudeIsSet(true);
    this.longitude = longitude;
    setLongitudeIsSet(true);
    this.place = place;
    this.name = name;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TransportStation(TransportStation other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetType()) {
      this.type = other.type;
    }
    this.id = other.id;
    this.latitude = other.latitude;
    this.longitude = other.longitude;
    if (other.isSetPlace()) {
      this.place = other.place;
    }
    if (other.isSetName()) {
      this.name = other.name;
    }
  }

  public TransportStation deepCopy() {
    return new TransportStation(this);
  }

  @Override
  public void clear() {
    this.type = null;
    setIdIsSet(false);
    this.id = 0;
    setLatitudeIsSet(false);
    this.latitude = 0;
    setLongitudeIsSet(false);
    this.longitude = 0;
    this.place = null;
    this.name = null;
  }

  /**
   * 
   * @see TransportStationType
   */
  public TransportStationType getType() {
    return this.type;
  }

  /**
   * 
   * @see TransportStationType
   */
  public TransportStation setType(TransportStationType type) {
    this.type = type;
    return this;
  }

  public void unsetType() {
    this.type = null;
  }

  /** Returns true if field type is set (has been assigned a value) and false otherwise */
  public boolean isSetType() {
    return this.type != null;
  }

  public void setTypeIsSet(boolean value) {
    if (!value) {
      this.type = null;
    }
  }

  public int getId() {
    return this.id;
  }

  public TransportStation setId(int id) {
    this.id = id;
    setIdIsSet(true);
    return this;
  }

  public void unsetId() {
    __isset_bit_vector.clear(__ID_ISSET_ID);
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return __isset_bit_vector.get(__ID_ISSET_ID);
  }

  public void setIdIsSet(boolean value) {
    __isset_bit_vector.set(__ID_ISSET_ID, value);
  }

  public int getLatitude() {
    return this.latitude;
  }

  public TransportStation setLatitude(int latitude) {
    this.latitude = latitude;
    setLatitudeIsSet(true);
    return this;
  }

  public void unsetLatitude() {
    __isset_bit_vector.clear(__LATITUDE_ISSET_ID);
  }

  /** Returns true if field latitude is set (has been assigned a value) and false otherwise */
  public boolean isSetLatitude() {
    return __isset_bit_vector.get(__LATITUDE_ISSET_ID);
  }

  public void setLatitudeIsSet(boolean value) {
    __isset_bit_vector.set(__LATITUDE_ISSET_ID, value);
  }

  public int getLongitude() {
    return this.longitude;
  }

  public TransportStation setLongitude(int longitude) {
    this.longitude = longitude;
    setLongitudeIsSet(true);
    return this;
  }

  public void unsetLongitude() {
    __isset_bit_vector.clear(__LONGITUDE_ISSET_ID);
  }

  /** Returns true if field longitude is set (has been assigned a value) and false otherwise */
  public boolean isSetLongitude() {
    return __isset_bit_vector.get(__LONGITUDE_ISSET_ID);
  }

  public void setLongitudeIsSet(boolean value) {
    __isset_bit_vector.set(__LONGITUDE_ISSET_ID, value);
  }

  public String getPlace() {
    return this.place;
  }

  public TransportStation setPlace(String place) {
    this.place = place;
    return this;
  }

  public void unsetPlace() {
    this.place = null;
  }

  /** Returns true if field place is set (has been assigned a value) and false otherwise */
  public boolean isSetPlace() {
    return this.place != null;
  }

  public void setPlaceIsSet(boolean value) {
    if (!value) {
      this.place = null;
    }
  }

  public String getName() {
    return this.name;
  }

  public TransportStation setName(String name) {
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

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((TransportStationType)value);
      }
      break;

    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((Integer)value);
      }
      break;

    case LATITUDE:
      if (value == null) {
        unsetLatitude();
      } else {
        setLatitude((Integer)value);
      }
      break;

    case LONGITUDE:
      if (value == null) {
        unsetLongitude();
      } else {
        setLongitude((Integer)value);
      }
      break;

    case PLACE:
      if (value == null) {
        unsetPlace();
      } else {
        setPlace((String)value);
      }
      break;

    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TYPE:
      return getType();

    case ID:
      return Integer.valueOf(getId());

    case LATITUDE:
      return Integer.valueOf(getLatitude());

    case LONGITUDE:
      return Integer.valueOf(getLongitude());

    case PLACE:
      return getPlace();

    case NAME:
      return getName();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TYPE:
      return isSetType();
    case ID:
      return isSetId();
    case LATITUDE:
      return isSetLatitude();
    case LONGITUDE:
      return isSetLongitude();
    case PLACE:
      return isSetPlace();
    case NAME:
      return isSetName();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TransportStation)
      return this.equals((TransportStation)that);
    return false;
  }

  public boolean equals(TransportStation that) {
    if (that == null)
      return false;

    boolean this_present_type = true && this.isSetType();
    boolean that_present_type = true && that.isSetType();
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (!this.type.equals(that.type))
        return false;
    }

    boolean this_present_id = true;
    boolean that_present_id = true;
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (this.id != that.id)
        return false;
    }

    boolean this_present_latitude = true;
    boolean that_present_latitude = true;
    if (this_present_latitude || that_present_latitude) {
      if (!(this_present_latitude && that_present_latitude))
        return false;
      if (this.latitude != that.latitude)
        return false;
    }

    boolean this_present_longitude = true;
    boolean that_present_longitude = true;
    if (this_present_longitude || that_present_longitude) {
      if (!(this_present_longitude && that_present_longitude))
        return false;
      if (this.longitude != that.longitude)
        return false;
    }

    boolean this_present_place = true && this.isSetPlace();
    boolean that_present_place = true && that.isSetPlace();
    if (this_present_place || that_present_place) {
      if (!(this_present_place && that_present_place))
        return false;
      if (!this.place.equals(that.place))
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

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_type = true && (isSetType());
    builder.append(present_type);
    if (present_type)
      builder.append(type.getValue());

    boolean present_id = true;
    builder.append(present_id);
    if (present_id)
      builder.append(id);

    boolean present_latitude = true;
    builder.append(present_latitude);
    if (present_latitude)
      builder.append(latitude);

    boolean present_longitude = true;
    builder.append(present_longitude);
    if (present_longitude)
      builder.append(longitude);

    boolean present_place = true && (isSetPlace());
    builder.append(present_place);
    if (present_place)
      builder.append(place);

    boolean present_name = true && (isSetName());
    builder.append(present_name);
    if (present_name)
      builder.append(name);

    return builder.toHashCode();
  }

  public int compareTo(TransportStation other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TransportStation typedOther = (TransportStation)other;

    lastComparison = Boolean.valueOf(isSetType()).compareTo(typedOther.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.type, typedOther.type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetId()).compareTo(typedOther.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, typedOther.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLatitude()).compareTo(typedOther.isSetLatitude());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLatitude()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.latitude, typedOther.latitude);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLongitude()).compareTo(typedOther.isSetLongitude());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLongitude()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.longitude, typedOther.longitude);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPlace()).compareTo(typedOther.isSetPlace());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPlace()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.place, typedOther.place);
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
        case 1: // TYPE
          if (field.type == org.apache.thrift.protocol.TType.I32) {
            this.type = TransportStationType.findByValue(iprot.readI32());
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // ID
          if (field.type == org.apache.thrift.protocol.TType.I32) {
            this.id = iprot.readI32();
            setIdIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // LATITUDE
          if (field.type == org.apache.thrift.protocol.TType.I32) {
            this.latitude = iprot.readI32();
            setLatitudeIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // LONGITUDE
          if (field.type == org.apache.thrift.protocol.TType.I32) {
            this.longitude = iprot.readI32();
            setLongitudeIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // PLACE
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.place = iprot.readString();
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 6: // NAME
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.name = iprot.readString();
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
    if (this.type != null) {
      oprot.writeFieldBegin(TYPE_FIELD_DESC);
      oprot.writeI32(this.type.getValue());
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(ID_FIELD_DESC);
    oprot.writeI32(this.id);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(LATITUDE_FIELD_DESC);
    oprot.writeI32(this.latitude);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(LONGITUDE_FIELD_DESC);
    oprot.writeI32(this.longitude);
    oprot.writeFieldEnd();
    if (this.place != null) {
      oprot.writeFieldBegin(PLACE_FIELD_DESC);
      oprot.writeString(this.place);
      oprot.writeFieldEnd();
    }
    if (this.name != null) {
      oprot.writeFieldBegin(NAME_FIELD_DESC);
      oprot.writeString(this.name);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TransportStation(");
    boolean first = true;

    sb.append("type:");
    if (this.type == null) {
      sb.append("null");
    } else {
      sb.append(this.type);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("id:");
    sb.append(this.id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("latitude:");
    sb.append(this.latitude);
    first = false;
    if (!first) sb.append(", ");
    sb.append("longitude:");
    sb.append(this.longitude);
    first = false;
    if (!first) sb.append(", ");
    sb.append("place:");
    if (this.place == null) {
      sb.append("null");
    } else {
      sb.append(this.place);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
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

