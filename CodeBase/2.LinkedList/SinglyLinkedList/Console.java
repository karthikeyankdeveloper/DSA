public class Console {

    public static void MenuList() {
        System.out.println("1.Insert At Beginning"); /* Done */
        System.out.println("2.Insert At End"); /* Done */
        System.out.println("3.Insert At Position"); /* Done */
        System.out.println("4.Delete At Position"); /* Done */
        System.out.println("5.Display"); /* Done */
        System.out.println("6.Exit"); /* Done */
        System.out.println("7.Search"); /* Done */
        System.out.println("8.Reverse"); /* Done */
        System.out.println("9.Middle"); /* Done */
        System.out.println("10.Detect Loop"); /* Done */
        System.out.println("11.Remove Loop"); /* Done */
        System.out.println("12.Length"); /* Done */
        System.out.println("13.Find nth Node from end of List"); /* Done */
        System.out.println("14.Remove Duplicate"); /* Done */
        System.out.println("15.Make Loop"); /* Done */
        System.out.println("16.Where Loop Start"); /* Done */
        System.out.print("Select Menu : ");
    }

    public static void enterValue() {
        System.out.print("Enter Value : ");
    }

    public static void enterPosition() {
        System.out.print("Enter Position : ");
    }

    public static void invalidPosition() {
        System.out.print("\n------------Invalid Position------------ \n");
    }

    public static void noData() {
        System.out.println("\n------------No Data Found!------------\n");
    }

    public static void insertAtBeginning() {
        System.out.println("\n------------Inserted At Beginning------------\n");
    }

    public static void insertAtEnd() {
        System.out.println("\n------------Inserted At End------------\n");
    }

    public static void log(String str) {
        System.out.print(str);
    }

}
