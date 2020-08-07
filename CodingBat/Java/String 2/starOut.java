public String starOut(String str) {
StringBuilder newStr = new StringBuilder();
if(str.contains("*") == false) return str;
for(int i = 0; i < str.length(); i++){ 
//understanding that I could group the second adn 3rd aguments here was kkey for me
if(str.charAt(i) == '*' || (i>0 && str.charAt(i-1) == '*')) continue;
if(i<str.length()-1 && str.charAt(i+1) == '*') continue;
newStr.append(str.charAt(i));
}
return newStr.toString();
}
