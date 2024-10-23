import br.view.LivroView;
import br.view.MenuView;

public class App {
    public static void main(String[] args) throws Exception {
        LivroView livroView = new LivroView();
        MenuView menuView = new MenuView();
        menuView.menuInicial();
    }
}
