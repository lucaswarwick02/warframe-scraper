package com.lucaswarwick02;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Time;
import java.sql.Timestamp;

import com.lucaswarwick02.content.world.WorldData;
import org.json.JSONObject;
import org.json.JSONArray;

public final class WorldState {
    public static WorldState INSTANCE;

    private String contentString;
    public String getContentString () {
        return this.contentString;
    }

    private JSONObject contentJSON;
    public JSONObject getContentJSON () {
        return this.contentJSON;
    }

    public WorldData worldData = null;

    public WorldState () {
        WorldState.INSTANCE = this;

        WebClient client = new WebClient();
        client.getOptions().setCssEnabled(false);
        client.getOptions().setJavaScriptEnabled(false);

        String searchUrl = "https://content.warframe.com/dynamic/worldState.php";

        try {
            HtmlPage page = client.getPage(searchUrl);

            // Store the content as String
            this.contentString = page.getBody().getTextContent();
            // Store the content as JSON
            this.contentJSON = new JSONObject(this.getContentString());

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Move data to classes
        this.worldData = new WorldData(this.contentJSON.getLong("Time"));
    }
}
