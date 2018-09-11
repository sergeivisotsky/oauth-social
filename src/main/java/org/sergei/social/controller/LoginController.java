package org.sergei.social.controller;

import org.sergei.social.model.UserModel;
import org.sergei.social.service.FacebookProvider;
import org.sergei.social.service.GoogleProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @Autowired
    private FacebookProvider facebookProvider;

    @Autowired
    private GoogleProvider googleProvider;

    @GetMapping("/facebook")
    public String loginWithFacebook(Model model) {
        return facebookProvider.getFacebookUserData(model, new UserModel());
    }

    @GetMapping("/google")
    public String loginWithGoogle(Model model) {
        return googleProvider.getGoogleUserData(model, new UserModel());
    }

    @GetMapping(value = {"/", "/login"})
    public String welcome() {
        return "index";
    }

}
