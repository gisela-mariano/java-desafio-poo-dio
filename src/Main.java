import br.com.dio.challenge.challenge.Bootcamp;
import br.com.dio.challenge.challenge.Course;
import br.com.dio.challenge.challenge.Dev;
import br.com.dio.challenge.challenge.Mentoring;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Course javaCourse = new Course();
        javaCourse.setTitle("Curso Java");
        javaCourse.setDescription("Descrição " + javaCourse.getTitle());
        javaCourse.setWorkload(8);

        Course javaScriptCourse = new Course();
        javaScriptCourse.setTitle("Curso JavaScript");
        javaScriptCourse.setDescription("Descrição " + javaScriptCourse.getTitle());
        javaScriptCourse.setWorkload(8);

        Mentoring mentoring = new Mentoring();
        mentoring.setTitle("Mentoria de Java");
        mentoring.setDescription("Descrição " + mentoring.getTitle());
        mentoring.setDate(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java Developer");
        bootcamp.setDescription("Descrição " + bootcamp.getName());
        bootcamp.getContents().add(javaCourse);
        bootcamp.getContents().add(javaScriptCourse);

        Dev devJane = new Dev();
        devJane.setName("Jane Doe");
        devJane.subscribeBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos " + devJane.getName() + ": " + devJane.getSubscribedContents());

        devJane.makeProgress();
        devJane.makeProgress();
        System.out.println("Progress...");
        System.out.println("Conteúdos concluidos " + devJane.getName() + ": " + devJane.getCompletedContents());
        System.out.println("Conteúdos inscritos " + devJane.getName() + ": " + devJane.getSubscribedContents());
        System.out.println("XP " + devJane.getName() + ": " + devJane.calculateTotalExp());

        System.out.println("-------------------------------------");

        Dev devJohn = new Dev();
        devJohn.setName("John Doe");
        devJohn.subscribeBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos " + devJohn.getName() + ": " + devJohn.getSubscribedContents());

        devJohn.makeProgress();
        System.out.println("Progress...");
        System.out.println("Conteúdos concluidos " + devJohn.getName() + ": " + devJohn.getCompletedContents());
        System.out.println("Conteúdos inscritos " + devJohn.getName() + ": " + devJohn.getSubscribedContents());
        System.out.println("XP " + devJohn.getName() + ": " + devJohn.calculateTotalExp());
    }
}
