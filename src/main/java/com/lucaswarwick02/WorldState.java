package com.lucaswarwick02;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Time;
import java.sql.Timestamp;

import org.json.JSONObject;
import org.json.JSONArray;

public final class WorldState {
    private static String contentString;
    public static String getContentString () {
        return WorldState.contentString;
    }

    private static JSONObject contentJSON;
    public static JSONObject getContentJSON () {
        return WorldState.contentJSON;
    }

    public WorldState () {
        WebClient client = new WebClient();
        client.getOptions().setCssEnabled(false);
        client.getOptions().setJavaScriptEnabled(false);

        String searchUrl = "https://content.warframe.com/dynamic/worldState.php";

        try {
            HtmlPage page = client.getPage(searchUrl);

            // Store the content as String
            WorldState.contentString = page.getBody().getTextContent();

            // Store the content as JSON
            WorldState.contentJSON = new JSONObject(WorldState.getContentString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void SaveAsString () {
        try {
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            FileWriter fileWriter = new FileWriter(App.SAVE_DATA_PATH + timestamp.getTime() + ".txt");
            fileWriter.write(WorldState.getContentString());
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void SaveAsJSON () {
        try {
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            FileWriter fileWriter = new FileWriter(App.SAVE_DATA_PATH + timestamp.getTime() + ".json");
            fileWriter.write(WorldState.getContentJSON().toString());
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
