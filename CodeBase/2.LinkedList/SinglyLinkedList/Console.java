public class Console {

    public static void MenuList() {
        System.out.println("1.Insert At Beginning");
        System.out.println("2.Insert At End");
        System.out.println("3.Insert At Position");
        System.out.println("4.Delete At Position");
        System.out.println("5.Display");
        System.out.println("6.Exit");
        System.out.print("Select Menu : ");
    }

    public static void enterValue() {
        System.out.print("Enter Value : ");
    }

    public static void noData() {
        System.out.println("------------No Data Found!------------\n");
    }

    public static void insertAtBeginning() {
        System.out.println("------------Inserted At Beginning------------\n");
    }

    public static void insertAtEnd() {
        System.out.println("------------Inserted At End------------\n");
    }

    public static void log(String str) {
        System.out.print(str);
    }

}
