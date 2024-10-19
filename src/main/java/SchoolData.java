import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SchoolData {

    public static void main(String[] args) {

//        public static ArrayList<SchoolMember> loadSchoolMembers(String filePath) {
//            ArrayList<SchoolMember> members = new ArrayList<>();
//
//            try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
//                String line;
//                br.readLine();
//                while ((line = br.readLine()) != null) {
//                    String[] data = line.split(",");
//                    String type = data[0].trim();
//                    String name = data[1].trim();
//                    int age = Integer.parseInt(data[2].trim());
//
//                    if (type.equalsIgnoreCase("student")) {
//                        members.add(new Student(name, age));
//                    } else if (type.equalsIgnoreCase("teacher")) {
//                        members.add(new Teacher(name, age));
//                    }
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//            return SchoolMember;
//        }




//        String desktopPath = System.getProperty("user.home") + "/Documents";
//
//        String filePath = desktopPath + "/student2.csv";
//
//        List<String> messages = new ArrayList<>();
//
//        try{
//            BufferedReader br = new BufferedReader(new FileReader(filePath));
//            String line;
//
//            while ((line = br.readLine()) != null){
//                messages.add(line);
//            }
//        } catch (IOException e){
//            throw new RuntimeException(e);
//        }
//        String[] messageArray = messages.toArray(new String[0]);
//
//        for(String ms : messageArray){
//            System.out.println(ms);
//        }


        String desktopPath = System.getProperty("user.home") + "/Documents";

        String filePath = desktopPath + "/SchoolApplicationExcel.csv";

        List<String> messages = new ArrayList<>();

        try{
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;

            while ((line = br.readLine()) != null){
                messages.add(line);
            }
        } catch (IOException e){
            throw new RuntimeException(e);
        }
        String[] messageArray = messages.toArray(new String[0]);

        for(String ms : messageArray){
            System.out.println(ms);
        }

    }


}
