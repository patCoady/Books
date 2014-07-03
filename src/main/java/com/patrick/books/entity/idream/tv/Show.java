
package com.patrick.books.entity.idream.tv;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;



@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
"showName",
"showDate"
})
public class Show {

@JsonProperty("showName")
private String showName;
@JsonProperty("showDate")
private String showDate;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("showName")
public String getShowName() {
return showName;
}

@JsonProperty("showName")
public void setShowName(String showName) {
this.showName = showName;
}

@JsonProperty("showDate")
public String getShowDate() {
return showDate;
}

@JsonProperty("showDate")
public void setShowDate(String showDate) {
this.showDate = showDate;
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