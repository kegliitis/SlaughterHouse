// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Product.proto

package via.sdj3.slaughterhouse.protobuf.product;

public interface GetProductResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:via.sdj3.slaughterhouse.protobuf.product.GetProductResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 id = 1;</code>
   * @return The id.
   */
  int getId();

  /**
   * <code>string name = 2;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string description = 3;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 3;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>repeated int32 animalParts = 4;</code>
   * @return A list containing the animalParts.
   */
  java.util.List<java.lang.Integer> getAnimalPartsList();
  /**
   * <code>repeated int32 animalParts = 4;</code>
   * @return The count of animalParts.
   */
  int getAnimalPartsCount();
  /**
   * <code>repeated int32 animalParts = 4;</code>
   * @param index The index of the element to return.
   * @return The animalParts at the given index.
   */
  int getAnimalParts(int index);

  /**
   * <code>int32 trayId = 5;</code>
   * @return The trayId.
   */
  int getTrayId();
}
