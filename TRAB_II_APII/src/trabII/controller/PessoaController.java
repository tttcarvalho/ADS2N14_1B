package trabII.controller;
import trabII.model.Pessoa;
import trabII.view.ViewPessoa;

import java.util.Random;

public class PessoaController {
    
    private ViewPessoa view = new ViewPessoa();
    private Pessoa pessoa;
    
    public void criaPessoa(){
         pessoa = new Pessoa();
         
         int i;
         int nomeAleatorioPessoa;
         int nomeAleatorioRua;
         int nrAleatorioRua;
         int nrAleatorioTelefone;
         int tipoAleatorioTelefone;
         String nomePessoa [] = {"Thiago Carvalho","Caroline Hindrichson","Felipe Silva","Juliana Lins","Simone Alves",},nome = "";
         String nomeRua [] = {"Rua do Emigrante","Avenida Brasil","Avenida Alberto Bins","Rua Coronel Genuino","Travessa Egito",},nomer = "";
         int numrua [] = {1,2,3,4,5,6,7,8,9,10,11}, num = 0,nume = 0;
         String numtelone [] = {"0","1","2","3","4","5","6","7","8","9"}, numtel = "",numetel = "",numetel2="";
         String TipoTelefone [] = {"Celular","Casa","Trabalho"}, tipoTel="", tipoTele="";         
         
         Random random = new Random();
                      
   // ************* Gera o nome aleatório ************* \\
                    
                    nomeAleatorioPessoa = 0 + random.nextInt(5);//escolhe uma pos de 0 a 4  
                    nome =  nomePessoa[nomeAleatorioPessoa];

                        pessoa.setNome(nome);  
                    
                
   // ************* Gera o nome da rua aleatório ************* \\
                
                    nomeAleatorioRua = 0 + random.nextInt(5);//escolhe uma pos de 0 a 4  
                    nomer = nomeRua[nomeAleatorioRua];
                
   // ************* Gera o numero da rua aleatorio ************* \\
                
                for(i = 0 ; i <= 8; i++){ 
                    nrAleatorioRua = 0 + random.nextInt(10);
                    num = numrua[nrAleatorioRua];
                    nume = nume + num;
                }
                
                nomer = nomer+" Nº:"+nume;
                    
                    pessoa.setEndereco(nomer);
    // ************* Gera o tipo de telefone aleatório ************* \\
                
                    tipoAleatorioTelefone = 0 + random.nextInt(3);
                    tipoTele = TipoTelefone[tipoAleatorioTelefone];
                                    
                    pessoa.setTipoTel(tipoTele);
               
    // ************* Gera o telefone aleatório ************* \\                         
               for(i = 0 ; i <= 6; i++){ 
                    nrAleatorioTelefone = 0 + random.nextInt(10);
                    numtel = numtelone[nrAleatorioTelefone];
                    if (i<3){
                        numetel = numetel + numtel;
                    }
                    else{
                        numetel2 = numetel + numtel;
                    }                    
                } 
               numetel = numetel+"-"+numetel2;
                    
                    pessoa.setTelefone(numetel);
        

    }
    
    public void mostraPessoa(){
        int j;
        for (j=0; j<=49; j++){ 
        view.impremePessoa(j,pessoa.getNome(), pessoa.getEndereco(), pessoa.getTipoTel(), pessoa.getTelefone());
        criaPessoa();
        }
    }
   
    
}
