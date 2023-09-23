package pe.edu.upc.aaw.evt_vip.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.evt_vip.entities.Author;
import pe.edu.upc.aaw.evt_vip.entities.Book;
import pe.edu.upc.aaw.evt_vip.repositories.IAuthorRepository;
import pe.edu.upc.aaw.evt_vip.repositories.IBookRepository;
import pe.edu.upc.aaw.evt_vip.services.IAuthorService;
import pe.edu.upc.aaw.evt_vip.services.IBookService;

import java.time.LocalDate;
import java.util.List;

@Service
public class BookServiceImplement implements IBookService {
    @Autowired
    private IBookRepository bR;

    @Override
    public void insertar(Book book) {
        bR.save(book);
    }

    @Override
    public List<Book> listar() {
        return bR.findAll();
    }

    @Override
    public List<Book> buscarFecha(LocalDate fecha) {
        return bR.findBypublicationDateBook(fecha);    }

    @Override
    public Long contarProyectosTipoA() {
        return bR.cantidad();
    }
}

