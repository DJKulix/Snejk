/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snejk;

/**
 *
 * @author shar_
 */
public class Grid {
    private int[][] grid;
    private int width;
    private int height;
    
    public Grid(){
        width = 10;
        height = 10;
        grid = new int[width][height];
    }

    public Grid(int width, int height) {
        grid = new int[width][height];
        this.width = width;
        this.height = height;
    }
    
    public int getWidth(){
        return width;
    }
    
    public int getHeight(){
        return height;
    }
    
    public int[][] getGrid(){
        return grid;
    }
     
    public int getGrid(int x, int y){
        return grid[x][y];
    }
    
    public void setGrid(int x, int y, int value){
       grid[x][y]=value;
    }
}
