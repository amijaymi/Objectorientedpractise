public class Laptop extends Computer {
    private String brand;
    public Laptop(String brand){
        this.brand=brand;
    }
    @Override
    public void code(){
        System.out.println("best and comforty way to code");
    }
    public void intro(){
        System.out.println("this desktop produced by"+this.brand+"in"+manu_year);
    }
    
}
//class Animal { }  
  
// class Dog3 extends Animal {  
//   static void method(Animal a) {  
//     if(a instanceof Dog3){  
//        Dog3 d=(Dog3)a;//downcasting  
//        System.out.println("ok downcasting performed");  
//     }  
//   }  