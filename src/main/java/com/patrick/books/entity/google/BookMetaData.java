package com.patrick.books.entity.google;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;



@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
"kind",
"totalItems",
"items"
})
public class BookMetaData {

@JsonProperty("kind")
private String kind;
@JsonProperty("totalItems")
private Integer totalItems;
@JsonProperty("items")
private List<Item> items = new ArrayList<Item>();
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("kind")
public String getKind() {
return kind;
}

@JsonProperty("kind")
public void setKind(String kind) {
this.kind = kind;
}

@JsonProperty("totalItems")
public Integer getTotalItems() {
return totalItems;
}

@JsonProperty("totalItems")
public void setTotalItems(Integer totalItems) {
this.totalItems = totalItems;
}

@JsonProperty("items")
public List<Item> getItems() {
return items;
}

@JsonProperty("items")
public void setItems(List<Item> items) {
this.items = items;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}