package ex_07062024.aug24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class lab3 {
    public static void main(String[] args) {
        Student s1 = new Student(1, "supriya");
        Student s2 = new Student(4, "sup");
        Student s3 = new Student(3, "supr");
        Student s4 = new Student(2, "supdi");
        List arrlist = new LinkedList();//can change to linkedlist,can be sorted using comparator
        arrlist.add(s1);
        arrlist.add(s2);
        arrlist.add(s3);
        arrlist.add(s4);
        System.out.println(arrlist);
        Collections.sort(arrlist);
        System.out.println(arrlist);


    }

}
    class Student implements Comparable<Student>{
        private Integer id;
        private String name;

        public Student(Integer id, String name) {
            this.id = id;
            this.name = name;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }

        @Override
        public int compareTo(Student o) {
            return Integer.compare(this.id, o.id);
        }
    }


