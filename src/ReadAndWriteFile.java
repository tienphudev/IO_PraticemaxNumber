import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readFile(String filePart){
        List<Integer> numbers = new ArrayList<>();
        try {
            File file = new File(filePart);
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = bufferedReader.readLine())!=null){
                numbers.add(Integer.parseInt(line));
            }
            bufferedReader.close();
        }catch (IOException e){
            System.out.println(e);
        }
        return numbers;
    }
    public void writeFile(String filePart, int max){
        try {
            FileWriter fileWriter = new FileWriter(filePart, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("giá trị lớn nhất là: " + max);
            bufferedWriter.close();
        }catch (IOException e){
           e.printStackTrace();
        }

    }

}
