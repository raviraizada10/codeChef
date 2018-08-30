package CLEANUP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        try {
            StringTokenizer tk = new StringTokenizer(br.readLine());
            int testCases = Integer.parseInt(tk.nextToken());
            while(testCases -- > 0){
                int[] sizeArray = Arrays.stream(br.readLine()
                                                   .trim()
                                                   .split("\\s"))
                                                   .mapToInt(Integer::parseInt)
                                                   .toArray();
                int totalJobs = sizeArray[0];
                int completedJobs = sizeArray[1];
                int remainingJobs = totalJobs - completedJobs;
                int[] jobIndices = IntStream.range(1, totalJobs+1).toArray();
                int[] completedJobsArray = Arrays.stream(br.readLine()
                                                .trim()
                                                .split("\\s"))
                                                .mapToInt(Integer::parseInt)
                                                .toArray();
                if(remainingJobs <= 0 || completedJobsArray.length != completedJobs){
                    System.exit(0);
                }
                Boolean swap = true;
                StringBuilder chefStr = new StringBuilder();
                StringBuilder asstStr = new StringBuilder();

                for(int i = 0; i< completedJobsArray.length; i++){
                    if(completedJobsArray[i] > totalJobs){
                        System.exit(0);
                    }
                    jobIndices[completedJobsArray[i]-1] = 0;
                }

                for (int i = 0; i < jobIndices.length ; i++) {
                    if(jobIndices[i] != 0 ){
                        if(swap){
                            chefStr.append(jobIndices[i]).append(" ");
                            swap = false;
                        }
                        else{
                            asstStr.append(jobIndices[i]).append(" ");
                            swap = true;
                        }
                    }
                }
                System.out.println(chefStr);
                System.out.println(asstStr);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

// String[] sizeArray = br.readLine().split(" ");