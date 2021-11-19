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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * AdditionalPropertiesClass
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdditionalPropertiesClass {
  public static final String SERIALIZED_NAME_MAP_PROPERTY = "map_property";
  @SerializedName(SERIALIZED_NAME_MAP_PROPERTY)
  private Map<String, String> mapProperty = null;

  public static final String SERIALIZED_NAME_MAP_OF_MAP_PROPERTY = "map_of_map_property";
  @SerializedName(SERIALIZED_NAME_MAP_OF_MAP_PROPERTY)
  private Map<String, Map<String, String>> mapOfMapProperty = null;

  public static final String SERIALIZED_NAME_ANYTYPE1 = "anytype_1";
  @SerializedName(SERIALIZED_NAME_ANYTYPE1)
  private Object anytype1 = null;

  public static final String SERIALIZED_NAME_MAP_WITH_UNDECLARED_PROPERTIES_ANYTYPE1 = "map_with_undeclared_properties_anytype_1";
  @SerializedName(SERIALIZED_NAME_MAP_WITH_UNDECLARED_PROPERTIES_ANYTYPE1)
  private Object mapWithUndeclaredPropertiesAnytype1;

  public static final String SERIALIZED_NAME_MAP_WITH_UNDECLARED_PROPERTIES_ANYTYPE2 = "map_with_undeclared_properties_anytype_2";
  @SerializedName(SERIALIZED_NAME_MAP_WITH_UNDECLARED_PROPERTIES_ANYTYPE2)
  private Object mapWithUndeclaredPropertiesAnytype2;

  public static final String SERIALIZED_NAME_MAP_WITH_UNDECLARED_PROPERTIES_ANYTYPE3 = "map_with_undeclared_properties_anytype_3";
  @SerializedName(SERIALIZED_NAME_MAP_WITH_UNDECLARED_PROPERTIES_ANYTYPE3)
  private Map<String, Object> mapWithUndeclaredPropertiesAnytype3 = null;

  public static final String SERIALIZED_NAME_EMPTY_MAP = "empty_map";
  @SerializedName(SERIALIZED_NAME_EMPTY_MAP)
  private Object emptyMap;

  public static final String SERIALIZED_NAME_MAP_WITH_UNDECLARED_PROPERTIES_STRING = "map_with_undeclared_properties_string";
  @SerializedName(SERIALIZED_NAME_MAP_WITH_UNDECLARED_PROPERTIES_STRING)
  private Map<String, String> mapWithUndeclaredPropertiesString = null;

  public AdditionalPropertiesClass() { 
  }

  public AdditionalPropertiesClass mapProperty(Map<String, String> mapProperty) {
    
    this.mapProperty = mapProperty;
    return this;
  }

  public AdditionalPropertiesClass putMapPropertyItem(String key, String mapPropertyItem) {
    if (this.mapProperty == null) {
      this.mapProperty = new HashMap<String, String>();
    }
    this.mapProperty.put(key, mapPropertyItem);
    return this;
  }

   /**
   * Get mapProperty
   * @return mapProperty
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getMapProperty() {
    return mapProperty;
  }


  public void setMapProperty(Map<String, String> mapProperty) {
    this.mapProperty = mapProperty;
  }


  public AdditionalPropertiesClass mapOfMapProperty(Map<String, Map<String, String>> mapOfMapProperty) {
    
    this.mapOfMapProperty = mapOfMapProperty;
    return this;
  }

  public AdditionalPropertiesClass putMapOfMapPropertyItem(String key, Map<String, String> mapOfMapPropertyItem) {
    if (this.mapOfMapProperty == null) {
      this.mapOfMapProperty = new HashMap<String, Map<String, String>>();
    }
    this.mapOfMapProperty.put(key, mapOfMapPropertyItem);
    return this;
  }

   /**
   * Get mapOfMapProperty
   * @return mapOfMapProperty
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Map<String, String>> getMapOfMapProperty() {
    return mapOfMapProperty;
  }


  public void setMapOfMapProperty(Map<String, Map<String, String>> mapOfMapProperty) {
    this.mapOfMapProperty = mapOfMapProperty;
  }


  public AdditionalPropertiesClass anytype1(Object anytype1) {
    
    this.anytype1 = anytype1;
    return this;
  }

   /**
   * Get anytype1
   * @return anytype1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getAnytype1() {
    return anytype1;
  }


  public void setAnytype1(Object anytype1) {
    this.anytype1 = anytype1;
  }


  public AdditionalPropertiesClass mapWithUndeclaredPropertiesAnytype1(Object mapWithUndeclaredPropertiesAnytype1) {
    
    this.mapWithUndeclaredPropertiesAnytype1 = mapWithUndeclaredPropertiesAnytype1;
    return this;
  }

   /**
   * Get mapWithUndeclaredPropertiesAnytype1
   * @return mapWithUndeclaredPropertiesAnytype1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getMapWithUndeclaredPropertiesAnytype1() {
    return mapWithUndeclaredPropertiesAnytype1;
  }


  public void setMapWithUndeclaredPropertiesAnytype1(Object mapWithUndeclaredPropertiesAnytype1) {
    this.mapWithUndeclaredPropertiesAnytype1 = mapWithUndeclaredPropertiesAnytype1;
  }


  public AdditionalPropertiesClass mapWithUndeclaredPropertiesAnytype2(Object mapWithUndeclaredPropertiesAnytype2) {
    
    this.mapWithUndeclaredPropertiesAnytype2 = mapWithUndeclaredPropertiesAnytype2;
    return this;
  }

   /**
   * Get mapWithUndeclaredPropertiesAnytype2
   * @return mapWithUndeclaredPropertiesAnytype2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getMapWithUndeclaredPropertiesAnytype2() {
    return mapWithUndeclaredPropertiesAnytype2;
  }


  public void setMapWithUndeclaredPropertiesAnytype2(Object mapWithUndeclaredPropertiesAnytype2) {
    this.mapWithUndeclaredPropertiesAnytype2 = mapWithUndeclaredPropertiesAnytype2;
  }


  public AdditionalPropertiesClass mapWithUndeclaredPropertiesAnytype3(Map<String, Object> mapWithUndeclaredPropertiesAnytype3) {
    
    this.mapWithUndeclaredPropertiesAnytype3 = mapWithUndeclaredPropertiesAnytype3;
    return this;
  }

  public AdditionalPropertiesClass putMapWithUndeclaredPropertiesAnytype3Item(String key, Object mapWithUndeclaredPropertiesAnytype3Item) {
    if (this.mapWithUndeclaredPropertiesAnytype3 == null) {
      this.mapWithUndeclaredPropertiesAnytype3 = new HashMap<String, Object>();
    }
    this.mapWithUndeclaredPropertiesAnytype3.put(key, mapWithUndeclaredPropertiesAnytype3Item);
    return this;
  }

   /**
   * Get mapWithUndeclaredPropertiesAnytype3
   * @return mapWithUndeclaredPropertiesAnytype3
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Object> getMapWithUndeclaredPropertiesAnytype3() {
    return mapWithUndeclaredPropertiesAnytype3;
  }


  public void setMapWithUndeclaredPropertiesAnytype3(Map<String, Object> mapWithUndeclaredPropertiesAnytype3) {
    this.mapWithUndeclaredPropertiesAnytype3 = mapWithUndeclaredPropertiesAnytype3;
  }


  public AdditionalPropertiesClass emptyMap(Object emptyMap) {
    
    this.emptyMap = emptyMap;
    return this;
  }

   /**
   * an object with no declared properties and no undeclared properties, hence it&#39;s an empty map.
   * @return emptyMap
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "an object with no declared properties and no undeclared properties, hence it's an empty map.")

  public Object getEmptyMap() {
    return emptyMap;
  }


  public void setEmptyMap(Object emptyMap) {
    this.emptyMap = emptyMap;
  }


  public AdditionalPropertiesClass mapWithUndeclaredPropertiesString(Map<String, String> mapWithUndeclaredPropertiesString) {
    
    this.mapWithUndeclaredPropertiesString = mapWithUndeclaredPropertiesString;
    return this;
  }

  public AdditionalPropertiesClass putMapWithUndeclaredPropertiesStringItem(String key, String mapWithUndeclaredPropertiesStringItem) {
    if (this.mapWithUndeclaredPropertiesString == null) {
      this.mapWithUndeclaredPropertiesString = new HashMap<String, String>();
    }
    this.mapWithUndeclaredPropertiesString.put(key, mapWithUndeclaredPropertiesStringItem);
    return this;
  }

   /**
   * Get mapWithUndeclaredPropertiesString
   * @return mapWithUndeclaredPropertiesString
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getMapWithUndeclaredPropertiesString() {
    return mapWithUndeclaredPropertiesString;
  }


  public void setMapWithUndeclaredPropertiesString(Map<String, String> mapWithUndeclaredPropertiesString) {
    this.mapWithUndeclaredPropertiesString = mapWithUndeclaredPropertiesString;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalPropertiesClass additionalPropertiesClass = (AdditionalPropertiesClass) o;
    return Objects.equals(this.mapProperty, additionalPropertiesClass.mapProperty) &&
        Objects.equals(this.mapOfMapProperty, additionalPropertiesClass.mapOfMapProperty) &&
        Objects.equals(this.anytype1, additionalPropertiesClass.anytype1) &&
        Objects.equals(this.mapWithUndeclaredPropertiesAnytype1, additionalPropertiesClass.mapWithUndeclaredPropertiesAnytype1) &&
        Objects.equals(this.mapWithUndeclaredPropertiesAnytype2, additionalPropertiesClass.mapWithUndeclaredPropertiesAnytype2) &&
        Objects.equals(this.mapWithUndeclaredPropertiesAnytype3, additionalPropertiesClass.mapWithUndeclaredPropertiesAnytype3) &&
        Objects.equals(this.emptyMap, additionalPropertiesClass.emptyMap) &&
        Objects.equals(this.mapWithUndeclaredPropertiesString, additionalPropertiesClass.mapWithUndeclaredPropertiesString);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(mapProperty, mapOfMapProperty, anytype1, mapWithUndeclaredPropertiesAnytype1, mapWithUndeclaredPropertiesAnytype2, mapWithUndeclaredPropertiesAnytype3, emptyMap, mapWithUndeclaredPropertiesString);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalPropertiesClass {\n");
    sb.append("    mapProperty: ").append(toIndentedString(mapProperty)).append("\n");
    sb.append("    mapOfMapProperty: ").append(toIndentedString(mapOfMapProperty)).append("\n");
    sb.append("    anytype1: ").append(toIndentedString(anytype1)).append("\n");
    sb.append("    mapWithUndeclaredPropertiesAnytype1: ").append(toIndentedString(mapWithUndeclaredPropertiesAnytype1)).append("\n");
    sb.append("    mapWithUndeclaredPropertiesAnytype2: ").append(toIndentedString(mapWithUndeclaredPropertiesAnytype2)).append("\n");
    sb.append("    mapWithUndeclaredPropertiesAnytype3: ").append(toIndentedString(mapWithUndeclaredPropertiesAnytype3)).append("\n");
    sb.append("    emptyMap: ").append(toIndentedString(emptyMap)).append("\n");
    sb.append("    mapWithUndeclaredPropertiesString: ").append(toIndentedString(mapWithUndeclaredPropertiesString)).append("\n");
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
    openapiFields.add("map_property");
    openapiFields.add("map_of_map_property");
    openapiFields.add("anytype_1");
    openapiFields.add("map_with_undeclared_properties_anytype_1");
    openapiFields.add("map_with_undeclared_properties_anytype_2");
    openapiFields.add("map_with_undeclared_properties_anytype_3");
    openapiFields.add("empty_map");
    openapiFields.add("map_with_undeclared_properties_string");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdditionalPropertiesClass.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdditionalPropertiesClass' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdditionalPropertiesClass> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdditionalPropertiesClass.class));

       return (TypeAdapter<T>) new TypeAdapter<AdditionalPropertiesClass>() {
           @Override
           public void write(JsonWriter out, AdditionalPropertiesClass value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdditionalPropertiesClass read(JsonReader in) throws IOException {
             JsonObject obj = elementAdapter.read(in).getAsJsonObject();

             return thisAdapter.fromJsonTree(obj);
           }

       }.nullSafe();
    }
  }

  public static class CustomDeserializer implements JsonDeserializer<AdditionalPropertiesClass> {
    @Override
    public AdditionalPropertiesClass deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
      JsonObject obj = json.getAsJsonObject(); //since you know it's a JsonObject
      Set<Entry<String, JsonElement>> entries = obj.entrySet();//will return members of your object
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry: entries) {
        if (!AdditionalPropertiesClass.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException("The field `" + entry.getKey() + "` in the JSON string is not defined in the `AdditionalPropertiesClass` properties");
        }
      }

      // all checks passed, return using the original implementation of deserialize
      return new Gson().fromJson(json, AdditionalPropertiesClass.class);
    }
  }
}
