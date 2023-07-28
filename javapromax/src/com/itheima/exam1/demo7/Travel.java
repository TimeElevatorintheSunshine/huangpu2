package com.itheima.exam1.demo7;



import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Travel {
    public static void main(String[] args) {
        String info = "10001,张无忌,男,2023-07-22 11:11:12,东湖-黄鹤楼#" +
                "10002,赵敏,女,2023-07-22 09:11:21,黄鹤楼-归元禅寺#" +
                "10003,周芷若,女,2023-07-22 04:11:21,木兰文化区-东湖#" +
                "10004,小昭,女,2023-07-22 08:11:21,东湖#" +
                "10005,灭绝,女,2023-07-22 17:11:21,归元禅寺";
        // 按#分割数据
        String[] split = info.split("#");

        // 遍历split按,分割得到学生信息分装到学生对象
        // 创建集合装入学生对象
        List<Student> students = new ArrayList<>();
        for (String s : split) {
            String[] student = s.split(",");
            long l = Long.parseLong(student[0]);
            String name = student[1];
            String sex = student[2];
            LocalDateTime time = LocalDateTime.parse(student[3], DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            String local = student[4];
            students.add(new Student(l, name, sex, time, local));
        }
        System.out.println(students);
        // 统计里面每个景点选择的次数
        // 定意一个Map集合统计
        Map<String, Integer> data = new HashMap<>();
        for (Student student : students) {
            String[] local = student.getLocal().split("-");
            for (String s : local) {
                data.put(s, data.containsKey(s) ? data.get(s) + 1 : 1);
            }
        }
        data.forEach((k, v) -> System.out.println("景点:" + k + "\n去的人数有:" + v + "人"));

        // 定义变量记录去的人数最大值，集合记录景点名字
        List<String> maxLocal = new ArrayList<>();
        int max = 0;

        // 遍历景点集合
        Set<String> set = data.keySet();
        for (String s : set) {
            if (data.get(s) > max) {
                max = data.get(s);
            }
        }
        for (String s : set) {
            if (data.get(s) == max) {
                maxLocal.add(s);
            }
        }
        System.out.println(maxLocal + "想去的人最多，有" + max + "人");

        // 遍历学生集合，计算那些人没有去最多人的景点
        OUT:
        for (Student student : students) {
            for (String s : maxLocal) {
                if (student.getLocal().contains(s)) {
                    continue OUT;
                }

            }
            System.out.println(student.getName() + "没有去" + maxLocal);
        }
    }
}

class Student {
    private Long id;
    private String name;
    private String sex;
    private LocalDateTime time;
    private String local;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", time=" + time +
                ", local='" + local + '\'' +
                '}';
    }

    public Student() {
    }

    public Student(Long id, String name, String sex, LocalDateTime time, String local) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.time = time;
        this.local = local;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
}