import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
    Testing Piping in the command line

    Run the GenerateNRandomInts program from the command line with an argument of the number of ints to generate.
    Pipe the output stream to the input stream of this program using '|'.
    Program uses buffered reader to accept input.
 */
public class ComputeAverage {
    public static void main(String[] args) throws IOException {
        double sum = 0;
        double count = 0;
//        for (String s:args) {
//            try{
//                sum += Integer.parseInt(s);
//            } catch (NumberFormatException n) {
//                sum += 0;
//            }
//        }
//        Scanner s = new Scanner(System.in);
//        while (s.hasNextInt()) {
//            int n = s.nextInt();
//            System.out.println(n);
//            sum += n;
//        }
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        String next;
        while ((next = b.readLine()) != null && !next.equalsIgnoreCase("quit")) {
            int nextInt = Integer.parseInt(next);
            sum+=nextInt;
            count++;
            System.out.println("int"+count+": "+nextInt);
        }
        System.out.println(sum/count);
        b.close();
    }
}
