package com.bakerbeach.market.core.api.model;

import java.math.BigDecimal;
import java.util.Map;

public interface Total {

	String getQualifier();

	BigDecimal getGross();

	BigDecimal getNet();

	BigDecimal getQuantity();

	Map<TaxCode, Line> getLines();

	public interface Line extends Comparable<Line> {

		public BigDecimal getGross();

		void setGross(BigDecimal gross);

		void addGross(BigDecimal summand);

		public BigDecimal getNet();

		void setNet(BigDecimal net);

		public BigDecimal getTax();

		void setTax(BigDecimal tax);

		public TaxCode getTaxCode();

		void setTaxCode(TaxCode taxCode);

		public BigDecimal getTaxPercent();

		void setTaxPercent(BigDecimal taxPercent);

		public BigDecimal getQuantity();

		void setQuantity(BigDecimal quantity);

		public void addQuantity(BigDecimal quantity);

	}
}