package CursoNelioAlves.Files.Exercicio;

public class Produto {
    private String name;
    private Double value;
    private Integer Unidade;

    public Produto(String name, Double value, Integer unidade) {
        this.name = name;
        this.value = value;
        Unidade = unidade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Integer getUnidade() {
        return Unidade;
    }

    public void setUnidade(Integer unidade) {
        Unidade = unidade;
    }

    public double Total(){
        return value * getUnidade();
    }
}
