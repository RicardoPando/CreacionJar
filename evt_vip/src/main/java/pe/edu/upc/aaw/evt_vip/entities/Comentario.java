package pe.edu.upc.aaw.evt_vip.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Comentario")
public class Comentario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int comentarioId;
    @Column(name = "usuarioId", length = 20, nullable = false)
    private int usuarioId;
    @Column(name = "eventosId", length = 20, nullable = false)
    private int eventosId;
    @Column(name = "valorancion", length = 20, nullable = false)
    private int valorancion;
    @Column(name = "contenido", length = 20, nullable = false)
    private String contenido;

    public Comentario() {
    }

    public Comentario(int comentarioId, int usuarioId, int eventosId, int valorancion, String contenido) {
        this.comentarioId = comentarioId;
        this.usuarioId = usuarioId;
        this.eventosId = eventosId;
        this.valorancion = valorancion;
        this.contenido = contenido;
    }

    public int getComentarioId() {
        return comentarioId;
    }

    public void setComentarioId(int comentarioId) {
        this.comentarioId = comentarioId;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public int getEventosId() {
        return eventosId;
    }

    public void setEventosId(int eventosId) {
        this.eventosId = eventosId;
    }

    public int getValorancion() {
        return valorancion;
    }

    public void setValorancion(int valorancion) {
        this.valorancion = valorancion;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
}
