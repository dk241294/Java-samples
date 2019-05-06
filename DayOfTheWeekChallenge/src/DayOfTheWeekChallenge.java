 public class DayOfTheWeekChallenge{
    public static void main(String []args){
        printDayOfTheWeek(3);
    }

    public static void printDayOfTheWeek(int day){
        switch(day)
        {
            case 0:
            System.out.println("sunday");
            break;
             case 1:
            System.out.println("monday");
            break;
             case 2:
            System.out.println("tuesday");
            break;
            case 3:
            System.out.println("wednesday");
            break;
             case 4:
            System.out.println("thrusday");
            break;
            case 5:
            System.out.println("friday");
            break;
            case 6:
            System.out.println("saturday");
            break;


        default:
            System.out.println("no such day exist");
    }}
}

