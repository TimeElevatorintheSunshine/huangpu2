package itheima.demo4;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;


    public class TimeTask extends TimerTask {
        // 用于记录闹钟的开始时间
        private LocalDateTime startTime;

        // 构造器，对闹钟的开始时间进行初始化
        public TimeTask() {
            String s = "2023年07月23日 17:52:00";
            // 补全代码
            DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
            startTime = LocalDateTime.parse(s,f);

            System.out.println("距离闹钟");
        }

        // 每一秒执行一次该方法
        @Override
        public void run() {
            // 补全代码：完成倒计时效果
            LocalDateTime now = LocalDateTime.now();
            Duration between = Duration.between(now,startTime );
            if (now.isAfter(startTime)){
                System.out.println("小泰起床！");
                this.cancel();
                System.exit(1);
            }


            System.out.println(between.toDays() + "天" + (between.toHours()-(between.toDays()*24))
                    + "小时" + (between.toMinutes()-between.toHours()*60) + "分钟" +(between.toMillis()-between.toMinutes()*60*1000)/1000 + "秒");

        }

    }
