package duyndph34554.fpoly.lab2_kot104

fun main(args: Array<String>) {
//    Lam viec voi null safety
//    val tenSV: String? = "Nguyen Duc Duy"
//
//    if (tenSV!=null) {
//        val MSSV = getThonhTinSv(tenSV)
//        println("Ma so sv cua $tenSV la $MSSV")
//    }

    val  sv1:SinhVienModel = SinhVienModel("Nguyen Duc Duy", "PH34554", 9.5f)
    val  sv2:SinhVienModel = SinhVienModel("Nguyen Tri Toan", "PH34454", 8.5f)

    sv2.daTotNghiep = false
    sv2.tuoi = 20

    val sv3: SinhVienModel = SinhVienModel("Truong Vam Quyet", "PH34523", 8.9f, false, 20)

    println(sv1.getThongTin())
    println(sv2.getThongTin())
    println(sv3.getThongTin())

//    Tao va xu ly ds sinh vien
    val listSV = mutableListOf<SinhVienModel>()
    listSV.add(sv1)
    listSV.add(sv2)
    listSV.add(sv3)

//    Xoa phan tu cuoi cung trong ds
    listSV.removeAt(listSV.size-1)

//    Cach 1 duyet nhanh
    println("Duyet nhanh")
    for (sv in listSV) {
        println(sv.getThongTin())
    }

//    Cach 2: Duyet co index
    println("Duyet co index")
    for (i in listSV.indices) {
        println("Thong tin $i: ${listSV.get(i).getThongTin()}")
    }
}

//fun getThonginSv(tenSV: String): String? {
//    when(tenSV) {
//        "Nguyen Duc Duy" -> return "PH34554"
//        "Le Tuan Anh" -> return "PH14372"
//        else -> return null
//    }
//    return null
//}