package trabII.model;

public class Pessoa {
     
    private String nome;
    private String endereco;
    private String telefone;
    private String tipoTel;
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getEndereco(){
        return endereco;
    }
    
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
      
    public String getTipoTel(){
        return tipoTel;
    }
    
    public void setTipoTel(String tipoTel){
        this.tipoTel = tipoTel;
    }
     
    public String getTelefone(){
        return telefone;
    }
    
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    
}
