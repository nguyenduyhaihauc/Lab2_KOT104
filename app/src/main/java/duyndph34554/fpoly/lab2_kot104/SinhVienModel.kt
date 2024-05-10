package duyndph34554.fpoly.lab2_kot104

class SinhVienModel (var tenSV: String, var mssv: String, var diemTB: Float) {
    var daTotNghiep: Boolean? = null
    var tuoi: Int? = null

    constructor(tenSV: String, mssv: String, diemTB: Float, daTotNghiep: Boolean, tuoi: Int) : this(tenSV, mssv , diemTB ) {
        this.daTotNghiep = daTotNghiep
        this.tuoi = tuoi
    }

    fun getThongTin(): String {
        val thongTin: String
        if (daTotNghiep != null && tuoi != null){
            thongTin = "Họ và tên: $tenSV, Ma SV: $mssv, Điểm TB: $diemTB, " +
                    "Đã tốt nghiệp: $daTotNghiep, Tuổi: $tuoi"
        } else {
            thongTin = "Họ và tên: $tenSV, Mã SV: $mssv, Điểm TB: $diemTB"
        }

        return thongTin
    }
}