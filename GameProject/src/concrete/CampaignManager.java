package concrete;

import entities.Campaign;

import java.util.ArrayList;
import java.util.List;

public class CampaignManager {

    Campaign campaign;
    double newPrice;

    static List<Campaign> campaigns=new ArrayList<Campaign>();

    public CampaignManager(Campaign campaign) {
        this.campaign = campaign;
    }

    public void add() {
        newPrice = campaign.getGame().getPrice() - campaign.getGame().getPrice() / 100 * campaign.getDiscountRate();
        campaign.getGame().setPrice(newPrice);
        System.out.println(campaign.getGame().getName() + " oyunu %" + campaign.getDiscountRate() + " indirimde. Yeni fiyatı : " + newPrice);
        campaigns.add(campaign);
    }

    public void delete() {
        newPrice=campaign.getGame().getPrice()*100/campaign.getDiscountRate();
        campaign.getGame().setPrice(newPrice);
        System.out.println(campaign.getGame().getName()+" oyununun %"+campaign.getDiscountRate()+" indirimi bitti. Yeni fiyatı : "+newPrice);
        campaigns.remove(campaign);
    }
}
