package org.sergei.social.model;

import java.io.Serializable;

public class UserModel implements Serializable {

    private static final long serialVersionUID = 1L;
    private String firstName;
    private String lastName;
    private String provider;

    public UserModel() {
    }

    public UserModel(String firstName, String lastName, String provider) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.provider = provider;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }
}
