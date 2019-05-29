package com.angularkeycloak.keycloak.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.security.Principal;

@RestController
@RequestMapping("/api/v1/books")
public class PublicLibraryController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getBooks(Principal principal, Model model) {
		model.addAttribute("member", principal.getName());
		return "books";
	}

	@RequestMapping(value = "/manager", method = RequestMethod.GET)
	public String getManager(Principal principal, Model model) {
		model.addAttribute("librarian", principal.getName());
		return "manager";
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpServletRequest request) throws ServletException {
		request.logout();
		return "redirect:/";
	}
}

