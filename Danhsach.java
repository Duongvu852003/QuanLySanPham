
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class Danhsach {

    ArrayList<SanPham> sp = new ArrayList<SanPham>();

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Nhap gia : ");
            double price;
            price = sc.nextDouble();
            sc.nextLine();
            System.out.println("Nhap ten san pham : ");
            String name;
            name = sc.nextLine();
            sp.add(new SanPham(price, name));
            System.out.println("Nhap tiep :(Y/N) ");
            String a = sc.nextLine();
            if (a.equals("N")) {
                break;
            }
        }
    }

    public void xuat() {
        System.out.println("Danh sach vua nhap la : ");
        for (SanPham st : sp) {
            System.out.println(st.toString());
        }

    }

    public void sapXep() {
        Collections.sort(sp, new Comparator<SanPham>() {
            @Override
            public int compare(SanPham t1, SanPham t2) {

                return t1.getName().compareTo(t2.getName());
            }
        });
        System.out.println("San pham sau khi sap xep la : ");
        for (SanPham st : sp) {
            System.out.println(st.toString());
        }
    }

    public void xoa() {
        System.out.println("Nhap ten san pham can xoa : ");
        Scanner sc = new Scanner(System.in);
        String a;
        a = sc.nextLine();
          Iterator<SanPham> it = sp.iterator();
        while (it.hasNext()) {
            SanPham i = it.next();
            if (i.getName().equals(a) ) {
                it.remove();
            }
        }    
        System.out.println("San pham sau khi xoa la : ");
        for (SanPham st : sp) {
            System.out.println(st.toString());
        }

    }
    public void giaTb(){
        double sum =0;
         Iterator<SanPham> it = sp.iterator();
        while (it.hasNext()) {
            SanPham i = it.next();
            sum += i.getPrice();
        }
        double tb = (double)sum/sp.size();
        System.out.println("Tb la : "+tb);
        
    }


}
