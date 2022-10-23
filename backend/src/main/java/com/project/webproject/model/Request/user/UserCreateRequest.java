package com.project.webproject.model.Request.user;

import com.project.webproject.model.Request.BaseRequest;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserCreateRequest extends BaseRequest {
    private String userId;
    private String email;
    private String username;
    private String password;
    private String profilePicture;
}
