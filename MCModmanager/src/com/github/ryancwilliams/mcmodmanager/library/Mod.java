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
class Mod {
    String name;
    String version;
    Path insidePath;
    Path outsidePath;
    Jar[] jars = new Jar[Library.arraySize];
    int jarsH = 0;
    Mod[] dependencies = new Mod[Library.arraySize];
    int dependenciesH = 0;
    Mod(String name, String version, Path insidepath){     
        this.name = name;
        this.version = version;
        this.insidePath = insidepath;
    }
    Mod(String name, String version, Path insidePath, Path outsidePath){     
        this.name = name;
        this.version = version;
        this.insidePath = insidePath;
        this.outsidePath = outsidePath;
    }
    public void addJar(Jar jar){
        this.jars[this.jarsH] = jar;
        this.jarsH++;
    }
    public void addDependency(Mod mod){
        this.dependencies[this.dependenciesH] = mod;
        this.dependenciesH++;
    }
    String getName(){
        return this.name;
    }
    String getVersion(){
        return this.version;
    }
    Path getPath(){
        return this.insidePath;
    }
    Path getOutsidePath(){
        return this.outsidePath;
    }
    Jar[] getJars(){
        return this.jars;
    }
    Mod[] getDependencies(){
        return this.dependencies;
    }
}
