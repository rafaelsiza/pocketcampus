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

public class CookReceivedOrder implements org.apache.thrift.TBase<CookReceivedOrder, CookReceivedOrder._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CookReceivedOrder");

  private static final org.apache.thrift.protocol.TField ORDER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("orderId", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField ORDERED_ITEMS_FIELD_DESC = new org.apache.thrift.protocol.TField("orderedItems", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField USER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("userId", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField DATE_FIELD_DESC = new org.apache.thrift.protocol.TField("date", org.apache.thrift.protocol.TType.I64, (short)4);
  private static final org.apache.thrift.protocol.TField PRICE_FIELD_DESC = new org.apache.thrift.protocol.TField("price", org.apache.thrift.protocol.TType.DOUBLE, (short)5);

  public long orderId; // required
  public List<CookReceivedItem> orderedItems; // required
  public long userId; // required
  public long date; // required
  public double price; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ORDER_ID((short)1, "orderId"),
    ORDERED_ITEMS((short)2, "orderedItems"),
    USER_ID((short)3, "userId"),
    DATE((short)4, "date"),
    PRICE((short)5, "price");

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
        case 1: // ORDER_ID
          return ORDER_ID;
        case 2: // ORDERED_ITEMS
          return ORDERED_ITEMS;
        case 3: // USER_ID
          return USER_ID;
        case 4: // DATE
          return DATE;
        case 5: // PRICE
          return PRICE;
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
  private static final int __ORDERID_ISSET_ID = 0;
  private static final int __USERID_ISSET_ID = 1;
  private static final int __DATE_ISSET_ID = 2;
  private static final int __PRICE_ISSET_ID = 3;
  private BitSet __isset_bit_vector = new BitSet(4);

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ORDER_ID, new org.apache.thrift.meta_data.FieldMetaData("orderId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64        , "Id")));
    tmpMap.put(_Fields.ORDERED_ITEMS, new org.apache.thrift.meta_data.FieldMetaData("orderedItems", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, CookReceivedItem.class))));
    tmpMap.put(_Fields.USER_ID, new org.apache.thrift.meta_data.FieldMetaData("userId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64        , "Id")));
    tmpMap.put(_Fields.DATE, new org.apache.thrift.meta_data.FieldMetaData("date", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64        , "Timestamp")));
    tmpMap.put(_Fields.PRICE, new org.apache.thrift.meta_data.FieldMetaData("price", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CookReceivedOrder.class, metaDataMap);
  }

  public CookReceivedOrder() {
  }

  public CookReceivedOrder(
    long orderId,
    List<CookReceivedItem> orderedItems,
    long userId,
    long date,
    double price)
  {
    this();
    this.orderId = orderId;
    setOrderIdIsSet(true);
    this.orderedItems = orderedItems;
    this.userId = userId;
    setUserIdIsSet(true);
    this.date = date;
    setDateIsSet(true);
    this.price = price;
    setPriceIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CookReceivedOrder(CookReceivedOrder other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.orderId = other.orderId;
    if (other.isSetOrderedItems()) {
      List<CookReceivedItem> __this__orderedItems = new ArrayList<CookReceivedItem>();
      for (CookReceivedItem other_element : other.orderedItems) {
        __this__orderedItems.add(new CookReceivedItem(other_element));
      }
      this.orderedItems = __this__orderedItems;
    }
    this.userId = other.userId;
    this.date = other.date;
    this.price = other.price;
  }

  public CookReceivedOrder deepCopy() {
    return new CookReceivedOrder(this);
  }

  @Override
  public void clear() {
    setOrderIdIsSet(false);
    this.orderId = 0;
    this.orderedItems = null;
    setUserIdIsSet(false);
    this.userId = 0;
    setDateIsSet(false);
    this.date = 0;
    setPriceIsSet(false);
    this.price = 0.0;
  }

  public long getOrderId() {
    return this.orderId;
  }

  public CookReceivedOrder setOrderId(long orderId) {
    this.orderId = orderId;
    setOrderIdIsSet(true);
    return this;
  }

  public void unsetOrderId() {
    __isset_bit_vector.clear(__ORDERID_ISSET_ID);
  }

  /** Returns true if field orderId is set (has been assigned a value) and false otherwise */
  public boolean isSetOrderId() {
    return __isset_bit_vector.get(__ORDERID_ISSET_ID);
  }

  public void setOrderIdIsSet(boolean value) {
    __isset_bit_vector.set(__ORDERID_ISSET_ID, value);
  }

  public int getOrderedItemsSize() {
    return (this.orderedItems == null) ? 0 : this.orderedItems.size();
  }

  public java.util.Iterator<CookReceivedItem> getOrderedItemsIterator() {
    return (this.orderedItems == null) ? null : this.orderedItems.iterator();
  }

  public void addToOrderedItems(CookReceivedItem elem) {
    if (this.orderedItems == null) {
      this.orderedItems = new ArrayList<CookReceivedItem>();
    }
    this.orderedItems.add(elem);
  }

  public List<CookReceivedItem> getOrderedItems() {
    return this.orderedItems;
  }

  public CookReceivedOrder setOrderedItems(List<CookReceivedItem> orderedItems) {
    this.orderedItems = orderedItems;
    return this;
  }

  public void unsetOrderedItems() {
    this.orderedItems = null;
  }

  /** Returns true if field orderedItems is set (has been assigned a value) and false otherwise */
  public boolean isSetOrderedItems() {
    return this.orderedItems != null;
  }

  public void setOrderedItemsIsSet(boolean value) {
    if (!value) {
      this.orderedItems = null;
    }
  }

  public long getUserId() {
    return this.userId;
  }

  public CookReceivedOrder setUserId(long userId) {
    this.userId = userId;
    setUserIdIsSet(true);
    return this;
  }

  public void unsetUserId() {
    __isset_bit_vector.clear(__USERID_ISSET_ID);
  }

  /** Returns true if field userId is set (has been assigned a value) and false otherwise */
  public boolean isSetUserId() {
    return __isset_bit_vector.get(__USERID_ISSET_ID);
  }

  public void setUserIdIsSet(boolean value) {
    __isset_bit_vector.set(__USERID_ISSET_ID, value);
  }

  public long getDate() {
    return this.date;
  }

  public CookReceivedOrder setDate(long date) {
    this.date = date;
    setDateIsSet(true);
    return this;
  }

  public void unsetDate() {
    __isset_bit_vector.clear(__DATE_ISSET_ID);
  }

  /** Returns true if field date is set (has been assigned a value) and false otherwise */
  public boolean isSetDate() {
    return __isset_bit_vector.get(__DATE_ISSET_ID);
  }

  public void setDateIsSet(boolean value) {
    __isset_bit_vector.set(__DATE_ISSET_ID, value);
  }

  public double getPrice() {
    return this.price;
  }

  public CookReceivedOrder setPrice(double price) {
    this.price = price;
    setPriceIsSet(true);
    return this;
  }

  public void unsetPrice() {
    __isset_bit_vector.clear(__PRICE_ISSET_ID);
  }

  /** Returns true if field price is set (has been assigned a value) and false otherwise */
  public boolean isSetPrice() {
    return __isset_bit_vector.get(__PRICE_ISSET_ID);
  }

  public void setPriceIsSet(boolean value) {
    __isset_bit_vector.set(__PRICE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ORDER_ID:
      if (value == null) {
        unsetOrderId();
      } else {
        setOrderId((Long)value);
      }
      break;

    case ORDERED_ITEMS:
      if (value == null) {
        unsetOrderedItems();
      } else {
        setOrderedItems((List<CookReceivedItem>)value);
      }
      break;

    case USER_ID:
      if (value == null) {
        unsetUserId();
      } else {
        setUserId((Long)value);
      }
      break;

    case DATE:
      if (value == null) {
        unsetDate();
      } else {
        setDate((Long)value);
      }
      break;

    case PRICE:
      if (value == null) {
        unsetPrice();
      } else {
        setPrice((Double)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ORDER_ID:
      return Long.valueOf(getOrderId());

    case ORDERED_ITEMS:
      return getOrderedItems();

    case USER_ID:
      return Long.valueOf(getUserId());

    case DATE:
      return Long.valueOf(getDate());

    case PRICE:
      return Double.valueOf(getPrice());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ORDER_ID:
      return isSetOrderId();
    case ORDERED_ITEMS:
      return isSetOrderedItems();
    case USER_ID:
      return isSetUserId();
    case DATE:
      return isSetDate();
    case PRICE:
      return isSetPrice();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CookReceivedOrder)
      return this.equals((CookReceivedOrder)that);
    return false;
  }

  public boolean equals(CookReceivedOrder that) {
    if (that == null)
      return false;

    boolean this_present_orderId = true;
    boolean that_present_orderId = true;
    if (this_present_orderId || that_present_orderId) {
      if (!(this_present_orderId && that_present_orderId))
        return false;
      if (this.orderId != that.orderId)
        return false;
    }

    boolean this_present_orderedItems = true && this.isSetOrderedItems();
    boolean that_present_orderedItems = true && that.isSetOrderedItems();
    if (this_present_orderedItems || that_present_orderedItems) {
      if (!(this_present_orderedItems && that_present_orderedItems))
        return false;
      if (!this.orderedItems.equals(that.orderedItems))
        return false;
    }

    boolean this_present_userId = true;
    boolean that_present_userId = true;
    if (this_present_userId || that_present_userId) {
      if (!(this_present_userId && that_present_userId))
        return false;
      if (this.userId != that.userId)
        return false;
    }

    boolean this_present_date = true;
    boolean that_present_date = true;
    if (this_present_date || that_present_date) {
      if (!(this_present_date && that_present_date))
        return false;
      if (this.date != that.date)
        return false;
    }

    boolean this_present_price = true;
    boolean that_present_price = true;
    if (this_present_price || that_present_price) {
      if (!(this_present_price && that_present_price))
        return false;
      if (this.price != that.price)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_orderId = true;
    builder.append(present_orderId);
    if (present_orderId)
      builder.append(orderId);

    boolean present_orderedItems = true && (isSetOrderedItems());
    builder.append(present_orderedItems);
    if (present_orderedItems)
      builder.append(orderedItems);

    boolean present_userId = true;
    builder.append(present_userId);
    if (present_userId)
      builder.append(userId);

    boolean present_date = true;
    builder.append(present_date);
    if (present_date)
      builder.append(date);

    boolean present_price = true;
    builder.append(present_price);
    if (present_price)
      builder.append(price);

    return builder.toHashCode();
  }

  public int compareTo(CookReceivedOrder other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    CookReceivedOrder typedOther = (CookReceivedOrder)other;

    lastComparison = Boolean.valueOf(isSetOrderId()).compareTo(typedOther.isSetOrderId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOrderId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.orderId, typedOther.orderId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOrderedItems()).compareTo(typedOther.isSetOrderedItems());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOrderedItems()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.orderedItems, typedOther.orderedItems);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUserId()).compareTo(typedOther.isSetUserId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userId, typedOther.userId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDate()).compareTo(typedOther.isSetDate());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDate()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.date, typedOther.date);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPrice()).compareTo(typedOther.isSetPrice());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPrice()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.price, typedOther.price);
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
        case 1: // ORDER_ID
          if (field.type == org.apache.thrift.protocol.TType.I64) {
            this.orderId = iprot.readI64();
            setOrderIdIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // ORDERED_ITEMS
          if (field.type == org.apache.thrift.protocol.TType.LIST) {
            {
              org.apache.thrift.protocol.TList _list46 = iprot.readListBegin();
              this.orderedItems = new ArrayList<CookReceivedItem>(_list46.size);
              for (int _i47 = 0; _i47 < _list46.size; ++_i47)
              {
                CookReceivedItem _elem48; // required
                _elem48 = new CookReceivedItem();
                _elem48.read(iprot);
                this.orderedItems.add(_elem48);
              }
              iprot.readListEnd();
            }
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // USER_ID
          if (field.type == org.apache.thrift.protocol.TType.I64) {
            this.userId = iprot.readI64();
            setUserIdIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // DATE
          if (field.type == org.apache.thrift.protocol.TType.I64) {
            this.date = iprot.readI64();
            setDateIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // PRICE
          if (field.type == org.apache.thrift.protocol.TType.DOUBLE) {
            this.price = iprot.readDouble();
            setPriceIsSet(true);
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
    if (!isSetOrderId()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'orderId' was not found in serialized data! Struct: " + toString());
    }
    if (!isSetUserId()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'userId' was not found in serialized data! Struct: " + toString());
    }
    if (!isSetDate()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'date' was not found in serialized data! Struct: " + toString());
    }
    if (!isSetPrice()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'price' was not found in serialized data! Struct: " + toString());
    }
    validate();
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    oprot.writeFieldBegin(ORDER_ID_FIELD_DESC);
    oprot.writeI64(this.orderId);
    oprot.writeFieldEnd();
    if (this.orderedItems != null) {
      oprot.writeFieldBegin(ORDERED_ITEMS_FIELD_DESC);
      {
        oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, this.orderedItems.size()));
        for (CookReceivedItem _iter49 : this.orderedItems)
        {
          _iter49.write(oprot);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(USER_ID_FIELD_DESC);
    oprot.writeI64(this.userId);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(DATE_FIELD_DESC);
    oprot.writeI64(this.date);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(PRICE_FIELD_DESC);
    oprot.writeDouble(this.price);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("CookReceivedOrder(");
    boolean first = true;

    sb.append("orderId:");
    sb.append(this.orderId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("orderedItems:");
    if (this.orderedItems == null) {
      sb.append("null");
    } else {
      sb.append(this.orderedItems);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("userId:");
    sb.append(this.userId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("date:");
    sb.append(this.date);
    first = false;
    if (!first) sb.append(", ");
    sb.append("price:");
    sb.append(this.price);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'orderId' because it's a primitive and you chose the non-beans generator.
    if (orderedItems == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'orderedItems' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'userId' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'date' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'price' because it's a primitive and you chose the non-beans generator.
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

