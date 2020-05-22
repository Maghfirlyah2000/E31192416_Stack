/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e31192416_stack;

import java.util.Scanner;

/**
 *
 * @author maghfirlyah
 */
public class Main {

	public static void main(String[] args) {
		//inisialisasi
		int pilihan;
		//tipe data integer dengan variable pilihan 
		int data = 0;
		//tipe data integer dengan variable data memiliki nilai sama dengan 0

		E31192416_Stack result = new E31192416_Stack();

		System.out.println("1.PUSH"); //menu push yaitu untuk menambahkan data
		System.out.println("2.Maghfirlyah"); //menu Maghfirlyah
		System.out.println("3.Fahmi"); //menu Fahmi
		System.out.println("4.Hidayat"); //menu Hidayat
		System.out.println("5. POP ITEM"); //menu pop yaitu untuk mengeluarkan data terakhir
		System.out.println("6. LIHAT ISI DATA");  //menu untuk menampilkan isi data stack
		System.out.println("7.KELUAR"); //menu untuk keluar
		System.out.println(" ");
		do {
			System.out.print("Pilih data : ");
			//syntax dibawah berguna agar user bisa menginputkan data
			Scanner input = new Scanner(System.in);
			pilihan = input.nextInt();
			//deklarasi dari menu
			if (pilihan == 1) { //perulangan apabila memilih menu 1
				System.out.print("data yang ditambahkan :");
				data = input.nextInt();
				result.push(data);
			} else if (pilihan == 2) { //perulangan apabila memilih menu 2
				result.push(data);
			} else if (pilihan == 3) { //perulangan apabila memilih menu 3
				result.push(data);
			} else if (pilihan == 4) { //perulangan apabila memilih menu 4
				result.push(data);
			} else if (pilihan == 5) { //perulangan apabila memilih menu 5
				result.pop();
			} else if (pilihan == 6) { //perulangan apabila memilih menu 6
				result.display();
			} else if (pilihan == 0) { //perulangan apabila memilih menu 0
				System.exit(0);
			} else {
				//program akan menampilkan kalimat berikut apabila memilih menu yang tidak tersedia
				System.out.println("pilihan tidak ada");
			}
		} while (pilihan != 0);
	}

}

