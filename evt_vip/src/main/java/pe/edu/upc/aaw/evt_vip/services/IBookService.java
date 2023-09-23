package pe.edu.upc.aaw.evt_vip.services;

import pe.edu.upc.aaw.evt_vip.entities.Author;
import pe.edu.upc.aaw.evt_vip.entities.Book;

import java.time.LocalDate;
import java.util.List;

public interface IBookService {
    public void insertar(Book book);

    List<Book> listar();
    List<Book> buscarFecha(LocalDate fecha);
    Long contarProyectosTipoA();

}
