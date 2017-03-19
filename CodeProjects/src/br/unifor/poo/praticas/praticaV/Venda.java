package br.unifor.poo.praticas.praticaV;

public class Venda {

    private Pagamento pagamento;
    private Produto listaProdutos[];
    private int [] quantidadeItens[];

    public Venda(){
        // TODO implementar instanciação de vetores;

    }

    public void setProduto(int quantidade, Produto produto){
        // TODO implementar a insercão dos valores os respectivos vetores.
    }

    public double getTotalVenda(){
        // TODO calcula e retorna o total de vendas

        return 0;
    }

    // TODO Metodo que define o pagamento.
    public Pagamento getTipoPagamento(int codigo){

        switch (codigo){

            case 1:
                pagamento = new PagamentoEspecie();
                break;

            case 2:
                pagamento = new PagamentoCheque();
                break;

            case 3:
                pagamento = new PagamentoCartaoCredito();
                break;
        }

        return pagamento;
    }
}



