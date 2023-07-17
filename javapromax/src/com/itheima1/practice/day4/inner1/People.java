package com.itheima1.practice.day4.inner1;

public class People {
    private int heartBeat = 100;

    public class Heart {
        private int heartBeat = 98;

        public void run() {
            int heartBeat = 88;
            System.out.println(heartBeat);
            System.out.println(this.heartBeat);
            System.out.println(People.this.heartBeat);
        }
    }

    public static void main(String[] args) {
        Heart heart = new People().new Heart();
        heart.run();
    }
}
