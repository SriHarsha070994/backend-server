package com.stktr.stktrserver.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stktr.stktrserver.util.Constants;
@CrossOrigin
@RestController
public class StktrApi {
	@RequestMapping("/")

	public ResponseEntity<String> getBook() {
		if (System.getenv(Constants.ENV_VARAIBLE) == null)
			return new ResponseEntity<String>("Environment Varaible: " + Constants.ENV_VARAIBLE + " is missing",
					HttpStatus.INTERNAL_SERVER_ERROR);
		if (System.getenv(Constants.ENV_VARAIBLE).isBlank())
			return new ResponseEntity<String>(
					"Value for the Environment Varaible: " + Constants.ENV_VARAIBLE + " is not set",
					HttpStatus.INTERNAL_SERVER_ERROR);
		return new ResponseEntity<String>("Hello " + System.getenv(Constants.ENV_VARAIBLE), HttpStatus.OK);
	}
}
