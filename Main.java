import java.util.Random;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		// create Random and Scanner instance
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		
		int range = 0;
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
						range = 10;
						System.out.println("Anda memilih kesulitan level mudah");
						break;
					case 2:
						range = 20;
						System.out.println("Anda memilih kesulitan level Sedang");
						break;
					case 3:
						range = 50;
						System.out.println("Anda memilih kesulitan level Sulit");
						break;
					default:
						System.out.println("Pilihan tidak ada");
						break;
				}
				
				answerKey = rand.nextInt(range);
				
				System.out.println("");
				
				int tryCount = 0;
				
				while (true) {
					tryCount++;
					System.out.print("Masukan jawaban anda : ");
					
					int answer = input.nextInt();
					
					if (answer == answerKey) {
						System.out.println("Selamat! tebakan anda benar :)");
						System.out.println("Anda menebak sebanyak " + tryCount + " kali");
						
						break;
					} else if (answer > answerKey) {
						System.out.println("Tebakan anda terlalu besar");
					} else if (answer < answerKey) {
						System.out.println("Tebakan anda terlalu kecil");
					}
				}
				
				break;
			} catch (Exception e) {
				System.out.println("Terjadi kesalahan : " + e);
				input.nextLine();
				
				break;
			}
		}
	}
}