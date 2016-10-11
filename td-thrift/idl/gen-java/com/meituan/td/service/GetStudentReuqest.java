/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.meituan.td.service;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
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
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-08-02")
public class GetStudentReuqest implements org.apache.thrift.TBase<GetStudentReuqest, GetStudentReuqest._Fields>, java.io.Serializable, Cloneable, Comparable<GetStudentReuqest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GetStudentReuqest");

  private static final org.apache.thrift.protocol.TField PARAM_FIELD_DESC = new org.apache.thrift.protocol.TField("param", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField BASE_FIELD_DESC = new org.apache.thrift.protocol.TField("base", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new GetStudentReuqestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new GetStudentReuqestTupleSchemeFactory());
  }

  public Param param; // required
  public Base base; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PARAM((short)1, "param"),
    BASE((short)2, "base");

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
        case 1: // PARAM
          return PARAM;
        case 2: // BASE
          return BASE;
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
    tmpMap.put(_Fields.PARAM, new org.apache.thrift.meta_data.FieldMetaData("param", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Param.class)));
    tmpMap.put(_Fields.BASE, new org.apache.thrift.meta_data.FieldMetaData("base", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Base.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GetStudentReuqest.class, metaDataMap);
  }

  public GetStudentReuqest() {
  }

  public GetStudentReuqest(
    Param param,
    Base base)
  {
    this();
    this.param = param;
    this.base = base;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetStudentReuqest(GetStudentReuqest other) {
    if (other.isSetParam()) {
      this.param = new Param(other.param);
    }
    if (other.isSetBase()) {
      this.base = new Base(other.base);
    }
  }

  public GetStudentReuqest deepCopy() {
    return new GetStudentReuqest(this);
  }

  @Override
  public void clear() {
    this.param = null;
    this.base = null;
  }

  public Param getParam() {
    return this.param;
  }

  public GetStudentReuqest setParam(Param param) {
    this.param = param;
    return this;
  }

  public void unsetParam() {
    this.param = null;
  }

  /** Returns true if field param is set (has been assigned a value) and false otherwise */
  public boolean isSetParam() {
    return this.param != null;
  }

  public void setParamIsSet(boolean value) {
    if (!value) {
      this.param = null;
    }
  }

  public Base getBase() {
    return this.base;
  }

  public GetStudentReuqest setBase(Base base) {
    this.base = base;
    return this;
  }

  public void unsetBase() {
    this.base = null;
  }

  /** Returns true if field base is set (has been assigned a value) and false otherwise */
  public boolean isSetBase() {
    return this.base != null;
  }

  public void setBaseIsSet(boolean value) {
    if (!value) {
      this.base = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PARAM:
      if (value == null) {
        unsetParam();
      } else {
        setParam((Param)value);
      }
      break;

    case BASE:
      if (value == null) {
        unsetBase();
      } else {
        setBase((Base)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PARAM:
      return getParam();

    case BASE:
      return getBase();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PARAM:
      return isSetParam();
    case BASE:
      return isSetBase();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GetStudentReuqest)
      return this.equals((GetStudentReuqest)that);
    return false;
  }

  public boolean equals(GetStudentReuqest that) {
    if (that == null)
      return false;

    boolean this_present_param = true && this.isSetParam();
    boolean that_present_param = true && that.isSetParam();
    if (this_present_param || that_present_param) {
      if (!(this_present_param && that_present_param))
        return false;
      if (!this.param.equals(that.param))
        return false;
    }

    boolean this_present_base = true && this.isSetBase();
    boolean that_present_base = true && that.isSetBase();
    if (this_present_base || that_present_base) {
      if (!(this_present_base && that_present_base))
        return false;
      if (!this.base.equals(that.base))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_param = true && (isSetParam());
    list.add(present_param);
    if (present_param)
      list.add(param);

    boolean present_base = true && (isSetBase());
    list.add(present_base);
    if (present_base)
      list.add(base);

    return list.hashCode();
  }

  @Override
  public int compareTo(GetStudentReuqest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetParam()).compareTo(other.isSetParam());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetParam()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.param, other.param);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBase()).compareTo(other.isSetBase());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBase()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.base, other.base);
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
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("GetStudentReuqest(");
    boolean first = true;

    sb.append("param:");
    if (this.param == null) {
      sb.append("null");
    } else {
      sb.append(this.param);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("base:");
    if (this.base == null) {
      sb.append("null");
    } else {
      sb.append(this.base);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (param != null) {
      param.validate();
    }
    if (base != null) {
      base.validate();
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

  private static class GetStudentReuqestStandardSchemeFactory implements SchemeFactory {
    public GetStudentReuqestStandardScheme getScheme() {
      return new GetStudentReuqestStandardScheme();
    }
  }

  private static class GetStudentReuqestStandardScheme extends StandardScheme<GetStudentReuqest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GetStudentReuqest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PARAM
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.param = new Param();
              struct.param.read(iprot);
              struct.setParamIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // BASE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.base = new Base();
              struct.base.read(iprot);
              struct.setBaseIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, GetStudentReuqest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.param != null) {
        oprot.writeFieldBegin(PARAM_FIELD_DESC);
        struct.param.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.base != null) {
        oprot.writeFieldBegin(BASE_FIELD_DESC);
        struct.base.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GetStudentReuqestTupleSchemeFactory implements SchemeFactory {
    public GetStudentReuqestTupleScheme getScheme() {
      return new GetStudentReuqestTupleScheme();
    }
  }

  private static class GetStudentReuqestTupleScheme extends TupleScheme<GetStudentReuqest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, GetStudentReuqest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetParam()) {
        optionals.set(0);
      }
      if (struct.isSetBase()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetParam()) {
        struct.param.write(oprot);
      }
      if (struct.isSetBase()) {
        struct.base.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, GetStudentReuqest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.param = new Param();
        struct.param.read(iprot);
        struct.setParamIsSet(true);
      }
      if (incoming.get(1)) {
        struct.base = new Base();
        struct.base.read(iprot);
        struct.setBaseIsSet(true);
      }
    }
  }

}
