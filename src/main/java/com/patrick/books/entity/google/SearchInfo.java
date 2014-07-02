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
"textSnippet"
})
public class SearchInfo {

@JsonProperty("textSnippet")
private String textSnippet;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("textSnippet")
public String getTextSnippet() {
return textSnippet;
}

@JsonProperty("textSnippet")
public void setTextSnippet(String textSnippet) {
this.textSnippet = textSnippet;
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