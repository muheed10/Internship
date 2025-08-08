package student;

public class StudentClass {
    String name;
    int id;
    int roll_no;
    int age;
    String branch;
    String year;

    public StudentClass(String name,int id,int roll_no,int age,String branch,String year){
        this.name=name;
        this.id=id;
        this.roll_no=roll_no;
        this.age=age;
        this.branch=branch;
        this.year=year;

    }

    StudentClass (StudentClass s){
        name = s.name;
        id = s.id;
        roll_no=s.roll_no;
        age=s.age;
        branch=s.branch;
        year=s.year;
    }

    @Override
    public String toString() {
        return "StudentClass{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", roll_no=" + roll_no +
                ", age=" + age +
                ", branch='" + branch + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}
