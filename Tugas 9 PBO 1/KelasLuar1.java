public class KelasLuar1 {
    
    //Class dalam/Inner Class Static
    private static class Programming{
        private String language;
        private void setLanguage(String language){
            this.language = language;
        }
        private String getLanguage(){
            return language;
        }
    }
    
    public static void main(String[] args){
        //Membuat Instance dari Kelas Dalam (Programming)
        KelasLuar.Programming MyLanguage = new KelasLuar.Programming();
        
        //Memasukan Nilai/Value
        MyLanguage.setLanguage("Java");
        
        //Menampilkan Hasil Output
        System.out.println("Saya Sedang Mempelajari: "+MyLanguage.getLanguage());
    }
}