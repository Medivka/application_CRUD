package by.sacuta.CrudApplication.repository;

import by.sacuta.CrudApplication.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepo extends JpaRepository<Player, Long> {

}
