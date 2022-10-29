package com.project.webproject.model.Request.user;

import com.project.webproject.model.Request.BaseRequest;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class UserUpdateRequest extends BaseRequest {
    private String userId;
    private String username;
    private String email;
    private String password;
    private String profilePicture;
    private String banner;
    private String status;
}
