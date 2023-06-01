package main

import "fmt"

func teste() int {
	return 5
};

func main() {
	var i = 0
    for i < 5 {
        //fmt.Println(i)
        i++
    }
	var a = 3;
	//var b int = 5.3;
	var c = 2.4;
	var d float32 = 2.4;
	var e = true;
	var f bool = true;
	var g = "teste"
	var h string = "teste";
	var j float32 = 3.4;
	j--;

	var isgrs float32 = teste();
	var teste bool;
	teste = !teste;

}
