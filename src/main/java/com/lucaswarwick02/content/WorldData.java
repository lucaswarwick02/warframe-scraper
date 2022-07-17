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

    public String toString () {
        StringBuilder sb = new StringBuilder();
        sb.append(time + "\n\n");
        sb.append(sorties.toString() + "\n\n");
        sb.append(invasions + "\n\n");
        sb.append(activeMissions + "\n\n");
        sb.append(voidStorms + "\n\n");
        sb.append(alerts + "\n\n");
        sb.append(globalUpgrades + "\n\n");

        return sb.toString();
    }
}
