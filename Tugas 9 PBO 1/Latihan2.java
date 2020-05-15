public class Latihan2 {
	public static void main(String[] args) {
	   /* Menginstansi objek dari wrapper class dan
	    * menggunkaan Argumen dari tipe data primitif
	     */

	Character objChar = new Character('T');
	Byte objByte = new Byte("12");
	Short objShort = new Short("100");
	Integer objInteger = new Integer(523);
	Long objLong = new Long(7689);
	Boolean objBoolean = new Boolean(true);
	Float objFloat = new Float(82.89f);
	Double objDouble = new Double(34.67);

	//Menampilkan Output dari Class Wrapper
	System.out.println(" Character: "+objChar);
	System.out.println(" Byte: "+objByte);
	System.out.println(" Short: "+objShort);
	System.out.println(" Integer: "+objInteger);
	System.out.println(" Long: "+objLong);
	System.out.println(" Boolean: "+objBoolean);
	System.out.println(" Float: "+objFloat);
	System.out.println(" Double: "+objDouble);
     }
}