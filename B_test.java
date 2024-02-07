public class B_test {
    public static void main(String[] args) {
        B t=new B();
        t.config();
        t.show();
        //A.area="mumbai" bu hata vericek final oldugu iicin degistiremivcez
        System.out.println(A.area);// buran anliyoruz ki final ve static, obje yaratmamiza gerek kalmadi
    }
}
