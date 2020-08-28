import java.util.*

public var input = Scanner(System.`in`);

fun main() {
    println("==ISIKAN DATA DIRI==")
    print("Isikan Nama : ")
    var n: String? = input.nextLine()
    print("Isikan Kelas : ")
    var k: String? = input.nextLine()
    print("Isikan Nomor : ")
    var nu: String? = input.nextLine()

    if (n.isNullOrEmpty()) {
        println("wajib diisi!")
        main()
    }
    menu()
}


    fun menu() {
        println("==MENU==")
        println("1. Volume Balok \n2. Volume Bola \n0. Keluar ")
        print("Silahkan pilih menu perhitungan : ")
        val pil: Int? = input.nextInt()
        when (pil) {
            1 -> balok()
            2 -> bola()
            0 -> keluar()
            else -> {
                println("Maaf, tidak dapat menemukan perhitungan.")
                menu()
            }
        }
    }

            fun balok() {
                println("==VOLUME BALOK==")
                print("Masukkan Panjang Balok : ")
                var pb: Double? = null
                pb = input.nextDouble()
                print("Masukkan Lebar Balok : ")
                var lb: Double? = null
                lb = input.nextDouble()
                print("Masukkan Tinggi Balok : ")
                var tb: Double? = null
                tb = input.nextDouble()
                val vb = pb * lb * tb
                println("Jadi, volume balok adalah : $vb")
                System.out.printf("%.2f", vb)
                println()
                menu()
            }

                fun bola() {
                    println("==VOLUME BOLA==")
                    print("Masukkan Jari-jari Bola : ")
                    var rbo: Double? = null
                    rbo = input.nextDouble()
                    val vbo = 4 / 3 * Math.PI * rbo * rbo * rbo
                    println("Jadi, volume bola adalah : $vbo")
                    System.out.printf("%.2f", vbo)
                    println()
                    menu()
                }
        fun keluar(){
            System.exit(0)
        }

