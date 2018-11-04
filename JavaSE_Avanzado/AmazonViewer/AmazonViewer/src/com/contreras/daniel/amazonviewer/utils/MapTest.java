package com.contreras.daniel.amazonviewer.utils;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		Map<Integer, String> treeMap = new TreeMap<Integer, String>();
		Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		
		map.put(1, "Texto 1");
		map.put(2, "Texto 2");
		map.put(3, "Texto 3");
		map.put(4, "Texto 4");
		map.put(5, "Texto 5");
		
		treeMap.put(1, "Texto 1");
		treeMap.put(2, "Texto 2");
		treeMap.put(3, "Texto 3");
		treeMap.put(4, "Texto 4");
		treeMap.put(5, "Texto 5");
		
		linkedHashMap.put(1, "Texto 1");
		linkedHashMap.put(2, "Texto 2");
		linkedHashMap.put(3, "Texto 3");
		linkedHashMap.put(4, "Texto 4");
		linkedHashMap.put(5, "Texto 5");
		
		// Se usa un iterador para recorrer el mapa.
		Iterator iterator = map.keySet().iterator();
		Iterator iterator2 = treeMap.keySet().iterator();
		Iterator iterator3 = linkedHashMap.keySet().iterator();
		
		while(iterator.hasNext()) {
			Integer key = (Integer) iterator.next();
			System.out.println("Clave: " + key + " -> Valor: " + map.get(key));
		}
		
		while(iterator2.hasNext()){
			Integer key = (Integer) iterator2.next();
			System.out.println("Clave: " + key + " -> Valor: " + linkedHashMap.get(key));
		}
		
		while(iterator3.hasNext()){
			Integer key = (Integer) iterator3.next();
			System.out.println("Clave: " + key + " -> Valor: " + treeMap.get(key));
		}
		
		//Manera de recorrer el map con el metodo foreach y lambdas.
		//map.forEach((k,v) -> System.out.println("Clave: " + k + " -> Valor: " + v));
		
	}
	
	
}
