public class Task2 {
    public int wordsCount(String str) {
        int words = str.length() == 0 ? 0 : 1;
        for (char c : str.toCharArray()){
            if (Character.isUpperCase(c)){
                words++;
            }
        }
        return words;
    }
}
