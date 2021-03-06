package br.com.senai.guiVitoriano.application.listas;

import java.util.ArrayList;
import java.util.List;

import br.com.senai.guiVitoriano.application.model.Estado;
import br.com.senai.guiVitoriano.application.model.Interesses;


public class ListasObjeto {
	
		public static final List<Estado> ESTADOS;
		public static final List<Interesses> INTERESSES;
	
	static {
		ESTADOS = new ArrayList<>();
		
		ESTADOS.add(new Estado("AC","Acre"));
		ESTADOS.add(new Estado("AL","Alagoas"));
		ESTADOS.add(new Estado("AP","Amap?"));
		ESTADOS.add(new Estado("AM","Amazonas"));
		ESTADOS.add(new Estado("BA","Bahia"));
		ESTADOS.add(new Estado("CE","Cear?"));
		ESTADOS.add(new Estado("DF","Distrito Federal"));
		ESTADOS.add(new Estado("ES","Esp?rito Santo"));
		ESTADOS.add(new Estado("GO","Goi?s"));
		ESTADOS.add(new Estado("MA","Maranh?o"));
		ESTADOS.add(new Estado("MT","Mato Grosso"));
		ESTADOS.add(new Estado("MS","Mato Grosso do Sul"));
		ESTADOS.add(new Estado("MG","Minas Gerais"));
		ESTADOS.add(new Estado("PA","Par?"));
		ESTADOS.add(new Estado("PB","Para?ba"));
		ESTADOS.add(new Estado("PR","Paran?"));
		ESTADOS.add(new Estado("PE","Pernambuco"));
		ESTADOS.add(new Estado("PI","Piau?"));
		ESTADOS.add(new Estado("RJ","Rio de Janeiro"));
		ESTADOS.add(new Estado("RN","Rio Grande do Norte"));
		ESTADOS.add(new Estado("RS","Rio Grande do Sul "));
		ESTADOS.add(new Estado("RO","Rond?nia"));
		ESTADOS.add(new Estado("RR","Roraima"));
		ESTADOS.add(new Estado("SC","Santa Catarina"));
		ESTADOS.add(new Estado("SP","S?o Paulo"));
		ESTADOS.add(new Estado("SE","Sergipe"));
		ESTADOS.add(new Estado("TO","Tocantins"));
		
	
		
	}
	
	static {
		
		INTERESSES = new ArrayList<>();
		INTERESSES.add(new Interesses(1,"Esportes"));
		INTERESSES.add(new Interesses(2,"M?sica"));
		INTERESSES.add(new Interesses(3,"Artes Marciais"));
		INTERESSES.add(new Interesses(4,"Viagens"));
		INTERESSES.add(new Interesses(5,"Cinema"));
		INTERESSES.add(new Interesses(6,"Dan?a"));
	}
		

	
}
