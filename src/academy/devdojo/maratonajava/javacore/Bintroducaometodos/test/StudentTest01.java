package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.PrintStudent;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Student02;

public class StudentTest01 {
    public static void main(String[] args) {
        Student02 student01 = new Student02();
        Student02 student02 = new Student02();
        PrintStudent printStudent = new PrintStudent();

        student01.name = "Sanji";
        student01.age = 22;
        student01.gender = 'M';

        student02.name = "Nami";
        student02.age = 15;
        student02.gender = 'F';

        printStudent.print(student01);
        printStudent.print(student02);
    }
}
