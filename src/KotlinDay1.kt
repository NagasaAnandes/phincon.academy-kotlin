fun calculate(nilaiMTK: Int, nilaiBING: Int, nilaiJurusan: Int) : Int {
    return 0
}

fun main() {
	val nama = "Nagasa Anandes"
    val nilaiMTK = 90
    val nilaiBING = 90
    val nilaiIPA = 80
    val nilaiIPS = 0
    var mean : Int
    var total = 0
    var grade : String
    var jurusan : String
    var nilaiJurusan = 0
    
    if (nilaiIPS == 0){
        jurusan = "IPA"
        nilaiJurusan = nilaiIPA
    } else if (nilaiIPA == 0) {
        jurusan = "IPS"
        nilaiJurusan = nilaiIPS
    } else {
        println("Tidak bisa multi jurusan")
        return
    }
    
    total = nilaiMTK + nilaiBING + nilaiJurusan
    mean = total / 3
    
    if (mean > 100){
        println("Nama $nama, Nilainya tidak masuk akal")
        return
    }
    when{
        mean >= 90 && jurusan == "IPA" -> grade = "A"
        mean >= 85 && jurusan == "IPS" -> grade = "A"
        mean >= 80 && jurusan == "IPA" -> grade = "B"
        mean >= 75 && jurusan == "IPS" -> grade = "B"
        mean >= 70 && jurusan == "IPA" -> grade = "C"
        mean >= 65 && jurusan == "IPS" -> grade = "C"
        else -> grade = "D"
    }
    println ("Nama $nama dengan jurusan $jurusan, Nilai Matematika $nilaiMTK, Nilai Bahasa Inggris $nilaiBING, Nilai $jurusan $nilaiJurusan. Dengan rata-rata $mean, maka mendapatkan grade $grade") 
}