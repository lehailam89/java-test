import java.util.*;

public class StudentManagement {
    public static void main(String[] args) {
        LinkedHashMap<String, Float> studentMap = new LinkedHashMap<>();
        studentMap.put("Nguyễn Văn A", 8.5f);
        studentMap.put("Anh Văn A", 7.2f);
        studentMap.put("Lê Văn C", 9.0f);

        // Sắp xếp theo tên, nếu trùng tên thì sắp theo họ
        studentMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}
