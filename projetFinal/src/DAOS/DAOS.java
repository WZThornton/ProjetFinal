
package DAOS;
import Model.Student;
import java.util.List;


public interface DAOS {
     public abstract void create(Student employee);

    public Student findById(int i);

    public List<Student> findAll();

    public void deleteById(int i);
}
