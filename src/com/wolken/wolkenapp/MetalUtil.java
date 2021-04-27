package com.wolken.wolkenapp;

public class MetalUtil {
	public static void main(String[] args) {
		MetalsDTO dto = new MetalsDTO();
		dto.setMetalId(65);
		dto.setMetalName("copper");
		dto.setProperty("conductivity");
		
		MetalsDTO dto1 = new MetalsDTO();
		dto1.setMetalId(45);
		dto1.setMetalName("Iron");
		dto1.setProperty("ductile");
		
		System.out.println("The metal details"+dto);
		System.out.println("The metal details"+dto1);
		System.out.println(dto);
		System.out.println(dto.hashcode());
		System.out.println(dto.hashcode());
		System.out.println(dto.equals(dto1));
		
		
		
	}

}
