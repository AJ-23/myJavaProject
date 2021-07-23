public class factorial {
    public static void main(String [] args){

        int num=50;
        int f=1;
        for(int i=1;i<=num;i++)
        {
            f=f*i;

        }

    //   System.out.println(f);

        int option=3;

        switch(option){
            case 1:
                System.out.println("you are new student to pragra");
                break;
            case 2:
                System.out.println("you are an exisiting student");
                break;
            case 3:
                System.out.println("you are in waiting list");
                break;
            case 4:
                System.out.println("you have graduated the all programs");
                break;
            case 5:
                System.out.println("you are not qualified to enroll");
                break;
            default:System.out.println("invalid");break;

        }
    }
}
