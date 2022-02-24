
package DAOC;

import Model.Cours;
import java.util.List;
       
public interface DAOC {
    public abstract void create(Cours cours);

    public Cours findById(int i);

    public List<Cours> findAll();

    public void deleteById(int i);
}
