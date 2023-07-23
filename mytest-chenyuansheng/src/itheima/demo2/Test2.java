package itheima.demo2;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 某班级要组织秋游活动，有四个景点的数据可以选择，
 * 依次是：“东湖”、"黄鹤楼"、“木兰文化区”、“归元禅寺”，
 * 每名学生最多可以选择两个想去的景点，最少要选择1个想去的景点，现在系统收集到了班级多名学生选择的信息如下。
 */
public class Test2 {
    public static void main(String[] args) {
        String info = "10001,张无忌,男,2023-07-22 11:11:12,东湖-黄鹤楼#10002,赵敏,女,2023-07-22" +
                " 09:11:21,黄鹤楼-归元禅寺#10003,周芷若,女,2023-07-22 04:11:21,木兰文化区-东湖#10004," +
                "小昭,女,2023-07-22 08:11:21,东湖#10005,灭绝,女,2023-07-22 17:11:21,归元禅寺";
        String[] split = info.split("#");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < split.length; i++) {
            String[] split1 = split[i].split(",");
            LocalDateTime s = LocalDateTime.parse(split1[3],formatter);
            Student student = new Student(split1[1], split1[4], s, Long.parseLong(split1[0]));
            students.add(student);
        }
        System.out.println(students);
       Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < students.size(); i++) {
            String[] split1 = students.get(i).getLocal().split("-");
            if (map.keySet().contains(split1[0])){
                map.put(split1[0],map.get(split1[0])+1 );
            }else {
                map.put(split1[0],1 );
            }
            if (split1.length !=1){
            if (map.keySet().contains(split1[1])){
                map.put(split1[1],map.get(split1[1])+1 );
            }else {
                map.put(split1[1],1 );
            }
        }
        }
        map.forEach((k,v)-> System.out.println(k+v));
        Integer max = 0;
        String maxName = "";
        Set<String> set = map.keySet();
        for (String s : set) {
            if (map.get(s)>max){
                max = map.get(s);
                maxName = s;
            }
        }
        System.out.println(maxName +"想去的最多");
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if (!student.getLocal().contains(maxName)){
                System.out.print(student.getName()+"\t");
            }
        }
        System.out.println("没有去" + maxName);
    }
}
class Student{
    private String name;
    private  String local ;
    private LocalDateTime time ;
    private Long id;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", local='" + local + '\'' +
                ", time=" + time +
                ", id=" + id +
                '}';
    }

    public Student() {
    }

    public Student(String name, String local, LocalDateTime time, Long id) {
        this.name = name;
        this.local = local;
        this.time = time;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}