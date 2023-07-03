package main

import "fmt"

func f0() {
	fmt.Println("f0")
};

func f1(a int) {
	fmt.Println("f1: ")
    fmt.Println(a)
};

func f2(a int, b int) {
	fmt.Println(a + b)
};

func f3(a int, b int, c float32) {
	fmt.Println(a + b)
};

func main() {
	var a int = 5
	fmt.Println(a)
	f0()
	f2(4.2)
	f1(4)
	f3(4, 2, 4.2)
};
