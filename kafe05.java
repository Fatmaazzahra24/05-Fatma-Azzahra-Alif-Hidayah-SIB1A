import java.util.Scanner;
public class kafe05 {
    public static void main(String[] args) {
            Scanner input =new Scanner (System.in);
            boolean keanggotaan;
            int jmlKopi, jmlTeh, jmlRoti;
            double totalHarga, nominalBayar,  hargaKopi = 12000.0, hargaTeh=7000.0, hargaRoti=20000.0;
            float diskon = 10/100f;
            System.out.print("Masukan keanggotaan (true/false): ");
            keanggotaan = input.nextBoolean();
            System.out.print("Masukan jumlah pembelian kopi: ");
            jmlKopi=input.nextInt();
            System.out.print("Masukan jumlah pembelian teh: ");
            jmlTeh=input.nextInt();
            System.out.print("Masukan jumlah pembelian roti: ");
            jmlRoti=input.nextInt();
            totalHarga = (jmlKopi*hargaKopi) + (jmlTeh*hargaTeh) + (jmlRoti * hargaRoti);
            nominalBayar= totalHarga - (diskon * totalHarga);
            System.out.println("Keanggotaan Pelanggan" + keanggotaan);
            System.out.println("Item pembelian:" + jmlKopi + "Kopi," + jmlTeh +"teh" + jmlRoti + "Roti"  );
            System.out.println("Nominal bayar Rp" + nominalBayar);
    
    }
}
