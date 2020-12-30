import java.util.*;

public class CourseManager{
    private Map<String,String> course=new HashMap<String,String>();  
 
    public CourseManager() {
        // System.out.println("Populating courses....");
        course.put("101","data science");
        course.put("102","machine learning");
        course.put("103","turing machine");
        course.put("104","data mining");

        
    }
    /**
     * convert map to set to traverse through(iterable)
        course.entrySet();
        */
    public void printCourses() {
        for(Map.Entry val:course.entrySet()){
            System.out.println(val.getKey()+ " "+ val.getValue());
        }
    }

    //PREVENT the original course list from modification
    public Map<String,String> getCourses(){
        Map<String,String> copyCourse=new HashMap<>(course);
        return copyCourse;
    }

    //check the course code selected by the student
    public boolean validateCourseByCode(String input){
        return course.containsKey(input);
 
    }
}
