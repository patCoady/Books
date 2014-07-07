package com.patrick.books.entity.openlib;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;


@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
"identifiers",
"subject_place",
"covers",
"lc_classifications",
"latest_revision",
"genres",
"source_records",
"title",
"languages",
"subjects",
"publish_country",
"by_statement",
"oclc_numbers",
"type",
"revision",
"publishers",
"last_modified",
"key",
"authors",
"publish_places",
"pagination",
"classifications",
"created",
"lccn",
"notes",
"number_of_pages",
"dewey_decimal_class",
"isbn_10",
"publish_date",
"works"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class Details {

@JsonProperty("identifiers")
private Identifiers identifiers;
@JsonProperty("subject_place")
private List<String> subject_place = new ArrayList<String>();
@JsonProperty("covers")
private List<Integer> covers = new ArrayList<Integer>();
@JsonProperty("lc_classifications")
private List<String> lc_classifications = new ArrayList<String>();
@JsonProperty("latest_revision")
private Integer latest_revision;
@JsonProperty("genres")
private List<String> genres = new ArrayList<String>();
@JsonProperty("source_records")
private List<String> source_records = new ArrayList<String>();
@JsonProperty("title")
private String title;
@JsonProperty("languages")
private List<Language> languages = new ArrayList<Language>();
@JsonProperty("subjects")
private List<String> subjects = new ArrayList<String>();
@JsonProperty("publish_country")
private String publish_country;
@JsonProperty("by_statement")
private String by_statement;
@JsonProperty("oclc_numbers")
private List<String> oclc_numbers = new ArrayList<String>();
@JsonProperty("type")
private Type type;
@JsonProperty("revision")
private Integer revision;
@JsonProperty("publishers")
private List<String> publishers = new ArrayList<String>();
@JsonProperty("last_modified")
private Last_modified last_modified;
@JsonProperty("key")
private String key;
@JsonProperty("authors")
private List<Author> authors = new ArrayList<Author>();
@JsonProperty("publish_places")
private List<String> publish_places = new ArrayList<String>();
@JsonProperty("pagination")
private String pagination;
@JsonProperty("classifications")
private Classifications classifications;
@JsonProperty("created")
private Created created;
@JsonProperty("lccn")
private List<String> lccn = new ArrayList<String>();
@JsonProperty("notes")
private String notes;
@JsonProperty("number_of_pages")
private Integer number_of_pages;
@JsonProperty("dewey_decimal_class")
private List<String> dewey_decimal_class = new ArrayList<String>();
@JsonProperty("isbn_10")
private List<String> isbn_10 = new ArrayList<String>();
@JsonProperty("publish_date")
private String publish_date;
@JsonProperty("works")
private List<Work> works = new ArrayList<Work>();
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("identifiers")
public Identifiers getIdentifiers() {
return identifiers;
}

@JsonProperty("identifiers")
public void setIdentifiers(Identifiers identifiers) {
this.identifiers = identifiers;
}

@JsonProperty("subject_place")
public List<String> getSubject_place() {
return subject_place;
}

@JsonProperty("subject_place")
public void setSubject_place(List<String> subject_place) {
this.subject_place = subject_place;
}

@JsonProperty("covers")
public List<Integer> getCovers() {
return covers;
}

@JsonProperty("covers")
public void setCovers(List<Integer> covers) {
this.covers = covers;
}

@JsonProperty("lc_classifications")
public List<String> getLc_classifications() {
return lc_classifications;
}

@JsonProperty("lc_classifications")
public void setLc_classifications(List<String> lc_classifications) {
this.lc_classifications = lc_classifications;
}

@JsonProperty("latest_revision")
public Integer getLatest_revision() {
return latest_revision;
}

@JsonProperty("latest_revision")
public void setLatest_revision(Integer latest_revision) {
this.latest_revision = latest_revision;
}

@JsonProperty("genres")
public List<String> getGenres() {
return genres;
}

@JsonProperty("genres")
public void setGenres(List<String> genres) {
this.genres = genres;
}

@JsonProperty("source_records")
public List<String> getSource_records() {
return source_records;
}

@JsonProperty("source_records")
public void setSource_records(List<String> source_records) {
this.source_records = source_records;
}

@JsonProperty("title")
public String getTitle() {
return title;
}

@JsonProperty("title")
public void setTitle(String title) {
this.title = title;
}

@JsonProperty("languages")
public List<Language> getLanguages() {
return languages;
}

@JsonProperty("languages")
public void setLanguages(List<Language> languages) {
this.languages = languages;
}

@JsonProperty("subjects")
public List<String> getSubjects() {
return subjects;
}

@JsonProperty("subjects")
public void setSubjects(List<String> subjects) {
this.subjects = subjects;
}

@JsonProperty("publish_country")
public String getPublish_country() {
return publish_country;
}

@JsonProperty("publish_country")
public void setPublish_country(String publish_country) {
this.publish_country = publish_country;
}

@JsonProperty("by_statement")
public String getBy_statement() {
return by_statement;
}

@JsonProperty("by_statement")
public void setBy_statement(String by_statement) {
this.by_statement = by_statement;
}

@JsonProperty("oclc_numbers")
public List<String> getOclc_numbers() {
return oclc_numbers;
}

@JsonProperty("oclc_numbers")
public void setOclc_numbers(List<String> oclc_numbers) {
this.oclc_numbers = oclc_numbers;
}

@JsonProperty("type")
public Type getType() {
return type;
}

@JsonProperty("type")
public void setType(Type type) {
this.type = type;
}

@JsonProperty("revision")
public Integer getRevision() {
return revision;
}

@JsonProperty("revision")
public void setRevision(Integer revision) {
this.revision = revision;
}

@JsonProperty("publishers")
public List<String> getPublishers() {
return publishers;
}

@JsonProperty("publishers")
public void setPublishers(List<String> publishers) {
this.publishers = publishers;
}

@JsonProperty("last_modified")
public Last_modified getLast_modified() {
return last_modified;
}

@JsonProperty("last_modified")
public void setLast_modified(Last_modified last_modified) {
this.last_modified = last_modified;
}

@JsonProperty("key")
public String getKey() {
return key;
}

@JsonProperty("key")
public void setKey(String key) {
this.key = key;
}

@JsonProperty("authors")
public List<Author> getAuthors() {
return authors;
}

@JsonProperty("authors")
public void setAuthors(List<Author> authors) {
this.authors = authors;
}

@JsonProperty("publish_places")
public List<String> getPublish_places() {
return publish_places;
}

@JsonProperty("publish_places")
public void setPublish_places(List<String> publish_places) {
this.publish_places = publish_places;
}

@JsonProperty("pagination")
public String getPagination() {
return pagination;
}

@JsonProperty("pagination")
public void setPagination(String pagination) {
this.pagination = pagination;
}

@JsonProperty("classifications")
public Classifications getClassifications() {
return classifications;
}

@JsonProperty("classifications")
public void setClassifications(Classifications classifications) {
this.classifications = classifications;
}

@JsonProperty("created")
public Created getCreated() {
return created;
}

@JsonProperty("created")
public void setCreated(Created created) {
this.created = created;
}

@JsonProperty("lccn")
public List<String> getLccn() {
return lccn;
}

@JsonProperty("lccn")
public void setLccn(List<String> lccn) {
this.lccn = lccn;
}

@JsonProperty("notes")
public String getNotes() {
return notes;
}

@JsonProperty("notes")
public void setNotes(String notes) {
this.notes = notes;
}

@JsonProperty("number_of_pages")
public Integer getNumber_of_pages() {
return number_of_pages;
}

@JsonProperty("number_of_pages")
public void setNumber_of_pages(Integer number_of_pages) {
this.number_of_pages = number_of_pages;
}

@JsonProperty("dewey_decimal_class")
public List<String> getDewey_decimal_class() {
return dewey_decimal_class;
}

@JsonProperty("dewey_decimal_class")
public void setDewey_decimal_class(List<String> dewey_decimal_class) {
this.dewey_decimal_class = dewey_decimal_class;
}

@JsonProperty("isbn_10")
public List<String> getIsbn_10() {
return isbn_10;
}

@JsonProperty("isbn_10")
public void setIsbn_10(List<String> isbn_10) {
this.isbn_10 = isbn_10;
}

@JsonProperty("publish_date")
public String getPublish_date() {
return publish_date;
}

@JsonProperty("publish_date")
public void setPublish_date(String publish_date) {
this.publish_date = publish_date;
}

@JsonProperty("works")
public List<Work> getWorks() {
return works;
}

@JsonProperty("works")
public void setWorks(List<Work> works) {
this.works = works;
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