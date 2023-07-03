package main

import "fmt"

func main() {
	var d int
	var a int
	var b int

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
	var i int = 1;
	for i <= 5 {
		fmt.Println("Número:", i)
		i = i + 1;
	}
}
