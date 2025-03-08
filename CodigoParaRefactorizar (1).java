public class CodigoParaRefactorizar {
    private static final double IVA = 0.21;
    private static final int[] DIAS_MES = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public double calculoIva(double precioBase) {
        return precioBase + (IVA * precioBase);
    }

public double calculoIva(double precioBase, double porcentajeDescuento) {
    double precioConIva = calculoIva(precioBase);
    return precioConIva - (precioConIva * porcentajeDescuento / 100);
}

public boolean esBisiesto(int anio) {
    (anio % 400 == 0) || ((anio % 4 == 0) && (anio % 100 != 0));
}

public int diasMes(int mes, int anio) {

    if (mes == 2 && esBisiesto(anio)) {
        return 29;
    }

    return DIAS_MES[mes - 1];
}

public double subidaPrecio(double precioBase, double subida) {
    double precioFinal = precioBase + subida;
    double precioConIva = calculoIva(precioFinal);
    imprimirResultados(precioFinal, precioConIva);
    return precioFinal;
}

private void imprimirResultados(double precioFinal, double precioConIva) {
    System.out.println("El nuevo precio base es " + precioFinal);
    System.out.println("El precio con IVA es " + precioConIva);
}
}
        }

