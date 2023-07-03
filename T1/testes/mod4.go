package main

import "fmt"

func main() {
	var a int = 1 + 2
	var b float32 = 3.1 + 1.1
	var c float32 = 3.1 + 1.1
	var d string = "teste " + "teste 2"

	var f int = 1 * 2
	var g float32
	g = 3.2 - 1
	var h float32
	h = 3.1 / 1.1

	var j bool
	j = 1 == 2
	var k bool
	k = 1.1 != 2.2
	var l bool
	l = 1 >= 3.2
	var m bool
	m = "abc" > "123"

	var s int = 2
	var t float32 = 3.2
	var v string = "str"

	fmt.Println(a)
	fmt.Println(b)
	fmt.Println(c)
	fmt.Println(d)

	fmt.Println(f)
	fmt.Println(g)
	fmt.Println(h)

	fmt.Println(j)
	fmt.Println(k)
	fmt.Println(l)
	fmt.Println(m)
	
	fmt.Println(s)
	fmt.Println(t)
	fmt.Println(v)

}