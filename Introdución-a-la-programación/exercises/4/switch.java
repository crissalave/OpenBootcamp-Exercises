class Main {

  public static void main(String[] args) {

    String estacion = "Invierno!";

    switch (estacion) {
      case "Invierno":
        System.out.println("Es invierno");
        break;
      case "Verano":
        System.out.println("Es verano");
        break;
      case "Primavera":
        System.out.println("Es Primavera");
        break;
      case "Otoño":
        System.out.println("Es otoño");
        break;
      default:
        System.out.println("Estación invalida");
    }

  }

}
