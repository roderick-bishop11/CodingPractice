public String plusOut(String str, String word) {
 int end = word.length();
  String newstring ="";
  for(int i=0; i<=str.length()-end; i++){
   if(str.substring(i,i+end).equals(word)){
     newstring+=word;
     i+=end-1;
   }
   else{
     newstring+="+";
   }

}
for(int i=newstring.length(); i<str.length();i++) newstring+="+";
return newstring;
}