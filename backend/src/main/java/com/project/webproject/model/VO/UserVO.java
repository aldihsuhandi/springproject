package com.project.webproject.model.VO;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserVO {
    private String userId;
    private String email;
    private String username;
    private String password;
    private String profilePicture;
    private String banner;
    private String status;
}
