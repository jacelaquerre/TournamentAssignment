public class Field {

    public enum Day {
        SATURDAY, SUNDAY, TBD;
    }

    private int ID;
    private String name;
    private int numGames;
    public  int age;
    private Day day;
    private Crew crew;

    public Field() {
        int ID = 0;
        String name = "Unknown";
        int numGames = 0;
        int age = 10;
        Day day = Day.TBD;
        this.crew = new Crew();
    }

    public Field(int ID, String name, int numGames, int age, Day day, Crew crew) {
        this.ID = ID;
        this.name = name;
        this.numGames = numGames;
        this.age = age;
        this.day = day;
        this.crew = crew;
    }

    // This constructor is for FileIO where no crew is specified in csv upload
    public Field(int ID, String name, int numGames, int age, Day day) {
        this.ID = ID;
        this.name = name;
        this.numGames = numGames;
        this.age = age;
        this.day = day;
        this.crew = new Crew();
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumGames() {
        return numGames;
    }

    public void setNumGames(int numGames) {
        this.numGames = numGames;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }

    public Crew getCrew() {
        return crew;
    }

    public void setCrew(Crew crew) {
        this.crew = crew;
    }

    @Override
    public String toString() {
        return "Field{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", numGames=" + numGames +
                ", age=" + age +
                ", day=" + day +
                ", crew=" + crew.toString() +
                '}';
    }

    public void addField(int ID, String name, int numGames, int age, Day day) {
        Field field = new Field(ID, name, numGames, age, day);
        Tournament.fieldList.add(field);
    }

    public void addField(Field field) {
        Tournament.fieldList.add(field);
    }
}
