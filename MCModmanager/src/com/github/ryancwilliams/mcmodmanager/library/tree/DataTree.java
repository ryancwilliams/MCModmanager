/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.ryancwilliams.mcmodmanager.library.tree;

import com.github.ryancwilliams.mcmodmanager.library.Library;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author ryanwilliams
 */
public class DataTree {
    private int[] nodes = new int[(Library.arraySize*4)];
    private String[] names = new String[(Library.arraySize*4)];
    private int[] ids = new int[(Library.arraySize*4)];
    private int nodesH = 0;
    
    public DataTree(String rootName){
        this.addToNodes(-1, rootName, -1);
    }
    public void addToTree(int parent, String name, int id){
        this.addToNodes(parent, name, id);
    }
    private void addToNodes(int parent, String name, int id){
        this.nodes[this.nodesH] = parent;
        this.names[this.nodesH] = name;
        this.ids[this.nodesH] = id;
        nodesH++;
    }
    public DefaultMutableTreeNode getTree(){
        //The Code to generate the tree
        //Vars for tree node generation 
        DefaultMutableTreeNode[] tNode = new DefaultMutableTreeNode[nodesH];
        
    }
}
