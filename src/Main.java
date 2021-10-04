import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        String a = "abcd";
        findMaxString(a);
    }
    public static void findMaxString(String arr){
        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();

        for (int i = 0; i < arr.length(); i++) {
            list.add(arr.charAt(i));
            for (int j = i + 1; j < arr.length(); j++) {
                if (arr.charAt(j) > list.getLast()) {
                    list.add(arr.charAt(j));
                }
            }
            if (list.size() > max.size()){
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        for (Character c: max){
            System.out.println(c);
        }
    }
}
