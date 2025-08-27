package com.itsajs.string;

<<<<<<< HEAD
=======
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

>>>>>>> 9566ee98e9fe27e724e62e9f57264b4c00710efa
public class NonRepeatingCharacter
{
  public static void main(String[] args) 
  {
<<<<<<< HEAD
	
=======
	 String name = "Avadesh Jaiswar";
	 LinkedHashMap<Character, Long> linkedHashMap = name.chars().mapToObj(ch -> (char)ch)
	 .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
  
	 char nonRepeatingCharacter = linkedHashMap.entrySet().stream().filter(m->m.getValue() > 1).map(Map.Entry::getKey)
	 .findFirst().get().charValue();
	 
	 System.out.println("NonRepeatingCharacter : "+nonRepeatingCharacter);
  
>>>>>>> 9566ee98e9fe27e724e62e9f57264b4c00710efa
  }
}
