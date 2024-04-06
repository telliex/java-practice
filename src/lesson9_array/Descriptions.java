package lesson9_array;

public class Descriptions {
    public static void main(String[] args) {
        String[] adjs = {"sweet","juicy","fresh"};
        String[] nouns = {"grapes","apples","oranges","melons"};
        for(int i = 0; i< adjs.length; i++){
            for(int j =0; j< nouns.length ; j++){
                System.out.println(adjs[i]+ " " + nouns[j]);
            }
        }
    }
}
