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
        StringBuilder sb = new StringBuilder();

        sb.append(this.featuredGuilds.toString() + "\n\n");
        sb.append(this.syndicateMissions.toString() + "\n\n");

        return sb.toString();
    }
}
