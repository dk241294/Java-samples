public class Addition {



    public int add(int a, int b)       // adding two integer values.
    {
        int sum = a+b;
        return sum;
    }

    public int add(int a, int b, int c)      //adding three integer
    {
        int sum = a+b+c;
        return sum;
    }


        public static void main (String[] args)
        {
            Addition ob = new Addition();
            int sum1 = ob.add(1,2);
            System.out.println("sum of the two integer value :" + sum1);
            int sum2 = ob.add(1,2,3);
            System.out.println("sum of the three integer value :" + sum2);
        }
    }


