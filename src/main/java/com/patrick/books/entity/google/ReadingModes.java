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
"text",
"image"
})
public class ReadingModes {

@JsonProperty("text")
private Boolean text;
@JsonProperty("image")
private Boolean image;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("text")
public Boolean getText() {
return text;
}

@JsonProperty("text")
public void setText(Boolean text) {
this.text = text;
}

@JsonProperty("image")
public Boolean getImage() {
return image;
}

@JsonProperty("image")
public void setImage(Boolean image) {
this.image = image;
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