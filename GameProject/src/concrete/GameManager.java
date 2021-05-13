package concrete;

import entities.Campaign;
import entities.Game;
import entities.Gamer;

public class GameManager {

    Game game;

    public GameManager(Game game) {
        this.game = game;
    }

    public void sell(Gamer gamer) {
        System.out.println(game.getName() + " oyununu " + gamer.getFirstName() + " adlı kullanıcı " + game.getPrice() + " fiyatında satın aldı");

    }

    public void sell(Gamer gamer, Campaign campaign) {
        if (checkCampaign(campaign)) {
            System.out.println(game.getName() + " oyununu %" + campaign.getDiscountRate() + " oranında indirim ile " + gamer.getFirstName() + " adlı kullanıcı " + game.getPrice() + " fiyatında satın aldı");
        } else {
            sell(gamer);
        }

    }

    public boolean checkCampaign(Campaign campaign) {
        return CampaignManager.campaigns.contains(campaign);

    }

    public void add() {


    }

    public void delete() {


    }

    public void update() {


    }
}
