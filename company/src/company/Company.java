package company;

public class Company {

    public static void main(String[] args) {
        /*  Emp e = new Emp();
        e.printName();
         */
        //anonymouse from the interface
        iEmp e = new iEmp() {
            @Override
            public void printName() {

                System.out.println("Salem");

            }

        };
        e.printName();
        

        // anonymouse from the class 
        Emp a = new Emp(){
          @Override   
          public void printName(){
              System.out.println("Naa1");
              System.out.println("Nada2");
              System.out.println("Nada3");
          }
          
        };
        a.printName();
        
        
        
        
        
        
    }

}
