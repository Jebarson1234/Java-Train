//package tamilnadu,madurai;
public class Student {
    public static void main(String[] args) {
        Student student = new Student();
        student.canteen();
        student.hostel();
        student.library();
        student.classroom();
    }
    public void canteen() {
        System.out.println("Canteen is open from 8 AM to 8 PM");
    }
    public void hostel() {
        System.out.println("Hostel is available for students");
    }
    public void library() {
        System.out.println("Library is open from 9 AM to 5 PM");
    }
    public void classroom() {
        System.out.println("Classrooms are equipped with smart boards");
    }
}