package main

import "fmt"

func f0() {
	fmt.Println("f0")
};

func f1(a float32) {
	fmt.Println("f1: ")
    fmt.Println(a)
};

func f2(a int, b int) int {
	fmt.Println(a+b)

	return 4
};

func f3(a int, b int) {
	fmt.Println(a-b)
};

func main() {
	var a int = 5
	fmt.Println(a)
	f0()
	f1(4.2)
	f2(3, 5)
	f3(4, 2)
};
