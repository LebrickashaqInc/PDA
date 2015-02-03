import java.io.*;
import java.util.*;
import java.text.*;

public class TeleData {
    
    public static void main (String args[]) throws IOException {
        // Setup the number formatter for 3 decimal places
        // You may also use the System.out.printf formatting
        // method instead -- your choice
        NumberFormat fmt = NumberFormat.getNumberInstance();
        fmt.setMinimumFractionDigits(3);
        fmt.setMaximumFractionDigits(3);
        
        // Initialize the scanner
        // Make sure you insert the data filename
        Scanner sf = new Scanner(new File("Switches.in"));
        
        // i will keep the current length of the array
        // text will keep the lines of text
        int i = 0;
        String text[] = new String[1000];

        // Loop through the file scanner retrieving each line of text
        while (sf.hasNext()) {
            // Store line in text[]
            text[i] = sf.nextLine();
            // Print result to console (may be commented out if not needed)
            System.out.println(text[i]);
            // Increment the index
            i++;
            // At this point i has the current length of text[]
        }
        
        // Close the file scanner
        sf.close();
        
        // Loop through each line stored in text[]
        for (int j=0; j<i; j++) {
            // You are already familiar with the Scanner class
            StringTokenizer st = new StringTokenizer(text[j], " ");
            Scanner sc = new Scanner(text[j]);
            
            //**********************************************************//
            
            int binNum = Integer.parseInt(sc.nextLine());
            int numArray[] = new int[8];
            
            numArray[0] = binNum & 0b11001001;
            numArray[1] = binNum & 0b01011010;
            numArray[2] = binNum & 0b10101100;
            numArray[3] = binNum & 0b01001110;
            numArray[4] = binNum & 0b10010110;
            numArray[5] = binNum & 0b00101010;
            numArray[6] = binNum & 0b01001010;
            numArray[7] = binNum & 0b11100100;
           
            System.out.println(binNum);
            
            System.out.println("Switch status for data value " + binNum + ":");
            for(int k = 0; k <= 7; k++)
            {
                System.out.print("Switch sw" + (k + 56) + " is ");
                if(numArray[k] > 0)
                {
                    System.out.print("\"on\"" + "\n");
                }
                else
                {
                    System.out.print("\"off\"" + "\n");
                }
            }
            //**********************************************************//
        }
    }
}
