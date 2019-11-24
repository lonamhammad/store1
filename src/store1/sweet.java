package store1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lona
 */
public class sweet implements snack{
    public void chocolate(){
        System.out.println();
    }
    public void biscuit(){
        System.out.println();
    }
    
    @Override
    public void type(){
        System.out.println("1 bar dark chocolate");
    }
    @Override
    public void calories(){
        System.out.println("content 207 calories");
    }
    @Override
    public void size(){
        System.out.println("wight = 1.45 oz");
    }
}
