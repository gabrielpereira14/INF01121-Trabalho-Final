package InheritanceExample;

public class ClasseFilha extends ClassePai implements ExemploInterface{
    int atributoClasseFilha;

    public ClasseFilha(int atributoClassePai) {
        super(atributoClassePai);
    }

    public void testarAcesso(){
        String mensagem = "Atributo da classe filha = " + atributoClasseFilha + "\n Atributo da classe pai = " + atributoClassePai;
    }

    @Override
    public void escreveMensagem(String mensagem) {

        System.out.println(mensagem);
    }
}