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
    Path path;
    Jar[] jars = new Jar[Library.arraySize];
    int jarsH = 0;
    Mod[] dependencies = new Mod[Library.arraySize];
    int dependenciesH = 0;
    Mod(String name, String version, Path path){     
        this.name = name;
        this.version = version;
        this.path = path;
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
        return this.path;
    }
    Jar[] getJars(){
        return this.jars;
    }
    Mod[] getDependencies(){
        return this.dependencies;
    }
}
