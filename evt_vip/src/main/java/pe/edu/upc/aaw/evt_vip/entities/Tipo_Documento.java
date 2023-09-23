package pe.edu.upc.aaw.evt_vip.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Tipo_Documento")
public class Tipo_Documento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Descripcion", length = 250, nullable = false)
    private String Descripcion;

    public Tipo_Documento() {
    }

    public Tipo_Documento(int id, String descripcion) {
        this.id = id;
        Descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
}
