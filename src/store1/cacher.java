
package store1;

public class cacher extends employee{
 public String lona;
 public String ID;
 private int salary; 
    
public String getname(){
 return lona;
}
 public String ID(){
  return ID;  
}
public int salary(){
    return salary;
}   
 public void setname(String lona){
   lona=lona; 
}
public void setrealis(String ID){
    ID=ID;
}
public void setexpire(int salary){
    salary=salary;
}  
    
    
     public void lona(){
        System.out.println("cacher");
    }
    
    
}
