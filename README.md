# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data guru menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan Nip guru, dan memberikan output berupa informasi detail dari Nip tersebut seperti tahun masuk, jurusan, tahun, dan golongan.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. *Class* adalah template atau blueprint dari object. Pada kode ini, Guru, GuruDetail, dan GuruBeraksi adalah contoh dari class.

bash
public class Guru {
    ...
}

public class GuruDetail extends Guru {
    ...
}

public class GuruBeraksi {
    ...
}


2. *Object* adalah instance dari class. Pada kode ini, gru[i] = new GuruDetail(nama, nip); adalah contoh pembuatan object.

bash
gru[i] = new GuruDetail(nama, nip);


3. *Atribut* adalah variabel yang ada dalam class. Pada kode ini, nama dan nip adalah contoh atribut.

bash
String nama;
String nip;


4. *Constructor* adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class Guru dan GuruDetail.

bash
public Guru(String nama, String nip) {
    this.nama = nama;
    this.npm = nip;
}

public GuruDetail(String nama, String nip) {
    super(nama, nip);
}


5. *Mutator* atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, setNama dan setNip adalah contoh method mutator.

bash
public void setNama(String nama) {
    this.nama = nama;
}

public void setNip(String nip) {
    this.nip = nip;
}


6. *Accessor* atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, getNama, getNip, getTahunMasuk, getJurusan, getTahun, dan getGolongan adalah contoh method accessor.

bash
public String getNama() {
    return nama;
}

public String getNip() {
    return nip;
}


7. *Encapsulation* adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut nama dan nip dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

bash
private String nama;
private String nip;


8. *Inheritance* adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, GuruDetail mewarisi Guru dengan sintaks extends.

bash
public class GuruDetail extends Guru {
    ...
}


9. *Polymorphism* adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method displayInfo(String) di Guru merupakan overloading method displayInfo dan displayInfo di GuruDetail merupakan override dari method displayInfo di Guru.

bash
public String displayInfo(String statuskepegawaian) {
    return displayInfo() + "\nStatusKepegawaian: " + statuskepegawaian;
}

@Override
public String displayInfo() {
    ...
}


10. *Seleksi* adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi if else dalam method getJurusan dan seleksi switch dalam method getTahun.

bash
public String getjurusan() {
    if(getNip().substring(2, 4).equals("10")){
        return "Jurusan Bahasa Indonesia";
    } else {
        return "Jurusan lain";
    }

    //return getNip().substring(2, 4).equals("10") ? "Jurusan Bahasa Indonesia" : "Jurusan lain";
}

public String getTahun() {
    switch(getNip().substring(4, 6)) {
        case "01":
            return "Jurusan Bahasa Indonesia";
        case "02":
            return "Jurusan Bahasa Inggris";
        default:
            return "Jurusan lain";
    }
}


11. *Perulangan* adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop for untuk meminta input dan menampilkan data.

bash
for (int i = 0; i < guru.length; i++) {
    ...
}


12. *Input Output Sederhana* digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class Scanner untuk menerima input dan method System.out.println untuk menampilkan output.

bash
Scanner scanner = new Scanner(System.in);
System.out.print("Masukkan Nama Guru ke-" + (i + 1) + ": ");
String nama = scanner.nextLine();

System.out.println("\nData Guru:");
System.out.println(guru.displayInfo());


13. *Array* adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, GuruDetail[] guru = new GuruDetail[2]; adalah contoh penggunaan array.

bash
GuruDetail[] guru = new GuruDetail[2];


14. *Error Handling* digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan try catch untuk menangani error.

bash
try {
    // code that might throw an exception
} catch (Exception e) {
    System.out.println("Error: " + e.getMessage());
}


## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | *TOTAL*      | *100* |

## Pembuat

Nama: Galuh Uliasari
NPM: 2310010117
