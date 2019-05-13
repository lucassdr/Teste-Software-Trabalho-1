package br.com.lucassdr.CalculadoraIMC;

import java.util.Scanner;

public class CalculadoraIMC {

	public static void main(String[] args) {
		System.out.println("Hello World");

		float altura;
		float peso;
		float resultadoIMC;
		int idade;
		String sexo;
		String gravida = null;
		boolean gravidaBoolean;
		Scanner ler = new Scanner(System.in);

		// TODO leitura da idade
		System.out.println("Digite a idade");
		idade = ler.nextInt();

		System.out.println("Digite a altura. Ex.: 1,78");
		altura = ler.nextFloat();

		System.out.println("Digite a altura. Ex.: 72");
		peso = ler.nextFloat();

		System.out.println("Digite o sexo. F para Feminino | M para Masculino");
		sexo = ler.next();

		if (sexo.equals("F")) {
			System.out.println("Está grávida? | S para SIM | N para NÃO");
			gravida = ler.next().toUpperCase();
			if(gravida.equals("S")) {
				gravidaBoolean = true;
			}
		}

		// calculo do IMC
		resultadoIMC = (peso) / (altura * altura);
		
		// Caso esteja grávida, os cálculos abaixos serão realizados.
		if (gravidaBoolean = true && sexo.equals("F") ) {
			if (resultadoIMC < 18.5) {
				System.out.println("Seu IMC é: " + resultadoIMC);
				System.out.println(
						"IMC menor que 18,5 kg/m2 (baixo peso) -> Ganho de peso gestacional desejado entre 12.5 e 18.0 kg.");
			} else if (resultadoIMC >= 18.5 && resultadoIMC <= 24.9) {
				System.out.println("Seu IMC é: " + resultadoIMC);
				System.out.println(
						"IMC entre 18.5 e 24.9 kg/m2 (peso normal) → ganho de peso gestacional desejado entre 11.5 e 16.0 kg.");
			} else if (resultadoIMC >= 25.0 && resultadoIMC <= 29.9) {
				System.out.println("Seu IMC é: " + resultadoIMC);
				System.out.println(
						"IMC entre 25.0 e 29.9 kg/m2 (sobrepeso) → ganho de peso gestacional desejado entre 7.0 e 11.5 kg.");
			} else if (resultadoIMC >= 25.0 && resultadoIMC <= 29.9) {
				System.out.println("Seu IMC é: " + resultadoIMC);
				System.out.println(
						"IMC maior que 30.0 kg/m2 (obesidade) → ganho de peso gestacional desejado entre 5.0 e 9.0 kg.");
			}
		}

		if ((idade >= 18 && idade < 65) && (gravidaBoolean = false )) {

			if (resultadoIMC < 16) {
				System.out.println("Seu IMC é: " + resultadoIMC);
				System.out.println("Baixo peso muito grave = abaixo de 16 kg/m².");
			} else if (resultadoIMC >= 16 && resultadoIMC <= 16.99) {
				System.out.println("Seu IMC é: " + resultadoIMC);
				System.out.println("Baixo peso grave = entre 16 e 16,99 kg/m².");
			} else if (resultadoIMC >= 17 && resultadoIMC <= 18.49) {
				System.out.println("Seu IMC é: " + resultadoIMC);
				System.out.println("Baixo peso = entre 17 e 18,49 kg/m².");
			} else if (resultadoIMC >= 18.50 && resultadoIMC <= 24.99) {
				System.out.println("Seu IMC é: " + resultadoIMC);
				System.out.println("Peso normal = entre 18,50 e 24,99 kg/m².");
			} else if (resultadoIMC >= 25 && resultadoIMC <= 29.99) {
				System.out.println("Seu IMC é: " + resultadoIMC);
				System.out.println("Sobrepeso = entre 25 e 29,99 kg/m2.");
			} else if (resultadoIMC >= 30 && resultadoIMC <= 34.99) {
				System.out.println("Seu IMC é: " + resultadoIMC);
				System.out.println("Obesidade grau I = entre 30 e 34,99 kg/m².");
			} else if (resultadoIMC >= 35 && resultadoIMC <= 39.99) {
				System.out.println("Seu IMC é: " + resultadoIMC);
				System.out.println("Obesidade grau II = entre 35 e 39,99 kg/m²");
			} else if (resultadoIMC >= 40) {
				System.out.println("Seu IMC é: " + resultadoIMC);
				System.out.println("Obesidade grau III (obesidade mórbida) = maior que 40 kg/m2");
			}
		}

		if (idade >= 65 && sexo.equals("F")) {
			if (resultadoIMC < 21.9) {
				System.out.println("Seu IMC é: " + resultadoIMC);
				System.out.println("Baixo peso = abaixo de 21,9 kg/m².");
			} else if (resultadoIMC >= 22 && resultadoIMC <= 27) {
				System.out.println("Seu IMC é: " + resultadoIMC);
				System.out.println("Peso normal = entre 22 e 27 kg/m².");
			} else if (resultadoIMC >= 27.1 && resultadoIMC <= 32) {
				System.out.println("Seu IMC é: " + resultadoIMC);
				System.out.println("Sobrepeso = entre 27,1 e 32 kg/m²");
			} else if (resultadoIMC >= 32.1 && resultadoIMC <= 37) {
				System.out.println("Seu IMC é: " + resultadoIMC);
				System.out.println("Obesidade grau I =  entre 32,1 e 37 kg/m².");
			} else if (resultadoIMC >= 37.1 && resultadoIMC <= 41.9) {
				System.out.println("Seu IMC é: " + resultadoIMC);
				System.out.println("Obesidade grau II = entre 37,1 e 41,9 kg/m²");
			} else if (resultadoIMC >= 42) {
				System.out.println("Seu IMC é: " + resultadoIMC);
				System.out.println("Obesidade grau III (obesidade mórbida) = maior que 42 kg/m².");
			}

		} else if (idade >= 65 && sexo.equals("M")) {
			if (resultadoIMC < 21.9) {
				System.out.println("Seu IMC é: " + resultadoIMC);
				System.out.println("Baixo peso = abaixo de 21,9 kg/m².");
			} else if (resultadoIMC >= 22 && resultadoIMC <= 27) {
				System.out.println("Seu IMC é: " + resultadoIMC);
				System.out.println("Peso normal = entre 22 e 27 kg/m².");
			} else if (resultadoIMC >= 27.1 && resultadoIMC <= 30) {
				System.out.println("Seu IMC é: " + resultadoIMC);
				System.out.println("Sobrepeso = entre 27,1 e 30 kg/m²");
			} else if (resultadoIMC >= 30.1 && resultadoIMC <= 35) {
				System.out.println("Seu IMC é: " + resultadoIMC);
				System.out.println("Obesidade grau I =  entre 30,1 e 35 kg/m².");
			} else if (resultadoIMC >= 35.1 && resultadoIMC <= 39.9) {
				System.out.println("Seu IMC é: " + resultadoIMC);
				System.out.println("Obesidade grau II = entre 35,1 e 39,9 kg/m²");
			} else if (resultadoIMC >= 40) {
				System.out.println("Seu IMC é: " + resultadoIMC);
				System.out.println("Obesidade grau III (obesidade mórbida) = maior que 40 kg/m².");
			}
		}

//		return resultadoIMC;
	}

}
