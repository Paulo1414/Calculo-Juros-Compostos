package servlets;

public class Utils {
	//classe utilizada para calcular juros compostos
public static double calculateCompoundingInterest(double principal, double interest, int years, int compoundingPeriod){
	//Math.round diminui as casas decimais do valor, Math.pow calcula um número (base) elevado à potência de outro número (expoente). assim a conta fica (valor principal vezes 1 + juros compostos dividido pelo periodo de capitalização elevado ao periodo de capitalização vezes os anos
	return Math.round(principal * Math.pow(1 +(interest / compoundingPeriod),(compoundingPeriod * years)));
}
}
