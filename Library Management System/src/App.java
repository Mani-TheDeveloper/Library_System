import com.library.management.db.LibraryDB;
import com.library.management.gui.Gui;

public class App {
    private LibraryDB libraryDB = new LibraryDB();

    /*
     * 5465
     * Java
     * BalaGuruSwamy
     * CSE
     */
    public App() {
        libraryDB.assignConnection();
        new Gui();
    }

    public static void main(String[] args) {
        new App();
    }
}