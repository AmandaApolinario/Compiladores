package main

import "fmt"

func main() {
	// Execução de blocos sequenciais de código
	if d > 10 {
		fmt.Println("d é maior que 10")
	} else {
		fmt.Println("d é menor ou igual a 10")
	}

	// Estrutura de escolha (if-then-else)
	if a < b {
		fmt.Println("a é menor que b")
	} else if a > b {
		fmt.Println("a é maior que b")
	} else {
		fmt.Println("a é igual a b")
	}
	
	// Estrutura de repetição (for)
	for i := 1; i <= 5; i++ {
		fmt.Println("Número:", i)
	}
}