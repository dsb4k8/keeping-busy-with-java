package com.homeoffice.exercises;

/*
* A ransome note can be formed by cutting the words out of a magazing to form a new sentence.
* How would you figure out if a ransome note can be formed from a magazine?
* Assumption: Both are String representations
*
* Frequency mapping:
*  - I can map all unique characters in the message with their frequency
*  - Then map all unique characters in the magazine with their frequency
*  - finally I can compare the message frequency mapping with the magazine
*  -    If values in freq1 > values in freq2.
*
*
* Output: System.out.println(ip.calculateWith(mes, mag)
* "i need money", "you have gotta see this beautiful property in sunnydale ca!"  => false
* "get in the car", "you have gotta see this beautiful property in sunnydale ca!"=> true
* "panic", "napkin company"                                                      => true
* "my devious ransom message", "napkin company"                                  => false
* "obsessed", "you have gotta see this beautiful property in sunnydale ca!")     => true
*  - */


import java.util.HashMap;

public class IsRandsomeNotePossible {

    public boolean calculateWith(String message, String magazine){

        if(message.length() > magazine.length()) {return false;}

        char[] msg = message.replaceAll(" ", "").toCharArray();
        char[] mgz = magazine.replaceAll(" ", "").toCharArray();

        HashMap<Character, Integer> msgFrequencyMap = new HashMap<>();
        HashMap<Character, Integer> mgzFrequencyMap = new HashMap<>();

        // make the freq mapping for msg
        for(char c : msg){
            if(msgFrequencyMap.containsKey(c)){
                msgFrequencyMap.put(c, msgFrequencyMap.get(c) + 1);
            }
            else{
                msgFrequencyMap.put(c, 1);
            }
        }

        // make freq mapping for mgz
        for(char c : mgz){
            if(mgzFrequencyMap.containsKey(c)){
                mgzFrequencyMap.put(c, mgzFrequencyMap.get(c) + 1);
            }
            else{
                mgzFrequencyMap.put(c, 1);
            }
        }

        // compare keymaps and return
        Character[] searchKeys = msgFrequencyMap.keySet().toArray(new Character[0]);
        for(Character target : searchKeys){
            if(((mgzFrequencyMap.containsKey(target))) && (mgzFrequencyMap.get(target) >= msgFrequencyMap.get(target))){
                continue;
            }
            return false;
        }
        return true;
    }

}
