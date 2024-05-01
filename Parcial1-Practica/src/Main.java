public class Main {
    public static void main(String[] args) {
        Athlete a1 = new Athlete(36780321, "Nicolas Alameda",25,1.76,90);
        Athlete a2 = new Athlete(38504312, "Maria Estrada",25,1.69,64);
        Athlete a3 = new Athlete(35682013, "Lizbeth Rodriguez",25,1.81,68);
        Athlete a4 = new Athlete(37543212, "Jose Martinez",25,1.78,72);

        NationalTeam nt1 = new NationalTeam("celeste", "Argentina");

        Trial t1 = new Trial(61439,"Prueba de velocidad");
        Trial t2 = new Trial(26132,"Prueba de fuerza");

        Facility f1 = new Facility("Categoría Ej","Buenos Aires, Argentina","Nombre Ej","Tipo Ej");

        Campus c1 = new Campus("25/05/2024","10:30",1,f1);

        c1.addTrials(t1);
        c1.addTrials(t2);

        f1.setCampus(c1);
        t1.setCampus(c1);
        t2.setCampus(c1);

        nt1.addAthletes(a1);
        nt1.addAthletes(a2);
        nt1.addAthletes(a3);
        nt1.addAthletes(a4);

        joinTrial(a1, t1);
        joinTrial(a2, t1);
        joinTrial(a3, t1);
        System.out.println();

        joinTrial(a2, t2);
        joinTrial(a3, t2);
        joinTrial(a4, t2);
        System.out.println();

        System.out.println("Desde un objeto instalacion: ");
        System.out.println("Nombre del/ de la 3er atleta de la 2da prueba: ");
        System.out.println(f1.getCampus().getTrials().get(2-1).getParticipants().get(3-1).getName());
        System.out.println("Codigo de la 2da prueba: ");
        System.out.println(f1.getCampus().getTrials().get(2-1).getCode()+"\n");

        System.out.println("Desde un objeto EquipoNacional: ");
        System.out.println("Altura de los/las atletas del equipo "+nt1.getColor()+": ");
        for (Athlete athlete : nt1.getAthletes()){
            System.out.println(athlete.getHeight());
        }
        System.out.println("Presencia de peso extra en los/las atletas del equipo "+nt1.getColor()+": ");
        for (Athlete athlete : nt1.getAthletes()){
            if (athlete.thereIsExtraWeight(athlete.getWeight())){
                System.out.println("El/la atleta "+athlete.getName()+" tiene peso extra");
            }else{
                System.out.println("El/la atleta "+athlete.getName()+" NO tiene peso extra");
            }
        }

    }
    public static void joinTrial(Athlete athlete, Trial trial){
        double pulsesPerMinute = athlete.takePulses();
        if (!athlete.thereIsExtraWeight(athlete.getWeight()) && pulsesPerMinute >= 60 && pulsesPerMinute <= 100){
            trial.addAthletes(athlete);
            System.out.println("El/la atleta "+athlete.getName()+" se ha unido a la prueba: "+trial.getTitle());
        }else{
            System.out.println("El/la atleta "+athlete.getName()+" no cumple el contrato, por lo tanto, no puede ingresar a la prueba");
        }
    }
}
