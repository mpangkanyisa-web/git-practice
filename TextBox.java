public class TextBox {
    public static void main(String [] args){
        String names = """
                My name is Slim \
                Surname is Willz
                """;

            //you add \ if you want to force them into 1 line
                //if you put the lines next to the last line it doesn't leave an extra new line at the end , but if you put the """ ryt  at the bottom then you will get an extra new line.


        System.out.println(names);
    }

}

//The escape sequence \r in Java represents a carriage return character. In the context of Java text blocks and strings, \r moves the cursor to the beginning of the current line without advancing to the next line. This is often used in combination with \n (newline) to represent different types of line endings, especially on Windows systems where the line ending is typically \r\n.
