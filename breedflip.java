import java.io.*;
import java.util.Scanner;

/*
    Use a boolean to keep track if the current difference is consecutive or not
    Increment if not
 */
public class breedflip {
    public static void main(String[] args) throws FileNotFoundException {
        File inp = new File("./breedflip.in");
        Scanner sc = new Scanner(inp);
        int n = sc.nextInt();
        char[] r = sc.next().toCharArray();
        char[] w = sc.next().toCharArray();
        int ans = 0;
        boolean dif = false;

        for (int i = 0; i < r.length; i++) {
            if(r[i] != w[i]){
                if(dif) continue;
                else if (!dif){
                    ans++;
                    dif = true;
                }
            } else dif = false;
        }

        PrintWriter myWriter = new PrintWriter("breedflip.out");
        myWriter.println(ans);
        myWriter.close();
    }
}
