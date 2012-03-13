/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.ryancwilliams.mcmodmanager.library;

import java.nio.file.Path;

/**
 *
 * @author ryanwilliams
 */
class Pack {
    String name;
    String description;
    Mod[] mods = new Mod[Library.arraySize];
    int modsH = 0;
    Pack(String name, String description){
        this.name = name;
        this.description = description;
    }
    void addMod(String version, Path insidePath){
        this.addMod(new Mod(this.name,version,insidePath));
    }
    void addMod(String version, Path insidePath, Path outsidePath){
        this.addMod(new Mod(this.name,version,insidePath,outsidePath));
    }
    void addMod(Mod mod){
        this.mods[this.modsH] = mod;
        this.modsH++;
    }
    String getName(){
        return this.name;
    }
    String getDescription(){
        return this.description;
    }
    Mod[] getMods(){
        return this.mods;
    }
}
