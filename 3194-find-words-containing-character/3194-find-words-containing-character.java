class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {

        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < words.length; i++)
        {
            String word = words[i];
            for(char ch : word.toCharArray()) 
            {
                if(ch == x)
                {
                    result.add(i);
                    break;
                }
            } 
        }
        return result;
    }
}