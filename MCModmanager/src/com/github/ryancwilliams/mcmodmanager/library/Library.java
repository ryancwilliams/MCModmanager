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
    public static int arraySize = 128;
    
    private Jar[] jars = new Jar[(this.arraySize*4)];
    private Pack[] mods = new Pack[(this.arraySize*4)];
    private DataTree tree;
    public Library(){
        
    }
}
