package homework.day5;

public class FindDuplicateStatic {

    public static void findAllDuplicate(String stringInput) {
        String[] arr = stringInput.split(" ");
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (arr[i].equals(arr[j])) {
                    System.out.println(arr[i]);
                }
            }
        }
    }

    public static void findAndPrintDuplicateWords(String text) {
        String[] words = text.split("\\s+");

        for (int i = 0; i < words.length; i++) {
            if (words[i] == null) {
                continue;  // Skip null or previously removed words
            }
            int count = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    words[j] = null;  // Mark duplicate as null
                }
            }
            if (count > 1) {
                System.out.println("Duplicate word: " + words[i]);
            }
        }
    }


}
