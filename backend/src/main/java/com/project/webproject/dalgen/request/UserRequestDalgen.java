package com.project.webproject.dalgen.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequestDalgen {
    private String userId;
    private String email;
    private String username;
    private String password;
    private String profilePicture;
    private String banner;
    private String status;
}
