public Map<String, String> mapAB4(Map<String, String> map) {

if (map.get("a") != null && map.get("b") != null){
  int aLen = map.get("a").length();
  int bLen = map.get("b").length();
  if(aLen == bLen){
    map.put("a", "");
    map.put("b", "");
  }
  else{
   map.put("c", getString(aLen, bLen, map));
  }
}
  return map;
}

public String getString(int aLen, int bLen, Map<String, String> map){
  if (Math.max(aLen, bLen) == 0) return "";
  if (Math.max(aLen, bLen) == aLen) return map.get("a");
  return map.get("b");
}
