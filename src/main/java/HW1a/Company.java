package HW1a;

public class Company {

    public int findName(String name, Employee[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (name.equals(arr[i].getName())){
                return 1;
            }
        }
        return -1;
    }

    public int findSubName(String subName, Employee[] arr){
        for (int i = 0; i < arr.length; i++){
            if (arr[i].getName().contains(subName)){
                return 1;
            }
        }
        return -1;
    }

    public int totalSalary(Employee[] arr){
        int result = 0;
        for (int i = 0; i < arr.length; i++){
            result += arr[i].getBaseSalary();
        }
        return result;
    }

    public int minSalary(Employee[] arr){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++){
            if (min > arr[i].getBaseSalary()) {
                min = arr[i].getBaseSalary();
            }
        }
        return min;
    }

    public int maxSalary(Employee[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++){
            if (max < arr[i].getBaseSalary()) {
                max = arr[i].getBaseSalary();
            }
        }
        return max;
    }



}
