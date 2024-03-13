package com.taskfive;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Question1 {

		public static void main(String[] args) {


			Stream<String> names = Stream.of("abc","d","ef");
			
			List<String> uppercase =  names.map(String::toUpperCase)//to convert to upper case using method reference
					.collect(Collectors.toList());
			
			System.out.println(uppercase);	
		}

	}


/*
 -------------output--------------
 
 [ABC, D, EF]
 
 */