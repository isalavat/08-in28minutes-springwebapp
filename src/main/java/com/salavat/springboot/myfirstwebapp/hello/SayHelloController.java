package com.salavat.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

	@RequestMapping("say-hello")
	@ResponseBody
	public String sayHello() {
		return "Hello! What are you learning today?";
	}

	@RequestMapping("say-hello-html")
	@ResponseBody
	public String sayHelloHtml() {
		return """
				<html>
					<head>
						<title>My first HTML Page</title>
					</head>
					<body>
					My first HTML Page with Body
					</body>
				</html>
				""";
	}

	@RequestMapping("say-hello-jsp")
	public String sayHelloJsp() {
		return "sayHello";
	}

}
