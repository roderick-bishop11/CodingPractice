def string_times(str, n):
  result = ""
  if n == 1:
    return str
  elif n == 0 or str == "":
    return ""
  else :
    for i in range (n):
      result += str
  return result
  #indentation is hard lol