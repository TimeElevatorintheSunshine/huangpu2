package com.itheima.exam.exam10;

import java.time.LocalDate;
import java.util.*;

/**
 * User 实体类，包含如下属性
 * - private Long id;  // 用户id 名
 * - private String gender;  //性别
 * - private LocalDate birthday;  //生日
 * - 注意需要提供 set和get方法，以及toString方法
 */
public class Topic2 {
    public static void main(String[] args) {
        String userStrs = "10001:张三:男:1990-01-01#10002:李四:女:1989-01-09#10003:王五:男:1999-09-09#10004:刘备:男:1899-01-01#10005:孙悟空:男:1900-01-01#10006:张三:女:1999-01-01#10007:刘备:女:1999-01-01#10008:张三:女:2003-07-01#10009:猪八戒:男:1900-01-01";

        String[] split = userStrs.split("#");

        List<User> users = new ArrayList<>();

        for (int i = 0; i < split.length; i++) {
            String[] split1 = split[i].split(":");
            User user = new User(Long.parseLong(split1[0]) , split1[2], LocalDate.parse(split1[3]), split1[1]);
            users.add(user);
        }
        System.out.println(users);
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            if (map.keySet().contains(user.getName())){
                map.put(user.getName(),map.get(user.getName()) + 1);
            }else {
            map.put(user.getName(),1);}
        }
        Set<String> strings = map.keySet();
        for (String string:strings) {
            System.out.println(string +":"+ map.get(string)+"次");
        }

    }
}
class User{
    private Long id;
    private String gender;
    private LocalDate birthday;
    private String name;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", gender='" + gender + '\'' +
                ", birthday=" + birthday +
                ", name='" + name + '\'' +
                '}';
    }

    public User() {
    }

    public User(Long id, String gender, LocalDate birthday, String name) {
        this.id = id;
        this.gender = gender;
        this.birthday = birthday;
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}