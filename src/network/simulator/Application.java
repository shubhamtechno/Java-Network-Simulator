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
public class Application {
    int id; 
    String type;
    int agentId;
    int start;
    int stop;
    int duration;

    public Application(int id, String type, int agentId, int start, int stop) {
        this.id = id;
        this.type = type;
        this.agentId = agentId;
        this.start = start;
        this.stop = stop;
        this.duration=stop-start;
    }
    
    

}
