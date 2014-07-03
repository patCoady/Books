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
"total_results",
"book"
})
public class IDream {

@JsonProperty("total_results")
private Integer total_results;
@JsonProperty("book")
private Book book;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("total_results")
public Integer getTotal_results() {
return total_results;
}

@JsonProperty("total_results")
public void setTotal_results(Integer total_results) {
this.total_results = total_results;
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