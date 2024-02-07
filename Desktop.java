public class Desktop extends Computer{
    private String brand;
    public Desktop(String brand){
        this.brand=brand;
    }
    @Override
    public void code(){
        System.out.println("best way to code");
    }
    public void intro(){
        System.out.println("this desktop produced by"+this.brand+"in"+manu_year);
    }

}
