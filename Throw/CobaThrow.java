package Throw;

public class CobaThrow {
    public static void methodLain() {
        try{
            throw new ArrayIndexOutOfBoundsException(1);
        }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Penanganan exception dalam method methodLain()");
            throw e;
        }
    }
    public static void main (String [] args){
        try{
            methodLain();
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Penanganan exception dalam method main()");
        }
    }
}
