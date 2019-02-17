import java.util.Scanner;
public class Lat {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Masukan Jumlah data : ");
		int inx = input.nextInt();
		int Bilangan[] = new int[inx];
		
		System.out.println("");
		for(int x=0; x<inx; x++) {
		System.out.print("input data ke-"+x+": ");
		Bilangan[x] = input.nextInt();
		}
		System.out.println("Hasil input data yang anda masukan = ");
		for(int x=0; x<inx; x++){
			if(Bilangan[x] < Bilangan[x+1]){
				int max = Bilangan[x];
				Bilangan[x] = Bilangan[x+1];
				Bilangan[x+1] = max;
			}
		}
		System.out.println("Hasil urutan dari yang terbesar : ");
		for(int x=inx-1; x>(inx-4);x--) {
			System.out.print(Bilangan[x] + ", ");
		}
		System.out.println("");
	}
}
