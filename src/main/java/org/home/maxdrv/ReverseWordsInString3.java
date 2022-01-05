package org.home.maxdrv;

/**
 * https://leetcode.com/problems/reverse-words-in-a-string-iii/
 */
public class ReverseWordsInString3 {

    public String reverseWords(String s) {

        char[] text = s.toCharArray();

        int prev = 0;
        for (int i = 0; i < text.length; i++) {

            if (text[i] == ' ') {
                reverse(text, prev, i - 1);
                prev = i + 1;
            }

        }

        reverse(text, prev, text.length - 1);

//        return new String(text);  // turns out that String.valueOf() much faster and more memory efficient. But why? It's literally uses new String() inside. Is this intrinsic on my jvm?
        return String.valueOf(text);
    }

    private static void reverse(char[] text, int start, int end) {
        int i = start, j = end;
        while (i < j) {

            char temp = text[i];
            text[i] = text[j];
            text[j] = temp;

            i++;
            j--;
        }
    }

}
