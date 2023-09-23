package teste;

public class Login {
    public String Nome;
    public String Usuario;
    private String Senha;
    public String Email;
    public String desc;
    public String decisao;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDecisao() {
        return decisao;
    }

    public void setDecisao(String decisao) {
        this.decisao = decisao;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setLogin(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }   
}