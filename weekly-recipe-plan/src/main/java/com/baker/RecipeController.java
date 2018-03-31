package com.baker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Controller class for mapping web requests for the
 * recipe application
 * @author Sassykatz13
 *
 */
@RestController
public class RecipeController {
	
	@GetMapping("/")
	private ModelAndView index() {
		return new ModelAndView("recipes");
	}

}
