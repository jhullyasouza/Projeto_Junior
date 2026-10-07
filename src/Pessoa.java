public class Pessoa {

    private int Id;
    private String Nome;
    private int Idade;

    public Pessoa(int Id, String Nome, int Idade) {
        this.Id = Id;
        this.Nome = Nome;
        this.Idade = Idade;
    }

    public Pessoa() {

    }

    public int getId() {
        return Id;
    }

    public String getNome() {
        return Nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + Id +
                ", nome='" + Nome + '\'' +
                ", idade=" + Idade +
                '}';
    }
}
