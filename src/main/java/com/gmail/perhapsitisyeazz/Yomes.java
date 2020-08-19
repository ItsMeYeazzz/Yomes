package com.gmail.perhapsitisyeazz;

import com.moderocky.mask.template.BukkitPlugin;

public class Yomes extends BukkitPlugin {

    private static Yomes instance;

    public static Yomes getInstance() {
        return instance;
    }

    @Override
    public void startup() {
        instance = this;
    }

    @Override
    public void disable() {
        instance = null;
    }
}
