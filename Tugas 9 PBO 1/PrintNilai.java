public class PrintNilai {
	//Metode main
	public static void main(String[] args) {
	//Deklarasi dan pemberian nilai awal ke variabel
	Integer varInt = 8134151;
	Double varDouble = 96342;
	Character varCharacter = 'T';
	String varString = "Belajar java";

	System.out.println();
	Ssytem.out.println("Nilai-nilai yang dicetak:");
	
	//Memanggil overloading metode print
	print(varInt);
	print(varDouble);
	print(varChar);
	print(varString);
       }

	// Metode print untuk mencetak nilai tipe long
	public static void print(Integer nilaiInteger) {
	    System.out.println(nilaiInteger);
	}
	// Metode print untuk mencetak nilai tipe double
	public static void print(Double nilaiDouble) {
	    System.out.println(nilaiDouble);
	}
	// Metode print untuk mencetak nilai tipe char
	public static void print(Character nilaiChar) {
	    System.out.println(nilaiChar);
	}
	// Metode print untuk mencetak nilai tipe string
	public static void print(String nilaiString) {
	    System.out.println(nilaiString);
	}
}