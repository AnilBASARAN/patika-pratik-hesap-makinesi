import java.util.Scanner;
public class Hesap {

    // öncelikle kullanıcıdan birinci ve ikinci sayı için bir tam sayı girmesini istiyoruz

    public static void main(String[] args) {
        int var1,var2,select;


        Scanner input = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz   ");
        var1 = input.nextInt();

        System.out.print("İkinci sayıyı giriniz   ");
        var2 = input.nextInt();

        // sonrasında iki operand arasında yapılacak operatorü seçmesini istiyoruz.

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçim yapınız:  ");
        select = input.nextInt();

        switch (select){
            case 1:
                System.out.println("Seçilen iki sayının Toplamı :" +(var1+var2) );
                break;
            case 2:
                System.out.println("Seçilen iki sayının Farkı :" +(var1-var2) );
                break;
            case 3:
                System.out.println("Seçilen iki sayının Çarpımı :" +(var1*var2) );
                break;
            case 4:
                switch (var2){
                    case 0:
                        System.out.println("Bir sayı 0'a bölünemez!");
                        break;
                    default:
                    System.out.println("Seçilen iki sayının Bölümü :" +(double)(var1/var2) );
                    break;
                }
                // eğer buraya break komutunu koymazsak case 4 ten sonra default olan
                // yanlıs bir değer girdiniz cümlesi de yazdırılıyor , o yüzden break komutunu ekledim
            break;
            default:
                System.out.println("Yanlış bir değer girdiniz.\nİşleminiz Sonlandırıldı.");

                // Son olarak açılan scanneri kapatalım
                input.close();

        }
    }
}
