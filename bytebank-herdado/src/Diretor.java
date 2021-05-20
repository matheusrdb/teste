
public class Diretor implements Autenticavel {

    private AutenticadorAuxiliar autenticador;

    public Diretor()    {

    }
    @Override
    public boolean autentica(int senha) {
        return autenticador.autentica(senha);
    }

    @Override
    public void setSenha(int senha) {
        autenticador.setSenha(senha);
    }

   // public double getBonificacao() {
   //     return super.getSalario() + super.getSalario() * 0.50;
   // }
}
