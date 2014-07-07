package com.patrick.books.entity.openlib;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;


@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
"key"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class Type {

@JsonProperty("key")
private String key;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("key")
public String getKey() {
return key;
}

@JsonProperty("key")
public void setKey(String key) {
this.key = key;
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