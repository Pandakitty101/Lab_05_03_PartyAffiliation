public class PartyAffiliation {
    public static void main(String[] args)
    {
        String party = "p";
        String menu = "D-Democrat R-Republican I-Independent";
        System.out.println(menu);
        party = party.toUpperCase();

        if(party.equals("R"))
        {
            System.out.println("You get a republican elephant");
        }
        else if (party.equals("D"))
        {
            System.out.println("You get a democratic donkey");
        }
        else if (party.equals("I"))
        {
            System.out.println("You get an independent man");
        }
        else
        {
            System.out.println("You entered an invalid party");
        }


    }
}
