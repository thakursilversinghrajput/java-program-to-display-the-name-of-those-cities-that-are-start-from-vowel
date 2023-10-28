 public class CitiesStartingWithVowel { 
    public static void main(String[] args) { 
        // Create an array of cities 
        String[] cities = {"New York", "Los Angeles", "London", "Paris", "Tokyo"}; 
 
        // Iterate through the cities and check for vowels at the beginning 
        System.out.println("Cities starting with a vowel:"); 
        for (String city : cities) { 
            if (startsWithVowel(city)) { 
                System.out.println(city);
            } 
        }
    } 
 
    // Function to check if a string starts with a vowel 
    public static boolean startsWithVowel(String str) { 
        str = str.toLowerCase(); // Convert the string to lowercase for case-insensitive check 
        char firstChar = str.charAt(0); 
        return "aeiou".indexOf(firstChar) != -1; // Check if the first character is a vowel
    } 
} 


