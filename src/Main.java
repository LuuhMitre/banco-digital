public class Main {
    public static void main(String[] args) {
        Cliente luana = new Cliente();
        luana.setNome("Luana");


        ContaCorrente cc = new ContaCorrente(luana); 
        cc.depositar(100);

        ContaPoupanca poupanca = new ContaPoupanca(luana); 

        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }    
}
