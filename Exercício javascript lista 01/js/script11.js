function areatrapezio(){
    var basemaior = parseInt(prompt("Digite a base maior"));
    var basemenor = parseInt(prompt("Digite a base menor"));
    var altura = parseFloat(prompt("Digite a altura"));
    var areatrapezio = (basemaior+basemenor)*altura/2;
    alert("A área do retângulo é: " + areatrapezio);
}