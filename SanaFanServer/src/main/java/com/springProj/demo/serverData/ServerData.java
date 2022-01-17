package com.springProj.demo.serverData;

import com.springProj.demo.spring.Player;

import java.util.ArrayList;

public class ServerData {
    public static ArrayList<Player> playerList = new ArrayList<>();

    public static Player getPlayer(String name){
        for(Player p: playerList){
            if(p.getName().equals(name)) return p;
        }
        return null;
    }
}
