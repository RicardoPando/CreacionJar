package pe.edu.upc.aaw.evt_vip.entities;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "Documento_Venta")
public class Documento_Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "monto")
    private BigDecimal monto;

    @Column(name = "fecha", nullable = false)
    private LocalDate fecha;

    @Column(name ="metodo", length = 50, nullable = false )
    private String metodo;

    @Column(name ="RUC", length = 10, nullable = false )
    private String RUC;

    @ManyToOne
    @JoinColumn(name = "asistentes_id")
    private Asistentes asistentes;

    @ManyToOne
    @JoinColumn(name = "detalle_id")
    private Detalle detalle;

    @ManyToOne
    @JoinColumn(name = "Tipo_Documento_id")
    private Tipo_Documento tipo_documento;


    public Documento_Venta() {
    }

    public Documento_Venta(int id, BigDecimal monto, LocalDate fecha, String metodo, String RUC, Asistentes asistentes, Detalle detalle, Tipo_Documento tipo_documento) {
        this.id = id;
        this.monto = monto;
        this.fecha = fecha;
        this.metodo = metodo;
        this.RUC = RUC;
        this.asistentes = asistentes;
        this.detalle = detalle;
        this.tipo_documento = tipo_documento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public String getRUC() {
        return RUC;
    }

    public void setRUC(String RUC) {
        this.RUC = RUC;
    }

    public Asistentes getAsistentes() {
        return asistentes;
    }

    public void setAsistentes(Asistentes asistentes) {
        this.asistentes = asistentes;
    }

    public Detalle getDetalle() {
        return detalle;
    }

    public void setDetalle(Detalle detalle) {
        this.detalle = detalle;
    }

    public Tipo_Documento getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(Tipo_Documento tipo_documento) {
        this.tipo_documento = tipo_documento;
    }
}
