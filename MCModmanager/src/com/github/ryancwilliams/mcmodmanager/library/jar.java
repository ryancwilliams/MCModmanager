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
class Jar {
    String name;
    String version;
    Path path;
    Jar(String name, String version, Path path){
        this.name = name;
        this.version = version;
        this.path = path;
    }
    String getName(){
        return this.name;
    }
    String getVersion(){
        return this.version;
    }
    Path getPath(){
        return this.path;
    }
    
}
