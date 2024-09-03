
package interfaces;

import java.util.List;
import modelo.cosmetologo;


public interface CRUD_cosmetologo {
    public List<cosmetologo> listar();
    public cosmetologo list (int id);
    public boolean add(cosmetologo clie);
    public boolean edit(cosmetologo clie);
    public boolean eliminar(int id);
}
