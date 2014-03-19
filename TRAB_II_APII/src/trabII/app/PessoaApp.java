package trabII.app;
import trabII.controller.PessoaController;

public class PessoaApp {
    
    public static void main(String[] args){
        
        PessoaController controller = new PessoaController();
        controller.criaPessoa();
        controller.mostraPessoa();
    }
    
}
