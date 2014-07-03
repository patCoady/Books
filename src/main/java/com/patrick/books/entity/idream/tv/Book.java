
package com.patrick.books.entity.idream.tv;

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
"author",
"pubDate",
"isbns",
"bookLink",
"showsCount",
"shows"
})
public class Book {

@JsonProperty("title")
private String title;
@JsonProperty("author")
private String author;
@JsonProperty("pubDate")
private String pubDate;
@JsonProperty("isbns")
private String isbns;
@JsonProperty("bookLink")
private String bookLink;
@JsonProperty("showsCount")
private Integer showsCount;
@JsonProperty("shows")
private List<Show> shows = new ArrayList<Show>();
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("title")
public String getTitle() {
return title;
}

@JsonProperty("title")
public void setTitle(String title) {
this.title = title;
}

@JsonProperty("author")
public String getAuthor() {
return author;
}

@JsonProperty("author")
public void setAuthor(String author) {
this.author = author;
}

@JsonProperty("pubDate")
public String getPubDate() {
return pubDate;
}

@JsonProperty("pubDate")
public void setPubDate(String pubDate) {
this.pubDate = pubDate;
}

@JsonProperty("isbns")
public String getIsbns() {
return isbns;
}

@JsonProperty("isbns")
public void setIsbns(String isbns) {
this.isbns = isbns;
}

@JsonProperty("bookLink")
public String getBookLink() {
return bookLink;
}

@JsonProperty("bookLink")
public void setBookLink(String bookLink) {
this.bookLink = bookLink;
}

@JsonProperty("showsCount")
public Integer getShowsCount() {
return showsCount;
}

@JsonProperty("showsCount")
public void setShowsCount(Integer showsCount) {
this.showsCount = showsCount;
}

@JsonProperty("shows")
public List<Show> getShows() {
return shows;
}

@JsonProperty("shows")
public void setShows(List<Show> shows) {
this.shows = shows;
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