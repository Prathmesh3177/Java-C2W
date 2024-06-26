import java.util.StringTokenizer;
class Demo1 {
    public static void main(String[] args) {
        String inputString = "Hello World";

        // Tokenize the string into individual characters
        StringTokenizer tokenizer = new StringTokenizer(inputString, "");
        
        // Iterate over each character and print it
        while (tokenizer.hasMoreTokens()) {
            String character = tokenizer.nextToken();
            System.out.println(character);
        }
    }
}

