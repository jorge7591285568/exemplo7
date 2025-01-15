public class App {
            public static void main(String[] args){

                Pessoa p = new Pessoa("jorge", 123456789);
                Carro c = new Carro( "fusca","volks");

              
            System.out.println(" \n Eu Sou Vencedor \n");
            System.out.println(" nome: "+ p.getNome() +"\n Cpf: "+ p.getCpf() +"\n");
            System.out.println(" nome: "+ c.getNome()+ "\n modelo: "+ c.getModelo()+ "\n");
        }
}
