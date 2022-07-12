public class BinarSurh {
    public static void main(String[] args) {
        int[] mass={2,45,67,68,70,75,89,99,123,137,165,198,232,412,432,456,476,489};
        int item=412;
        binarSurch(mass,0,mass.length-1,item);
    }
    public static void binarSurch(int[] foundMass ,int first,int last,int vuleuFound){
        int mid;
        int firstFound=first;
        int lastFound=last;
        int count = 0;
        while (firstFound<lastFound) {
            System.out.println(count++);
            mid=(firstFound+lastFound)/2;
            if (foundMass[mid] > vuleuFound) {
             lastFound=mid-1;


            }
            if(foundMass[mid]<vuleuFound){
                firstFound=mid+1;
            }
            if(foundMass[mid]==vuleuFound){
                System.out.println(mid);
                System.exit(0);
            }
            if(firstFound==lastFound&& foundMass[firstFound]==vuleuFound ){
                System.out.println(firstFound);
                System.exit(0);
            }



        }
        System.out.println("Значения не существует в массиве");

    }
}
