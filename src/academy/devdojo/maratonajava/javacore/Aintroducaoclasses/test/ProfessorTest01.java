package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domain.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.name = "Mestre Kami";
        professor.age = 140;
        professor.gender = 'M';

        System.out.println("Nome:" + professor.name + " idade:" + professor.age + " genero:" + professor.gender);
    }
}
