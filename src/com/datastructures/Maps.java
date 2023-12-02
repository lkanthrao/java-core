package com.datastructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

public class Maps {
	@SuppressWarnings({ "rawtypes", "unchecked", "unused" })
	public static void main(String[] args) {
		HashMap<String, String> hMap = new HashMap<String, String>();
		hMap.put("knth", "Roa");
		hMap.put("1", "2");
		hMap.put(null, null);
		hMap.put("1", "21");
		hMap.put("1", "21");
		hMap.put("1", "21");


		ConcurrentHashMap chMpa = new ConcurrentHashMap();
		chMpa.put("1", "a");
		chMpa.put("1", "b");
		chMpa.put("1", "b");
		try {
			chMpa.put(null, "c");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			chMpa.put(1, null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		Collections.synchronizedMap(hMap);
		Hashtable<String, String> hTable = new Hashtable<String, String>();
		hTable.put("1", "a");
		hTable.put("1", "b");
		try {
			hTable.put(null, "c");
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			hTable.put("1", null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		hTable.put("knth", "Roa");
		hTable.put("1", "2");
		hTable.put("1", "21");
		
		Vector<String> vector = new Vector<String>();
		Vector<String> vectorSize = new Vector<String>(10);
		vectorSize.setSize(10);
		Enumeration<String> enumLi = vectorSize.elements();
		
		ArrayList<String> arrayList = new ArrayList<String>();
		ArrayList<String> arrayListSize = new ArrayList<String>(10);
		Iterator itr =  arrayList.iterator();
		ListIterator itrList =  arrayList.listIterator();
		
		
		
		
	}
}
