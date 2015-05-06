package network.simulator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sona1_000
 */
public class Packet {
    int id;
    int src;
    int dest;
    int size;
    String type; // 0-TCP, 1-ACK

    public Packet(int id, int src, int dest, int size, String type) {
        this.id = id;
        this.src = src;
        this.dest = dest;
        this.size = size;
        this.type = type;
    }
    
}
