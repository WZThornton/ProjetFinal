package StudentDao;

import java.util.ArrayList;
import java.util.List;
import Model.Student;
import DAOS.DAOS;

public class StudentDao implements DAOS { //implements veut dire que cette class suit ce que Dao dit de faire

    private List<Student> listStudent;

    public StudentDao() {
        listStudent = new ArrayList<Student>(); //va creer une List vide de Students
    }

    public void create(Student student) {
        listStudent.add(student);
    }

    public List<Student> findAll() {
        return listStudent;
    }

    public Student findById(int i) {
        return listStudent.get(i);
    }

    public void deleteById(int i) {
        listStudent.remove(i);
    }

}
