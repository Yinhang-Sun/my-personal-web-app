package com.yinhang.mypersonalwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	
	// login => com.yinhang.mypersonalwebapp.login.LoginController => login.jsp
	
	@RequestMapping("login")
	public String gotoLoginPage() {
		return "login";
	}
}
