import java.util.*;

public class StudentManager {

    public static void main(String[] args) {

        // create list of students
        ArrayList<Student> studentList = new ArrayList<>();
        while (true) {
            int choice = menu();
            Student stud = null;
            switch (choice) {
            case 1:
                System.out.println("you choose registration service");
                stud = addStudent();
                studentList.add(stud);

                System.out.println("choose the course you want to attend:");
                courseSelection(stud);
                break;
            case 2:
                System.out.println("showing list of students...");
                for (Student record : studentList) {
                    System.out.println(record);
                    calculateGrade(record);

                }
                break;
            case 3:
                break;
            case 4:
                System.out.println("you choose to quit, quitting....");
                System.exit(0);
                break;
            default:
                System.out.println("invalid choice");
            }

        }

    }

    public static Student addStudent() {
        Student stud = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.print("please fill in your student details:\n First name: ");
        stud.setFirstName(sc.next());
        System.out.print("Last name: ");
        stud.setLastName(sc.next());
        System.out.print("Age: ");
        stud.setAge(sc.nextInt());
        System.out.print("Department: ");
        stud.setDepartment(sc.next());
        return stud;

    }

    public static int menu() {

        int selection;
        Scanner input = new Scanner(System.in);

        /***************************************************/

        System.out.println("welcome dear student!!! \nChoose the services you want:");
        System.out.println("-------------------------\n");
        System.out.println("1 -Student registration");
        System.out.println("2- Check student records");
        System.out.println("3- Course selection");
        System.out.println("4 - Quit");

        selection = input.nextInt();
        return selection;
    }

    public static void courseSelection(Student student) {

        System.out.println("*****************\ndisplaying available course list... \n******************");

        // instantiate crsmgr method to get course list
        CourseManager crsmgr = new CourseManager();
        crsmgr.printCourses();

        // ask the student to choose course by entering course codde
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("enter course code to choose OR Q to quite course selection.");
            String code = scan.next();
            if (code == null || "Q".equals(code.trim())) {
                return;
            }

            // checked result of entered code validation w.r.t. course code of
            boolean result = crsmgr.validateCourseByCode(code);
            if (result) {
                StudentCourse stucr = new StudentCourse(); // StudentCourse class instantiation
                stucr.setStudentId(student.getStudentId());// set the studentID value in Student class for StudentCourse
                                                           // studentId field
                stucr.setCourseCode(code); // assign the code accepted as input for courseCode value of StudentCourse
                                           // class variable
                System.out.println("please provide the scores you get");
                stucr.setScore(scan.nextDouble());

                student.getCourses().add(stucr);

                System.out.println(
                        "****************************\nHere is your course information.... \n******************");
                System.out.println("Student ID: " + stucr.getStudentId() + "\nScore: " + stucr.getScore()
                        + "\n Course code: " + stucr.getCourseCode());
            } else {
                System.out.println("invalid course code, please enter the correct code");
            }
        }

    }

    public static void calculateGrade(Student student) {
        List<StudentCourse> ourList = student.getCourses();
        int size = ourList.size();
        double average = 0, sum = 0;
        for (StudentCourse m : ourList) {
            sum += m.getScore();
        }
        average = sum / size;

     System.out.println("your average point is: "+average);
     
//        for(int i=0; i<size; i++) {
//            sum += ourList.get(i).getScore();
//            StudentCourse cs = ourList.get(i);
//            sum += cs.getScore();
//        }
       //for(int i=0;i<=size;i++) {
           if(average>=90) {
               System.out.println("your grade is: " +"A");   
       }
         
             else if(average>=80&&average<90) {
                 System.out.println("your grade is: B");
                 
             }
             else if(average>65&&average<80) {
                 System.out.println("your grade is: C");
             }
             else {
                 System.out.println("your grade is: D");
         }
    }
}