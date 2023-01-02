English :
The ViewModel pattern is a way of organizing data and logic in an Android app that is responsible for preparing
and managing the data for the UI. It is designed to store and manage UI-related data in a lifecycle conscious way,
and to expose this data via observables to the UI. The ViewModel is responsible for managing the data and logic
related to the data, while the UI controller (such as an activity or fragment) is responsible for displaying the
data and handling user input. This separation of concerns allows the UI controller to focus on its specific role,
and it also allows the ViewModel to survive configuration changes (such as screen rotations) and maintain
the data that it is holding.

Study Case : The Name List

The NameViewModel class is a view model class that is used to manage the data for the list of names in the app. A view model is a class that is responsible for preparing and managing the data for an activity or a fragment.

The NameViewModel class in this project has the following main functions:

Storing the list of names: The NameViewModel class has a MutableLiveData object called _names that stores a list of names.
Providing the list of names to the activity or fragment: The NameViewModel class has a names property that returns the value of the MutableLiveData object. This allows the activity or fragment to observe the list of names and update the UI whenever the list of names changes.
Adding a new name to the list: The NameViewModel class has an addName method that adds a new name to the list of names. This method is called when the user clicks the "Add" button in the UI.

Bahasa Indonesia :

Pola ViewModel adalah cara mengatur data dan logika di aplikasi Android yang bertanggung jawab menyiapkan dan mengelola
data untuk UI. Ini dirancang untuk menyimpan dan mengelola data terkait UI dengan cara sadar siklus hidup, dan untuk
memaparkan data ini melalui yang dapat diamati ke UI. ViewModel bertanggung jawab untuk mengelola data dan logika yang
terkait dengan data, sedangkan pengontrol UI (seperti aktivitas atau fragmen) bertanggung jawab untuk menampilkan data dan
menangani input pengguna. Pemisahan perhatian ini memungkinkan pengontrol UI untuk fokus pada peran khususnya, dan juga
memungkinkan ViewModel bertahan dari perubahan konfigurasi (seperti rotasi layar) dan memelihara data yang disimpannya.

Studi Kasus : Daftar Nama

Kelas NameViewModel adalah kelas model tampilan yang digunakan untuk mengelola data untuk daftar nama di aplikasi. Model tampilan adalah kelas yang bertanggung jawab menyiapkan dan mengelola data untuk aktivitas atau fragmen.

Kelas NameViewModel dalam proyek ini memiliki fungsi utama sebagai berikut:

Menyimpan daftar nama: Kelas NameViewModel memiliki objek MutableLiveData bernama _names yang menyimpan daftar nama.
Menyediakan daftar nama untuk aktivitas atau fragmen: Kelas NameViewModel memiliki properti nama yang mengembalikan nilai objek MutableLiveData. Hal ini memungkinkan aktivitas atau fragmen mengamati daftar nama dan memperbarui UI setiap kali daftar nama berubah.
Menambahkan nama baru ke daftar: Kelas NameViewModel memiliki metode addName yang menambahkan nama baru ke daftar nama. Metode ini dipanggil saat pengguna mengklik tombol "Tambah" di UI.