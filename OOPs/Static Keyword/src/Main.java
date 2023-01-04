class Student{
    String name;
    static String schoolName = "MCS";

    public static void changeSchoolName(String newSchoolName){
        schoolName = newSchoolName;  // We can't use this keyword because static property is fixed for all objects.
    }

    static public void displaySchoolName(){
        System.out.println(schoolName);
    }
}

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        Student st1 = new Student();
        st1.name = "Rahul";

        // We can use static properties without using objects.
        Student.displaySchoolName();
        Student.changeSchoolName("Midnapore Collegiate School");
        Student.displaySchoolName();



    }
}