package com.itheima.exam.exam8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        String userStrs = "10001:张三:男:1990-01-01#10002:" +
                "李四:女:1989-01-09#10003:王五:男:1999-09-09#10004:" +
                "刘备:男:1899-01-01#10005:孙悟空:男:1900-01-01#10006:张三:女:1999-01-01#10007:" +
                "刘备:女:1999-01-01#10008:张三:女:2003-07-01#10009:猪八戒:男:1900-01-01";
        List<User> users = new ArrayList<>();
        String[] split = userStrs.split("#");
       String[] split1 = null;
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        for (int i = 0; i < split.length; i++) {
            split1 = split[i].split(":");
            String dateStr = split1[3];
            users.add(new User(Long.parseLong(split1[0]),split1[1],split1[2],LocalDate.parse(dateStr,fmt)));
        }
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < users.size(); i++) {
            if (map.keySet().contains(users.get(i).getName())){
                map.put(users.get(i).getName(),map.get(users.get(i).getName()) + 1);
            }else {
            map.put(users.get(i).getName(),1);}
        }
        Set<String> strings = map.keySet();
        for (String string:strings) {
            System.out.println(string + ":" + map.get(string)+"次");
        }
    }
}

class User {
    private Long id;  // 用户id 名
    private String gender;  //性别
    private LocalDate birthday;  //生日
    private String name;
    public User() {
    }

    public User(Long id,String name, String gender, LocalDate birthday) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", gender='" + gender + '\'' +
                ", birthday=" + birthday +
                ", name='" + name + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }


}