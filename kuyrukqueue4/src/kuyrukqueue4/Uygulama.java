package kuyrukqueue4;

public class Uygulama {

	public static void main(String[] args) {
		kuyrukqueu kuyruk =new kuyrukqueu(5);
		kuyruk.enqueu(1);
		kuyruk.enqueu(2);
		kuyruk.enqueu(3);
		kuyruk.enqueu(4);
		kuyruk.enqueu(5);
		
		kuyruk.dequeu();
		
		kuyruk.yazdır();
		System.out.println("");
		kuyruk.kacelemanvar();

	}

}
