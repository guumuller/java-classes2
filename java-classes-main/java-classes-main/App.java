import java.util.Scanner;

public class App {

        public String Nome;
        public String Sobrenome;
        public int Idade;
        public int Salario;
        public int Altura;
        public String Palavra;

        Scanner ler = new Scanner(System.in);
        public void setNome(String nome) {
            Nome = nome;
        }
        public String getNome(){
            return Nome;
        }

        public void setSobrenome(String sobrenome){
            Sobrenome = sobrenome; 
        }
        public String getSobrenome(){
            return Sobrenome;
        }

        public void setIdade(int idade){
            Idade = idade;
        }
        public int getIdade(){
            return Idade;
        }

        public void setSalario(int salario){
            Salario = salario;
        }
        public int getSalario(){
            return Salario;
        }

        public void setAltura(int altura){
            Altura = altura;
        }
        public int getAltura(){
            return Altura;
        }

        public void setPalavra(String palavra){
            Palavra = palavra;
        }
        public String getPalavra(){
            return Palavra;
        }


        public void Salvar(){
            
            System.out.println("Escreva o seu nome:");
            Nome = ler.next();
            
            System.out.println("Escreva seu sobrenome:");
            Sobrenome = ler.next();
            
            System.out.println("Escreva sua idade:");
            Idade = ler.nextInt();
            
            System.out.println("Escreva seu salario:");
            Salario = ler.nextInt();
            
            System.out.println("Escreva sua altura:");
            Altura = ler.nextInt();

            System.out.println("Escreva qualquer palavra:");
            Palavra = ler.next();
 
            setNome(Nome);
            setSobrenome(Sobrenome);
            setIdade(Idade);
            setSalario(Salario);
            setAltura(Altura);
        }
 
        public void exibirNome(){
            String Nome = this.getNome();
            String Sobrenome = this.getSobrenome();

            System.out.println(Nome + " " + Sobrenome);
               
        }

        public void converterMaiusculo(){
            String Palavra = this.getPalavra().toUpperCase();

            System.out.println(Palavra);
        }

        public void validarIdade(){
            int Idade = this.getIdade();

            if ( Idade < 18) {
                System.out.println("Menor de idade");
            } 

            if (Idade > 18) {
                System.out.println("Maior de idade");
            }

            if (Idade < 18) {
                System.out.println("Menor de idade");
            } else {
                System.out.println("Maior de idade");
            }
            
        }

        public void validarImpostoDeRenda(){
            int Salario = this.getSalario();

            if (Salario <= 1903.98) {
                System.out.println("isento");
            } else if (Salario >= 1903.99 & Salario <= 2826.65) {
                System.out.println("7,50%");
            } else if (Salario >= 2826.66 & Salario <= 3751.05){
                System.out.println("15,00%");
            } else if (Salario >= 3751.06 & Salario <= 4664.68){
                System.out.println("22,50%");
            } else if (Salario >= 4664.69 & Salario > 4664.68){
                System.out.println("27,50%");
            }
        }

        public void salarioComIR(){
            double Salario = this.getSalario();
            double Desconto = 0;
            if (Salario >= 1903.99 & Salario <= 2826.65) {
                Desconto = (Salario * 7.5) / 100;
                Salario = Salario - Desconto;
                System.out.println("Salario com desconto do IR: " + Salario);
            } else if (Salario >= 2826.66 & Salario <= 3751.05) {
                Desconto = (Salario * 15.0) / 100;
                Salario = Salario - Desconto;
                System.out.println("Salario com desconto do IR: " + Salario);
            } else if (Salario >= 3751.06 & Salario <= 4664.68){
                Desconto = (Salario * 22.5) / 100;
                Salario = Salario - Desconto;
                System.out.println("Salario com desconto do IR: " + Salario);
            } else if (Salario >= 4664.69 & Salario > 4664.68){
                Desconto = (Salario * 27.5) / 100;
                Salario = Salario - Desconto;
                System.out.println("Salario com desconto do IR: " + Salario);
            }
        }
        public static void main(String[] args) throws Exception {
            
            App pessoa = new App();

            pessoa.Salvar();
            pessoa.exibirNome();
            pessoa.converterMaiusculo();
            pessoa.validarIdade();
            pessoa.validarImpostoDeRenda();
            pessoa.salarioComIR();

        }
}
