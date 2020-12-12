package com.medici.controller;

import java.security.Principal;
import java.util.Collection;
import java.util.Map;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author a73s
 *
 */
@RestController
@RequestMapping("/environment")
public class EnvironmentController {

	protected Logger logger = Logger.getLogger(EnvironmentController.class.getName());

	@Autowired
	Environment environment;

	@RequestMapping(value = "/system", method = RequestMethod.GET)
	public Map<String, String> envVars(Principal principal) {
		logger.info("microservice envVars() invoked");
		logger.info(principal.getName());
		return System.getenv();
	}

	@RequestMapping(value = "/profiles", method = RequestMethod.GET)
	public String[] activeProfiles(Principal principal) {
		logger.info("microservice activeProfiles() invoked");
		logger.info(principal.getName());
		return environment.getActiveProfiles();
	}

	@RequestMapping(value = "/username", method = RequestMethod.GET)
	public String currentUserName(Authentication authentication) {
		Collection<? extends GrantedAuthority> auth = authentication.getAuthorities();
		Object credentials = authentication.getCredentials();
		logger.info(authentication.getName());
		return authentication.getName();
	}

}
