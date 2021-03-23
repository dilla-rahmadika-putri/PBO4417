/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan3.Praktek;

/**
 *
 * @author ASUS
 */
public class TestGame {
    public static void main(String[]args){
        GameEnemy enemy = new GameEnemy();
        enemy.run();
        
        GamePlayer player = new GamePlayer();
        player.setPosition(60, 90);
        player.run();
        player.run(30);                        
    }
    
}
