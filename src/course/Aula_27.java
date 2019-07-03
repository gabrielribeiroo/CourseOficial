/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course;

/**
 *
 * @author cn3
 */
public class Aula_27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String Original = "abcde FGHIJ ABC abc DEFG    ";

        String s01 = Original.toLowerCase();
        String s02 = Original.toUpperCase();
        String s03 = Original.trim();
        String s04 = Original.substring(2);
        String s05 = Original.substring(2, 9);
        String s06 = Original.replace('a', 'x');
        String s07 = Original.replace("abc", "xy");
        int i = Original.indexOf("bc");
        int j = Original.lastIndexOf("bc");

        System.out.println("Original: - " + Original + "-");
        System.out.println("toLowerCase: - " + s01 + "-");
        System.out.println("toUpperCase: - " + s02 + "-");
        System.out.println("trim: - " + s03 + "-");
        System.out.println("substring(2): - " + s04 + "-");
        System.out.println("substring(2, 9): - " + s05 + "-");
        System.out.println("replace('a', 'x'): - " + s06 + "-");
        System.out.println("replace(abc , xy): - " + s07 + "-");
        System.out.println("indexOf(\"bc\"): " + i);
        System.out.println("lastIndexOf(\"bc\"): " + j);
        System.out.println("-----------------------");
        
        String s = "potato apple lemon orange";
        String[] vect = s.split(" ");
        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);
        System.out.println(vect[3]);
    }

}
