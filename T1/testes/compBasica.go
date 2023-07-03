package main

import "fmt"

func main() {
    var a int 
    var b int

    a = 10
    b = 5

    // Operações de comparação básicas
    var result bool 

	result = a < b 
	fmt.Println(result)
	result = a > b 
	fmt.Println(result)
	result = a == b
	fmt.Println(result)
	result = a != b
	fmt.Println(result)
	result = a >= b
	fmt.Println(result)
	result = a <= b
	fmt.Println(result)
    
}