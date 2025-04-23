package javaviradonojiraya.javacore.Ycolecoes.test;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        //Em maz ele se orienta por meio de chave-valor, e não podem haver chaves duplicadas, e no caso deo HashMap, ele
        // se orienta e organiza as chaves pelo hash (sendo necessário a implementação do .equals e .compareTo
        Map<String, String> map = new HashMap<>();
        //Da mesma forma do HashSet, caso queira manter a ordem de inserção das chaves-valores, basta usar LinkedHashMap
        map.put("teklado", "teclado");
        map.put("imbigo", "umbigo");
        map.put("trusse", "trouxe");
        map.put("vc", "você");
        map.put("galfo", "garfo");
        map.put("galfo", "garfo2");
        /*Diferente do set, no Map caso use a mesma chave, o valor é sobrescrito e o valor anterior perdido, para evitar
        isso, existe o putIfAbsent, que escreve apenas se não houve um valor associado a chave;
         */
        map.putIfAbsent("galfo", "garfo3");

        System.out.println(map);

        //Formas de percorrer um map, Via chaves:
        System.out.println("-----------");
        for (String key : map.keySet()) {
            System.out.println("Chave: " + key + " Valor -> " + map.get(key)); //nesse caso, com a chave, eu consegui pegar o valor também
        }

        //Formas de percorrer o Map, via Valor:
        System.out.println("-----------");
        for (String value : map.values()) {
            System.out.println(value);
        }

        //Forma usando Map.Entry:
        System.out.println("--------------------");
        for(Map.Entry<String, String> entry: map.entrySet()){
            System.out.println(entry.getKey() +" - "+ entry.getValue());
        }
    }
}
