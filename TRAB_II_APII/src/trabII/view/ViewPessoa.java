package trabII.view;
import static java.lang.System.out;

public class ViewPessoa {
    
    public void impremePessoa(int j, String nome, String endereco, String tipoTel, String telefone){
        
            out.println("========== "+(j+1)+" Pessoa(s): "+"==========");
            out.println("Nome: " + nome);
            out.println("Endereço: " + endereco);
            out.println("Tipo Telefone: " + tipoTel);
            out.println("Telefone: " + telefone);
            out.println("");
        
    }
    
}
