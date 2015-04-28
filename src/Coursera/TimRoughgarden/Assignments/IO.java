package Coursera.TimRoughgarden.Assignments;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
 *  @author : Ganesh Satpute
 *  @date   : 2/3/2015  9:46 PM
 *
 */
public class IO {

    public static List<List<Integer>> readSpaceSeparatedMatrix(String fileName) {
        List<List<Integer>> matrix = new ArrayList<List<Integer>>();
        BufferedReader reader = null;
        try {
            File file = new File(fileName);
            if(file.exists()) {
                reader = new BufferedReader(new FileReader(file));
                // read the data
                String line;
                while ((line = reader.readLine() ) != null) {
                    String[] integers = line.split("\t");
                    List<Integer> row = new ArrayList<Integer>();
                    // Parse each number
                    for(String number : integers) {
                        row.add(Integer.parseInt(number));
                    }
                    // Add row in main matrix
                    matrix.add(row);
                }
            }
            else {
                System.out.println("File InetegerArray.txt is not present in " + System.getProperty("user.dir") + fileName);
            }
        }
        catch (Exception ex) { // Catching generic exceptions, wrong but okay here!{
            System.out.println("Some exception occurred " + ex.getMessage());
        }
        finally {
            try {
                if(reader != null)
                    reader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return matrix;
    }
    public static int[] readSpaceSeparatedValues(String fileName) {
        List<Integer> input = new ArrayList<Integer>();
        BufferedReader reader = null;
        try {
            File file = new File(fileName);
            if(file.exists()) {
                reader = new BufferedReader(new FileReader(file));
                String line;
                while((line = reader.readLine()) != null) {
                    input.add(Integer.parseInt(line));
                }
            }
            else {
                System.out.println("File InetegerArray.txt is not present in " + System.getProperty("user.dir") + fileName);
            }
        }
        catch (Exception ex) { // Catching generic exceptions, wrong but okay here!{
            System.out.println("Some exception occurred " + ex.getMessage());
        }
        finally {
            try {
                if(reader != null)
                    reader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        int[] inputArray = new int[input.size()];
        for(int i = 0 ; i < input.size() ; i++ ) {
            inputArray[i] = input.get(i);
        }
        return  inputArray;
    }
}
