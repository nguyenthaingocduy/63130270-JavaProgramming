package Lab7_B2;

public class SinhVienZ extends SinhVienPoly {
    double diemMarketing;
    double diemSales;

    public SinhVienBiz(String hoTen,double diemMarketing, double diemSales) {
        super(hoTen,"Biz");
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }

    @Override
    double getDiem() {
        return (2 * diemMarketing + diemSales) / 3;
    }
}