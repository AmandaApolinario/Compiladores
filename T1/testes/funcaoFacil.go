package main

import "fmt"


func f1(a int) {
	var b int
	b = a + 3
    fmt.Println(a)
};

func main() {
	var a int = 6

	fmt.Println(a)
	
	f1(4)

	fmt.Println(a)
};
