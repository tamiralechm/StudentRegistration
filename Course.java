
public class Course{

private String courseName;
private int courseCode;
// private ArrayList<Student> studentList=new ArrayList<Student>();


//DEFAULT CONSTRUCTOR
public Course(){

}

//getter and setter methods of the class variables to enable usage in other classes
public String getCourseName(){
    return this.courseName;
}

public void setCourseName(String courseName){
    this.courseName=courseName;
}

public int courseCode(){
    return this.courseCode;
}
public void courseCode(int courseCode){
    this.courseCode=courseCode;
}
// public ArrayList<Student> getStudentList(){
//     return this.studentList;
// }
// public void setStudentList(ArrayList<Student> studentList){
//     this.studentList=studentList;
// }

//toString method to return/display our datas
@Override
public String toString(){
    return courseName +" "+ courseCode;
}

}