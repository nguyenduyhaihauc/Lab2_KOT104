package duyndph34554.fpoly.lab2_kot104

var listSV = mutableListOf<SinhVienModel>()
fun addSinhVien() {
    println("Nhập họ tên: ")
    var tenSV: String? = readLine()
    if (tenSV == null) return

    println("Nhập mã sinh viên: ")
    var maSV: String ?= readLine()
    if (maSV == null) return

    println("Nhập điểm TB: ")
    var diemTB: Float? = readLine()?.toFloat()
    if (diemTB == null) return

    println("Đã tốt nghiệp chưa: ")
    var daTotNghiep: Boolean? = readLine()?.toBoolean()
    if (daTotNghiep == null) return

    println("Nhập tuổi: ")
    var tuoi: Int? = readLine()?.toInt()
    if (tuoi == null) return

    var sv: SinhVienModel = SinhVienModel(tenSV, maSV, diemTB, daTotNghiep, tuoi)
    listSV.add(sv)
    println("=============Danh sách sinh viên===============")
    for (sv in listSV.indices) {
        println("${sv+1}. ${listSV.get(sv).getThongTin()}")
    }
}

fun deleteSinhVien() {
    println("Mời nhập mã sinh viên cân xóa: ")
    var maSVXoa: String?= readLine()

    for (i in listSV.indices) {
        if (listSV[i].mssv == maSVXoa) {
            listSV.removeAt(i)
            println("Xóa sinh viên $maSVXoa thành công")
            println("============Danh sách sinh viên=============")
            for (index in listSV.indices) {
                println("${index+1}. ${listSV.get(index).getThongTin()}")
            }
        } else {
            println("Mã sinh viên $maSVXoa không tồn tại")
        }
    }
}

fun getDSSinhVien() {
    println("================Danh sách sinh viên==================")
    for (index in listSV.indices) {
        println("${index+1}. ${listSV.get(index).getThongTin()}")
    }
}

fun main(args: Array<String>) {

    while (true) {
        println("============Danh sách chức năng=============")
        println("||         1. Thêm sinh viên mới          ||")
        println("||            2. Xóa sinh viên            ||")
        println("||       3. Xem danh sách sinh viên       ||")
        println("||                0. Thoát                ||")
        println("============================================")
        println("Mời nhập lựa chọn: ")
        var input: Int? = readLine()?.toInt()
        if (input == null) return

        when(input) {
            1 -> addSinhVien()
            2 -> deleteSinhVien()
            3 -> getDSSinhVien()
            0 -> return
            else -> println("Yêu cầu nhập đúng!!!")
        }

        println("Bạn có muốn nhập tiếp không(Y/N): ")
        var s: String ? = readLine()
        if (s == "n" || s == "N") {
            return
        }
    }
}