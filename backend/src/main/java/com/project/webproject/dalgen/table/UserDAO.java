package com.project.webproject.dalgen.table;

import com.project.webproject.dalgen.request.UserRequestDalgen;
import com.project.webproject.dalgen.result.UserResultDalgen;

public interface UserDAO {
    UserResultDalgen insert(UserRequestDalgen request) throws Exception;
}
