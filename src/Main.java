public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        String sonuc = calculator.Sonuc();
        int sonucTopla = calculator.Topla(20,30);
        int sonucCikar = calculator.Cikar(30,20);
        int sonucCarp = calculator.Carpma(20,30);
        int sonucBol = calculator.Bolme(30,20);

        System.out.println(sonuc);
        System.out.println("Toplam : " + sonucTopla);
        System.out.println("Çıkarma : " + sonucCikar);
        System.out.println("Çarpme : " + sonucCarp);
        System.out.println("Bölme : " + sonucBol);

    }
}