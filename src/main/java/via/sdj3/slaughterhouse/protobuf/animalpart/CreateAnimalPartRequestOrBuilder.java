// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AnimalPart.proto

package via.sdj3.slaughterhouse.protobuf.animalpart;

public interface CreateAnimalPartRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:via.sdj3.slaughterhouse.protobuf.animalpart.CreateAnimalPartRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>double weight = 1;</code>
   * @return The weight.
   */
  double getWeight();

  /**
   * <code>int32 animalId = 2;</code>
   * @return The animalId.
   */
  int getAnimalId();

  /**
   * <code>int32 trayId = 3;</code>
   * @return The trayId.
   */
  int getTrayId();

  /**
   * <code>int32 animalPartTypeId = 4;</code>
   * @return The animalPartTypeId.
   */
  int getAnimalPartTypeId();
}
