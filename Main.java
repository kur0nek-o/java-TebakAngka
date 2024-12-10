import java.util.Random;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		// create Random and Scanner instance
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		
		int answerKey;
		
		System.out.println("Selamat datang di game 'Tebak Angka' :)");
		
		// game loop
		while (true) {
			try {
				System.out.println("Pilih kesulitan game, dengan menginputkan 'nomor' kesulitan : ");
				System.out.println("1. Mudah");
				System.out.println("2. Sedang");
				System.out.println("3. Sulit");
				
				System.out.print("Saya pilih : ");
				
				int difficulty = input.nextInt();
				
				switch (difficulty) {
					case 1:
						System.out.println("Anda memilih kesulitan level mudah");
						break;
					case 2:
						System.out.println("Anda memilih kesulitan level Sedang");
						break;
					case 3:
						System.out.println("Anda memilih kesulitan level Sulit");
						break;
					default:
						System.out.println("Pilihan tidak ada");
						break;
				}
				
				break;
			} catch (Exception e) {
				System.out.println("Terjadi kesalahan : " + e);
				
				break;
			}
		}
	}
}