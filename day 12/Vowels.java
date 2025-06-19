public class Vowels {
    public static void main(String[] args) {
        printVowels("Zoho corporation");
        printVowels("Zohi carportotoon");
        printVowels("google");
        printVowels("goagle");
    }

    public static void printVowels(String input) {
        System.out.print(input + " - ");
        for (char c : input.toLowerCase().toCharArray()) {
            if (isVowel(c)) {
                System.out.print(c + " ");
            }
        }
        System.out.println(); // for newline after each result
    }

    public static boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) != -1;
    }
}