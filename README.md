# TUGAS PBO — INHERITANCE (PERSON, STUDENT, TEACHER)

Program sederhana tentang pewarisan kelas (inheritance) di Java.  
Ada kelas `Person` sebagai induk, lalu `Student` dan `Teacher` sebagai turunan.

---

## FILE-FILE DI PROYEK INI

**Person.java**  
Kelas induk. Punya atribut name dan address, plus method getName, getAddress, setAddress, dan toString.

**Student.java**  
Turunan dari Person. Bisa menambah mata kuliah dan nilai, mencetak daftar nilai, dan menghitung rata-rata.

**Teacher.java**  
Turunan dari Person. Bisa menambah dan menghapus mata kuliah yang diampu. Ada pengecekan agar tidak duplikat.

**Main.java**  
File utama dengan Scanner. User bisa input data mahasiswa, dosen, mata kuliah, nilai, dan simulasi hapus mata kuliah.

---