    class Solution {
        public String removeStars(String s) {
            StringBuffer sb = new StringBuffer("");

            for(char ch : s.toCharArray())
            {
                if(ch == '*')
                {
                    if(sb.length() > 0)
                    {
                        sb.deleteCharAt(sb.length() -1);
                    }
                }
                else{
                    sb.append(ch);
                }
            }

            return sb.toString();
        }
    }