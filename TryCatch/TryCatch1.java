package TryCatch;

public class TryCatch1 {
    public static void main (String[] args){
        try{
            int[] arr = new int[1];
            System.out.println(arr[1]);
            System.out.println("Baris ini tidak akan dieksekusi, karena statement baris diatas terjadi exception");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Terjadi exception karena indeks di luar kapasitas array");
        }
        System.out.println("Setelah blok try catch");
    }
}
