package com.lucaswarwick02.content;

import org.json.JSONArray;

public class GuildData {
    public JSONArray featuredGuilds;
    public JSONArray syndicateMissions;

    public GuildData (JSONArray featuredGuilds, JSONArray syndicateMissions) {
        this.featuredGuilds = featuredGuilds;
        this.syndicateMissions = syndicateMissions;
    }

    @Override
    public String toString () {

        return this.featuredGuilds.toString() +
                "\n\n" +
                this.syndicateMissions.toString();
    }
}
