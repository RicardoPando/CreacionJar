package pe.edu.upc.aaw.evt_vip.entities;


import jakarta.persistence.*;


@Entity
@Table(name = "Usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUser;
    @Column(name = "DNI", length = 8, nullable = false)
    private long dni;
    @Column(name = "Nombre", length = 45, nullable = false)
    private String nombre;
    @Column(name = "Apellido", length = 45, nullable = false)
    private String apellido;
    @Column(name = "Email", length = 50, nullable = false)
    private String email;
    @Column(name = "Telefono", length = 9, nullable = false)
    private long telefono;

    public Usuario() {
    }

    public Usuario(int idUser, long dni, String nombre, String apellido, String email, long telefono) {
        this.idUser = idUser;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
}