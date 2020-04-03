import java.sql.Ref;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TournamentTest extends Tournament {

    @org.junit.jupiter.api.Test
    void testAssign() {
        Tournament tournament = new Tournament();
        Referee ref1 = new Referee();
        Referee ref2 = new Referee();
        Availibility availibility = new Availibility(true,true);
        Field field = new Field();
        tournament.assign(field.getID(),ref1.getID());
        tournament.assign(field.getID(),ref2.getID());
    }

    @org.junit.jupiter.api.Test
    void testFindRef() {
        Tournament tournament = new Tournament();
        Referee ref1 = new Referee();
        ref1.setID(1);
        Referee ref2 = new Referee();
        ref2.setID(2);
        List<Referee> refList = new ArrayList<Referee>();
        refList.add(ref1);
        tournament.findRef(1);
        tournament.findRef(2);

    }

    @org.junit.jupiter.api.Test
    void testFindField() {
        Tournament tournament = new Tournament();
        Field field1 = new Field();
        field1.setID(1);
        Field field2 = new Field();
        field2.setID(2);
        List<Field> fieldList = new ArrayList<Field>();
        fieldList.add(field1);
        tournament.findField(1);
        tournament.findField(2);
    }
}