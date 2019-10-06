package mbmwat.bookmakers.mvc.controllers;

import mbmwat.bookmakers.repository.model.Game;
import mbmwat.bookmakers.repository.model.League;
import mbmwat.generators.GamesGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    private GamesGenerator gamesGenerator;

    public HomeController(GamesGenerator gamesGenerator) {
        this.gamesGenerator = gamesGenerator;
    }

    @RequestMapping("/")
    public String home(Model model){

        List<League> leagues = new ArrayList<>();

        leagues.add(League.builder().name("Angielska").build());
        leagues.add(League.builder().name("Niemiecka").build());
        leagues.add(League.builder().name("Brytyjska").build());
        leagues.add(League.builder().name("Polska").build());
        leagues.add(League.builder().name("Francuska").build());
        leagues.add(League.builder().name("Argentyńska").build());
        leagues.add(League.builder().name("Rosyjska").build());
        leagues.add(League.builder().name("Włoska").build());
        leagues.add(League.builder().name("Czeska").build());
        leagues.add(League.builder().name("Szwedzka").build());
        leagues.add(League.builder().name("Duńska").build());

       List<Game> games =  gamesGenerator.generateGames();


        model.addAttribute("leagues", leagues);
        model.addAttribute("games", games);

        return "homePage";
    }

    @GetMapping("/tm")
    public String tm(){
        return "tm";
    }
}
