
import java.util.ArrayList;



/**
 *
 * @author vina
 */
public class Cliente {
   private String idCliente;
   private String nombre;
   private ArrayList<Reserva> listaReservasRealizadas;

    public Cliente() {
     listaReservasRealizadas = new ArrayList<>();     
    }

    public Cliente(String idCliente, String nombre, ArrayList<Reserva> listaReservasRealizadas) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.listaReservasRealizadas = listaReservasRealizadas;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Reserva> getListaReservasRealizadas() {
        return listaReservasRealizadas;
    }

    public void setListaReservasRealizadas(ArrayList<Reserva> listaReservasRealizadas) {
        this.listaReservasRealizadas = listaReservasRealizadas;
    }
 
    
    
    
   
   
   
}
