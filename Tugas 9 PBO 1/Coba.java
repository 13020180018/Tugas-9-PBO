public class Coba {
	//Membuat instance hewan (Static)
	static hewan data = new Hewan() {
	 
	//Contoh Penggunaan Anonymous Class
	@Override
	public void Jenis() {
	   System.out.println("Kucing");
	  }

	@Override
	public void Makanan() {
	   System.out.println("Ikan");
	  } 

	@Override
	public void Suara() {
	   System.out.println("Kambing");
	  }
    }; //Block Anonymous Class Harus di akhiri titik koma

	public static void main(String[] args) {
	//Memanggil dan menjalankan methond anonymous
	data.Jenis();
	data.Makanan();
	data.Suara();
    }
}