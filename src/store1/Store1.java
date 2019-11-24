 
package store1;

 
public class Store1 {

 
    public static void main(String[] args) {
     
    employee obj=new employee();
    obj.lona();
    
    cacher a=new cacher();
    a.lona();
    
    employee b=new cacher();
      b.lona();
    
  System.out.println(obj.employre("lona",19));
  System.out.println(obj.employre("yara",5463));
  
  sweet x=new sweet();
  x.type();
  x.calories();
  x.size();
  
  System.out.println("*************************");
        
  drink y=new drink ();
  y.type();
  y.calories();
  y.size();
}
}