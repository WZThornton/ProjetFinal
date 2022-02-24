package CoursDao;

import java.util.ArrayList;
import java.util.List;
import Model.Cours;
import DAOC.DAOC;

public class CoursDao implements DAOC { //implements veut dire que cette class suit ce que Dao dit de faire

    private List<Cours> listCours;

    public CoursDao() {
        listCours = new ArrayList<Cours>(); //va creer une List vide de Students
    }

    public void create(Cours cours) {
        listCours.add(cours);
    }

    public List<Cours> findAll() {
        return listCours;
    }

    public Cours findById(int i) {
        return listCours.get(i);
    }

    public void deleteById(int i) {
        listCours.remove(i);
    }

}
