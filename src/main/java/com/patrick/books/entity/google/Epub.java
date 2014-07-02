package com.patrick.books.entity.google;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;



@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
"isAvailable"
})
public class Epub {

@JsonProperty("isAvailable")
private Boolean isAvailable;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("isAvailable")
public Boolean getIsAvailable() {
return isAvailable;
}

@JsonProperty("isAvailable")
public void setIsAvailable(Boolean isAvailable) {
this.isAvailable = isAvailable;
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