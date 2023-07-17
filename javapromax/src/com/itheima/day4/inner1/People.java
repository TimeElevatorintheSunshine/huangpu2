package com.itheima.day4.inner1;

public class People {
    private int heartBeat = 120;

    public class Heart {
        private int heartBeat = 90;

        public void run() {
            int heartBeat = 83;
            System.out.println(heartBeat);
            System.out.println(this.heartBeat);
            System.out.println(People.this.heartBeat);
        }
    }

    public static void main(String[] args) {
        Heart heart = new People().new Heart();

    }
}
