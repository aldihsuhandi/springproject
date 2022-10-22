package com.project.webproject.dalgen.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserCreateRequestDalgen {
    private String userId;
    private String email;
    private String username;
    private String profilePicture;
    private String banner;
    private String status;
}
