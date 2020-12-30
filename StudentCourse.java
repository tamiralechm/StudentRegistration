
class StudentCourse {
    private int studentId;
    private String courseCode;
    private double score;

    //defaault constructor
    public StudentCourse() {
    }

    public void setStudentId(int id) {
        this.studentId = id;
    }

    public int getStudentId() {
        return this.studentId;
    }

public String getCourseCode(){
    return this.courseCode;
}
public void setCourseCode(String courseCode){
    this.courseCode=courseCode;
}

public double getScore(){
    return this.score;
}
public void setScore(double score){
    this.score=score;
}

public String toString(){
    //return studentId+" "+ courseCode +" "+ score;
       return "Student ID: "+ studentId +"\n Course code: "+ courseCode + "\n Score: "+ score;
}

}