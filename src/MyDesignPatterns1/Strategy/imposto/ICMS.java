package MyDesignPatterns1.Strategy.imposto;

import java.math.BigDecimal;

import MyDesignPatterns1.Strategy.orcamento.Orcamento;

public class ICMS implements IImposto {

	
	public BigDecimal calcular(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.1"));
	}
}
