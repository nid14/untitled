package strings;

import java.util.ArrayList;
import java.util.List;

public class FlipGames {
    public List<String> generatePossibleNextMoves(String s) {
        List<String> list = new ArrayList<>();
        for(int i=0; i<s.length()-1; i++){
            char[] c = s.toCharArray();
            if(c[i]=='+' && c[i+1]=='+'){
                c[i]='-';
                c[i+1]='-';
                list.add(new String(c));
            }
        }
        return list;
    }
}
