# If Else

1. objek scanner digunakan untuk membaca berbagai jenis data dari pengguna, seperti string, angka bulat, atau bilangan desimal.

                  Scanner scanner = new Scanner(System.in);
2. program ini akan terus meminta pengguna memasukkan angka hingga pengguna memasukkan angka negatif. Ketika angka negatif dimasukkan, program akan berhenti, dan eksekusi program selesai. Hal ini memungkinkan pengguna untuk keluar dari program dengan menginputkan angka negatif sebagai tanda penghentian

                while (true) {
                            System.out.print("Masukkan sebuah angka (angka negatif untuk keluar): ");
                            int inputAngka = scanner.nextInt();
                
                            if (inputAngka < 0) {
                                break;
                            }
3. kode ini digunakan untuk mengidentifikasi apakah suatu angka adalah angka genap atau angka ganjil berdasarkan sifat bilangan tersebut. Output pesan yang sesuai akan ditampilkan tergantung pada hasil pengujian kondisi, yaitu apakah inputAngka habis dibagi 2 (angka genap) atau memiliki sisa pembagian (angka ganjil).

                 if (inputAngka % 2 == 0) {
                                System.out.println(inputAngka + " adalah angka genap.");
                            } else {
                                System.out.println(inputAngka + " adalah angka ganjil.");
                            }
  
