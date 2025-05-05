//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        while (tc-- > 0) {
            String s[] = br.readLine().split(" ");

            Solution obj = new Solution();

            String encodedString = obj.encode(s);
            String decodedStrings[] = obj.decode(encodedString);

            for (String x : decodedStrings) {
                System.out.print(x + " ");
            }
            System.out.println();
            System.out.println("~");
        }
    }
}
// } Driver Code Ends

class Solution {

    // Encodes a list of strings to a single string
    public String encode(String[] s) {
        StringBuilder encoded = new StringBuilder();

        for (String str : s) {
            encoded.append(str.length()).append('#').append(str);
        }

        return encoded.toString();
    }

    // Decodes a single string to a list of strings
    public String[] decode(String s) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < s.length()) {
            int j = i;
            while (s.charAt(j) != '#') {
                j++;
            }

            int length = Integer.parseInt(s.substring(i, j));
            j++; // skip the '#'
            result.add(s.substring(j, j + length));
            i = j + length;
        }

        return result.toArray(new String[0]);
    }
}