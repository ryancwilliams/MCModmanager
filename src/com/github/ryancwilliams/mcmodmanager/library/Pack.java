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
    Pack(String name, String description){
        this.name = name;
        this.description = description;
    }
    String getDescription(){
        return this.description;
    }
    Path getPath(){
        return this.path;
    }
}
