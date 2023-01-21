class solution120956{
//    public int solution(String[] babbling) {
//        int res = 0;
//        for (int i = 0; i < babbling.length; i++) {
//            babbling[i] = babbling[i].replaceAll("aya", "1");
//            babbling[i] = babbling[i].replaceAll("ye", "1");
//            babbling[i] = babbling[i].replaceAll("woo", "1");
//            babbling[i] = babbling[i].replaceAll("ma", "1");
//            babbling[i] = babbling[i].replaceAll("1", "");
//            if(babbling[i].isEmpty()) res++;
//        }
//        return res;
//    }

    public int solution(String[] babbling) {
        int res = 0;
        for (int i = 0; i < babbling.length; i++) {
            if(babbling[i].matches("^(aya|ye|woo|ma)+$")) res++;
        }
        return res;
    }
}