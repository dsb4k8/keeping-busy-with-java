package com.homeoffice.exercises;


public class StringsAndArrays {


//    joinWords - use stringBuilder when possible
    static String reverse(String[] s){
        StringBuilder sb = new StringBuilder();
        for(int i = s.length-1; i >= 0; i--){
            sb.append(s[i]);
        }
        return sb.toString();
    }

    static boolean hasAllUniqueChars(String s){
        boolean[] charset = new boolean[128]; //ititialized to false
        for(int i = 0; i < s.length(); i++){
            int val = s.charAt(i);
            System.out.println("val = "+ val + "\ncharset[val] = " + charset[val]);
            if(charset[val]){
                return false;
            }
            charset[val] = true;
        }
        return true;
    }

//    "Hello"
//    boolean [] presenceMap = new boolean[128];
//    H => ? y/n => y: return false  n: ADD H => continue
//    e => ? y/n => y: return false  n: ADD H => continue
//    l => ? y/n => y: return false  n: ADD H => continue
//    l => ? y/n => y: return false  n: ADD H => continue


    static boolean hasUnique(String s){
        boolean[] presenceCollecton = new boolean[128];
        for(int i = 0; i < s.length(); i++){
            int val = s.charAt(i);
            if(presenceCollecton[val]){
                return false;
            }
            presenceCollecton[val] = true;
        }
        return true;
    }

    static boolean bitshifthasUnique(String s){

        int checker = 0;

        for(int i = 0; i < s.length(); i++){
            int val = s.charAt(i) - 'a';
            System.out.println("val " + val);
            if((checker & (1 << val)) > 0 ){
                return false;
            }
            checker |= (1<<val);
        }
        return true;
    }

    static boolean isPermutation(String strA, String strB){
        if(strA.length() != strB.length()){return false;}
        int[] b = new int[128];

        for(int i = 0; i <= strA.length()-1; i++) {
            int current_a = strA.charAt(i) -'a';// char value rep of string a
            int current_b = strB.charAt(i) -'a';// char value rep of string b
            b[current_a] += 1;
            System.out.println("b[current_a] += 1: " + b[current_a]);
            b[current_b] -= 1;
            System.out.println("b[current_b] += 1: " + b[current_b] + "\n");
        }
        for(int i = 0; i <=  b.length-1; i++) {
            if(b[i] > 0){
                return false;
            }
        }
        return true;
    }

    static String URLify(String str, int true_size){
        //how are we going to determine how much space to allocate?
//        "Good Morning the world is burning",  33 of which 5 are spaces.
//        how many non space characters
        char [] string_char_array = str.toCharArray();
        int non_space = 0;
        for(int i = 0; i < str.length(); i ++){
            if(string_char_array[i]!=' '){
                non_space ++;
            }
        }
        char [] new_char_array = new char[true_size + ((true_size - non_space) * 3)];
        for(int i = 0; i < str.length(); i ++) {
            if(str.charAt(i) == ' ') {
                new_char_array[i] = '%';
                new_char_array[i+1] = '2';
                new_char_array[i+2] = '0';
                i += 0;
            }
            else{new_char_array[i] = str.charAt(i);}

        }
        for(int i = 0; i < new_char_array.length; i ++) {
            System.out.println(new_char_array[i]);
        }
        return new_char_array.toString();
    }




    public static void main(String[] args){
//        System.out.println("Hello");
//        System.out.println(reverse("HelloWorld".split("")));
////        System.out.println(hasAllUniqueChars("HeWorld"));
//        System.out.println(hasUnique("oHeWorld"));
//        System.out.println(bitshifthasUnique("HHelloWorld"));
//        System.out.println(100 - 'a');

//        System.out.println(isPermutation("racecar", "carcare"));
        System.out.println(URLify("Mr John Smith", 13));
    }
}
