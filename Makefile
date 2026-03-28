Berikut adalah contoh Makefile sederhana untuk mengcompile dan menjalankan program Java :

compile:
	javac -d bin src/model/*.java src/driver/*.java

run:
	java -cp bin driver.Main	
