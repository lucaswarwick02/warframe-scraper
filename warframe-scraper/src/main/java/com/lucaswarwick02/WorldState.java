package com.lucaswarwick02;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

import java.io.IOException;

public final class WorldState {
    private static String contentString;
    public static String getContentString () {
        return WorldState.contentString;
    }

    public WorldState () {
        WebClient client = new WebClient();
        client.getOptions().setCssEnabled(false);
        client.getOptions().setJavaScriptEnabled(false);

        String searchUrl = "https://content.warframe.com/dynamic/worldState.php";

        try {
            HtmlPage page = client.getPage(searchUrl);
            WorldState.contentString = page.getBody().getTextContent();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
