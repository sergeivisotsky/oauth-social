package org.sergei.social.service;

import org.sergei.social.model.BaseProvider;
import org.sergei.social.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.connect.ConnectionRepository;
import org.springframework.social.facebook.api.Facebook;
import org.springframework.social.facebook.api.User;
import org.springframework.social.google.api.Google;
import org.springframework.social.google.api.plus.Person;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class GoogleProvider {
    private static final String GOOGLE = "google";
    private static final String REDIRECT_CONNECT_GOOGLE = "redirect:/login";

    @Autowired
    private BaseProvider baseProvider;

    public String getGoogleUserData(Model model, UserModel userForm) {
        ConnectionRepository connectionRepository = baseProvider.getConnectionRepository();
        if (connectionRepository.findPrimaryConnection(Google.class) == null) {
            return REDIRECT_CONNECT_GOOGLE;
        }

        setUserDetailsFromGoogle(userForm);
        model.addAttribute("loggedInUser", userForm);

        return "user";
    }

    private void setUserDetailsFromGoogle(UserModel userForm) {
        Google google = baseProvider.getGoogle();
        Person user = google.plusOperations().getGoogleProfile();

        userForm.setFirstName(user.getGivenName());
        userForm.setLastName(user.getFamilyName());

        userForm.setProvider(GOOGLE);
    }
}
