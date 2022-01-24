package ex22;

import java.util.*;

class Student implements Comparable<Student> {
    int number;
    String name;

    Student(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Student s) {
        return number - s.number; // 학번순서로 정렬한다.
    }
}

public class SortTest2 {
    public static void main(String[] args) {
        Student[] students = {
                new Student(02, "선옥자"),
                new Student(03, "한영희"),
                new Student(01, "김철수")
        };

        List<Student> list = Arrays.asList(students);
        Collections.sort(list);
        System.out.println(list);
    }
}
