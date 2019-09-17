package pvi.samplespring.admin;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultHandler {

	@Value("${spring.application.name}")
	String appName;

	@GetMapping(path = "/", produces = MediaType.TEXT_PLAIN_VALUE)
	@ResponseBody
	public String getAppName() {
		return appName;
	}
}
