package Others.java.objetos;

import java.math.BigDecimal;
import java.util.Objects;

public class ContaCorrente {
	private String banco;
	private String agencia;
	private String numero;
	private BigDecimal saldo;
	private Correntista correntista;
	
	public ContaCorrente(String banco, String agencia, String numero, Correntista correntista) {
		this();
		this.banco = banco;
		this.agencia = agencia;
		this.numero = numero;
		this.correntista = correntista;
	}
	
	public ContaCorrente() {
		this.saldo = BigDecimal.ZERO;
	}

    public boolean identificadaPor(String banco, String agencia, String numero) {
        return this.banco.equals(banco)
            && this.agencia.equals(agencia)
            && this.numero.equals(numero);
    }
    
    public String getBanco() {
    	return banco;
    }
    
    public String getAgencia() {
    	return agencia;
    }
    
    public String getNumero() {
    	return numero;
    }

	@Override
	public int hashCode() {
		return Objects.hash(agencia, banco, numero);
	}
	
	public boolean identificadorPor(String banco, String agencia, String numero) {
		return this.banco.equals(banco) 
				&& this.agencia.equals(agencia)
				&& this.numero.equals(numero);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContaCorrente other = (ContaCorrente) obj;
		return Objects.equals(agencia, other.agencia) && Objects.equals(banco, other.banco)
				&& Objects.equals(numero, other.numero);
	}

	@Override
	public String toString() {
		return "ContaCorrente [banco=" + banco + ", agencia=" + agencia + ", numero=" + numero + ", saldo=" + saldo
				+ ", correntista=" + correntista + "]";
	}
    
    
	
}
