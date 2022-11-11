package com.homeoffice.exercises;

public class Exercise {
    public int getNumSegmentsInString(String s){
        return s.split(" ").length;
    }
    public static void main(String[] args) {
        Exercise ex = new Exercise();
        System.out.println(ex.getNumSegmentsInString("To be or not to be that is the queston"));
    }
}
