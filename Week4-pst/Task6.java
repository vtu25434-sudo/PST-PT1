import java.util.*;

class Task6 {


    static class CategoryInfo {
        int totalSales = 0;
        int maxSale = 0;
        String maxItem = "";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

    
        System.out.print("Enter number of sales records: ");
        int N = sc.nextInt();

        
        LinkedHashMap<String, CategoryInfo> map = new LinkedHashMap<>();

        System.out.println("Enter sales details (category itemName amount):");

    
        for (int i = 0; i < N; i++) {
            String category = sc.next();
            String item = sc.next();
            int amount = sc.nextInt();

        
            if (!map.containsKey(category)) {
                map.put(category, new CategoryInfo());
            }

            CategoryInfo info = map.get(category);

        
            info.totalSales += amount;

        
            if (amount > info.maxSale) {
                info.maxSale = amount;
                info.maxItem = item;
            }
        }
        System.out.println("\nOutput:");
        for (Map.Entry<String, CategoryInfo> entry : map.entrySet()) {
            CategoryInfo info = entry.getValue();
            System.out.println(entry.getKey() + " " + info.totalSales + " " + info.maxItem);
        }

        sc.close();
    }
}
