package com.patrick.books.controller;

import java.io.IOException;
import java.security.KeyStore.Entry;
import java.util.Map;
import java.util.Set;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.patrick.books.entity.google.BookMetaData;
import com.patrick.books.entity.openlib.OpenLibrary;


/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

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
		//logger.info(googleBooksData);
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
	//@RequestParam Map<String,String> allRequestParams
	@RequestMapping(value = "info", method = RequestMethod.POST)
	public String do_Info(Model model, @RequestParam("bookInfo") String bookInfo){
		ObjectMapper objectMapper = new ObjectMapper();
		OpenLibrary openLibrary = null;
		//logger.info(bookInfo);

		try {
			openLibrary = objectMapper.readValue(bookInfo, OpenLibrary.class);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e){
			e.printStackTrace();
		}
		try{
			logger.info(openLibrary.getISBN().getInfo_url());
			model.addAttribute("info", openLibrary.getISBN());
			return "bookInfo";
		}catch(Exception e){
			model.addAttribute("error", "No Details found please try again");
			return "error";
		}
	}

}
