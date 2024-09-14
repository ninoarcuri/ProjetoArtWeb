
package projetoweb.poo.negocio;

public class Usuario {
    private String Usuario, Senha,Nome,Acesso;
    private String Sobrenome,Soxo,Endereço,Email; 
    private int Idade;
    private int iduser;

   
    public String getUsuario() {
        return Usuario;
    }

  
    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

   
    public String getSenha() {
        return Senha;
    }

    
    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

 
    public String getNome() {
        return Nome;
    }

    
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    
    public String getAcesso() {
        return Acesso;
    }

    
    public void setAcesso(String Acesso) {
        this.Acesso = Acesso;
    }

    
    public int getIduser() {
        return iduser;
    }

    
    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    
    public String getSobrenome() {
        return Sobrenome;
    }

   
    public void setSobrenome(String Sobrenome) {
        this.Sobrenome = Sobrenome;
    }

    
    public String getSoxo() {
        return Soxo;
    }

   
    public void setSoxo(String Soxo) {
        this.Soxo = Soxo;
    }

   
    public String getEndereço() {
        return Endereço;
    }

    
    public void setEndereço(String Endereço) {
        this.Endereço = Endereço;
    }

    
    public String getEmail() {
        return Email;
    }

    
    public void setEmail(String Email) {
        this.Email = Email;
    }

    
    public void setIdade(int Idade) {
        this.Idade = Idade;
    }


    public int getIdade() {
        return Idade;
    }
    
}
