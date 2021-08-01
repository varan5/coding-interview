package com.company.oop;

class Alarm {
 String alarmTime;
 String ringTone;
 String repeat;
 static int volume;
 static int snooze;

 //Static Initializer Block
 //A block of code use to initialize the static data members of the class.
 //It autorun as class gets loaded in memory.
 static
 {
   System.out.println("SIB");
   Alarm.volume = 7;
   Alarm.snooze = 5;
 }

 Alarm()
 {
  System.out.println("Alarm()");
  alarmTime = "12.00";
  ringTone = "Classic (Ding Ding Ding)";
  repeat = "Everyday";
 }
 
 Alarm(String at, String rt, String rp)
 {
  System.out.println("Alarm(params)");
  alarmTime = at;
  ringTone = rt;
  repeat = rp;
 }

 //this: 
 //* system defined formal parameter for non static methods of the class.
 //* this is initialized with the reference to the caller object of the method.
 //* In the method this acts as a default caller object for access of other members. 
 //* It is a final reference of type current class.
 void playAlarm() 
 {
  System.out.println(ringTone + "@" + Alarm.volume);
  System.out.println("Its : " + this.alarmTime);
  System.out.println("Either wakeup or snooze of " + Alarm.snooze + " minutes");
 }

 static void setSnooze(int x)
 {
   Alarm.snooze = x; 
 }

 static void setVolume(int x)
 {
   Alarm.volume = x; 
 }

 public static void main(String args[])
 {
  Alarm a1 = new Alarm();
  Alarm a2 = new Alarm("6.00", "Rooster(Kuduku)", "Everyday");
  Alarm a3 = new Alarm("8.50", "Danger(Out for office now)", "Mon-Fri");

  a1.playAlarm(); // playAlarm(a1)
  Alarm.setVolume(10);
  a2.playAlarm();
  a3.playAlarm();
 }
}
