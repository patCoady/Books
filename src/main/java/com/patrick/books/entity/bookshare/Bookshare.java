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
"version",
"messages",
"book"
})
public class Bookshare {

@JsonProperty("version")
private String version;
@JsonProperty("messages")
private List<Object> messages = new ArrayList<Object>();
@JsonProperty("book")
private Book book;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("version")
public String getVersion() {
return version;
}

@JsonProperty("version")
public void setVersion(String version) {
this.version = version;
}

@JsonProperty("messages")
public List<Object> getMessages() {
return messages;
}

@JsonProperty("messages")
public void setMessages(List<Object> messages) {
this.messages = messages;
}

@JsonProperty("book")
public Book getBook() {
return book;
}

@JsonProperty("book")
public void setBook(Book book) {
this.book = book;
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