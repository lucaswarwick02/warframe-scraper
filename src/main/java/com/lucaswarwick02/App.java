package com.lucaswarwick02;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URISyntaxException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static WorldState WORLD_STATE = new WorldState();

    public static String SAVE_DATA_PATH = new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + File.separator + "warframe-scraper" + File.separator;
    public static void main( String[] args )
    {
        // Initialise Project
        createSaveDataDirectory();

        WorldState.SaveAsString();
        WorldState.SaveAsJSON();
    }

    private static void createSaveDataDirectory () {
        File directory = new File(SAVE_DATA_PATH);
        if (!directory.exists()) {
            directory.mkdir();
        }
    }
}
