package com.project.webproject.dalgen.table.impl;

import com.project.webproject.config.DataSourceConfig;
import com.project.webproject.dalgen.request.UserRequestDalgen;
import com.project.webproject.dalgen.result.UserResultDalgen;
import com.project.webproject.dalgen.table.UserDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDAOImpl implements UserDAO {
    private DataSourceConfig dataSourceConfig;

    private Connection connection;

    public UserDAOImpl() throws SQLException {
        dataSourceConfig = new DataSourceConfig();
        connection = dataSourceConfig.source().getConnection();
    }

    public UserResultDalgen insert(UserRequestDalgen request) throws Exception {
        UserResultDalgen result = new UserResultDalgen();
        String sql = "INSERT INTO users('user_id', 'email', 'username', 'password') VALUES(?, ?, ?, ?)";

        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, request.getUserId());
        statement.setString(2, request.getEmail());
        statement.setString(3, request.getUsername());
        statement.setString(4, request.getPassword());

        statement.executeUpdate();
        result.setUserId(request.getUserId());

        return result;
    }
}
