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
    public void addFolderToTree(int parrent, String name){
        this.addToNodes(parrent, name, -1);
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
        
        //Create the nodes
        //Create the root node
        tNode[0] = new DefaultMutableTreeNode(this.names[0]);
        //Create the other nodes
        for(int c = 1;c <= this.nodesH;c++){
            //Create the Vars for the for loop
            DefaultMutableTreeNode cNode;
            //Check if node is a folder
            if (this.ids[c] != -1){
            cNode = new DefaultMutableTreeNode(new DataNode
                    (this.names[c],this.ids[c]));
            } else {
            cNode = new DefaultMutableTreeNode(this.names); 
            }
            //Place the resulte in the array
            tNode[c] = cNode;
        }
        
        //Link the nodes
        for(int c = 1;c <= this.nodesH;c++){
            //Get the indux of the parent node
            int pNode = this.nodes[c];
            //Set the parent node of the current node
            tNode[pNode].add(tNode[c]);
        }
        //return the root node
        return tNode[0];
    }
}
