import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CrewTest extends Crew {

    @Test
    void testFilled() {
        Crew crew = new Crew();
        boolean filled = crew.filled();
    }
}