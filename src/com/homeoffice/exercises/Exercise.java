package com.homeoffice.exercises;

public class Exercise {

    public int getNumSegmentsInString(String s){
        /*
        Given a string s, return the number of segments in the string.
        A segment is defined to be a contiguous sequence of non-space characters.
        */
        if (s.equals("") || s.equals(" ")) return 0;
        int res = 0;
        for(String word : s.split(" ")){
            if(!(word.trim().length()<1)) res +=1;
        }
        return res;
    }
    public static void main(String[] args) {
        Exercise ex = new Exercise();
        System.out.println(ex.getNumSegmentsInString(""));//0
        System.out.println(ex.getNumSegmentsInString("hello, my name is john"));//5;
        System.out.println(ex.getNumSegmentsInString(", , , ,        a, eaefa"));//6;
    }
}
