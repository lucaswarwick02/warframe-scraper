package com.lucaswarwick02.content;

import org.json.JSONArray;

public class PVPData {
    public JSONArray challengeInstances;
    public JSONArray activeTournaments;

    public PVPData (JSONArray challengeInstances, JSONArray activeTournaments) {
        this.challengeInstances = challengeInstances;
        this.activeTournaments = activeTournaments;
    }

    @Override
    public String toString () {

        return this.challengeInstances.toString() +
                "\n\n" +
                this.activeTournaments.toString();
    }
}
