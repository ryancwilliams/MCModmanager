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
    /**
     * The Name of this node
     */
    public String name;
    /**
     * The ID of this node
     */
    public int id;
    
    /**
     * Creates a new DataNode
     * @param name The name of this node
     * @param id The ID of this node
     */
    public DataNode(String name,int id) {
        this.name = name;
        this.id = id;
    }
    /**
     * The toString method
     * @return The name of this node
     */
    @Override
    public String toString() {
        return this.name;
    }
}
