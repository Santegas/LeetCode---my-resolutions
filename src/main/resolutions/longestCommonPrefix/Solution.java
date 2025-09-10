package main.resolutions.longestCommonPrefix;

public class Solution {
    public String longestCommonPrefix(String[] strs) {

        if(strs == null || strs.length == 0){
            return "";
        }

        String prefixo = strs[0];

        for(String str : strs) {
            while (str.indexOf(prefixo) != 0) {
                prefixo = prefixo.substring(0, prefixo.length() - 1);
                if (prefixo.isEmpty()) {
                    return "";
                }
            }
        }
        return prefixo;
    }
}

