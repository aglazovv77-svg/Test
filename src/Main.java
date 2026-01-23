import glazov.Less2;
import glazov.Lesson1;
import glazov.Student;

import static glazov.Lesson1.stringSay;

void main() {

        Lesson1 lesson1 = new Lesson1();
        System.out.println("Summa = " + lesson1.sum(587, 1258));

        stringSay("Hello, Alex!");

        Less2.sayHello();

        Student student1 = new Student("Alex", 25, "Biology", 1);
        Student student2 = new Student("Susana", 27, "Mathematics", 2);
        student1.setName("Elena");
        student1.setAge(30);

        System.out.println("Student = " + student1);
        System.out.println("Student = " + student2);


}
