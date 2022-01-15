package training;

import java.util.Scanner;

class Date {
    int year;
    String month;
    int day;

    Date() { // 기본 생성자 1
        month = "1월";
        day = 1;
        year = 2009;
    }

    Date(int year, String month, int day) { // 생성자 2
        setDate(year, month, day);
    }

    Date(int year) { // 생성자 3
        setDate(year, "1월", 1);
    }

    void setDate(int year, String month, int day) {
        this.month = month;
        this.day = day;
        this.year = year;
    }
}

public class Constructor {
    public static void main(String[] args) {
        Date date1 = new Date(2009, "3월", 2); // 2009.3.2 // 생성자 2 호출
        Date date2 = new Date(2010); // 2010.1.1 // 생성자 3 호출
        Date date3 = new Date(); // 2009.1.1 // 생성자 1 호출
    }
}
