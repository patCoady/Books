package com.patrick.books.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.patrick.books.entity.google.BookMetaData;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {


	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home( Model model) {

		return "home";
	}

	@RequestMapping(value = "author", method = RequestMethod.POST)
	public String do_Books(Model model,
			@RequestParam("googleBooksData") String googleBooksData) {

		ObjectMapper objectMapper = new ObjectMapper();
		BookMetaData bookMetaData = null;

		try {
			bookMetaData = objectMapper.readValue(googleBooksData, BookMetaData.class);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		model.addAttribute("books", bookMetaData);
		return "books";
	}
	
	@RequestMapping(value = "info", method = RequestMethod.GET)
	public String do_Info(Model model){
		
		return "bookInfo";
	}

}
