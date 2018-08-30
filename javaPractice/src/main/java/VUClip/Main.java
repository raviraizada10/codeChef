package VUClip;/* Save this in a file called Main.java to compile and test it */

/* 
   Example file showing how to write a program that reads
   input from `input.txt` in the current directory
   and writes output to `output.txt` in the current directory
*/

/* Do not add a package declaration */
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.io.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

/* DO NOT CHANGE ANYTHING ABOVE THIS LINE */
/* You may add any imports here, if you wish, but only from the 
   standard library */

/* Do not add a namespace declaration */

public class Main {
    private static Stream<String> Lines;
    private static Map<String, List<Apps>> apiMap = new HashMap<>();
    private static Set<String> appList = new HashSet<>();

    public static void main (String[] args) {
        ArrayList<String> inputData = new ArrayList<String>();
        int numLines = 0;
        try {
            //Scanner in = new Scanner(new BufferedReader(new FileReader("input.txt")));

            /* Here we can read in the input file */
            /* In this example, we're reading all the lines of file
               `input.txt` and then ignoring them. 
               You should modify this part of the
               program to read and process the input as desired */

            Lines = Files.lines(Paths.get("input.txt"));
            Lines.forEach(line -> {
                String[] dataArr = line.split(",");
                if(apiMap.get(dataArr[1])==null){
                    apiMap.put(dataArr[1], new ArrayList<>(Arrays.asList(new Apps(dataArr[0], dataArr[1], dataArr[2]))));
                }
                else{
                    apiMap.get(dataArr[1]).add(new Apps(dataArr[0], dataArr[1], dataArr[2]));
                }
            });
            Comparator<Apps> apiVersionComparator = Comparator.comparing(Apps::getVersion);
            apiMap.entrySet().stream()
                    .filter(appsList -> appsList.getValue().size() > 1)
                    .map(Map.Entry::getValue)
                    .forEach(apiList -> apiList.stream()
                            .sorted(apiVersionComparator.reversed())
                            .filter(api -> !apiList.get(apiList.size() -1).getVersion().equals(api.getVersion()))
                            .map(Apps::getAppName)
                            .forEach(x ->appList.add(x)));

            appList.stream().forEach(System.out::println);
            Files.write(Paths.get("output.txt"), appList);

            /* In this example, we're writing `num_lines` to
               the file `output.txt`.
               You should modify this part of the
               program to write the desired output */
          /*  PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
            output.println("" + numLines);
            output.close();*/
        } catch (IOException e) {
            System.out.println("IO error in input.txt or output.txt");
        }
    }
}
