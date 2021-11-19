/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * DogAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DogAllOf {
  public static final String SERIALIZED_NAME_BREED = "breed";
  @SerializedName(SERIALIZED_NAME_BREED)
  private String breed;

  public DogAllOf() { 
  }

  public DogAllOf breed(String breed) {
    
    this.breed = breed;
    return this;
  }

   /**
   * Get breed
   * @return breed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBreed() {
    return breed;
  }


  public void setBreed(String breed) {
    this.breed = breed;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DogAllOf dogAllOf = (DogAllOf) o;
    return Objects.equals(this.breed, dogAllOf.breed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(breed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DogAllOf {\n");
    sb.append("    breed: ").append(toIndentedString(breed)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("breed");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DogAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DogAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DogAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DogAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<DogAllOf>() {
           @Override
           public void write(JsonWriter out, DogAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DogAllOf read(JsonReader in) throws IOException {
             JsonObject obj = elementAdapter.read(in).getAsJsonObject();

             return thisAdapter.fromJsonTree(obj);
           }

       }.nullSafe();
    }
  }

  public static class CustomDeserializer implements JsonDeserializer<DogAllOf> {
    @Override
    public DogAllOf deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
      JsonObject obj = json.getAsJsonObject(); //since you know it's a JsonObject
      Set<Entry<String, JsonElement>> entries = obj.entrySet();//will return members of your object
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry: entries) {
        if (!DogAllOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException("The field `" + entry.getKey() + "` in the JSON string is not defined in the `DogAllOf` properties");
        }
      }

      // all checks passed, return using the original implementation of deserialize
      return new Gson().fromJson(json, DogAllOf.class);
    }
  }
}
