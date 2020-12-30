import java.util.*;

public class Student {
    private int studentId;
    private String firstName;
    private String lastName;
    private int age;
    private String department;
    private List<StudentCourse> courses = new ArrayList<>();

    // default(no arg constructor) constructor
    // this is recomended for POJO classes
    public Student() {
    }

    public List<StudentCourse> getCourses(){
        // if(courses==null) {
        //     courses = new ArrayList<>();
        // }
        return this.courses;
    }

    public void setCourses(List<StudentCourse> courses){
        this.courses=courses;
    }

    public void setStudentId(int id) {
        this.studentId = id;
    }

    public int getStudentId() {
        return this.studentId;
    }

    public String getFirstName(){
        return this.firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
         this.age=age;
    }

    public String getDepartment(){
        return this.department;
    }

    public void setDepartment(String department){
        this.department=department;
    }

    @Override
    public String toString() {
        return "First name: "+ firstName +" Last name: "
        + lastName +" Age: "+age+ " Department: "
        + department+ " Student ID: "+ studentId +" "+Arrays.toString(courses.toArray());
    }
}