class Solution {
    public static StringBuilder solution(String my_string){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            if (!(my_string.charAt(i) == 'a' || my_string.charAt(i) == 'e'
                    || my_string.charAt(i) == 'i' || my_string.charAt(i) == 'o'
                    || my_string.charAt(i) == 'u')) {
                sb.append(my_string.charAt(i));
            }
        }
        return sb;
    }
}