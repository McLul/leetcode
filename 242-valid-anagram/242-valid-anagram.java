class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> sKeys = new <Character,Integer>HashMap();
        HashMap<Character,Integer> tKeys = new <Character,Integer>HashMap();
        for (int i = 0; i < s.length(); i++) {
            char item = s.charAt(i);
            if (sKeys.get(item) == null) {
                sKeys.put(item,1);
            } else {
                sKeys.put(item,sKeys.get(item)+1);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            char item = t.charAt(i);
            if (tKeys.get(item) == null) {
                tKeys.put(item,1);
            } else {
                tKeys.put(item,tKeys.get(item)+1) ;
            }
        }
        if (sKeys.size() != tKeys.size()) {
            return false;
        } else {
            for (Map.Entry<Character,Integer> entry : sKeys.entrySet() ) {
                if (tKeys.get(entry.getKey()) == null) {
                    return false;
                }
                System.out.println(tKeys.get(entry.getKey()).getClass());
                if (!tKeys.get(entry.getKey()).equals(entry.getValue())) {
                    System.out.println(tKeys.get(entry.getKey()));
                    System.out.println(entry.getValue());
                    System.out.println(tKeys.get(entry.getKey()) - entry.getValue());
                    return false;
                }
            }
        }
        return true;
    }
}