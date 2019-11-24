package store1;


import store1.snack;



/**
 *
 * @author Lona
 */
public class drinks implements snack{
        public void soda(){
        System.out.println();
    }
    public void juice(){
        System.out.println();
    }
    
        @Override
    public void type(){
        System.out.println("coca cola");
    }
        @Override
    public void calories(){
        System.out.println("content 140 calories");
    }
        @Override
    public void size(){
        System.out.println("1 can");
    }
}
