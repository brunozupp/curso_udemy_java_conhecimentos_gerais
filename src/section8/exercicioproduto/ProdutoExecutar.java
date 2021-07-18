package section8.exercicioproduto;

public class ProdutoExecutar {

    public static void executar() {

        Produto produto = new Produto("Arroz", 15.5, 30);
        produto.print();

        produto.addProducts(7);
        produto.print();

        produto.removeProducts(4);
        produto.print();
    }
}
