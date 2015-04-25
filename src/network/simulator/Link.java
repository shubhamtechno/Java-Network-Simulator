/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package network.simulator;

/**
 *
 * @author sona1_000
 */
public class Link {
    int id;
    int fromNode;
    int toNode;
    String type;
    int capacity;
    int delay;
    int queueSize;
    String queueType;

    public Link(int id, int fromNode, int toNode, String type, int capacity, int delay, int queueSize, String queueType) {
        this.id = id;
        this.fromNode = fromNode;
        this.toNode = toNode;
        this.type = type;
        this.capacity = capacity;
        this.delay = delay;
        this.queueSize = queueSize;
        this.queueType = queueType;
    }
    
    
    
}
