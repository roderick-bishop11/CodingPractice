public String getSandwich(String str) {
 int index1 = str.indexOf("bread")+5; //end index of 1st (maybe only) bread
 int index2 = 0; 
  if(str.length() > index1 && str.substring(index1).contains("bread")){
  index2 = str.substring(index1).lastIndexOf("bread")+index1;
    return str.substring(index1, index2);
  }
    return ""; //if no other bread
}

//Just a side note, but I wanted to challenge myself to solve this one without a loop, so glad i could do it!