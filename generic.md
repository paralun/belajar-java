# Belajar Java Generic

## Genric Class
## Generic Method
## Invariant
    - Invariant artinya tidak boleh disubtitusi dengan subtype (child) atau supertype (parent).
    - Secara default, saat membuat generic parameter type, parameter tersebut adalah invariant.
    - Sebagai contoh, Data<String> tidak sama dengan Data<Object> begitupun sebaliknya. 
## Covariant
    - Covariant artinya bisa melakukan subtitusi subtype (child) dengan supertype (parent).
    - Untuk membuat covariant adalah dengan menggunakan kata kunci (? extends Object).
    - Sebagai contoh, Data<String>, maka bisa disubtitusi menjadi Data<? extends Object>.
    - Covariant bersifat read-only, jadi tidak bisa mengubah data genericnya.