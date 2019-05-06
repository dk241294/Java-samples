public class DayOfTheWeek {
    public static void main(String[]args){
      printDayOfTheWeek(1);
        printDayOfTheWeek(2);
        printDayOfTheWeek(0);
        printDayOfTheWeek(-1);
        printDayOfTheWeek(3);
        printDayOfTheWeek(4);
    }
    private static void printDayOfTheWeek(int day){
        if(day==0){
            System.out.println("sunday");
        }
            else if(day==1){
                System.out.println("monday");
            }
               else if(day==2){
                    System.out.println("tuesday");
                }
                    else if(day==3){
                        System.out.println("wednesday");
                    }
                        else if(day==4){
                            System.out.println("thursday");
                        }
                            else if(day==5){
                                System.out.println("friday");
                            }

                                  else if(day==6){
                                     System.out.println("saturday");
                                  }

                                  else  {
                                      System.out.println("no valid day");

                                  }
 }  }
