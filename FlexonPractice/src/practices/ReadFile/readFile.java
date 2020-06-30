package practices.ReadFile;

import java.io.*;
import java.util.*;

public class readFile {

    public static void main(String[] args) {
        try{
            File directory = new File("");
            String courseFile = directory.getCanonicalPath() ;
            String path= courseFile +"\\sample.txt";
            Set<String> set = readFile(path);
            List<String> res = new ArrayList<>(set);
            printList(res);
        } catch (Exception e) {
            System.out.println("Please creat sample.txt in the location where your jar file is.");
        }
    }

    private static void printList(List<String> list) {
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }

    private static Set<String> readFile(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        String line = br.readLine();
        Map<String, Integer> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        while (line != null) {
            String[] words = line.split(" ");
            for (String word : words){
                int count = map.getOrDefault(word, 0)+1;
                map.put(word, count);
                if (count >= 5 && word.length() > 5){
                    String newWord = "";
                    for (int i = word.length() - 1; i >= 0; i--){
                        newWord += word.charAt(i);
                    }
                    set.add(newWord);
                }
            }
            line = br.readLine();
        }
        br.close();
        return set;
    }
}
