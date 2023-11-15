package P11;

public class tugas4_23 {
   
        public static void main(String[] args) {
            char[] nama = {'M', 'u', 'h', 'a', 'm', 'm', 'a', 'd', 'R', 'i', 'f', 'd', 'a', 'M', 'u', 's', 'y', 'a', 'f', 'f', 'a'};
            int baris = 8;
            int kolom = 5;
    
            char[][] Array = new char[baris][kolom];
            int n = 0;
    
            
            for (int i = 0; i < baris; i++) {
                for (int j = 0; j < kolom; j++) {
                    if (n < nama.length) {
                        Array[i][j] = nama[n++];
                    } else {
                        
                        Array[i][j] = nama[n % nama.length];
                        n++;
                    }
                }
            }
    
            
            for (int i = 0; i < baris; i++) {
                for (int j = 0; j < kolom; j++) {
                    System.out.print(Array[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
