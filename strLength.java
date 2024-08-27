//Take an array of strings input from the user and find the cumulative (combined) length of all those strings.

package String;
import java.util.*;
public class strLength {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size = sc.nextInt();
        String arr[] = new String[size];
        int totalLength = 0;
        for(int i=0; i<size; i++){
            arr[i] =sc.next();
            totalLength += arr[i].length();
        }
        System.out.println(totalLength);
    }
}
