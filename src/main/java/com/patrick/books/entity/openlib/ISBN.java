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
"info_url",
"bib_key",
"preview_url",
"thumbnail_url",
"details",
"preview"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class ISBN {

@JsonProperty("info_url")
private String info_url;
@JsonProperty("bib_key")
private String bib_key;
@JsonProperty("preview_url")
private String preview_url;
@JsonProperty("thumbnail_url")
private String thumbnail_url;
@JsonProperty("details")
private Details details;
@JsonProperty("preview")
private String preview;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("info_url")
public String getInfo_url() {
return info_url;
}

@JsonProperty("info_url")
public void setInfo_url(String info_url) {
this.info_url = info_url;
}

@JsonProperty("bib_key")
public String getBib_key() {
return bib_key;
}

@JsonProperty("bib_key")
public void setBib_key(String bib_key) {
this.bib_key = bib_key;
}

@JsonProperty("preview_url")
public String getPreview_url() {
return preview_url;
}

@JsonProperty("preview_url")
public void setPreview_url(String preview_url) {
this.preview_url = preview_url;
}

@JsonProperty("thumbnail_url")
public String getThumbnail_url() {
return thumbnail_url;
}

@JsonProperty("thumbnail_url")
public void setThumbnail_url(String thumbnail_url) {
this.thumbnail_url = thumbnail_url;
}

@JsonProperty("details")
public Details getDetails() {
return details;
}

@JsonProperty("details")
public void setDetails(Details details) {
this.details = details;
}

@JsonProperty("preview")
public String getPreview() {
return preview;
}

@JsonProperty("preview")
public void setPreview(String preview) {
this.preview = preview;
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