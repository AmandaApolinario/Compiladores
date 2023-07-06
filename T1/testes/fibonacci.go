package main

import "fmt"

func fibonacci(n int) int {

	if n <= 1 {
		return n
	} else {
		var fib1 int
		fib1 = fibonacci(n-2)
		var fib2 int 
		fib2 = fibonacci(n-1) 
		var res int = fib1 + fib2
		return res
	}
};

func main() {
	var numTerms int = 25

	var i = 0
	for i < numTerms {
		var res int 
		res = fibonacci(i)
		fmt.Println(res)
		i = i + 1
	}
}
