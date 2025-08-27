package com.itsajs.string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatingCharacter
{
  public static void main(String[] args) 
  {
	 String name = "Avadesh Jaiswar";
	 LinkedHashMap<Character, Long> linkedHashMap = name.chars().mapToObj(ch -> (char)ch)
	 .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
  
	 char nonRepeatingCharacter = linkedHashMap.entrySet().stream().filter(m->m.getValue() > 1).map(Map.Entry::getKey)
	 .findFirst().get().charValue();
	 
	 System.out.println("NonRepeatingCharacter : "+nonRepeatingCharacter);
  
  }
}
