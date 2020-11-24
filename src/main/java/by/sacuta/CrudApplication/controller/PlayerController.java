package by.sacuta.CrudApplication.controller;

import by.sacuta.CrudApplication.model.Player;
import by.sacuta.CrudApplication.service.PlayerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class PlayerController {
    private final PlayerService playerService;

    public PlayerController(PlayerService playerService) {

        this.playerService = playerService;
    }



    @GetMapping("/players")
    public String findAll(Model model){
        List<Player> players= playerService.findAll();
        model.addAttribute("players",players);
        return "/player-list";
    }
    @GetMapping("/player-create")
    public String createPlayerForm(Player player ){

        return "player-create";
    }
    @PostMapping("/player-create")
    public String createPlayer(Player player){
        playerService.saveUser(player);
        return "redirect:/players";
    }
    @GetMapping("player-delete/{id}")
    public String deletePlayer(@PathVariable("id") Long id){
        playerService.deleteById(id);
        return "redirect:/players";
    }
    @GetMapping("player-update/{id}")
    public String updatePlayerFrom(@PathVariable("id") Long id, Model model){
        Player player= playerService.findById(id);
        model.addAttribute("player",player);
      return "/player-update";
    }
    @PostMapping("/player-update")
    public String updatePlayer(Player player){
        playerService.saveUser(player);
        return "redirect:/players";
    }


}
