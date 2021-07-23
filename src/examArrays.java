import java.sql.SQLOutput;

public class examArrays {
    public static void main(String[] args) {
        {
            String name = "AB";
            String reversename="";
           // for (int i=0; i<name.length(); i++)
            for (int i=name.length()-1;i>=0; i--)
            {
                reversename+= String.valueOf(name.charAt(i));
            }
            System.out.println(reversename);
        if (name.equals(reversename))
            System.out.println("It is palendrome");
        else
            System.out.println("It is not palendrome");

            System.out.println(reversename);
        }
    }
}


            /* int i=0;
            int j=name.length()-1;
            while(i<j) {
                if (name.charAt(i) != name.charAt(j))
                    System.out.println("IT is not a palendrome");
                else
                    System.out.println("IT is a palendrome");

            }i++;

            */