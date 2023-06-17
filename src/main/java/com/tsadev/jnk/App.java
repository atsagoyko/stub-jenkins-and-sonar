package com.tsadev.jnk;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * App starting point.
 */
public class App {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(App.class));

    public static void main(String[] args) {
        LOGGER.log(Level.INFO, "Application started successfully.");
    }
}
