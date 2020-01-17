public String alarmClock(int day, boolean vacation) {
  String time = "7:00";
  if((day == 0 || day == 6) && vacation == false) time = "10:00";
  if((day == 0 || day == 6) && vacation == true) time = "off";
  if((day > 0 && day < 6) && vacation == true) time = "10:00";
  return time;
}
