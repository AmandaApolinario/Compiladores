package main 



import "fmt"

func main() {

	num := 2

    switch num {
    case 1:
        fmt.Println("One")
        continue // skip to next iteration
    case 2:
        fmt.Println("Two")
        break // exit switch statement
    case 3:
        fmt.Println("Three")
        fallthrough // execute next case
    case 4:
        fmt.Println("Four")
        fallthrough // execute next case
    default:
        fmt.Println("Unknown")
    }

}