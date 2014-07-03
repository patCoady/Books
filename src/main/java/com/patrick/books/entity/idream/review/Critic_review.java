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
"pos_or_neg",
"star_rating",
"review_date",
"smiley_or_sad",
"source_logo"
})
public class Critic_review {

@JsonProperty("snippet")
private String snippet;
@JsonProperty("source")
private String source;
@JsonProperty("review_link")
private String review_link;
@JsonProperty("pos_or_neg")
private String pos_or_neg;
@JsonProperty("star_rating")
private Double star_rating;
@JsonProperty("review_date")
private String review_date;
@JsonProperty("smiley_or_sad")
private String smiley_or_sad;
@JsonProperty("source_logo")
private String source_logo;
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

@JsonProperty("pos_or_neg")
public String getPos_or_neg() {
return pos_or_neg;
}

@JsonProperty("pos_or_neg")
public void setPos_or_neg(String pos_or_neg) {
this.pos_or_neg = pos_or_neg;
}

@JsonProperty("star_rating")
public Double getStar_rating() {
return star_rating;
}

@JsonProperty("star_rating")
public void setStar_rating(Double star_rating) {
this.star_rating = star_rating;
}

@JsonProperty("review_date")
public String getReview_date() {
return review_date;
}

@JsonProperty("review_date")
public void setReview_date(String review_date) {
this.review_date = review_date;
}

@JsonProperty("smiley_or_sad")
public String getSmiley_or_sad() {
return smiley_or_sad;
}

@JsonProperty("smiley_or_sad")
public void setSmiley_or_sad(String smiley_or_sad) {
this.smiley_or_sad = smiley_or_sad;
}

@JsonProperty("source_logo")
public String getSource_logo() {
return source_logo;
}

@JsonProperty("source_logo")
public void setSource_logo(String source_logo) {
this.source_logo = source_logo;
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