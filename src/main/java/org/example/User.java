package org.example;

import lombok.Data;

import java.time.*;
import java.util.Date;

@Data
public class User {
    private Integer id;

    private String username;

    private String password;

    private String nickName;

    private Integer sex;

    private ZonedDateTime registerDate;


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", nickName='" + nickName + '\'' +
                ", sex=" + sex +
                ", registerDate=" + registerDate +
                '}';
    }
}
