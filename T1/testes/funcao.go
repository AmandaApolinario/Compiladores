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

	fmt.Println("f2")
};

func f3(a int, b int) {
	fmt.Println("f3")
};

func main() {
	var a int = 5
	fmt.Println(a)
	f0()
	f1(4)
	f2(3, 5)
	f3(4, 2)
};
