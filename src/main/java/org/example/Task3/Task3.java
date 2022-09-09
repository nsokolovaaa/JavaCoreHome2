package org.example.Task3;


public class Task3 {
    /*
    Task3
        Реализовать функцию нечеткого поиска
                fuzzySearch("car", "ca6$$#_rtwheel"); // true
                fuzzySearch("cwhl", "cartwheel"); // true
                fuzzySearch("cwhee", "cartwheel"); // true
                fuzzySearch("cartwheel", "cartwheel"); // true
                fuzzySearch("cwheeel", "cartwheel"); // false
                fuzzySearch("lw", "cartwheel"); // false
     */
    public static void main(String[] args) {
        System.out.println(fuzzySearch("car", "ca6$$#_rtwheel"));
        System.out.println(fuzzySearch("cwhl", "cartwheel"));
        System.out.println(fuzzySearch("cwhee", "cartwheel"));
        System.out.println(fuzzySearch("cartwheel", "cartwheel"));
        System.out.println(fuzzySearch("cwheeel", "cartwheel"));
        System.out.println(fuzzySearch("lw", "cartwheel"));

    }

    public static boolean fuzzySearch(String name, String str) {

        int j = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == name.charAt(j)) {
                if (j == name.length() - 1)
                    return true;
                else j++;
            }
        }
        return false;
    }
}
