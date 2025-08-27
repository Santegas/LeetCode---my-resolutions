package main.resolutions.romanToInteger;

import java.util.HashMap;
import java.util.Map;

public class Solution {
        public int romanToInt(String s) {
            Map<Character, Integer> mapa = new HashMap<>();
            mapa.put('I', 1);
            mapa.put('V', 5);
            mapa.put('X', 10);
            mapa.put('L', 50);
            mapa.put('C', 100);
            mapa.put('D', 500);
            mapa.put('M', 1000);
            
            int total = 0;

            for (int i = 0; i < s.length() ; i++) {
                int valorAtual = mapa.get(s.charAt(i));

                if (i + 1 < s.length() && valorAtual < mapa.get(s.charAt(i + 1))){
                    total -= valorAtual;
                }else {
                    total += valorAtual;
                }
            }

            return total;
    }
}
