import java.util.ArrayList;
import java.util.List;

public class Tournament {

    private int numFields;
    // Create List for holding Referee objects
    public static List<Referee> refList = new ArrayList<>();
    // Create List for holding Field objects
    public static List<Field> fieldList = new ArrayList<>();

    public Tournament() {
        numFields = 0;
        fieldList = new ArrayList<>();
        refList = new ArrayList<>();
    }
    public Tournament(int numFields, List<Field> fieldList, List<Referee> refList) {
        this.numFields = numFields;
        Tournament.fieldList = fieldList;
        Tournament.refList = refList;
    }

    public int getNumFields() {
        return numFields;
    }

    public void setNumFields(int numFields) {
        this.numFields = numFields;
    }

    public static List<Field> getFieldList() {
        return fieldList;
    }

    public static void setFieldList(List<Field> fieldList) {
        Tournament.fieldList = fieldList;
    }

    public static List<Referee> getRefList() {
        return refList;
    }

    public static void setRefList(List<Referee> refList) {
        Tournament.refList = refList;
    }

    @Override
    public String toString() {
        return "Tournament{" +
                "numFields=" + numFields +
                "Field List: " + Tournament.fieldList.toString() +
                "Referee List: " + Tournament.refList.toString() +
                '}';
    }
}