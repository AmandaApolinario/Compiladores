package main

import "fmt"

func main() {
	// Chamada de função com parâmetros fixos
	resultado := somaDoisNumeros(8, 5) 
	fmt.Println("Resultado da função:", resultado)
}

// Função que realiza a soma de dois números
func somaDoisNumeros(a, b int) int {
	return a + b
}