import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class WordReader {
    //final private String FILE = "~/5words.txt";
    ArrayList<String> words;
    
    public static ArrayList<Word> importWords(String fileName) throws IOException {
		ArrayList<Word> words = new ArrayList<Word>();
		File file = new File(fileName);
		Scanner sc = new Scanner(file);
		String line;

		while(sc.hasNext()) {
	    	line = sc.nextLine().trim();
            words.add(new Word(line)); 	
	    }

		sc.close();
		return words;
	}

    public static void main (String[] args) throws IOException{
        ArrayList<Word> imported = importWords("/users/callumgraham/documents/rascle/rascle/5words.txt");
        ArrayList<Word> notIt = new ArrayList<Word>();
        char notInWord = 'c';

        System.out.println("Current possibilities: " + imported.size());

        for (Word w : imported) {
            char[] chars = w.getLetters();
            for(int i = 0; i < 5; i++){
                if(chars[i] == notInWord){
                    notIt.add(w);
                    break;
                }
                
            }   
        }


        for(Word w : notIt){
            imported.remove(w);
        }

        System.out.println("Current possibilities: " + imported.size());

        char green = 'd';
        int greenPos = 0;
        notIt = new ArrayList<Word>();

        for (Word w : imported ){
            if(green == w.getLetters()[greenPos]){
                notIt.add(w);
            }
        }

        for(Word w : notIt){
            imported.remove(w);
        }

        System.out.println("Current possibilities: " + imported.size());


        char[] notIn = new char[]{'a','b','c'};

        notIt = new ArrayList<Word>();

        for (Word w : imported ){
            for(int i = 0; i < w.getLetters().length-1; i ++){
                for(int j = 0; j < notIn.length-1; j ++){
                    if(w.getLetters()[i] ==  notIn[j]){
                        notIt.add(w);
                        break;
                    }
                }
            }
        }

        for(Word w : notIt){
            imported.remove(w);
        }

        System.out.println("Current possibilities: " + imported.size());

        ArrayList<Word> possIt = new ArrayList<Word>();

        char[] in = new char[]{'d','i'};

        for (Word w : imported ){
            for(int i = 0; i < w.getLetters().length-1; i ++){
                for(int j = 0; j < in.length; j ++){
                    if(w.getLetters()[i] ==  in[j])
                        possIt.add(w);
                        continue;
                }
            }
        }

        System.out.println("Current possibilities: " + possIt.size());
       
    }
}
