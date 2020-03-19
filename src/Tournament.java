import java.util.ArrayList;
import java.util.List;

public class Tournament {

    private int numFields;
    private List<Field> fieldList;

    public Tournament() {
        numFields = 0;
        fieldList = new ArrayList<>();
    }
    public Tournament(int numFields, List<Field> fieldList) {
        this.numFields = numFields;
        this.fieldList = fieldList;
    }

    public int getNumFields() {
        return numFields;
    }

    public void setNumFields(int numFields) {
        this.numFields = numFields;
    }

    public List<Field> getFieldList() {
        return fieldList;
    }

    public void setFieldList(List<Field> fieldList) {
        this.fieldList = fieldList;
    }

}