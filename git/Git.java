
package git;

import java.util.Scanner;

public class Git {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama, nim, programStudi;
        
        System.out.print("Nama Mahasiswa : ");
        nama= input.nextLine();
        
        System.out.print("NIM : ");
        nim = input.nextLine();
        
        System.out.print("Program studi : ");
        programStudi = input.nextLine();
        
        System.out.println();
        System.out.println("-------------------------------");
        System.out.println("Selamat Datang di forum ini");
        System.out.println("-------------------------------");
        System.out.println("Nama lengkap : "+nama);
        System.out.println("NIM : "+nim);
        System.out.println("Program studi : "+programStudi);

    }
    
}
