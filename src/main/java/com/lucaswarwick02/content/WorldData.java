package com.lucaswarwick02.content;

import com.lucaswarwick02.WorldState;
import org.json.JSONArray;

import java.util.HashMap;

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
        StringBuilder sortiesString = new StringBuilder();
        sortiesString.append("########## SORTIES ##########\n");
        WorldState.INSTANCE.worldData.sorties.toList().forEach(entry -> {
            ((HashMap) entry).forEach((k, v) -> {
                sortiesString.append(k + ": " + v.getClass() + "\n");
            });
            sortiesString.append("\n\n");
        });

        StringBuilder invasionsString = new StringBuilder();
        invasionsString.append("########## INVASIONS ##########\n");
        WorldState.INSTANCE.worldData.invasions.toList().forEach(entry -> {
            ((HashMap) entry).forEach((k, v) -> {
                invasionsString.append(k + ": " + v.getClass() + "\n");
            });
            invasionsString.append("\n\n");
        });

        StringBuilder activeMissionsString = new StringBuilder();
        activeMissionsString.append("########## ACTIVE MISSIONS ##########\n");
        WorldState.INSTANCE.worldData.invasions.toList().forEach(entry -> {
            ((HashMap) entry).forEach((k, v) -> {
                activeMissionsString.append(k + ": " + v.getClass() + "\n");
            });
            activeMissionsString.append("\n\n");
        });

        return this.time +
                "\n\n" +
                sortiesString.toString() +
                "\n\n" +
                invasionsString.toString() +
                "\n\n" +
                activeMissionsString.toString() +
                "\n\n" +
                this.voidStorms.toString() +
                "\n\n" +
                this.alerts.toString() +
                "\n\n" +
                this.globalUpgrades.toString();
    }
}
