package com.lucaswarwick02.content;

import org.json.JSONArray;
import org.json.JSONObject;

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
        StringBuilder sb = new StringBuilder();

        sb.append(this.time + "\n\n");
        sb.append(this.sorties.toString() + "\n\n");
        sb.append(this.invasions.toString() + "\n\n");
        sb.append(this.activeMissions.toString() + "\n\n");
        sb.append(this.voidStorms.toString() + "\n\n");
        sb.append(this.alerts.toString() + "\n\n");
        sb.append(this.globalUpgrades.toString() + "\n\n");

        return sb.toString();
    }
}
