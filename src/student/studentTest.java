package student;

public class studentTest {
    public static void main(String[] args){
        StudentClass s1= new StudentClass("Muheed",12,76,20,"CSE","3rd");
        StudentClass s2=new StudentClass(s1);
        System.out.println("Student s1 details:" +s1);
        System.out.println("Student s2 details:" +s2);
    }
}
