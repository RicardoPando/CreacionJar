package pe.edu.upc.aaw.evt_vip.entities;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "Detalle")
public class Detalle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "eventos_id")
    private Eventos eventos;

    @Column(name = "subTotal")
    private BigDecimal subTotal;

    public Detalle() {
    }

    public Detalle(int id, Eventos eventos, BigDecimal subTotal) {
        this.id = id;
        this.eventos = eventos;
        this.subTotal = subTotal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Eventos getEventos() {
        return eventos;
    }

    public void setEventos(Eventos eventos) {
        this.eventos = eventos;
    }

    public BigDecimal getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(BigDecimal subTotal) {
        this.subTotal = subTotal;
    }
}
