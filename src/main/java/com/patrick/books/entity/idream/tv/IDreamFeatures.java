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
"booksCount",
"books"
})
public class IDreamFeatures {

@JsonProperty("booksCount")
private Integer booksCount;
@JsonProperty("books")
private List<Book> books = new ArrayList<Book>();
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("booksCount")
public Integer getBooksCount() {
return booksCount;
}

@JsonProperty("booksCount")
public void setBooksCount(Integer booksCount) {
this.booksCount = booksCount;
}

@JsonProperty("books")
public List<Book> getBooks() {
return books;
}

@JsonProperty("books")
public void setBooks(List<Book> books) {
this.books = books;
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