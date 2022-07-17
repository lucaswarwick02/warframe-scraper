package com.lucaswarwick02.content;

import org.json.JSONArray;

public class WorldData {
    public long time;
    public JSONArray sorties;
    public JSONArray invasions;
    public JSONArray activeMissions;
    public JSONArray voidStorms;
    public JSONArray alerts;
    public JSONArray globalUpgrades;

    public WorldData (long time, JSONArray sorties, JSONArray invasions, JSONArray activeMissions, JSONArray voidStorms, JSONArray alerts, JSONArray globalUpgrades) {
        this.time = time;
        this.sorties = sorties;
        this.invasions = invasions;
        this.activeMissions = activeMissions;
        this.voidStorms = voidStorms;
        this.alerts = alerts;
        this.globalUpgrades = globalUpgrades;
    }

    @Override
    public String toString () {

        return this.time +
                "\n\n" +
                this.sorties.toString() +
                "\n\n" +
                this.invasions.toString() +
                "\n\n" +
                this.activeMissions.toString() +
                "\n\n" +
                this.voidStorms.toString() +
                "\n\n" +
                this.alerts.toString() +
                "\n\n" +
                this.globalUpgrades.toString();
    }
}
