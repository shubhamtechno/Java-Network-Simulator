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
public class Agent {
    int id;
    String type;
    int sinkNodeId;
    int nodeId;
    int packetSize;

    public Agent(int id, String type, int sinkNodeId, int nodeId, int packetSize) {
        this.id = id;
        this.type = type;
        this.sinkNodeId = sinkNodeId;
        this.nodeId = nodeId;
        this.packetSize = packetSize;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSinkNodeId() {
        return sinkNodeId;
    }

    public void setSinkNodeId(int sinkNodeId) {
        this.sinkNodeId = sinkNodeId;
    }

    public int getNodeId() {
        return nodeId;
    }

    public void setNodeId(int nodeId) {
        this.nodeId = nodeId;
    }

    public int getPacketSize() {
        return packetSize;
    }

    public void setPacketSize(int packetSize) {
        this.packetSize = packetSize;
    }
    
}
