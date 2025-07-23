class Solution {
    private int calc(String tmp, int x, int y){
        int res = 0;

        if(x >= y){
            int b = 0, a = 0;
           
            for(int i = 0; i < tmp.length(); i++){
                if(tmp.charAt(i) == 'b'){
                    if(a > 0){ a--; res += x; }
                    else{ b++; }
                }
                else{ a++; }
            }
            
            res += Math.min(a, b) * y;
        }
        else{
            int b = 0, a = 0;
            
            for(int i = 0; i < tmp.length(); i++){
                if(tmp.charAt(i) == 'a'){
                    if(b > 0){ b--; res += y; }
                    else{ a++; }
                }
                else{ b++; }
            }
           
            res += Math.min(a, b) * x;
        }

        return res;
    }

    
    public int maximumGain(String s, int x, int y) {
        int points = 0;
        StringBuilder tmp = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'b'){
                tmp.append(s.charAt(i));
            }
            else{
               
                points += calc(tmp.toString(), x, y);
               
                tmp.setLength(0);
            }
        }

        if(tmp.length() > 0) points += calc(tmp.toString(), x, y);

        return points;
    }
}