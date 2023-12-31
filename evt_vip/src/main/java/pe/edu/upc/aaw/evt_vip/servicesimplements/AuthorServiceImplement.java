package pe.edu.upc.aaw.evt_vip.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.evt_vip.repositories.IAuthorRepository;
import pe.edu.upc.aaw.evt_vip.entities.Author;
import pe.edu.upc.aaw.evt_vip.services.IAuthorService;

import java.util.List;

@Service
public class AuthorServiceImplement implements IAuthorService {
    @Autowired
    private IAuthorRepository irA;

    @Override
    public void insertar(Author author) {
        irA.save(author);
    }

    @Override
    public void eliminar(int idAuthor) {
        irA.deleteById(idAuthor);
    }

    @Override
    public Author listarId(int idAuthor) {
        return irA.findById(idAuthor).orElse(new Author());
    }

    @Override
    public List<Author> listar() {
        return irA.findAll();
    }
}

