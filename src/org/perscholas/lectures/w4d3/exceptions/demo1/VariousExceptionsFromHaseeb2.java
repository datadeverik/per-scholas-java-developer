package org.perscholas.lectures.w4d3.exceptions.demo1;

public class VariousExceptionsFromHaseeb2 {

    public static void main(String[] args) {
        try
        {
            String s = null;
            s.length();

            String[] st = {"abc","xyz","898","grd","123"};

            st[1] = "dfdf";

            for(int i = 0; i < st.length; i++)
            {
                int intValue = Integer.parseInt(st[i]);
            }

        }

        catch(ArrayIndexOutOfBoundsException e)
        {
            e.printStackTrace();
            System.out.println("index position is not exsist");
        }
        catch(NumberFormatException e)
        {
            System.out.println("The Thrown NumberFormateException will be caught here");
        }

        catch(NullPointerException e)
        {
            System.out.println("String lenght should be greather then zero ");
        }


        finally {
            System.out.println("Finally block will execute");
        }
    }
}
