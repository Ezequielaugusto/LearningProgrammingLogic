/*As a user, I would like to have the name and age of participants in a swimming tournament and that the system would print as follows:
Under 10 years old: <name> will participate in the kid's category
Between 11 and 15 years old: <name> will participate in the youth category
Between 16 and 19 years old: <name> will participate in the young adult category
Above: <name> will participate in the adult category
So that I can quickly sort all the participants */

public class SwimmingTournament {
    public static void main(String[] args){
        String name = "LUffy";
        int age = 19;
        if(age < 11)
            {System.out.println(name + "will participate in the kid's category");
        }else if
            (age >= 11 && age < 16 )
            {System.out.println(name + "will participate in the youth's category");
        }else if (age >= 16 && age <= 19)
            {System.out.println("will participate in the young adult category");
        }else
            {System.out.println("will participate in the adult category");
        }
    }
}
