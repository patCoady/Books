package com.patrick.books.entity.google;

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
"subtitle",
"authors",
"publishedDate",
"industryIdentifiers",
"readingModes",
"printType",
"contentVersion",
"imageLinks",
"language",
"previewLink",
"infoLink",
"canonicalVolumeLink"
})
public class VolumeInfo {

@JsonProperty("title")
private String title;
@JsonProperty("subtitle")
private String subtitle;
@JsonProperty("authors")
private List<String> authors = new ArrayList<String>();
@JsonProperty("publishedDate")
private String publishedDate;
@JsonProperty("industryIdentifiers")
private List<IndustryIdentifier> industryIdentifiers = new ArrayList<IndustryIdentifier>();
@JsonProperty("readingModes")
private ReadingModes readingModes;
@JsonProperty("printType")
private String printType;
@JsonProperty("contentVersion")
private String contentVersion;
@JsonProperty("imageLinks")
private ImageLinks imageLinks;
@JsonProperty("language")
private String language;
@JsonProperty("previewLink")
private String previewLink;
@JsonProperty("infoLink")
private String infoLink;
@JsonProperty("canonicalVolumeLink")
private String canonicalVolumeLink;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("title")
public String getTitle() {
return title;
}

@JsonProperty("title")
public void setTitle(String title) {
this.title = title;
}

@JsonProperty("subtitle")
public String getSubtitle() {
return subtitle;
}

@JsonProperty("subtitle")
public void setSubtitle(String subtitle) {
this.subtitle = subtitle;
}

@JsonProperty("authors")
public List<String> getAuthors() {
return authors;
}

@JsonProperty("authors")
public void setAuthors(List<String> authors) {
this.authors = authors;
}

@JsonProperty("publishedDate")
public String getPublishedDate() {
return publishedDate;
}

@JsonProperty("publishedDate")
public void setPublishedDate(String publishedDate) {
this.publishedDate = publishedDate;
}

@JsonProperty("industryIdentifiers")
public List<IndustryIdentifier> getIndustryIdentifiers() {
return industryIdentifiers;
}

@JsonProperty("industryIdentifiers")
public void setIndustryIdentifiers(List<IndustryIdentifier> industryIdentifiers) {
this.industryIdentifiers = industryIdentifiers;
}

@JsonProperty("readingModes")
public ReadingModes getReadingModes() {
return readingModes;
}

@JsonProperty("readingModes")
public void setReadingModes(ReadingModes readingModes) {
this.readingModes = readingModes;
}

@JsonProperty("printType")
public String getPrintType() {
return printType;
}

@JsonProperty("printType")
public void setPrintType(String printType) {
this.printType = printType;
}

@JsonProperty("contentVersion")
public String getContentVersion() {
return contentVersion;
}

@JsonProperty("contentVersion")
public void setContentVersion(String contentVersion) {
this.contentVersion = contentVersion;
}

@JsonProperty("imageLinks")
public ImageLinks getImageLinks() {
return imageLinks;
}

@JsonProperty("imageLinks")
public void setImageLinks(ImageLinks imageLinks) {
this.imageLinks = imageLinks;
}

@JsonProperty("language")
public String getLanguage() {
return language;
}

@JsonProperty("language")
public void setLanguage(String language) {
this.language = language;
}

@JsonProperty("previewLink")
public String getPreviewLink() {
return previewLink;
}

@JsonProperty("previewLink")
public void setPreviewLink(String previewLink) {
this.previewLink = previewLink;
}

@JsonProperty("infoLink")
public String getInfoLink() {
return infoLink;
}

@JsonProperty("infoLink")
public void setInfoLink(String infoLink) {
this.infoLink = infoLink;
}

@JsonProperty("canonicalVolumeLink")
public String getCanonicalVolumeLink() {
return canonicalVolumeLink;
}

@JsonProperty("canonicalVolumeLink")
public void setCanonicalVolumeLink(String canonicalVolumeLink) {
this.canonicalVolumeLink = canonicalVolumeLink;
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