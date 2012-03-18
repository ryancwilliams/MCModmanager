/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.ryancwilliams.mcmodmanager.library;

import com.github.ryancwilliams.mcmodmanager.library.tree.DataTree;

/**
 *
 * @author ryanwilliams
 */
public class Library {
    /**
     * The base size of the arrays used by the library and its subclasses
     */
    public static int arraySize = 128;
    
    private Jar[] jars = new Jar[(Library.arraySize*4)];
    private int jarsH = 0;
    private Pack[] mods = new Pack[(Library.arraySize*4)];
    private int packH = 0;
    private DataTree tree = new DataTree("Library");
    public Library(){
        
    }
    public int addPack(Pack pack){
        String name = pack.name;
        int id = addPack(pack,name);
        return id;
    }
    public int addPack(Pack pack, String name){
        int id = this.packH;
        this.mods[id] = pack;
        this.tree.addToTree(0, name, id);
        this.packH++;
        return id;
    }
    public int addMod(Mod mod,String description){
        String name = mod.name;
        int id = addPack(new Pack(name, description));
        addToPack(id,mod);
        return id;
    }
    public void addToPack(int id, Mod mod){
        mods[id].addMod(mod);
    }
    public void createFolder(String name){
        this.tree.addFolderToTree(0, name);
    }
    public void createFolder(String name, String parentName){
        this.tree.addFolderToTree(parentName, name);
    }
    public void moveToFolder(int id, String name){
        this.tree.changeParent(id, name);
    }
}
