import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class WordReader {
    final private String FILE = "~/5words.txt";
    ArrayList<String> words;
    
    public static ArrayList<Word> importWords(String fileName) throws IOException {
		ArrayList<Word> words = new ArrayList<Word>();
		File file = new File(fileName);
		Scanner sc = new Scanner(file);
		String line;

		while(sc.hasNext()) {
	    	line = sc.nextLine().trim();
            words.add(new Word(line));
            System.out.println(line);  	
	    }

		sc.close();
		return words;
	}

    public static void main (String[] args) throws IOException{
        ArrayList<Word> imported = importWords("/users/callumgraham/documents/rascle/rascle/5words.txt");
        ArrayList<Word> notIt = new ArrayList<Word>();
        char notInWord = 'c';

        for (Word w : imported) {
            char[] chars = w.getLetters();
            for(int i = 0; i < 5; i++){
                if(chars[i] == notInWord){
                    notIt.add(w);
                    //imported.remove(w);
                }
                
            }   
        } 

        for(Word w : notIt){
            imported.remove(w);
        }
        for (Word w : imported) {
            System.out.println(w.getWord());
            
        }       
    }
}
