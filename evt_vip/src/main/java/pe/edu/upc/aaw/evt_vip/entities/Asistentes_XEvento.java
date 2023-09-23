package pe.edu.upc.aaw.evt_vip.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Asistentes_XEvento")
public class Asistentes_XEvento {
    @Id // PK-FK
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAsisXEve;

    @ManyToOne
    @JoinColumn(name = "asistentes_id")
    private Asistentes asistentes;



    @ManyToOne
    @JoinColumn(name = "eventos_id")
    private Eventos eventos;

    public Asistentes_XEvento() {
    }

    public Asistentes_XEvento(Asistentes asistentes, Eventos eventos) {
        this.asistentes = asistentes;
        this.eventos = eventos;
    }

    public Asistentes getAsistentes() {
        return asistentes;
    }

    public void setAsistentes(Asistentes asistentes) {
        this.asistentes = asistentes;
    }

    public Eventos getEventos() {
        return eventos;
    }

    public void setEventos(Eventos eventos) {
        this.eventos = eventos;
    }
}
