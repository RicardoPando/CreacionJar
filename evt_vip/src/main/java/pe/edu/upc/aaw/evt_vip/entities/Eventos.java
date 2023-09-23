package pe.edu.upc.aaw.evt_vip.entities;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name="Eventos")
public class Eventos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombre", length = 100, nullable = false)
    private String nombre;

    @Column(name = "descripcion", length = 255)
    private String descripcion;

    @Column(name = "fecha", nullable = false)
    private LocalDate fecha;

    @Column(name = "hora")
    private LocalTime hora;

    @Column(name = "capacidad")
    private int capacidad;

    @Column(name = "costo")
    private BigDecimal costo;

    @ManyToOne
    @JoinColumn(name = "organizador_id")
    private Organizador organizador;

    @ManyToOne
    @JoinColumn(name = "lugares_id")
    private Lugares lugares;

    public Eventos() {
    }

    public Eventos(int id, String nombre, String descripcion, LocalDate fecha, LocalTime hora, int capacidad, BigDecimal costo, Organizador organizador, Lugares lugares) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.hora = hora;
        this.capacidad = capacidad;
        this.costo = costo;
        this.organizador = organizador;
        this.lugares = lugares;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public BigDecimal getCosto() {
        return costo;
    }

    public void setCosto(BigDecimal costo) {
        this.costo = costo;
    }

    public Organizador getOrganizador() {
        return organizador;
    }

    public void setOrganizador(Organizador organizador) {
        this.organizador = organizador;
    }

    public Lugares getLugares() {
        return lugares;
    }

    public void setLugares(Lugares lugares) {
        this.lugares = lugares;
    }
}
