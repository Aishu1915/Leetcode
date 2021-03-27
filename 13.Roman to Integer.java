class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> Map=new HashMap<Character,Integer>();
        Map.put('I',1);
        Map.put('V',5);
        Map.put('X',10);
        Map.put('L',50);
        Map.put('C',100);
        Map.put('D',500); 
        Map.put('M',1000);
        int res=0;
        for(int i=0;i<s.length();i++){
            if(i>0 && Map.get (s.charAt(i)) > Map.get(s.charAt(i-1))){
            res=res+ Map.get (s.charAt(i))-2* Map.get(s.charAt(i-1));
            }
            else{
                res=res+Map.get(s.charAt(i));
            }    
        }
        
            
        return res;
    }
}
