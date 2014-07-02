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
"smallThumbnail",
"thumbnail"
})
public class ImageLinks {

@JsonProperty("smallThumbnail")
private String smallThumbnail;
@JsonProperty("thumbnail")
private String thumbnail;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("smallThumbnail")
public String getSmallThumbnail() {
return smallThumbnail;
}

@JsonProperty("smallThumbnail")
public void setSmallThumbnail(String smallThumbnail) {
this.smallThumbnail = smallThumbnail;
}

@JsonProperty("thumbnail")
public String getThumbnail() {
return thumbnail;
}

@JsonProperty("thumbnail")
public void setThumbnail(String thumbnail) {
this.thumbnail = thumbnail;
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