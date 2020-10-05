public Map<String, String> mapAB(Map<String, String> map) {
  if(map.containsKey("a") && map.containsKey("b")){
    String concat =  map.get("a") + map.get("b");
    map.put("ab", concat);
  } 

return map;
}
