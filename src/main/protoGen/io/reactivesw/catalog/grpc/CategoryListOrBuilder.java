// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: catalog_message.proto

package io.reactivesw.catalog.grpc;

public interface CategoryListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.reactivesw.catalog.infrastructure.CategoryList)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .io.reactivesw.catalog.infrastructure.GrpcCategory category = 1;</code>
   */
  java.util.List<io.reactivesw.catalog.grpc.GrpcCategory> 
      getCategoryList();
  /**
   * <code>repeated .io.reactivesw.catalog.infrastructure.GrpcCategory category = 1;</code>
   */
  io.reactivesw.catalog.grpc.GrpcCategory getCategory(int index);
  /**
   * <code>repeated .io.reactivesw.catalog.infrastructure.GrpcCategory category = 1;</code>
   */
  int getCategoryCount();
  /**
   * <code>repeated .io.reactivesw.catalog.infrastructure.GrpcCategory category = 1;</code>
   */
  java.util.List<? extends io.reactivesw.catalog.grpc.GrpcCategoryOrBuilder> 
      getCategoryOrBuilderList();
  /**
   * <code>repeated .io.reactivesw.catalog.infrastructure.GrpcCategory category = 1;</code>
   */
  io.reactivesw.catalog.grpc.GrpcCategoryOrBuilder getCategoryOrBuilder(
      int index);
}