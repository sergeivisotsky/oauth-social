package org.sergei.social.service;

import org.sergei.social.model.BaseProvider;
import org.sergei.social.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.connect.ConnectionRepository;
import org.springframework.social.facebook.api.Facebook;
import org.springframework.social.facebook.api.User;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class FacebookProvider {
    private static final String FACEBOOK = "facebook";
    private static final String REDIRECT_LOGIN = "redirect:/login";

    @Autowired
    private BaseProvider baseProvider;

    public String getFacebookUserData(Model model, UserModel userForm) {
        ConnectionRepository connectionRepository = baseProvider.getConnectionRepository();
        if (connectionRepository.findPrimaryConnection(Facebook.class) == null) {
            return REDIRECT_LOGIN;
        }

        setUserDetailsFromFacebook(userForm);
        model.addAttribute("loggedInUser", userForm);

        return "user";
    }

    private void setUserDetailsFromFacebook(UserModel userForm) {
        Facebook facebook = baseProvider.getFacebook();
        User user = facebook.userOperations().getUserProfile();

        userForm.setFirstName(user.getFirstName());
        userForm.setLastName(user.getLastName());

        userForm.setProvider(FACEBOOK);
    }
}
