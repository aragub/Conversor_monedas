/*
 	   - Convertir de la moneda de tu país a Dólar
       - Convertir de la moneda de tu país  a Euros
       - Convertir de la moneda de tu país  a Libras Esterlinas
       - Convertir de la moneda de tu país  a Yen Japonés
       - Convertir de la moneda de tu país  a Won sur-coreano
       
       - Convertir de Dólar a la moneda de tu país
       - Convertir de Euros a la moneda de tu país
       - Convertir de Libras Esterlinas a la moneda de tu país
       - Convertir de Yen Japonés a la moneda de tu país
       - Convertir de Won sul-coreano a la moneda de tu país
 */

public class Conversor {
	
	private double valor;
	
	public Conversor () {
		
	}
	
	public Conversor(double valor,int item1, int item2) {
		this.valor = valor;
		
	}
	
	public String Convertir(double valor, int item1, int item2) {
		System.out.println("Antes de: " + valor);
		switch (item1) {  // Pesos a:
			case 0:{
				switch (item2) { 
					case 0:{	// Pesos 1 = 1
						this.valor = valor;
						break;
					}
					case 1:{   // Dolar 1 = 0.055
						this.valor = valor * 0.055;
						break;
					}
					case 2:{   // Euro 1 = 0.051
						this.valor = valor * 0.051;
						break;
					}
					case 3:{   // Libra Esterlina 1 = 0.044
						this.valor = valor * 0.044;
						break;
					}
					case 4:{   // Yen Japones 1 = 7.30
						this.valor = valor * 7.30;
						break;
					}
					case 5:{   // won 1 = 72.67
						this.valor = valor * 72.67;
						break;
					}
				}
				System.out.println("Despues de: " + this.valor);
				break;
			}
			case 1:{     // Dolares a:
				switch (item2) { 
					case 0:{	// Pesos 1 = 18.14
						this.valor = valor * 18.14;
						break;
					}
					case 1:{   // Dolar 1 = 1
						this.valor = valor ;
						break;
					}
					case 2:{   // Euro 1 = 0.92
						this.valor = valor * 0.92;
						break;
					}
					case 3:{   // Libra Esterlina 1 = 0.81
						this.valor = valor * 0.81;
						break;
					}
					case 4:{   // Yen Japones 1 = 132.53
						this.valor = valor * 132.53;
						break;
					}
					case 5:{   // won 1 = 1,318.94
						this.valor = valor * 1318.94;
						break;
					}
				}
				System.out.println("Despues de: " + this.valor);
				break;
			}
			case 2:{     // Euro a:
				switch (item2) { 
					case 0:{	// Pesos 1 = 19.79
						this.valor = valor * 19.79;
						break;
					}
					case 1:{   // Dolar 1 = 1.09
						this.valor = valor * 1.09;
						break;
					}
					case 2:{   // Euro 1 = 1
						this.valor = valor;
						break;
					}
					case 3:{   // Libra Esterlina 1 = 0.88
						this.valor = valor * 0.88;
						break;
					}
					case 4:{   // Yen Japones 1 = 144.54
						this.valor = valor * 144.54;
						break;
					}
					case 5:{   // won 1 = 1438.90
						this.valor = valor * 1438.90;
						break;
					}
				}
				System.out.println("Despues de: " + this.valor);
				break;
			}
			case 3:{     // Libra Esterlina a:
				switch (item2) { 
					case 0:{	// Pesos 1 = 22.53
						this.valor = valor * 22.53;
						break;
					}
					case 1:{   // Dolar 1 = 1.24
						this.valor = valor * 1.24;
						break;
					}
					case 2:{   // Euro 1 = 1.14
						this.valor = valor * 1.14;
						break;
					}
					case 3:{   // Libra Esterlina 1 = 1
						this.valor = valor;
						break;
					}
					case 4:{   // Yen Japones 1 = 164.68
						this.valor = valor * 164.68;
						break;
					}
					case 5:{   // won 1 = 1638.30
						this.valor = valor * 1638.30;
						break;
					}
				}
				System.out.println("Despues de: " + this.valor);
				break;
			}
			case 4:{     // Yen Japones a:
				switch (item2) { 
					case 0:{	// Pesos 1 = 0.14
						this.valor = valor * 0.14;
						break;
					}
					case 1:{   // Dolar 1 = 0.0075
						this.valor = valor * 0.0075;
						break;
					}
					case 2:{   // Euro 1 = 0.0069
						this.valor = valor * 0.0069;
						break;
					}
					case 3:{   // Libra Esterlina 1 = 0.0061
						this.valor = valor * 0.0061;
						break;
					}
					case 4:{   // Yen Japones 1 = 1
						this.valor = valor;
						break;
					}
					case 5:{   // won 1 = 9.95
						this.valor = valor * 9.95;
						break;
					}
				}
				System.out.println("Despues de: " + this.valor);
				break;
			}
			case 5:{     // Won Surcoreano a:
				switch (item2) { 
					case 0:{	// Pesos 1 = 0.014
						this.valor = valor * 0.014;
						break;
					}
					case 1:{   // Dolar 1 = 0.00076
						this.valor = valor * 0.00076;
						break;
					}
					case 2:{   // Euro 1 = 0.00070
						this.valor = valor * 0.00070;
						break;
					}
					case 3:{   // Libra Esterlina 1 = 0.00061
						this.valor = valor * 0.00061;
						break;
					}
					case 4:{   // Yen Japones 1 = 0.10
						this.valor = valor * 0.10;
						break;
					}
					case 5:{   // won 1 = 1
						this.valor = valor;
						break;
					}
				}
				System.out.println("Despues de: " + this.valor);
				break;
			}
			
		}
		
	return  String.valueOf(String.format("%.2f", this.valor));
		
	}
	
}
