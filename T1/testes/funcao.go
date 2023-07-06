package main

import "fmt"

func f0() {
	fmt.Println("f0")
};

func f1(d float32) {
	fmt.Println("f1: ")
    fmt.Println(d)
};

func f2(a int, b int) float32 {
	fmt.Println(a+b)

	return 13.1
};

func f3(c int, e int) {
	fmt.Println(c-e)
};

func f4(x int, y int) bool {
	var result bool
	result = x < y
	
	return result
};

func main() {
	var a int = 5
	fmt.Println(a)
	f0()
	f1(4.2)

	var b float32
	b = f2(3, 5)
	fmt.Println(b)

	f3(4, 2)

	var c bool
	c = f4(4, 2)
	fmt.Println(c)

};
