public Map<String, String> mapAB3(Map<String, String> map) {
  if(map.get("a") != null && map.get("b") == null) map.put("b", map.get("a"));
  if(map.get("b") != null && map.get("a") == null) map.put("a", map.get("b"));
  return map;
}
