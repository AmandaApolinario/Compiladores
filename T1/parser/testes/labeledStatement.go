package main 

import "fmt"

func main() {

	LabeledStatement:
		fmt.Println("LabeledStatement")


	AnotherLabeledStatement:
		int a = 10
		int b = 5

		int soma = a + b * 2

		fmt.Println("Soma:", soma)
}
