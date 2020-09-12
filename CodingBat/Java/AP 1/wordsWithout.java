public String[] wordsWithout(String[] words, String target) {
    int count = 0;
    
    for(int i = 0; i < words.length; i++) {
        if(!words[i].equals(target))
            count++;
    }
                    
    String[] match = new String[count];
    int index = 0;
                          
    for(int i = 0; index < count; i++) {
        if(!words[i].equals(target)) {
            match[index] = words[i];
            index++;
        }
    }
       
return match;
}
