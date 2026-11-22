package padroes.projeto.factory;

public class Main {
    public static void main(String[] args) {

        InterfaceFactory fabrica = InterfaceFactory.getFactory("claro");

        Botao botao = fabrica.criarBotao();
        System.out.println(botao.renderizar());

        CampoTexto campoTexto = fabrica.criarCampoTexto();
        System.out.println(campoTexto.renderizar());

        fabrica = InterfaceFactory.getFactory("escuro");

        botao = fabrica.criarBotao();
        System.out.println(botao.renderizar());

        campoTexto = fabrica.criarCampoTexto();
        System.out.println(campoTexto.renderizar());
    }
}