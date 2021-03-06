# Belajar Java Generic

## Genric Class
## Generic Method
## Invariant
    - Invariant artinya tidak boleh disubtitusi dengan subtype (child) atau supertype (parent).
    - Secara default, saat membuat generic parameter type, parameter tersebut adalah invariant.
    - Sebagai contoh, Data<String> tidak sama dengan Data<Object> begitupun sebaliknya. 
## Covariant
    - Covariant artinya bisa melakukan subtitusi subtype (child) dengan supertype (parent).
    - Untuk membuat covariant adalah dengan menggunakan kata kunci (? extends ParentType).
    - Sebagai contoh, Data<String>, maka bisa disubtitusi menjadi Data<? extends Object>.
    - Covariant bersifat read-only, jadi tidak bisa mengubah data genericnya.
## Contravariant
    - Contravariant artinya bisa melakukan subtitusi supertype (parent) dengan subtype (child).
    - Untuk membuat contravariant dengan menggunakan kata kunci (? super SubType).
    - Sebagai contoh, Data<Object>, maka bisa disubtitusi menjadi Data<? super String>.
    - Convariant bisa write dan read.
## Bounded Type Parameter
    - Untuk membatasi type data yg boleh digunakan di generic parameter type.
    - Secara default, generic parameter type adalah object, sehingga semua type data bisa digunakan.
## Multiple Bounded Type Parameter
    - Untuk menambahkan beberapa bounded type parameter dengan karakter `&` setelah bounded pertama.
    - Type bounded kedua dan seterusnya harus menggunakan type `interface` bukan `class`
## Wildcard
    - Wildcard artinya bisa maemasukan type data generic dengan type data apapun.
    - Wildcard bisa dibuat dengan mengganti generic parameter type dengan karakter `?`
## Type Erasure
    - Type Erasure adalah proses pengecekan generic pada saat compile time, dan menghiraukan pengecekan pada saat runtime.
    - Compiler akan mengubah generic parameter type menjadi type Object di Java.