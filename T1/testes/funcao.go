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
	var c int
	c = a + b
	fmt.Println(c)
};

func f3(a int, b int) {
	fmt.Println(a)
};

func main() {
	var a int = 5
	fmt.Println(a)
	f0()
	f1(4)
	f2(3, 5)
	f3(4, 2)
};
