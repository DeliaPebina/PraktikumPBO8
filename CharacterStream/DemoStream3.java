package CharacterStream;

import java.io.*;

public class DemoStream3 {
    public static void main(String[] args) {
        try {
            // Menggunakan BufferedReader dengan try-with-resources agar sumber daya ditutup secara otomatis
            try (BufferedReader buff = new BufferedReader(new InputStreamReader(System.in))) {
                char data;
                StringBuilder str = new StringBuilder();

                System.out.print("Ketik : ");
                data = (char) buff.read();

                while (data != '\r' && data != '\n') {
                    // Menggunakan StringBuilder untuk menghindari masalah kinerja pada penggabungan string
                    str.append(data);
                    data = (char) buff.read();
                }

                System.out.println("Yang diketik : " + str);
                System.out.println("Program Selesai");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
