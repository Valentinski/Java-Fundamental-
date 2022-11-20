package AssociativeArraysLambdaAndStreamApiExercise;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, List<String >> companyLIst = new LinkedHashMap<>();
        while (!input.equals("End")){
            String company = input.split(" -> ")[0];
            String id = input.split(" -> ")[1];

            if(!companyLIst.containsKey(company)){
                companyLIst.put(company, new ArrayList<>());
                companyLIst.get(company).add(id);

            }else {
                List<String> idsInCompany = companyLIst.get(company);
                if(isThereId(idsInCompany, id)){
                    companyLIst.get(company).add(id);
                }
            }



            input = scanner.nextLine();
        }
        companyLIst.entrySet()
                .forEach(entry -> {
                    //key: име на курса
                    //value: списък с хората
                    //име на курса -> бр. хората
                    System.out.println(entry.getKey());

                    entry.getValue().forEach(studentName-> System.out.println("-- " + studentName));
                    //ascending order / нарастващ ред
                });
    }
    public static boolean isThereId (List<String> ids, String id ){
        if(ids.contains(id)){
            return false;
        }else {
            return true;
        }
    }

}
