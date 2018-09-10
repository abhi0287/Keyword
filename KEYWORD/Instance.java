import java.io.*; 
  
class Foo{ 
      
    String name = ""; 
     
    public void geek(String name){ 
          
        this.name = name; 
    } 
} 
  
class Instance { 
    public static void main (String[] args) { 
        Foo ob = new Foo(); 
        ob.geek("GeeksforGeeks"); 
        System.out.println(ob.name); 
    } 
}
