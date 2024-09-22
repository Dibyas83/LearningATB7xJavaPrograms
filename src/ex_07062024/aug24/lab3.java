package ex_07062024.aug24;

import java.util.*;

public class lab3 {
    public static void main(String[] args) {
        Student s1 = new Student(1, "supriya");
        Student s2 = new Student(4, "aup");
        Student s3 = new Student(3, "jupr");
        Student s4 = new Student(2, "iot");
        List arrlist = new LinkedList();//can change to linkedlist,can be sorted using comparator
        arrlist.add(s1);
        arrlist.add(s2);
        arrlist.add(s3);
        arrlist.add(s4);
        System.out.println(arrlist);
        Collections.sort(arrlist,new Sortbyid());
        Collections.sort(arrlist,new Sortbyname());
        System.out.println(arrlist);


    }
}
class Sortbyname implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
class Sortbyid implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getId(),o2.getId());
    }
}




//    class Student implements Comparable<Student> {
    class Student{//cannot sort by name at the same time
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


//        @Override
//        public int compareTo(Student o) {
//            return CharSequence.compare(this.name,o.name);
       // }


    }


