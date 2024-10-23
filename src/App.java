import br.respository.LivroRepository;
import br.view.MenuView;

public class App {
    public static void main(String[] args) throws Exception {
        LivroRepository livroRepository = new LivroRepository();
        MenuView menuView = new MenuView();
        menuView.menuInicial();
    }
}
