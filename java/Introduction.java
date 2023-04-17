class myself{
    String name;
    String course;
    String sem;
    myself(){
        name="Manish kumar";
        course="MCA with computer network and cyber security";
        sem="2nd";
    }
    public void mydetail(){
        System.out.println("Name: "+name);
        System.out.println("Course: "+course);
        System.out.println("Semester: "+sem);
    }
    public void address(){
        System.out.println("From : Bhagalpur Bihar");
    }
    public void hobby(){
        String hobby="GYM AND CODING";
        System.out.println("Hobbies: "+hobby);
    }
    public void habits(){
        String habits="LEARN NEW THINGS";
        System.out.println("Habits: "+habits);
    }
}
public class Introduction {
    public static void main(String[] args) {
        myself obj= new myself();
        obj.mydetail();
        obj.address();
        obj.hobby();
        obj.habits();
    }
    
}
