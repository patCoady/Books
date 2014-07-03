package com.patrick.books.entity.idream.review;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;



@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
"snippet",
"source",
"review_link",
"review_date"
})
public class Unrated_critic_review {

@JsonProperty("snippet")
private String snippet;
@JsonProperty("source")
private String source;
@JsonProperty("review_link")
private String review_link;
@JsonProperty("review_date")
private String review_date;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("snippet")
public String getSnippet() {
return snippet;
}

@JsonProperty("snippet")
public void setSnippet(String snippet) {
this.snippet = snippet;
}

@JsonProperty("source")
public String getSource() {
return source;
}

@JsonProperty("source")
public void setSource(String source) {
this.source = source;
}

@JsonProperty("review_link")
public String getReview_link() {
return review_link;
}

@JsonProperty("review_link")
public void setReview_link(String review_link) {
this.review_link = review_link;
}

@JsonProperty("review_date")
public String getReview_date() {
return review_date;
}

@JsonProperty("review_date")
public void setReview_date(String review_date) {
this.review_date = review_date;
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