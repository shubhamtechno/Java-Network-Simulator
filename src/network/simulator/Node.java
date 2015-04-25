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
public class Node {
    int id;
    int x_cord;
    int y_cord;
    int connectedTo[];

    public Node(int id, int x_cord, int y_cord) {
        this.id = id;
        this.x_cord = x_cord;
        this.y_cord = y_cord;
        this.connectedTo = new int[100];
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getX_cord() {
        return x_cord;
    }

    public void setX_cord(int x_cord) {
        this.x_cord = x_cord;
    }

    public int getY_cord() {
        return y_cord;
    }

    public void setY_cord(int y_cord) {
        this.y_cord = y_cord;
    }

    public int[] getConnectedTo() {
        return connectedTo;
    }

    public void setConnectedTo(int[] connectedTo) {
        this.connectedTo = connectedTo;
    }
    
}
