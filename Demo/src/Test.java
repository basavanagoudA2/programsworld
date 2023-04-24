import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test {
    public static int logestWordLeng(int N,String[] words){
        Set<String> wordSet=new HashSet<>();
        String temp="";
        // removing duplicates in array

        String[] newWordsArr = Arrays.asList(words).stream().distinct().toArray(String[]::new);
        for (String word:newWordsArr) {

        }
        return 0;
    }
    public static void main(String[] args) {
        logestWordLeng(5,new String[]{"ab","ed","ab","ef","eg"});
    }
}
