//CALCULO TRAPÉZIO
function calcularTrapezio(baseMaior, baseMenor, altura){
    const trapezio = ((baseMaior + baseMenor)*altura)/2;
    return trapezio;

};
console.log(`Area do trapézio ${calcularTrapezio(12, 4, 5)}`)

//CALCULO RETANGULO
function calcularRetangulo(base, altura){
    const retangulo = (base*altura);
    return retangulo;
};
console.log(`Area do retangulo ${calcularRetangulo(10,5)}`)

//CALCULO PERIMETRO RETANGULO
function calcularPerimetroRetangulo(base, altura){
    const perimetro = 2*(base+altura);
    return perimetro;
};
console.log(`Perimetro do retangulo ${calcularPerimetroRetangulo(10,5)}`)



//CALCULO RAIO / CIRCUNFERÊNCIA
function calcularRaio(raio){
    const area = Math.PI * Math.pow(raio, 2);
    return area;

}
console.log(`Area do raio ${calcularRaio(12).toFixed(2)}`)

//CALCULO TRIÂNGULO
function calcularTriangulo(base, altura){
    const triangulo = (base*altura)/2;
    return triangulo;
};
console.log(`Area do triangulo ${calcularTriangulo(10,5)}`)

//CALCULO QUADRADO
function calcularQuadrado(comprimento, altura){
    const area = (comprimento*altura);
    return area;
};
console.log(`Area do quadrado ${calcularQuadrado(10,5)}`)

//CALCULO PERIMETRO DO QUADRADO
function calcularPerimetroQuadrado(lado){
    const perimetro = (lado*4);
    return perimetro;
};
console.log(`Perimetro do quadrado ${calcularPerimetroQuadrado(10)}`)