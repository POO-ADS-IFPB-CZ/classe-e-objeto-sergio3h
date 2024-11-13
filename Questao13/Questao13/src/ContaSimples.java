public class ContaSimples {
    private double saldo;
    private String conta;

    public ContaSimples(double saldo, String conta){
        this.conta = conta;
        this.saldo = saldo;
    }

    public void deposita(double valor){
        if(valor > 0){
            saldo += valor;
            System.out.println("Deposito realizado com sucesso");
        }else{
            System.out.println("Erro no deposito");
        }
    }

    public boolean retira(double valor){
        if(valor > 0 &&valor <= saldo){
            saldo -= valor;
            System.out.println("Valor retirado com sucesso");
            return true;
        }
        else{
            System.out.println("Erro na retirada");
            return false;
        }
    }

    public double getSaldo(){
        return saldo;
    }

    public  String getConta(){
        return conta;
    }

    public static boolean Transferencia(ContaSimples origem,ContaSimples destino, double valor){
        if(origem.retira(valor)){
            destino.deposita(valor);
            System.out.println("Transferencia realizada com sucesso" + valor);
            return true;
        }else{
            System.out.println("ERRO na transferencia");
            return false;
        }
    }

}


