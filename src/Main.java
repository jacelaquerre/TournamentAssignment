// Jace Laquerre & Aaron Slocum
// This is a simulated referee assignment system for a sports (leaning to soccer) tournament

public class Main {

    public static void main(String[] args) {
        Tournament tourney = new Tournament();

        // Creating Fields
        Field treefarm = new Field(1, "Tree Farm", 9, 16, Field.Day.SATURDAY);
        Field sb = new Field(2, "SB",8,14, Field.Day.SUNDAY);
        treefarm.addField(treefarm);
        sb.addField(sb);
        System.out.println("Testing toString on a Field:");
        System.out.println(treefarm.toString()); // why is it not printing anything
        System.out.println("Printing field list:");
        tourney.printFieldList();

        // Creating Referees
        Referee ref1 = new Referee();
        Availibility jaces_aval = new Availibility(true, true);
        Referee jace = new Referee(1, "Jace Laquerre", jaces_aval, 19, 12, 6);
        ref1.addReferee(jace);
        Availibility bens_aval = new Availibility(false, true);
        ref1.addReferee(2, "Ben Crane", bens_aval,18,13,8);
        System.out.println("Printing Referee list:");
        tourney.printRefList();

        // Testing the assignment
        // Ben will be assign as CR to the field ID 1, But ben will not be assigned because hes
        // not available on that day so Jace will become CR
        tourney.assign(1, 2);
        tourney.assign(1, 1);

        tourney.printFieldList();
        // Jace will be assigned as CR to field ID 2, Ben will be AR1
        tourney.assign(2,1);
        tourney.assign(2, 2);
        tourney.printFieldList();

    }

}
