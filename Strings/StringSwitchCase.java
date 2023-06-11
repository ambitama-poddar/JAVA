// Write an application involving switch-case-default that performs one of the following actions:
// (i) reads a line of text and outputs the text twice—once in all uppercase letters and once in all lowercase
// letters;
// (ii) reads a line of text and a search character and uses String method indexOf to determine the number
// of occurrences of the character in the text;
// (iii) reads a line of text, tokenizes the line using space characters as delimiters and outputs only those
// words beginning with the letter "b";
// (iv) reads a line of text, tokenizes it using space characters as delimiters and outputs only those words
// ending with the letters "ED".
// (v) reads a line of text, tokenizes the line with String method split and outputs the tokens in reverse
// order. Use space characters as delimiters.


import java.util.*;

public class StringSwitchCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a line of text: ");
        String text=sc.nextLine();

        while(true){
            System.out.println("Enter 1: To print text in uppercase and lowercase");
            System.out.println("Enter 2: To find the number of occurences of a character in the text");
            System.out.println("Enter 3: To print words beginning with the letter 'b'");
            System.out.println("Enter 4: To print words ending with the letters 'ED'");
            System.out.println("Enter 5: To print tokens in reverse order");
            System.out.println("Enter 0: To exit");

            System.out.println("Enter your choicce: ");
            int choice=sc.nextInt();

            switch(choice){
                case 1: System.out.println("Text in uppercase: "+text.toUpperCase());
                        System.out.println("Text in lowercase: "+text.toLowerCase());
                        break;

                case 2: System.out.println("Enter a character: ");
                        char ch=sc.next().charAt(0);
                        int count=0;
                        for(int i=0;i<text.length();i++){
                            if(text.charAt(i)==ch)
                                count++;
                        }
                        System.out.println("Number of occurences of "+ch+" in the text: "+count);
                        break;

                case 3: String[] words=text.split(" ");
                        System.out.println("Words beginning with the letter 'b': ");
                        for(int i=0;i<words.length;i++){
                            if(words[i].charAt(0)=='b')
                                System.out.println(words[i]);
                        }
                        break;

                case 4: words=text.split(" ");
                        System.out.println("Words ending with the letters 'ED': ");
                        for(int i=0;i<words.length;i++){
                            if(words[i].charAt(words[i].length()-1)=='d' && words[i].charAt(words[i].length()-2)=='e')
                                System.out.println(words[i]);
                        }
                        break;

                case 5: words=text.split(" ");
                        System.out.println("Tokens in reverse order: ");
                        for(int i=words.length-1;i>=0;i--){
                            System.out.println(words[i]);
                        }
                        break;

                case 0: System.exit(0);
                        break;

                default: System.out.println("Invalid choice");
                         break;
            }
        }
    }
}
