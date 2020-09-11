public int wordsCount(String[] words, int len) {
  int answer=0;
  for(int i=0; i<words.length; i++){
    if(words[i].length()==len){
      answer++;
    }
  }
  return answer;
}

