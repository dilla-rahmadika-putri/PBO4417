/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan4.Praktek;

/**
 *
 * @author ASUS
 */
import java.util.ArrayList;
import java.math.*;

public class GameEnvironment {
    private double width;
    private double height;

    private ArrayList<GamePlayer> arrPlayer = new ArrayList<GamePlayer>();
    private ArrayList<GameEnemy> arrEnemy = new ArrayList<GameEnemy>();

    public GameEnvironment() {
    }
    public GameEnvironment(double width, double height) {
        this.width = width;
        this.height = height;
        this.arrPlayer = new ArrayList<GamePlayer>();
        this.arrEnemy = new ArrayList<GameEnemy>();
    }
    public void addPlayer(GamePlayer newPlayer) {
        arrPlayer.add(newPlayer);
    }
    public void removePlayer(GamePlayer nowPlayer) {
        arrPlayer.remove(nowPlayer);
    }
    public void getAllPlayers() {
        System.out.print("All of Players : [");
        for(int i = 0; i < arrPlayer.size(); i++) {
            if(i != 0){
                System.out.print(", ");
			}
			System.out.print(arrPlayer.get(i));                     
		}
        System.out.print("]\n");
    }
    public void addEnemy(GameEnemy newEnemy) {
        arrEnemy.add(newEnemy);
    }
    public void removeEnemy(GameEnemy nowEnemy) {
        arrEnemy.remove(nowEnemy);
    }
    public void getAllEnemy() {
        System.out.print("All of Enemies : [");
        for(int i = 0; i < arrEnemy.size(); i++) {
            if(i != 0) {
                System.out.print(", ");
            }
			System.out.print(arrEnemy.get(i));                     
		}
        System.out.print("]\n");
    }
    public void Interaction() {
        if (arrPlayer == null || arrEnemy == null) {
            System.out.println("Player or enemy not sets");
        }
        for (int i = 0; i < arrPlayer.size(); i++) {
            for (int j = 0; j < arrEnemy.size(); j++) {
                if (arrPlayer.get(i).getY() != arrEnemy.get(j).getY()) {
                    System.out.println("Player : " + arrPlayer.get(i) + " and Enemy : " + arrEnemy.get(j) + " not in the same Y position");
                }
                if (EuclideanDistance(arrPlayer.get(i).getX(), arrPlayer.get(i).getY(), arrEnemy.get(j).getX(), arrEnemy.get(j).getY()) < 2) {
                    System.out.println("Player : " + arrPlayer.get(i) + " Attacked");
                    System.out.println("Enemy : " + arrEnemy.get(j) + " loses");
                    removeEnemy(arrEnemy.get(j));
                }
                else {
                    System.out.println("==> Player " + arrPlayer.get(i));
                    arrPlayer.get(i).run((int) Math.ceil(Math.random()*10));
                    System.out.println("current x position = " + arrPlayer.get(i).getX() + " <==");
                }
            }
        }
    }
    public static int EuclideanDistance(int x1, int y1, int x2, int y2) {
        return (int)Math.sqrt((Math.pow(y1-x1, 2)) + (Math.pow(y2-x2, 2)));
    }
}
    

