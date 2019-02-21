### SUBSTRACTION, MULTIPLICATION and DIVISION

We decided to test integers substracions, multiplications and divisions by testing our function output with already known results.
We choose to use a TDD process, this means that we first tought about what the output should be (considering the fact that the operations are with integers), then we created the tests and finally we implemented our functions. These already known results considers the output of integer operations, this means that the division of two integers that has floating values would not be considered for the result.
Additionally, divisions with denominators equals to zero are not being handled by out function, this is a an intentionally design decision because we considered that we are not responsible
of handling CPU errors, therefore, these errors should not be considered in our functions design.
