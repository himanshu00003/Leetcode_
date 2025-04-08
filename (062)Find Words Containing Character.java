class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> newarraylist = new ArrayList<>(); // Using ArrayList because we don't know how many indices we'll find

        for (int i = 0; i < words.length; i++) {
            if (words[i].contains(String.valueOf(x))) { // Convert char x to String before using .contains()
                newarraylist.add(i); // Add index if word contains x
            }
        }

        return newarraylist; 
    }
}
