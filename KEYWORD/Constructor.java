class Constructor 
{ 
    Constructor() 
    { 
        this(5); 
        System.out.println("The Default constructor"); 
    } 
    Constructor(int x) 
    { 
        System.out.println(x); 
    } 
    Constructor(int x, int y) 
    { 
        System.out.println(x * y); 
    } 
  
    public static void main(String args[]) 
    { 
        new Constructor(); 
    } 
}
