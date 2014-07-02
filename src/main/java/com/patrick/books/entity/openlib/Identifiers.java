package com.patrick.books.entity.openlib;

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
"goodreads",
"project_gutenberg",
"librarything"
})
public class Identifiers {

@JsonProperty("goodreads")
private List<String> goodreads = new ArrayList<String>();
@JsonProperty("project_gutenberg")
private List<String> project_gutenberg = new ArrayList<String>();
@JsonProperty("librarything")
private List<String> librarything = new ArrayList<String>();
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("goodreads")
public List<String> getGoodreads() {
return goodreads;
}

@JsonProperty("goodreads")
public void setGoodreads(List<String> goodreads) {
this.goodreads = goodreads;
}

@JsonProperty("project_gutenberg")
public List<String> getProject_gutenberg() {
return project_gutenberg;
}

@JsonProperty("project_gutenberg")
public void setProject_gutenberg(List<String> project_gutenberg) {
this.project_gutenberg = project_gutenberg;
}

@JsonProperty("librarything")
public List<String> getLibrarything() {
return librarything;
}

@JsonProperty("librarything")
public void setLibrarything(List<String> librarything) {
this.librarything = librarything;
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