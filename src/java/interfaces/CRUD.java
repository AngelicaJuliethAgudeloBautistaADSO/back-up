
package interfaces;

import modelo.cliente;
import java.util.List;


public interface CRUD {
    public List listar();
    public cliente list (int id);
    public boolean add(cliente clie);
    public boolean edit(cliente clie);
    public boolean eliminar(int id);
}
