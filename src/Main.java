import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final int LIMITE_CACHE = 10;

    public static void main(String[] args) {

        List<Pessoa> banco = new ArrayList<>();
        banco.add(new Pessoa(1313, "Jennyfer", 24));
        banco.add(new Pessoa(1314, "Ester", 17));
        banco.add(new Pessoa(1315, "Kimberli", 19));
        banco.add(new Pessoa(1316, "Sthefany", 18));
        banco.add(new Pessoa(1317, "Karolzinha", 15));

        List<Pessoa> cache = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            IO.println("\nDigite o ID da pessoa que deseja buscar (ou 0 para sair): ");
            int idBuscado = scanner.nextInt();

            if (idBuscado == 0) {
                IO.println("Saindo do programa...");
                break;
            }

            Pessoa pessoaEncontrada = null;
            for (Pessoa p : cache) {
                if (p.getId() == idBuscado) {
                    pessoaEncontrada = p;
                    break;
                }
            }

            if (pessoaEncontrada != null) {
                IO.println("Pessoa encontrada no cache: " + pessoaEncontrada);
                continue;
            }

            for (Pessoa p : banco) {
                if (p.getId() == idBuscado) {
                    pessoaEncontrada = p;
                    break;
                }
            }

            if (pessoaEncontrada != null) {

                if (cache.size() >= LIMITE_CACHE) {
                    cache.remove(0);
                }
                cache.add(pessoaEncontrada);
                IO.println("Pessoa buscada no banco e adicionada ao cache: " + pessoaEncontrada);
            } else {
                IO.println("Pessoa com ID " + idBuscado + " não foi encontrada no banco.");
            }
        }
        scanner.close();
    }
}























