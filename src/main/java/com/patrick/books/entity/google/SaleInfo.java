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
"country",
"saleability",
"isEbook",
"buyLink"
})
public class SaleInfo {

@JsonProperty("country")
private String country;
@JsonProperty("saleability")
private String saleability;
@JsonProperty("isEbook")
private Boolean isEbook;
@JsonProperty("buyLink")
private String buyLink;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("country")
public String getCountry() {
return country;
}

@JsonProperty("country")
public void setCountry(String country) {
this.country = country;
}

@JsonProperty("saleability")
public String getSaleability() {
return saleability;
}

@JsonProperty("saleability")
public void setSaleability(String saleability) {
this.saleability = saleability;
}

@JsonProperty("isEbook")
public Boolean getIsEbook() {
return isEbook;
}

@JsonProperty("isEbook")
public void setIsEbook(Boolean isEbook) {
this.isEbook = isEbook;
}

@JsonProperty("buyLink")
public String getBuyLink() {
return buyLink;
}

@JsonProperty("buyLink")
public void setBuyLink(String buyLink) {
this.buyLink = buyLink;
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