import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FieldTest extends Field {

    @Test
    void testAddField() {
        Tournament tournament = new Tournament();
        Field field = new Field();
        addField(field);
        Assert.assertEquals(Tournament.getFieldList(),field);
    }
}