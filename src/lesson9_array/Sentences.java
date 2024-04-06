package lesson9_array;

public class Sentences {
    public static void main(String[] args) {
        String[] foods = {"noodle", "rice", "pizza", "dumping","soup","salad"};
        String[] activities = {"reading","hiking","jogging", "biking"};

        for(int i =0; i< foods.length; i++){
            System.out.println("I can cook "+ foods[i]+".");
        }

        for(String e : activities){
            System.out.println("I enjoy "+ e +".");
        }
    }
}
