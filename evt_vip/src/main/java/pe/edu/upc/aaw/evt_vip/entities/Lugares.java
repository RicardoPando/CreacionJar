package pe.edu.upc.aaw.evt_vip.entities;

import jakarta.persistence.*;

@Entity
@Table(name="Lugares")
public class Lugares {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name ="Nombre", length = 250, nullable = false )
    private String Nombre;

    @Column(name ="Direccion", length = 250, nullable = false )
    private String Direccion;

    @Column(name ="Capacidad", length = 250, nullable = false )
    private String Capacidad;

    @ManyToOne
    @JoinColumn(name = "DLocal_id")
    private D_Local d_local;

    public Lugares() {
    }

    public Lugares(int id, String nombre, String direccion, String capacidad, D_Local d_local) {
        this.id = id;
        Nombre = nombre;
        Direccion = direccion;
        Capacidad = capacidad;
        this.d_local = d_local;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(String capacidad) {
        Capacidad = capacidad;
    }

    public D_Local getD_local() {
        return d_local;
    }

    public void setD_local(D_Local d_local) {
        this.d_local = d_local;
    }
}
