public class latihan1 {
	public static void main (String[] args) {
	//membuat instance dan mendefinisikan tipe data String
	All_in_One <String> nama = new All_in_One<>();
	nama.setManusia(" Tiwi ");
	System.out.println(" Nama Saya: "+nama.getManusia());
	
	//membuat instance dan mendefinisikan tipe data Integer
	All_in_One<Integer> umur = new All_in_One<>();
	umur.setManusia(19);
	System.out.println(" Usia Saya: "+umur.getManusia());

	//membuat instance dan mendefinisikan tipe data Boolean
	All_in_One<Boolean> kondisi = new All_in_One<>();
	kondisi.setManusia(true);
	System.out.println(" sedang belajar PBO: "+kondisi.getManusia());

	//membuat instance dan mendefinisikan tipe data Character
	All_in_One<Character> character = new All_in_One<>();
	karakter.setManusia('T');
	System.out.println(" Huruf awal nama saya adalah: "+karakter.getManusia());
     }
}