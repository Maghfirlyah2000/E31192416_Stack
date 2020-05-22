/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e31192416_stack;

/**
 *
 * @author maghfirlyah
 */
public class E31192416_Stack {

	//pendeklarasian array dan variable
	private boolean empty, full;
	private int pos; //variable post dengan tipe data integer
	private int max_data = 3; //wadah untuk menyimpan data, maksimal 9 data
	private int item[] = new int[max_data];

	//stack method
	public void Stack() {
		full = false; //variable full bernilai false
		empty = true; //variable empty bernilai true
		pos = 0; //pos bernilai 0
	}

	//method untuk mengecek apakah stack sudah penuh atau tidak
	public boolean isFull() {
		return (full);
	}

	//method untuk mengecek apakah stack masih kosong dengan tipe data boolean
	public boolean isEmpty() {
		return (empty);
	}

	//method untuk memasukkan data
	public void push(int data) {
		//perulangan untuk stack apabila sudah penuh
		if (!isFull()) {
			item[pos++] = data; //item [post increment] bernilai data
			empty = false; //variable empty bernilai false
			if (pos == max_data) { //apabila nilai post sama dengan nilai maksimal data
				full = true; //variable full bernilai true
			}
			//program akan menampilkan kalimat berikut apabila ada penambahan data
			System.out.println("Data sudah ditambahkan");
		} else {
			//program akan menampilkan data berikut apabila sudah penuh
			System.out.println("stack penuh");
		}
		return;
	}

	//method yang berfungsi untuk mengeluarkan data terakhir
	public int pop() {
		int x = 0; //tipe data integer dengan nilai 0
		//perulangan untuk mengeluarkan data terakhir
		if (!isEmpty()) {
			x = item[--pos];
			full = false; //variable full bernilai false
			//jika perulanagn dilakukan maka akan tampil kalimat berikut
			System.out.println("data yang di pop adalah " + item[pos]);
			System.out.println("");
			item[pos] = 0;
			//perulangan apabila nilai pos sama dengan 0
			if (pos == 0) {
				empty = true; //variable empty bernilai true
				//jika perulangan dilakukan maka akan tampil kalimat berikut
				System.out.println("stack adalah kosong");
			} else {//jika data masih ada
				//program akan menampilkan kalimat berikut jika ada pengambilan data
				System.out.println("data sudah di ambil");
			}
		} else {
			System.out.println("stack masih kosong: \n");
		}
		return (x);
	}

	//untuk menampilkan data
	public void display() {
		System.out.println("isi stack adalah");
		for (int i = 0; i < pos; i++) {
			System.out.println(item[i] + "");
		}
		System.out.println("\n");
	}

}

