import java.util.ArrayList;

public class myInterests {
    public static void main(String[] args) {
        ArrayList<String> interests = new ArrayList<String>();
        
        interests.add("soccer");
        interests.add("technology");
        interests.add(1, "music");
        interests.add("cars");
        
        System.out.println(interests);
        System.out.println("There are " + interests.size() + " in the list.");
    }
}
