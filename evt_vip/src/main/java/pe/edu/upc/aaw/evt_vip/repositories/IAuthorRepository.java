package pe.edu.upc.aaw.evt_vip.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.evt_vip.entities.Author;
@Repository
public interface IAuthorRepository extends JpaRepository<Author,Integer> {
}
