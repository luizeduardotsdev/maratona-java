package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.PrintStudent;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Student;

public class StudentTest01 {
    public static void main(String[] args) {
        Student student01 = new Student();
        Student student02 = new Student();
        PrintStudent print = new PrintStudent();

        student01.name = "Midoriya";
        student01.age = 15;
        student01.gender = 'M';

        student02.name = "Sakura";
        student02.age = 20;
        student02.gender = 'F';

       print.print(student01);

       print.print(student02);

    }
}
