package com.patrick.books.entity.bookshare;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;



@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
"bookshare"
})
public class BookObj{

@JsonProperty("bookshare")
private Bookshare bookshare;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("bookshare")
public Bookshare getBookshare() {
return bookshare;
}

@JsonProperty("bookshare")
public void setBookshare(Bookshare bookshare) {
this.bookshare = bookshare;
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