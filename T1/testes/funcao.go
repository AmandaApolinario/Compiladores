package main

import "fmt"

func main() {
	// Chamada de função com parâmetros fixos
	resultado := somaDoisNumeros(8, 5) 
	fmt.Println("Resultado da função:", resultado)
};

func somaDoisNumeros(a int, b int) {
	var texto string = "Olá, mundo!"
	fmt.Println("Num a:", a)
	fmt.Println("Num b:", b)
	return a + b
};

func testaDiferentesTiposs(a string, b int) {

}