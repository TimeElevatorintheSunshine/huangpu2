package com.itheima.exam1.demo2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        // 拿数据到程序中去
        String info = "10001,张无忌,男,2023-07-22 11:11:12,东湖-黄鹤楼#10002,赵敏,女,2023-07-22 09:11:21," +
                "黄鹤楼-归元禅寺#10003,周芷若,女,2023-07-22 04:11:21,木兰文化区-东湖#10004," +
                "小昭,女,2023-07-22 08:11:21,东湖#10005,灭绝,女,2023-07-22 17:11:21,归元禅寺";

        // 定义学生类
        List<Student> students = parseDataToStudent(info);
        System.out.println(students);
        // 统计每个景点选择的次数
        Map<String, Integer> result = countSelectNumbers(students);
        System.out.println("投票情况" + result);
        // 统计出哪个景点的人数最多
        List<String> maxSelect = new ArrayList<>();
        Collection<Integer> values = result.values();
        int max = 0;
        for (Integer value : values) {
            if(value > max) max = value;
        }
        Set<String> keys = result.keySet();
        for (String key : keys) {
            Integer value = result.get(key);
            if(value == max){
                System.out.println("【" + key + "】这个地方想去的人数最多，为" + max + "人！");
                maxSelect.add(key);
            }
        }

        // maxSelect = [东湖, 木兰文化区]
        // 5、哪些人没有选择最多人想去的景点
        OUT:
        for (Student student : students) {
            String selectInfo = student.getSelectInfo(); //  东湖, 黄鹤楼-木兰文化区
            String[] selectData = selectInfo.split("-");
            for (String selectDatum : selectData) {
                if(maxSelect.contains(selectDatum)){
                    continue OUT;
                }
            }
            System.out.println(student.getName() + "没有选择最多人选择的景点");
        }
    }

    private static Map<String, Integer> countSelectNumbers(List<Student> students) {
        Map<String, Integer> result = new HashMap<>();
        for (Student student : students) {
            String selectInfo = student.getSelectInfo();
            String[] selcts = selectInfo.split("-");
            for (String selct : selcts) {
                result.put(selct, result.containsKey(selct) ? result.get(selct) + 1 : 1);
            }
        }


        return result;
    }

    private static List<Student> parseDataToStudent(String info) {
        List<Student> students = new ArrayList<>();
        String[] strDatas = info.split("#");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        for (String strData : strDatas) {
            Student s = new Student();
            String[] studentData = strData.split(",");
            s.setId(Long.valueOf(studentData[0]));
            s.setName(studentData[1]);
            s.setSex(studentData[2]);
            s.setTime(LocalDateTime.parse(studentData[3], dtf));
            s.setSelectInfo(studentData[4]);
            students.add(s);
        }
        return students;
    }
}

class Student {
    private Long id;
    private String name;
    private String sex;
    private LocalDateTime time;
    private String selectInfo;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", time=" + time +
                ", selectInfo='" + selectInfo + '\'' +
                '}' + "\n";
    }

    public Student() {
    }

    public Student(Long id, String name, String sex, LocalDateTime time, String selectInfo) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.time = time;
        this.selectInfo = selectInfo;
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

    public String getSelectInfo() {
        return selectInfo;
    }

    public void setSelectInfo(String selectInfo) {
        this.selectInfo = selectInfo;
    }
}