package me.hansboy.mailsender;

import org.bukkit.plugin.java.JavaPlugin;

public final class cmdExecutor extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("mail").setExecutor(new cmdMail());
    }
}