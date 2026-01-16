import glazov.Less2;
import glazov.Less3;
import glazov.Lesson1;

void main() {

    IO.println("Hello and welcome!");

    for (int i = 1; i <= 5; i++) {

        IO.println("i = " + i);
    }
        Lesson1 lesson1 = new Lesson1();
        System.out.println("Summa = " + lesson1.sum(587, 1258));

        Lesson1 lesson2 = new Lesson1();
        lesson2.String("Hello");

        Less2.sayHello();
        Less3.sayHello();


}
