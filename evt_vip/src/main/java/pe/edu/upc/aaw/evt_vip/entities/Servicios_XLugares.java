package pe.edu.upc.aaw.evt_vip.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Servicios_XLugares")
public class Servicios_XLugares {
    @Id // PK-FK
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSerxL;
    @ManyToOne
    @JoinColumn(name = "lugares_id")
    private Lugares lugares;


    @ManyToOne
    @JoinColumn(name = "serviciosDisponibles_id")
    private ServiciosDisponibles serviciosdisponibles;

    @Column(name = "Descripcion", length = 250, nullable = false)
    private String Descripcion;

    public Servicios_XLugares() {
    }

    public Servicios_XLugares(Lugares lugares, ServiciosDisponibles serviciosdisponibles, String descripcion) {
        this.lugares = lugares;
        this.serviciosdisponibles = serviciosdisponibles;
        Descripcion = descripcion;
    }

    public Lugares getLugares() {
        return lugares;
    }

    public void setLugares(Lugares lugares) {
        this.lugares = lugares;
    }

    public ServiciosDisponibles getServiciosdisponibles() {
        return serviciosdisponibles;
    }

    public void setServiciosdisponibles(ServiciosDisponibles serviciosdisponibles) {
        this.serviciosdisponibles = serviciosdisponibles;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
}
