public String changeXY(String str) {
 if(str.length() == 0)
        return str; //base case 
    if(str.charAt(0) == 'x')
        return 'y' + changeXY(str.substring(1)); //tack on a y and then send the substring
    return str.charAt(0) + changeXY(str.substring(1)); //otherwise, send it as is
}
