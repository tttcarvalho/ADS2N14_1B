package mvc.app;
 import mvc.controller.PessoaController;

public class PessoaApp {
    public static void main(String[] args){
        PessoaController controller = new PessoaController();
        controller.criaPessoa();
        controller.mostraPessoa();
    }
    
}
