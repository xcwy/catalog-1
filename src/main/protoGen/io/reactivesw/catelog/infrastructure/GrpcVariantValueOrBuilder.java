// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: reactivesw-catelog.proto

package io.reactivesw.catelog.infrastructure;

public interface GrpcVariantValueOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.reactivesw.catelog.grpc.GrpcVariantValue)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int64 id = 1;</code>
   */
  long getId();

  /**
   * <code>optional string value = 2;</code>
   */
  java.lang.String getValue();
  /**
   * <code>optional string value = 2;</code>
   */
  com.google.protobuf.ByteString
      getValueBytes();

  /**
   * <code>optional int32 displayOrder = 3;</code>
   */
  int getDisplayOrder();

  /**
   * <code>optional string priceAdjustment = 4;</code>
   */
  java.lang.String getPriceAdjustment();
  /**
   * <code>optional string priceAdjustment = 4;</code>
   */
  com.google.protobuf.ByteString
      getPriceAdjustmentBytes();
}