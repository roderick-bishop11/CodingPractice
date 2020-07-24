public boolean catDog(String str) {
  int dogCount=0;
  int catCount=0;
  for(int i=0; i<str.length()-2; i++){
    if(str.substring(i,i+3).equals("cat")){
      catCount++;
    }
    else if (str.substring(i,i+3).equals("dog")){
      dogCount++;
    }
  }
  if(catCount==dogCount) {
    return true;
}
else {return false;}

}
