

package binary.search;

import java.util.Arrays;
import static java.util.Arrays.binarySearch;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class BinarySearch {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        String array[] ={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q"
                            ,"R","S","T","U","V","W","X","Y","Z"};
        String search = JOptionPane.showInputDialog("Masukan huruf HURUF : ");

        Arrays.sort(array);

        int searchIndex = binarySearch(array,search);
        
        String hasil = (searchIndex != -1 ? array[searchIndex]+ " - Index KE "+searchIndex : "SALAH MEMASUKAN HURUF");
        
        JOptionPane.showMessageDialog(null,hasil);
    }
    
     public static int binarySearch(String[] a, String x) {
        int low = 0;
        int high = a.length - 1;
        int mid;

        while (low <= high) {
            mid = (low + high) / 2;

            if (a[mid].compareTo(x) < 0) {
                low = mid + 1;
            } else if (a[mid].compareTo(x) > 0) {
                high = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    }
    

