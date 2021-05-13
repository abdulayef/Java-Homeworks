import adapters.DefaultCheckManager;
import adapters.MernisCheckManager;
import concrete.CampaignManager;
import concrete.GameManager;
import concrete.GamerManager;
import entities.Campaign;
import entities.Game;
import entities.Gamer;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) throws Exception {

        Gamer test=new Gamer(1, "Birol", "Öztürk", "10586746529", LocalDate.of(3000, 8, 7));
        Game minecraft=new Game(1, 10, 320, "Minecraft");
        Campaign campaign=new Campaign(1, 50, minecraft);

        GamerManager userManager=new GamerManager(test, new MernisCheckManager());
        GameManager gameManager=new GameManager(minecraft);
        CampaignManager campaignManager=new CampaignManager(campaign);

        userManager.register();
        gameManager.sell(test);
        campaignManager.add();
        campaignManager.delete();
        gameManager.sell(test, campaign);



    }
}
