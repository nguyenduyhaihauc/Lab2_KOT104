package duyndph34554.fpoly.lab2_kot104

fun main(args: Array<String>) {
    val listSV = mutableListOf<SinhVienModel>()
    while (true) {
        println("Nhập tên sinh viên: ")
        var tenSV: String? = readLine().toString()
        if (tenSV == null) return
        println("Nhập mã sinh viên: ")
        var mssv: String? = readLine().toString()
        if (mssv == null) return
        println("Nhập điểm TB: ")
        var diemTB: Float? = readLine()?.toFloat()
        if (diemTB == null) return
        println("Đã tốt nghiệp chưa: ")
        var daTotNghiep: Boolean? = readLine()?.toBoolean()
        if (daTotNghiep == null) return
        println("Nhập tuổi: ")
        var tuoi: Int? = readLine()?.toInt()
        if (tuoi == null) return

        var sv: SinhVienModel = SinhVienModel(tenSV , mssv, diemTB, daTotNghiep, tuoi)
        listSV.add(sv)

        println("==========Danh sách sinh viên==========")
        for (sv in listSV.indices) {
            println("Thông tin sinh viên tại vị trí $sv la ${listSV.get(sv).getThongTin()}")
        }

        println("==========================================")
        println("Bạn có muốn nhập tiếp không(Y/N): ")
        var s: String? = readLine()
        if (s == "n" || s == "N") {
            println("Bạn muốn xóa sinh viên ở vị trí nào: ")
            var index: Int? = readLine()?.toInt()
            if (index != null) {
                if (index >= 0 && index < listSV.size) {
                    listSV.removeAt(index)
                    println("Danh sách sinh viên sau khi xóa")
                    for ((i, sinhVien) in listSV.withIndex()) {
                        println("Thông tin sinh viên tại vị trí $i là ${sinhVien.getThongTin()}")
                    }
                } else {
                    println("Vị trí $index không hợp lệ")
                }
            } else {
                return
            }
        }
    }
}