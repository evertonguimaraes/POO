package br.unifor.poo.praticas.praticaV;

import java.util.Scanner;

public class LojinhaUnifor {

    public static void main(String[] args) {

        int codigo, quantidade;

        Pagamento pagamento;
        Produto produto;
        Venda venda;

        Scanner input = new Scanner(System.in);

        System.out.println("Informe o código do produto. ");
        codigo = input.nextInt();

        // TODO Modifique a lógica para garantir que o código digitado seja valido;

        boolean repete = false;
        do{
            venda = new Venda();
            produto = Produto.buscar(codigo);

            if(produto == null){
                System.out.println("Código digitado incorretamente.");
            }else{
                System.out.printf("Encontrado o produto %s .\n", produto.getDescricao());

                System.out.println("Informe quantos itens você vai levar.");
                quantidade = input.nextInt();

                venda.setProduto(quantidade, produto);

                System.out.println("Deseja inserir outro produto? ");
                System.out.println("1 - SIM, 2 - NAO");
                codigo = input.nextInt();

                if (codigo == 1){
                    repete = true;
                }else{
                    // TODO Implementar o código abaixo.
                    System.out.println("Imprimindo o resumo da compra.");

                    // Somente simulando
                    double totalCompra = 0;

                    System.out.println("Informe a opcao de pagamento.");
                    System.out.println("1 - a vista.");
                    System.out.println("2 - cheque.");
                    System.out.println("3 - cartao de credito");

                    int opcao = input.nextInt();

                    pagamento = venda.getTipoPagamento(opcao);

                    if(pagamento instanceof PagamentoEspecie){
                        pagamento.setValor(totalCompra * 0.9);
                    }else{
                        if (pagamento instanceof PagamentoCheque){
                            pagamento.setValor(totalCompra);
                        }else{
                            if (pagamento instanceof PagamentoCartaoCredito){
                                System.out.println("Informe o numero do cartao. ");
                                // TODO

                                System.out.println("Informe a data de validade. ");
                                // TODO

                                System.out.println("Informe a quantidade de parcelas.");
                                int quantidadeParcelas = input.nextInt();

                                pagamento.setValor(totalCompra);
                                pagamento.setValorParcela( totalCompra / quantidadeParcelas);
                            }
                        }
                    }

                }
            }
        }while(repete);

    }

}





