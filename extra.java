import java.util.Scanner;
public class extra {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("What is  your HP");
        int HP=sc.nextInt();
        System.out.println("What  your mana");
        int Mana= sc.nextInt();
        System.out.println("What is your skill point");
        int Skillpoint=sc.nextInt();

        if(HP>50|| Mana>75|| Skillpoint==100){
            System.out.println("You can cast your ultimate");
        }
        else{
            System.out.println("You cannot cast your ultimate");
        }


    }
}
