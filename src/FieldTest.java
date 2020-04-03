import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FieldTest extends Field {

    @Test
    void testAddField() {
        Field field = new Field();
        addField(field);
    }
}