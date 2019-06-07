/*


Given a string, return a string made of the first 2 chars (if present), 
however include first char only if it is 'o' and include the second only if it is 'z', 
so "ozymandias" yields "oz".

*/

public String startOz(String str) {
String returnString = "";
	if(str.length()<1) return returnString;
	if(str.charAt(0)=='o'&& str.length()>=1){
		returnString = returnString + str.charAt(0);
	}   
	if(str.length()>=2  && str.charAt(1)=='z'){
		returnString+=str.charAt(1);
	}
return returnString;
}
