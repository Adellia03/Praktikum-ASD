import java.util.Scanner;
public class SortingMain03{
    public static void main(String[] args) {

    int a[]= {20, 10, 2, 7, 12};
    int b[]= {30, 20, 2, 8, 14};

    Sorting03 dataurut1 = new Sorting03(a, a.length);
    Sorting03 dataurut2 = new Sorting03(b, b.length);

    System.out.println("Data awal 1");
    dataurut1.tampil();
    dataurut1.bubbleSort();
    System.out.println("Data sudah diurutkan dengan BUBBLE SORT (ASC)");
    dataurut1.tampil();
    System.out.println("________________________________________________");

    System.out.println("Data awal 2");
    dataurut2.tampil();
    dataurut2.SelectionSort();
    System.out.println("Data sudah diurutkan dengan SELECTION SORT (ASC)");
    dataurut2.tampil();

}
}
