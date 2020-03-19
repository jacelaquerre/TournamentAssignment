import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the Tournament Referee Assignment System");
        System.out.println("Commands: ");
        System.out.println("1 - Load field list from csv file");
        System.out.println("2 - Load referee list from csv file");
        System.out.println("3 - Print field list");
        System.out.println("4 - Print referee list");
        System.out.println("5 - Manually add field");
        System.out.println("6 - Manually add Referee");
        System.out.println("7 - Assign referee to a field");

        Scanner scan = new Scanner(System.in);
        //////// TODO: Input validation?
        System.out.println("Enter a number: ");
        int choice = scan.nextInt();

        switch(choice) {
            case 1:
                FileIO fileIO = new FileIO();
                System.out.println("Enter the name of the file: ");
                String filename = scan.nextLine();
                fileIO.fieldFileIO(filename);
                break;
            case 2:
                FileIO fileIO2 = new FileIO();
                System.out.println("Enter the name of the file: ");
                String filename2 = scan.nextLine();
                fileIO2.refFileIO(filename2);
                break;
            case 3:
                System.out.println(Tournament.fieldList.toString());
                break;
            case 4:
                System.out.println(Tournament.refList.toString());
                break;
            case 5:
                // TODO: case 5
                break;
            case 6:
                break;
            case 7:
                break;
        }

        // Closing Scanner after the use
        scan.close();
    }
}
