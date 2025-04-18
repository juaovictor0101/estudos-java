package javaviradonojiraya.javacore.ZZHpadroesdeprojeto.test;

import javaviradonojiraya.javacore.ZZHpadroesdeprojeto.domain.Country;
import javaviradonojiraya.javacore.ZZHpadroesdeprojeto.domain.Currency;
import javaviradonojiraya.javacore.ZZHpadroesdeprojeto.domain.CurrencyFactory;

public class FactoryTest01 {
    public static void main(String[] args) {
        Currency currency = new CurrencyFactory().newCurrency(Country.BRAZIL);
        System.out.println(currency.getSymbol());
    }
}
