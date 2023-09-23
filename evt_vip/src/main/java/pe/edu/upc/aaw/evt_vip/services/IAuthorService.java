package pe.edu.upc.aaw.evt_vip.services;

import pe.edu.upc.aaw.evt_vip.entities.Author;

import java.util.List;

public interface IAuthorService {
    public void insertar(Author author);

    public void eliminar(int idAuthor);

    public Author listarId(int idAuthor);

    List<Author> listar();

}
