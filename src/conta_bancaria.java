import java.util.*;

interface Cliente {
    String getNome();
    String getCPF();
}

class PessoaFisica implements Cliente {
    private String nome;
    private String cpf;

    public PessoaFisica(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return cpf;
    }
}

class Conta {
    private String agencia;
    private String numeroConta;
    private int senha;
    private Cliente cliente;
    private double saldo;

// Construtores, getters e setters
// Implementar validações e outras funcionalidades necessárias
}

interface OperacoesBancarias {
    void cadastrarCliente();
    void cadastrarContaCorrente();
    void cadastrarContaPoupanca();
    void efetuarDeposito();
    void efetuarSaque();
    void efetuarTransferencia();
}

class Banco implements OperacoesBancarias {
    private Map<String, Cliente> clientes;
    private List<Conta> contas;
    private Scanner scanner;

    public Banco() {
        clientes = new HashMap<>();
        contas = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void cadastrarCliente() {
// Implementar
    }

    public void cadastrarContaCorrente() {
// Implementar
    }

    public void cadastrarContaPoupanca() {
// Implementar
    }

    public void efetuarDeposito() {
// Implementar


    }

    public void efetuarSaque() {
// Implementar
    }

    public void efetuarTransferencia() {
// Implementar
    }

    public static void main(String[] args) {
        Banco banco = new Banco();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Cadastrar Conta Corrente");
            System.out.println("3. Cadastrar Conta Poupança");
            System.out.println("4. Efetuar Depósito");
            System.out.println("5. Efetuar Saque");
            System.out.println("6. Efetuar Transferência");
            System.out.println("7. Sair");
            System.out.print("Escolha a opção: ");

            int opcao = banco.scanner.nextInt();
            banco.scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    banco.cadastrarCliente();
                    break;
                case 2:
                    banco.cadastrarContaCorrente();
                    break;
                case 3:
                    banco.cadastrarContaPoupanca();
                    break;
                case 4:
                    banco.efetuarDeposito();
                    break;
                case 5:
                    banco.efetuarSaque();
                    break;
                case 6:
                    banco.efetuarTransferencia();
                    break;
                case 7:
                    System.out.println("Saindo do sistema.");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
