public class  Word {
    private String word;
    private char[] letters;

    public String getWord() {
        return this.word;
    }

    public char[] getLetters() {
        return this.letters;
    }

    public Word(String word){
        this.word = word;
        letters = word.toCharArray();

    }    
}
