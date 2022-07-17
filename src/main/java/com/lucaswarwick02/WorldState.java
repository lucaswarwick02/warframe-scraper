package com.lucaswarwick02;

import java.io.IOException;

import com.lucaswarwick02.content.GuildData;
import com.lucaswarwick02.content.PVPData;
import com.lucaswarwick02.content.ShopData;
import com.lucaswarwick02.content.WorldData;
import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public final class WorldState {
    public static WorldState INSTANCE;

    public WorldData worldData = null;
    public ShopData shopData = null;
    public GuildData guildData = null;
    public PVPData pvpData = null;

    public WorldState () {
        WorldState.INSTANCE = this;

        JSONObject content = null;

        try {
            Document doc = Jsoup.connect("https://content.warframe.com/dynamic/worldState.php").get();
            String bodyText = doc.body().toString();
            bodyText = bodyText.replace("<body>", "");
            bodyText = bodyText.replace("</body>", "");

            content = new JSONObject(bodyText);
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (content != null) {
            this.worldData = new WorldData(
                    content.getLong("Time"),
                    content.getJSONArray("Sorties"),
                    content.getJSONArray("Invasions"),
                    content.getJSONArray("ActiveMissions"),
                    content.getJSONArray("VoidStorms"),
                    content.getJSONArray("Alerts"),
                    content.getJSONArray("GlobalUpgrades")
            );

            this.shopData = new ShopData(
                    content.getJSONArray("DailyDeals"),
                    content.getJSONArray("VoidTraders"),
                    content.getJSONArray("FlashSales")
            );

            this.guildData = new GuildData(
                    content.getJSONArray("FeaturedGuilds"),
                    content.getJSONArray("SyndicateMissions")
            );

            this.pvpData = new PVPData(
                    content.getJSONArray("PVPChallengeInstances"),
                    content.getJSONArray("PVPActiveTournaments")
            );
        }
    }
}
