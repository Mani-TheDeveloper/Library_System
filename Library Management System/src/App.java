
import com.library.management.db.LibraryDB;
import com.library.management.gui.Gui;

public class App {

    private final LibraryDB libraryDB = new LibraryDB();

    public App() {
        libraryDB.assignConnection();
        @SuppressWarnings("unused")
        Gui gui = new Gui();
    }

    public static void main(String[] args) {
        @SuppressWarnings("unused")
        App app = new App();
    }
}
