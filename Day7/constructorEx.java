package Day7;

class Student{
    String name;
    int age;
    // Default 
    Student(){}

    // Param
    Student(String name,int age){
        this.name = name;
        this.age = age;
        System.out.println(this);
    }

    // Copy
    Student(Student s){
        name =s.name;
        age = s.age;
    }
}

public class constructorEx {
    public static void main(String[] args) {
        Student s = new Student("Mohit",10);
        System.out.println(s);
    }
}
