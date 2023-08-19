package com.github.duckythecolonel.ducks.helloworld;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

@SuppressWarnings("unused")
public class HelloWorldPlugin extends JavaPlugin {
    private final Logger log = getLogger();

    @Override
    public void onLoad() {
        saveDefaultConfig();
        log.info("HelloWorld : onLoad");
    }

    @Override
    public void onEnable() {
        log.info("HelloWorld : onEnable");
    }

    @Override
    public void onDisable() {
        log.info("HelloWorld : onDisable");
    }
}
