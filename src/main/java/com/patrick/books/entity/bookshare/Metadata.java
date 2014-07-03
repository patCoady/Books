package com.patrick.books.entity.bookshare;

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
"author",
"availableToDownload",
"bookshareId",
"briefSynopsis",
"category",
"completeSynopsis",
"contentId",
"copyright",
"downloadFormat",
"dtbookSize",
"freelyAvailable",
"images",
"isbn13",
"language",
"publishDate",
"publisher",
"quality",
"title"
})
public class Metadata {

@JsonProperty("author")
private List<String> author = new ArrayList<String>();
@JsonProperty("availableToDownload")
private Integer availableToDownload;
@JsonProperty("bookshareId")
private String bookshareId;
@JsonProperty("briefSynopsis")
private String briefSynopsis;
@JsonProperty("category")
private List<Object> category = new ArrayList<Object>();
@JsonProperty("completeSynopsis")
private String completeSynopsis;
@JsonProperty("contentId")
private Integer contentId;
@JsonProperty("copyright")
private String copyright;
@JsonProperty("downloadFormat")
private List<Object> downloadFormat = new ArrayList<Object>();
@JsonProperty("dtbookSize")
private Integer dtbookSize;
@JsonProperty("freelyAvailable")
private Integer freelyAvailable;
@JsonProperty("images")
private Integer images;
@JsonProperty("isbn13")
private String isbn13;
@JsonProperty("language")
private List<String> language = new ArrayList<String>();
@JsonProperty("publishDate")
private String publishDate;
@JsonProperty("publisher")
private String publisher;
@JsonProperty("quality")
private String quality;
@JsonProperty("title")
private String title;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("author")
public List<String> getAuthor() {
return author;
}

@JsonProperty("author")
public void setAuthor(List<String> author) {
this.author = author;
}

@JsonProperty("availableToDownload")
public Integer getAvailableToDownload() {
return availableToDownload;
}

@JsonProperty("availableToDownload")
public void setAvailableToDownload(Integer availableToDownload) {
this.availableToDownload = availableToDownload;
}

@JsonProperty("bookshareId")
public String getBookshareId() {
return bookshareId;
}

@JsonProperty("bookshareId")
public void setBookshareId(String bookshareId) {
this.bookshareId = bookshareId;
}

@JsonProperty("briefSynopsis")
public String getBriefSynopsis() {
return briefSynopsis;
}

@JsonProperty("briefSynopsis")
public void setBriefSynopsis(String briefSynopsis) {
this.briefSynopsis = briefSynopsis;
}

@JsonProperty("category")
public List<Object> getCategory() {
return category;
}

@JsonProperty("category")
public void setCategory(List<Object> category) {
this.category = category;
}

@JsonProperty("completeSynopsis")
public String getCompleteSynopsis() {
return completeSynopsis;
}

@JsonProperty("completeSynopsis")
public void setCompleteSynopsis(String completeSynopsis) {
this.completeSynopsis = completeSynopsis;
}

@JsonProperty("contentId")
public Integer getContentId() {
return contentId;
}

@JsonProperty("contentId")
public void setContentId(Integer contentId) {
this.contentId = contentId;
}

@JsonProperty("copyright")
public String getCopyright() {
return copyright;
}

@JsonProperty("copyright")
public void setCopyright(String copyright) {
this.copyright = copyright;
}

@JsonProperty("downloadFormat")
public List<Object> getDownloadFormat() {
return downloadFormat;
}

@JsonProperty("downloadFormat")
public void setDownloadFormat(List<Object> downloadFormat) {
this.downloadFormat = downloadFormat;
}

@JsonProperty("dtbookSize")
public Integer getDtbookSize() {
return dtbookSize;
}

@JsonProperty("dtbookSize")
public void setDtbookSize(Integer dtbookSize) {
this.dtbookSize = dtbookSize;
}

@JsonProperty("freelyAvailable")
public Integer getFreelyAvailable() {
return freelyAvailable;
}

@JsonProperty("freelyAvailable")
public void setFreelyAvailable(Integer freelyAvailable) {
this.freelyAvailable = freelyAvailable;
}

@JsonProperty("images")
public Integer getImages() {
return images;
}

@JsonProperty("images")
public void setImages(Integer images) {
this.images = images;
}

@JsonProperty("isbn13")
public String getIsbn13() {
return isbn13;
}

@JsonProperty("isbn13")
public void setIsbn13(String isbn13) {
this.isbn13 = isbn13;
}

@JsonProperty("language")
public List<String> getLanguage() {
return language;
}

@JsonProperty("language")
public void setLanguage(List<String> language) {
this.language = language;
}

@JsonProperty("publishDate")
public String getPublishDate() {
return publishDate;
}

@JsonProperty("publishDate")
public void setPublishDate(String publishDate) {
this.publishDate = publishDate;
}

@JsonProperty("publisher")
public String getPublisher() {
return publisher;
}

@JsonProperty("publisher")
public void setPublisher(String publisher) {
this.publisher = publisher;
}

@JsonProperty("quality")
public String getQuality() {
return quality;
}

@JsonProperty("quality")
public void setQuality(String quality) {
this.quality = quality;
}

@JsonProperty("title")
public String getTitle() {
return title;
}

@JsonProperty("title")
public void setTitle(String title) {
this.title = title;
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