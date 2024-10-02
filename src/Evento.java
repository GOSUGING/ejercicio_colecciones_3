
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author vina
 */
public class Evento {

    private String idEvento;
    private String nombre;
    private LocalDate fechaEvento;
    private ArrayList<Reserva> listaReservas;

    public Evento() {
        listaReservas = new ArrayList<>();
    }

    public Evento(String idEvento, String nombre, LocalDate fechaEvento, ArrayList<Reserva> listaReservas) {
        this.idEvento = idEvento;
        this.nombre = nombre;
        this.fechaEvento = fechaEvento;
        this.listaReservas = listaReservas;
    }

    public String getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(String idEvento) {
        this.idEvento = idEvento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaEvento() {
        return fechaEvento;
    }

    public void setFechaEvento(LocalDate fechaEvento) {
        this.fechaEvento = fechaEvento;
    }

    public ArrayList<Reserva> getListaReservas() {
        return listaReservas;
    }

    public void setListaReservas(ArrayList<Reserva> listaReservas) {
        this.listaReservas = listaReservas;
    }

    public boolean agregar(Reserva reserva) {
        return listaReservas.add(reserva);
    }

    public boolean eliminar(String id) {
        for (Reserva reserva : listaReservas) {
            if (reserva.getIdEvento().equals(id)) {
                listaReservas.remove(reserva);
                return true;
            }
        }
        return false;
    }
}
