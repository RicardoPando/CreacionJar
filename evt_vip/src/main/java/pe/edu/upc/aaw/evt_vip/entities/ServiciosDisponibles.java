package pe.edu.upc.aaw.evt_vip.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "ServiciosDisponibles")
public class ServiciosDisponibles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSerDisp;

    @Column(name ="Nombre", length = 250, nullable = false )
    private String nombre;

    @Column(name ="Descripcion", length = 250, nullable = false )
    private String descripcion;

    @Column(name = "costo",nullable = false,scale = 2)
    private double costo;

    public ServiciosDisponibles() {
    }

    public ServiciosDisponibles(int idSerDisp, String nombre, String descripcion, double costo) {
        this.idSerDisp = idSerDisp;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.costo = costo;
    }

    public int getIdSerDisp() {
        return idSerDisp;
    }

    public void setIdSerDisp(int idSerDisp) {
        this.idSerDisp = idSerDisp;
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

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
}
