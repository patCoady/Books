package com.patrick.books.entity.openlib;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;


@Generated("org.jsonschema2pojo")
/*@JsonPropertyOrder({
"ISBN:"
})*/

@JsonIgnoreProperties(ignoreUnknown = true)
public class OpenLibrary {
//
//@JsonProperty("ISBN:")
private ISBN iSBN;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

//@JsonProperty("ISBN:")
public ISBN getISBN() {
return iSBN;
}

//@JsonProperty("ISBN:")
public void setISBN(ISBN iSBN) {
this.iSBN = iSBN;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, ISBN value) {
this.iSBN = value;
this.additionalProperties.put(name, value);
}


}