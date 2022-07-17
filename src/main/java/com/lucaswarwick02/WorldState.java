package com.lucaswarwick02;

import java.io.IOException;

import com.lucaswarwick02.content.WorldData;
import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public final class WorldState {
    public static WorldState INSTANCE;

    private JSONObject contentJSON;
    public JSONObject getContentJSON () {
        return this.contentJSON;
    }

    public WorldData worldData = null;

    public WorldState () {
        WorldState.INSTANCE = this;

        try {
            Document doc = Jsoup.connect("https://content.warframe.com/dynamic/worldState.php").get();
            String bodyText = doc.body().toString();
            bodyText = bodyText.replace("<body>", "");
            bodyText = bodyText.replace("</body>", "");

            this.contentJSON = new JSONObject(bodyText);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Move data to classes
        this.worldData = new WorldData(
                this.contentJSON.getLong("Time"),
                this.contentJSON.getJSONArray("Sorties"),
                this.contentJSON.getJSONArray("Invasions"),
                this.contentJSON.getJSONArray("ActiveMissions"),
                this.contentJSON.getJSONArray("VoidStorms"),
                this.contentJSON.getJSONArray("Alerts"),
                this.contentJSON.getJSONArray("GlobalUpgrades")
        );
    }
}
