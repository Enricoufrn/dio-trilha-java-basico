import java.math.BigDecimal;
import java.math.RoundingMode;

public class Conta {
    private Integer numero;
    private String agencia;
    private String nomeCliente;
    private BigDecimal saldo;

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public BigDecimal getSaldo() {
        return saldo.setScale(2, RoundingMode.HALF_UP);
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }
}
