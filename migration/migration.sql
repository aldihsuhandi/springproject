CREATE DATABASE spring;

USE spring;

CREATE TABLE users(
    user_id varchar(255) NOT NULL,
    email varchar(255) UNIQUE NOT NULL,
    username varchar(255) UNIQUE NOT NULL,
    password varchar(255) NOT NULL,
    profile_picture longtext,
    banner longtext,
    status varchar(255),
    is_active boolean NOT NULL DEFAULT true,
    gmt_create DATE NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
    gmt_modified DATE NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
    PRIMARY KEY(user_id)
);

CREATE TABLE friend_list (
    user_id varchar(255) NOT NULL,
    friend_id varchar(255) NOT NULL,
    is_blocked boolean NOT NULL DEFAULT true,
    gmt_create DATE NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
    gmt_modified DATE NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
    PRIMARY KEY(user_id, friend_id),
    FOREIGN KEY(user_id) REFERENCES users(user_id),
    FOREIGN KEY(friend_id) REFERENCES users(user_id)
);

CREATE TABLE chatrooms (
    chatroom_id varchar(255) NOT NULL,
    extend_info varchar(255),
    gmt_create DATE NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
    gmt_modified DATE NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
    is_active boolean,
    PRIMARY KEY(chatroom_id)
);

CREATE TABLE group_members (
    chatroom_id varchar(255) NOT NULL,
    user_id varchar(255) NOT NULL,
    is_muted BOOLEAN NOT NULL DEFAULT false,
    gmt_create DATE NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
    gmt_modified DATE NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
    FOREIGN KEY(chatroom_id) REFERENCES chatrooms(chatroom_id),
    FOREIGN KEY(user_id) REFERENCES users(user_id)
);

CREATE TABLE friendrooms (
    chatroom_id varchar(255) NOT NULL,
    user_id varchar(255) NOT NULL,
    friend_id varchar(255) NOT NULL,
    PRIMARY KEY(chatroom_id),
    FOREIGN KEY(chatroom_id) REFERENCES chatrooms(chatroom_id),
    FOREIGN KEY(user_id) REFERENCES users(user_id),
    FOREIGN KEY(friend_id) REFERENCES users(user_id)
);

CREATE TABLE chats(
    chat_id INT(6) ZEROFILL NOT NULL AUTO_INCREMENT,
    chatroom_id varchar(255) NOT NULL,
    user_id varchar(255) NOT NULL,
    message longtext NOT NULL,
    is_deleted boolean NOT NULL DEFAULT false,
    is_edited boolean NOT NULL DEFAULT false,
    gmt_create DATE NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
    gmt_modified DATE NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
    PRIMARY KEY(chat_id),
    FOREIGN KEY(user_id) REFERENCES users(user_id),
    FOREIGN KEY(chatroom_id) REFERENCES chatrooms(chatroom_id)
);

CREATE TABLE sessions(
    session_id varchar(255) NOT NULL,
    user_id varchar(255) NOT NULL,
    is_active boolean NOT NULL DEFAULT true,
    gmt_create DATE NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
    gmt_modified DATE NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
    PRIMARY KEY(session_id),
    FOREIGN KEY(user_id) REFERENCES users(user_id)
);