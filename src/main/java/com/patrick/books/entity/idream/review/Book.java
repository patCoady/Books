package com.patrick.books.entity.idream.review;

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
"title",
"sub_title",
"author",
"review_count",
"rating",
"to_read_or_not",
"detail_link",
"genre",
"pages",
"release_date",
"critic_reviews"
})
public class Book {

@JsonProperty("title")
private String title;
@JsonProperty("sub_title")
private String sub_title;
@JsonProperty("author")
private String author;
@JsonProperty("review_count")
private Integer review_count;
@JsonProperty("rating")
private Integer rating;
@JsonProperty("to_read_or_not")
private String to_read_or_not;
@JsonProperty("detail_link")
private String detail_link;
@JsonProperty("genre")
private String genre;
@JsonProperty("pages")
private Integer pages;
@JsonProperty("release_date")
private String release_date;
@JsonProperty("unrated_review_count")
private Integer unrated_review_count;
@JsonProperty("unrated_critic_reviews")
private List<Unrated_critic_review> unrated_critic_reviews = new ArrayList<Unrated_critic_review>();
@JsonProperty("critic_reviews")
private List<Critic_review> critic_reviews = new ArrayList<Critic_review>();
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("title")
public String getTitle() {
return title;
}

@JsonProperty("title")
public void setTitle(String title) {
this.title = title;
}

@JsonProperty("sub_title")
public String getSub_title() {
return sub_title;
}

@JsonProperty("sub_title")
public void setSub_title(String sub_title) {
this.sub_title = sub_title;
}

@JsonProperty("author")
public String getAuthor() {
return author;
}

@JsonProperty("author")
public void setAuthor(String author) {
this.author = author;
}

@JsonProperty("review_count")
public Integer getReview_count() {
return review_count;
}

@JsonProperty("review_count")
public void setReview_count(Integer review_count) {
this.review_count = review_count;
}

@JsonProperty("rating")
public Integer getRating() {
return rating;
}

@JsonProperty("rating")
public void setRating(Integer rating) {
this.rating = rating;
}

@JsonProperty("to_read_or_not")
public String getTo_read_or_not() {
return to_read_or_not;
}

@JsonProperty("to_read_or_not")
public void setTo_read_or_not(String to_read_or_not) {
this.to_read_or_not = to_read_or_not;
}

@JsonProperty("detail_link")
public String getDetail_link() {
return detail_link;
}

@JsonProperty("detail_link")
public void setDetail_link(String detail_link) {
this.detail_link = detail_link;
}

@JsonProperty("genre")
public String getGenre() {
return genre;
}

@JsonProperty("genre")
public void setGenre(String genre) {
this.genre = genre;
}

@JsonProperty("pages")
public Integer getPages() {
return pages;
}

@JsonProperty("pages")
public void setPages(Integer pages) {
this.pages = pages;
}

@JsonProperty("release_date")
public String getRelease_date() {
return release_date;
}

@JsonProperty("release_date")
public void setRelease_date(String release_date) {
this.release_date = release_date;
}

@JsonProperty("critic_reviews")
public List<Critic_review> getCritic_reviews() {
return critic_reviews;
}

@JsonProperty("critic_reviews")
public void setCritic_reviews(List<Critic_review> critic_reviews) {
this.critic_reviews = critic_reviews;
}
@JsonProperty("unrated_review_count")
public Integer getUnrated_review_count() {
return unrated_review_count;
}

@JsonProperty("unrated_review_count")
public void setUnrated_review_count(Integer unrated_review_count) {
this.unrated_review_count = unrated_review_count;
}

@JsonProperty("unrated_critic_reviews")
public List<Unrated_critic_review> getUnrated_critic_reviews() {
return unrated_critic_reviews;
}

@JsonProperty("unrated_critic_reviews")
public void setUnrated_critic_reviews(List<Unrated_critic_review> unrated_critic_reviews) {
this.unrated_critic_reviews = unrated_critic_reviews;
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