package entities;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import entities.enums.NivelTrabalho;

public class Trabalho {
    private String name;
    private NivelTrabalho nivel;
    private Double baseSalarial;

    private Departamento departamento;
    private List<ContratoHoras> contratos = new ArrayList<>();

    public Trabalho(){
    }

    public Trabalho(Double baseSalarial, String name, NivelTrabalho nivel, Departamento departamento) {
        this.baseSalarial = baseSalarial;
        this.name = name;
        this.nivel = nivel;
        this.departamento = departamento;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NivelTrabalho getNivel() {
        return nivel;
    }

    public void setNivel(NivelTrabalho nivel) {
        this.nivel = nivel;
    }

    public Double getBaseSalarial() {
        return baseSalarial;
    }

    public void setBaseSalarial(Double baseSalarial) {
        this.baseSalarial = baseSalarial;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<ContratoHoras> getContratoHoras() {
        return contratos;
    }

    public void AdicionarContrato(ContratoHoras contrato){
        contratos.add(contrato);
    }

    public void RemoverContrato (ContratoHoras contrato){
        contratos.remove(contrato);
    }

    public void Income (int ano, int mes) {
        double soma = baseSalarial;
        Calendar cal = Calendar.getInstance();
        for (ContratoHoras c : contratos){
            cal.setTime(c.getData());
            int c_ano = cal.get(Calendar.YEAR);
            int c_mes = 1 + cal.get(Calendar.MONTH);
            if (ano == c_ano && mes == c_mes){
                soma += c.ValorTotal();
            }
        }
    }
}


