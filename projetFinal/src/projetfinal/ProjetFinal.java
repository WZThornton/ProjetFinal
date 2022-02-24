package projetfinal;

import Model.Employee;
import Model.Student;
import Model.Cours;
import java.util.List;
import DAOE.DAOE;
import DAOS.DAOS;
import DAOC.DAOC;
import StudentDao.StudentDao;
import CoursDao.CoursDao;
import EmployeeDao.EmployeeDao;

public class ProjetFinal {

    public static void main(String[] args) {
        DAOE daoe = new EmployeeDao();
        DAOS daos = new StudentDao();
        DAOC daoc = new CoursDao();

        Employee Employee1 = new Employee(1, "William", "Thornton");
        daoe.create(Employee1);

        Employee Employee2 = new Employee(2, "Youki", "LeChat");
        daoe.create(Employee2);

        Employee Employee3 = new Employee(3, "Monsieur", "Toufik");
        daoe.create(Employee3);

        Student Student1 = new Student("Paul", "Pauly");
        daos.create(Student1);

        Student student2 = new Student("Raoul", "Raouly");
        daos.create(student2);

        Student student3 = new Student("Hasan", "Piker");
        daos.create(student3);

        Cours cours1 = new Cours(14, "Math");
        daoc.create(cours1);

        Cours cours2 = new Cours(43, "Algo");
        daoc.create(cours2);

        Cours cours3 = new Cours(74, "SE");
        daoc.create(cours3);

        List<Cours> listeCours = daoc.findAll();
        List<Employee> listeEmployee = daoe.findAll();
        List<Student> listeStudent = daos.findAll();

        for (Cours c : listeCours) {
            System.out.println("coursID: " + c.getClassId()+ "\tcoursNom: " + c.getClassName());
        }

    }
}
