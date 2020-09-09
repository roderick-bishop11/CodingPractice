public Map<String, String> mapBully(Map<String, String> map) {
  if(map.get("a") != null){
  map.put("b",map.get("a"));
  map.put("a","");
  }
  return map;
}
