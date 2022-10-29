package com.project.webproject.service;

import com.project.webproject.dalgen.compose.UserDalgenCompose;
import com.project.webproject.dalgen.table.UserDAO;
import com.project.webproject.model.Request.user.UserCreateRequest;
import com.project.webproject.model.Request.user.UserUpdateRequest;
import com.project.webproject.model.Result.user.UserCreateResult;
import com.project.webproject.model.Result.user.UserUpdateResult;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Setter
public class UserService {

    @Autowired
    private UserDAO userDAO;

    @Autowired
    private BCryptPasswordEncoder encoder;

    public UserCreateResult create(UserCreateRequest request) {
        return UserDalgenCompose.composeUserResult(userDAO.insert(UserDalgenCompose.composeUserRequestDalgen(request)));
    }

    public UserUpdateResult update(UserUpdateRequest request) {
        return null;
    }

    public String encryptPassword(String password) {
        return encoder.encode(password);
    }
}
