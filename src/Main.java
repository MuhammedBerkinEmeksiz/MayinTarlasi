import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int row;
		int colon;
		System.out.println("Mayin tarlasina hos geldiniz");
		System.out.println("Lutfen oynamak istediginiz boyutlari giriniz");
		System.out.println("Satir sayisi : ");
		row = scan.nextInt();
		System.out.println("Sutun sayisi : ");
		colon = scan.nextInt();
		MayinTarlasi mayin = new MayinTarlasi(row,colon);
	}

}
