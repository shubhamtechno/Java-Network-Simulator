/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package network.simulator;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sona1_000
 */
public class Simulation {

    ArrayList<Integer>[] timeline;
    Thread t[];
    Simulation(int simulationTime,int appCount)
    {
        timeline = (ArrayList<Integer>[])new ArrayList[simulationTime*1000+1];
        for(int i=0;i<=simulationTime*1000;i++)
            timeline[i]= new ArrayList<>();
        t=new Thread[appCount+1];
    }
    public static void main(String[] args) {
        int simulationTime=mainFrame.simulationTime;
        String outFile=mainFrame.outFile;
        int appCount=mainFrame.appNum;
        Simulation obj = new Simulation(simulationTime,appCount);
        obj.assignTime(appCount);
        obj.checkTime(simulationTime);
        System.out.println("Simulation Ended\n\n\n\n\n\n");
    }

    public void checkTime(int simulationTime) {
        int time=simulationTime*1000;
        for(int i=0;i<time;i++)
        {
            if(!this.timeline[i].isEmpty())
            {
                for(int j=0;j<this.timeline[i].size();j++)
                {                    
                    final int id=this.timeline[i].get(j);                  
                    System.out.println("App started : "+id);
                    t[id] = new Thread(new Runnable(){
                        @Override
                        public void run() {
                            Simulation.startFTP(id);
                        }
                    });
                    t[id].start();
                }
            }
            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(Simulation.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void assignTime(int appCount) {
        for(int i=0;i<=appCount;i++)
        {
            this.timeline[mainFrame.appObj[i].start*1000].add(i);
        }
    }
    
    public static void startFTP(int AppId) {
        ArrayList<Packet> pkts = new ArrayList<>();
        int agentId,src,dest,size;
        String type;
        agentId=mainFrame.appObj[AppId].agentId;
        src=mainFrame.agentObj[agentId].nodeId;
        dest=mainFrame.agentObj[agentId].sinkNodeId;
        size=mainFrame.agentObj[agentId].packetSize;
        type=mainFrame.agentObj[agentId].type;
        int duration = mainFrame.appObj[AppId].duration;
        int pktId=0;
        while(pktId<duration*1000)
        {
            
            pkts.add(new Packet(pktId,src,dest,size,type));
            System.out.println("Packet Generated : "+agentId+" "+pktId+" ");
            pktId++;
            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(Simulation.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("App ended : "+AppId);
        return;
    } 
    
}
