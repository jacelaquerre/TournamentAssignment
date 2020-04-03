import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RefereeTest extends Referee {

    @Test
    void testAddReferee() {
        Referee ref1 = new Referee();
        addReferee(ref1);
    }
}