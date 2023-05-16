package main

import "fmt"

func main() {
	// Chamada de função com parâmetros fixos
	resultado := main(8, 5) 
	fmt.Println("Resultado da função:", resultado)
};

func main(a, b) {
	var texto string = "Olá, mundo!"
	fmt.Println("Num a:", a)
	fmt.Println("Num b:", b)
	return a + b
}