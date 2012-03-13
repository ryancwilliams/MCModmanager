/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.ryancwilliams.mcmodmanager.library.tree;

/**
 *
 * @author ryanwilliams
 */
class DataNode {
    public String name;
    public int id;
    
    public DataNode(String name,int id) {
        this.name = name;
        this.id = id;
    }   
    @Override
    public String toString() {
        return this.name;
    }
}
