// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: reactivesw-catelog.proto

package io.reactivesw.catelog.infrastructure;

public interface GrpcProductOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.reactivesw.catelog.grpc.GrpcProduct)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int64 id = 1;</code>
   */
  long getId();

  /**
   * <code>optional string manufacturer = 2;</code>
   */
  java.lang.String getManufacturer();
  /**
   * <code>optional string manufacturer = 2;</code>
   */
  com.google.protobuf.ByteString
      getManufacturerBytes();

  /**
   * <code>optional string brand = 3;</code>
   */
  java.lang.String getBrand();
  /**
   * <code>optional string brand = 3;</code>
   */
  com.google.protobuf.ByteString
      getBrandBytes();

  /**
   * <code>optional string model = 4;</code>
   */
  java.lang.String getModel();
  /**
   * <code>optional string model = 4;</code>
   */
  com.google.protobuf.ByteString
      getModelBytes();

  /**
   * <code>optional string name = 5;</code>
   */
  java.lang.String getName();
  /**
   * <code>optional string name = 5;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>optional string price = 6;</code>
   */
  java.lang.String getPrice();
  /**
   * <code>optional string price = 6;</code>
   */
  com.google.protobuf.ByteString
      getPriceBytes();

  /**
   * <code>optional int32 displayOrder = 7;</code>
   */
  int getDisplayOrder();

  /**
   * <code>optional string description = 8;</code>
   */
  java.lang.String getDescription();
  /**
   * <code>optional string description = 8;</code>
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>optional string detail = 9;</code>
   */
  java.lang.String getDetail();
  /**
   * <code>optional string detail = 9;</code>
   */
  com.google.protobuf.ByteString
      getDetailBytes();

  /**
   * <code>optional bool isDisplayed = 10;</code>
   */
  boolean getIsDisplayed();

  /**
   * <code>optional bool isDeleted = 11;</code>
   */
  boolean getIsDeleted();

  /**
   * <code>repeated .io.reactivesw.catelog.grpc.GrpcAttribute attribute = 12;</code>
   */
  java.util.List<io.reactivesw.catelog.infrastructure.GrpcAttribute> 
      getAttributeList();
  /**
   * <code>repeated .io.reactivesw.catelog.grpc.GrpcAttribute attribute = 12;</code>
   */
  io.reactivesw.catelog.infrastructure.GrpcAttribute getAttribute(int index);
  /**
   * <code>repeated .io.reactivesw.catelog.grpc.GrpcAttribute attribute = 12;</code>
   */
  int getAttributeCount();
  /**
   * <code>repeated .io.reactivesw.catelog.grpc.GrpcAttribute attribute = 12;</code>
   */
  java.util.List<? extends io.reactivesw.catelog.infrastructure.GrpcAttributeOrBuilder> 
      getAttributeOrBuilderList();
  /**
   * <code>repeated .io.reactivesw.catelog.grpc.GrpcAttribute attribute = 12;</code>
   */
  io.reactivesw.catelog.infrastructure.GrpcAttributeOrBuilder getAttributeOrBuilder(
      int index);

  /**
   * <code>repeated .io.reactivesw.catelog.grpc.GrpcSku sku = 13;</code>
   */
  java.util.List<io.reactivesw.catelog.infrastructure.GrpcSku> 
      getSkuList();
  /**
   * <code>repeated .io.reactivesw.catelog.grpc.GrpcSku sku = 13;</code>
   */
  io.reactivesw.catelog.infrastructure.GrpcSku getSku(int index);
  /**
   * <code>repeated .io.reactivesw.catelog.grpc.GrpcSku sku = 13;</code>
   */
  int getSkuCount();
  /**
   * <code>repeated .io.reactivesw.catelog.grpc.GrpcSku sku = 13;</code>
   */
  java.util.List<? extends io.reactivesw.catelog.infrastructure.GrpcSkuOrBuilder> 
      getSkuOrBuilderList();
  /**
   * <code>repeated .io.reactivesw.catelog.grpc.GrpcSku sku = 13;</code>
   */
  io.reactivesw.catelog.infrastructure.GrpcSkuOrBuilder getSkuOrBuilder(
      int index);

  /**
   * <code>repeated .io.reactivesw.catelog.grpc.GrpcVariant variant = 14;</code>
   */
  java.util.List<io.reactivesw.catelog.infrastructure.GrpcVariant> 
      getVariantList();
  /**
   * <code>repeated .io.reactivesw.catelog.grpc.GrpcVariant variant = 14;</code>
   */
  io.reactivesw.catelog.infrastructure.GrpcVariant getVariant(int index);
  /**
   * <code>repeated .io.reactivesw.catelog.grpc.GrpcVariant variant = 14;</code>
   */
  int getVariantCount();
  /**
   * <code>repeated .io.reactivesw.catelog.grpc.GrpcVariant variant = 14;</code>
   */
  java.util.List<? extends io.reactivesw.catelog.infrastructure.GrpcVariantOrBuilder> 
      getVariantOrBuilderList();
  /**
   * <code>repeated .io.reactivesw.catelog.grpc.GrpcVariant variant = 14;</code>
   */
  io.reactivesw.catelog.infrastructure.GrpcVariantOrBuilder getVariantOrBuilder(
      int index);

  /**
   * <code>repeated .io.reactivesw.catelog.grpc.GrpcFeature feature = 15;</code>
   */
  java.util.List<io.reactivesw.catelog.infrastructure.GrpcFeature> 
      getFeatureList();
  /**
   * <code>repeated .io.reactivesw.catelog.grpc.GrpcFeature feature = 15;</code>
   */
  io.reactivesw.catelog.infrastructure.GrpcFeature getFeature(int index);
  /**
   * <code>repeated .io.reactivesw.catelog.grpc.GrpcFeature feature = 15;</code>
   */
  int getFeatureCount();
  /**
   * <code>repeated .io.reactivesw.catelog.grpc.GrpcFeature feature = 15;</code>
   */
  java.util.List<? extends io.reactivesw.catelog.infrastructure.GrpcFeatureOrBuilder> 
      getFeatureOrBuilderList();
  /**
   * <code>repeated .io.reactivesw.catelog.grpc.GrpcFeature feature = 15;</code>
   */
  io.reactivesw.catelog.infrastructure.GrpcFeatureOrBuilder getFeatureOrBuilder(
      int index);
}