/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vina
 */
public class Reserva {
    private Evento idEvento;
    private String asientoReservado;

    public Reserva() {
    }

    public Reserva(Evento idEvento, String asientoReservado) {
        this.idEvento = idEvento;
        this.asientoReservado = asientoReservado;
    }

    public Evento getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(Evento idEvento) {
        this.idEvento = idEvento;
    }

    public String getAsientoReservado() {
        return asientoReservado;
    }

    public void setAsientoReservado(String asientoReservado) {
        this.asientoReservado = asientoReservado;
    }

    boolean getIdEvento(String idEvento) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
