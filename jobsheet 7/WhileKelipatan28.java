import java.util.Scanner;
public class WhileKelipatan28 {
    public static void main(String [] args){
        Scanner scan =new Scanner(System.in);

        int kelipatan;
        int jumlah = 0;
        int counter = 0;
        int total=0;
        float rataRata;

        System.out.println("Masukkan bilangan kelipatan (1-9): ");
        kelipatan = scan.nextInt();
        int i = 1;
        while (i <=50){
            if (i % kelipatan == 0){
                total += i;
                counter++;
            }
                
            
            i++;
            rataRata = (float) total/counter;
            System.out.println("Jumlah bilangan kelipatan " + kelipatan + " dari 1 hingga 50 adalah " + counter);
            System.out.println("Rata-rata bilangan kelipatan " + kelipatan + " dari 1 hingga 50 adalah " + rataRata);
        }





        }
        
    }
    
