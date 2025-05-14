public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1000);

        System.out.println("Livro: " + livro.getTitulo() + " por " + livro.getAutor());
        System.out.println("Progresso inicial: " + livro.progresso() + "%");

        livro.ler(150);
        System.out.println("Páginas lidas: " + livro.getPaginasLidas());
        System.out.println("Progresso: " + livro.progresso() + "%");

        livro.ler(900); 
        System.out.println("Páginas lidas: " + livro.getPaginasLidas());
        System.out.println("Progresso final: " + livro.progresso() + "%");
    }
}
//exer1
public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 25);
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());

        pessoa.setIdade(-5); 
        pessoa.setNome("Maria");
        pessoa.setIdade(30);

        System.out.println("Novo nome: " + pessoa.getNome());
        System.out.println("Nova idade: " + pessoa.getIdade());
    }
}
//exer2
public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Camiseta", 49.90);
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: R$ " + produto.getPreco());

        produto.setPreco(-10); 
        produto.setPreco(59.90); 

        System.out.println("Novo preço: R$ " + produto.getPreco());
    }
}
//exerc3
public class Main {
    public static void main(String[] args) {
        Termometro t = new Termometro(25.0);
        System.out.println("Temperatura atual: " + t.getTemperatura() + " °C");

        t.setTemperatura(-300); 
        t.setTemperatura(-100); 

        System.out.println("Temperatura atualizada: " + t.getTemperatura() + " °C");
    }
}
//exer4
public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Ana", 7.5);

        System.out.println("Aluno: " + aluno.getNome());
        System.out.println("Nota: " + aluno.getNota());
        System.out.println("Aprovado? " + aluno.aprovado());

        aluno.setNota(11); 
        aluno.setNota(5.5); 
        System.out.println("Nova nota: " + aluno.getNota());
        System.out.println("Aprovado? " + aluno.aprovado());
    }
}
//exer5
public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Fusca");

        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Velocidade inicial: " + carro.getVelocidade() + " km/h");

        carro.acelerar(50);
        System.out.println("Velocidade após acelerar: " + carro.getVelocidade() + " km/h");

        carro.frear(20);
        System.out.println("Velocidade após frear: " + carro.getVelocidade() + " km/h");

        carro.frear(40); 
        System.out.println("Velocidade final: " + carro.getVelocidade() + " km/h");
    }
}