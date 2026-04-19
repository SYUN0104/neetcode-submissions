class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String i : strs){
            sb.append(i.length()).append("#").append(i);
        }

        String encodedString = sb.toString();

        return encodedString;
    }

    public List<String> decode(String str) {
        List<String> ansString = new ArrayList<>();
        int st = 0;

        while(st < str.length()){
            int sharpIndex = str.indexOf("#", st);
            int len = Integer.parseInt(str.substring(st, sharpIndex));
            ansString.add(str.substring(sharpIndex + 1, sharpIndex + len + 1));

            st = sharpIndex + len + 1;
        }

        return ansString;
    }
}
