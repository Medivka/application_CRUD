package by.sacuta.CrudApplication.service;

import by.sacuta.CrudApplication.model.Player;
import by.sacuta.CrudApplication.repository.PlayerRepo;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PlayerService {

    private final PlayerRepo playerRepo;

    public PlayerService(PlayerRepo playerRepo) {
        this.playerRepo = playerRepo;
    }

    public Player findById(Long id){
        return playerRepo.getOne(id);
    }
    public List<Player> findAll(){
        return playerRepo.findAll();
    }
    public Player saveUser(Player player){
        return playerRepo.save(player);
    }
    public void deleteById(Long id){
        playerRepo.deleteById(id);
    }
}
