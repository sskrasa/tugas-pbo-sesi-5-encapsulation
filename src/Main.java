import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== DATA MAHASISWA ===");
        System.out.print("Nama Mahasiswa: ");
        String namaMhs = input.nextLine();
        System.out.print("Alamat Mahasiswa: ");
        String alamatMhs = input.nextLine();

        Student student = new Student(namaMhs, alamatMhs);

        System.out.print("Jumlah mata kuliah: ");
        int jumlahMK = input.nextInt();
        input.nextLine();

        for (int i = 0; i < jumlahMK; i++) {
            System.out.print("Nama mata kuliah: ");
            String mk = input.nextLine();
            System.out.print("Nilai: ");
            int nilai = input.nextInt();
            input.nextLine();
            student.addCourse(mk, nilai);
        }

        System.out.println("\n=== DATA DOSEN ===");
        System.out.print("Nama Dosen: ");
        String namaDosen = input.nextLine();
        System.out.print("Alamat Dosen: ");
        String alamatDosen = input.nextLine();

        Teacher teacher = new Teacher(namaDosen, alamatDosen);

        System.out.print("Jumlah mata kuliah yang diampu: ");
        int jumlahAmpu = input.nextInt();
        input.nextLine();

        for (int i = 0; i < jumlahAmpu; i++) {
            System.out.print("Nama mata kuliah: ");
            String mk = input.nextLine();
            if (teacher.addCourse(mk)) {
                System.out.println("Mata kuliah " + mk + " berhasil ditambahkan");
            } else {
                System.out.println("Mata kuliah " + mk + " sudah ada");
            }
        }

        System.out.println("\n=== OUTPUT ===");
        System.out.println(student);
        student.printGrades();
        System.out.println("Rata-rata nilai: " + student.getAverageGrade());

        System.out.println("\n" + teacher);
        System.out.print("Hapus mata kuliah: ");
        String hapusMK = input.nextLine();
        if (teacher.removeCourse(hapusMK)) {
            System.out.println("Mata kuliah " + hapusMK + " berhasil dihapus");
        } else {
            System.out.println("Mata kuliah " + hapusMK + " tidak ditemukan");
        }

        input.close();
    }
}