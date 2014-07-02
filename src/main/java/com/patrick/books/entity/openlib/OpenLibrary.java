package com.patrick.books.entity.openlib;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;


@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
"ISBN:0451526538"
})
public class OpenLibrary {

@JsonProperty("ISBN:")
private ISBN iSBN;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("ISBN:")
public ISBN getISBN_0451526538() {
return iSBN;
}

@JsonProperty("ISBN:")
public void setISBN_0451526538(ISBN iSBN_0451526538) {
this.iSBN = iSBN_0451526538;
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