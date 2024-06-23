
package gestormundial;

import java.util.ArrayList;
import java.util.List;

public class EquiposDatos {

    public List<Equipo> getEquipos() {
        List<Equipo> equipos = new ArrayList<>();

        equipos.add(crearEquipoBrasil());
        equipos.add(crearEquipoArgentina());
        equipos.add(crearEquipoEspana());
        equipos.add(crearEquipoFrancia());
        equipos.add(crearEquipoChile());
        equipos.add(crearEquipoColombia());
        equipos.add(crearEquipoPortugal());
        equipos.add(crearEquipoAlemania());

        return equipos;
    }

    private Equipo crearEquipoBrasil() {
        Equipo brasil = new Equipo("Brasil", "Tite");
        brasil.agregarJugador(new Jugador("Neymar Jr", 29, "Delantero"));
        brasil.agregarJugador(new Jugador("Casemiro", 29, "Centrocampista"));
        brasil.agregarJugador(new Jugador("Thiago Silva", 36, "Defensa"));
        brasil.agregarJugador(new Jugador("Alisson Becker", 28, "Portero"));
        brasil.agregarJugador(new Jugador("Marquinhos", 27, "Defensa"));
        brasil.agregarJugador(new Jugador("Roberto Firmino", 30, "Delantero"));
        brasil.agregarJugador(new Jugador("Philippe Coutinho", 29, "Centrocampista"));
        brasil.agregarJugador(new Jugador("Gabriel Jesus", 24, "Delantero"));
        brasil.agregarJugador(new Jugador("Dani Alves", 38, "Defensa"));
        brasil.agregarJugador(new Jugador("Ederson", 27, "Portero"));
        brasil.agregarJugador(new Jugador("Fabinho", 28, "Centrocampista"));
        brasil.agregarJugador(new Jugador("Everton Soares", 25, "Delantero"));
        brasil.agregarJugador(new Jugador("Renan Lodi", 23, "Defensa"));
        brasil.agregarJugador(new Jugador("Richarlison", 24, "Delantero"));
        brasil.agregarJugador(new Jugador("Lucas Paquetá", 24, "Centrocampista"));
        brasil.agregarJugador(new Jugador("Militao", 23, "Defensa"));
        brasil.agregarJugador(new Jugador("Vinícius Jr", 21, "Delantero"));
        brasil.agregarJugador(new Jugador("Bruno Guimarães", 24, "Centrocampista"));
        brasil.agregarJugador(new Jugador("Emerson", 22, "Defensa"));
        return brasil;
    }

    private Equipo crearEquipoArgentina() {
        Equipo argentina = new Equipo("Argentina", "Lionel Scaloni");
        argentina.agregarJugador(new Jugador("Lionel Messi", 34, "Delantero"));
        argentina.agregarJugador(new Jugador("Ángel Di María", 33, "Extremo"));
        argentina.agregarJugador(new Jugador("Nicolás Otamendi", 33, "Defensa"));
        argentina.agregarJugador(new Jugador("Emiliano Martínez", 29, "Portero"));
        argentina.agregarJugador(new Jugador("Paulo Dybala", 27, "Delantero"));
        argentina.agregarJugador(new Jugador("Lautaro Martínez", 24, "Delantero"));
        argentina.agregarJugador(new Jugador("Leandro Paredes", 27, "Centrocampista"));
        argentina.agregarJugador(new Jugador("Giovani Lo Celso", 25, "Centrocampista"));
        argentina.agregarJugador(new Jugador("Marcos Acuña", 29, "Defensa"));
        argentina.agregarJugador(new Jugador("Lucas Ocampos", 27, "Extremo"));
        argentina.agregarJugador(new Jugador("Juan Foyth", 23, "Defensa"));
        argentina.agregarJugador(new Jugador("Rodrigo De Paul", 27, "Centrocampista"));
        argentina.agregarJugador(new Jugador("Guido Rodríguez", 27, "Centrocampista"));
        argentina.agregarJugador(new Jugador("Nicolás Tagliafico", 29, "Defensa"));
        argentina.agregarJugador(new Jugador("Cristian Romero", 23, "Defensa"));
        argentina.agregarJugador(new Jugador("Emiliano Buendía", 24, "Centrocampista"));
        argentina.agregarJugador(new Jugador("Julián Álvarez", 21, "Delantero"));
        argentina.agregarJugador(new Jugador("Gonzalo Montiel", 24, "Defensa"));
        argentina.agregarJugador(new Jugador("Agustín Marchesín", 33, "Portero"));
        return argentina;
    }

    private Equipo crearEquipoEspana() {
        Equipo espana = new Equipo("España", "Luis Enrique");
        espana.agregarJugador(new Jugador("Sergio Ramos", 35, "Defensa"));
        espana.agregarJugador(new Jugador("Gerard Piqué", 34, "Defensa"));
        espana.agregarJugador(new Jugador("Sergio Busquets", 33, "Centrocampista"));
        espana.agregarJugador(new Jugador("David De Gea", 30, "Portero"));
        espana.agregarJugador(new Jugador("Jordi Alba", 32, "Defensa"));
        espana.agregarJugador(new Jugador("Thiago Alcántara", 30, "Centrocampista"));
        espana.agregarJugador(new Jugador("Álvaro Morata", 28, "Delantero"));
        espana.agregarJugador(new Jugador("Koke", 29, "Centrocampista"));
        espana.agregarJugador(new Jugador("Saúl Ñíguez", 26, "Centrocampista"));
        espana.agregarJugador(new Jugador("Marcos Llorente", 26, "Centrocampista"));
        espana.agregarJugador(new Jugador("Dani Carvajal", 29, "Defensa"));
        espana.agregarJugador(new Jugador("Marco Asensio", 25, "Extremo"));
        espana.agregarJugador(new Jugador("Mikel Oyarzabal", 24, "Delantero"));
        espana.agregarJugador(new Jugador("Unai Simón", 24, "Portero"));
        espana.agregarJugador(new Jugador("Pau Torres", 24, "Defensa"));
        espana.agregarJugador(new Jugador("José Gayà", 26, "Defensa"));
        espana.agregarJugador(new Jugador("Rodri", 25, "Centrocampista"));
        espana.agregarJugador(new Jugador("Ferran Torres", 21, "Extremo"));
        espana.agregarJugador(new Jugador("Adama Traoré", 25, "Extremo"));
        return espana;
    }

    private Equipo crearEquipoFrancia() {
        Equipo francia = new Equipo("Francia", "Didier Deschamps");
        francia.agregarJugador(new Jugador("Kylian Mbappé", 22, "Delantero"));
        francia.agregarJugador(new Jugador("Antoine Griezmann", 30, "Delantero"));
        francia.agregarJugador(new Jugador("Paul Pogba", 28, "Centrocampista"));
        francia.agregarJugador(new Jugador("N'Golo Kanté", 30, "Centrocampista"));
        francia.agregarJugador(new Jugador("Karim Benzema", 33, "Delantero"));
        francia.agregarJugador(new Jugador("Raphaël Varane", 28, "Defensa"));
        francia.agregarJugador(new Jugador("Hugo Lloris", 34, "Portero"));
        francia.agregarJugador(new Jugador("Kingsley Coman", 25, "Extremo"));
        francia.agregarJugador(new Jugador("Lucas Hernández", 25, "Defensa"));
        francia.agregarJugador(new Jugador("Benjamin Pavard", 25, "Defensa"));
        francia.agregarJugador(new Jugador("Olivier Giroud", 34, "Delantero"));
        francia.agregarJugador(new Jugador("Presnel Kimpembe", 25, "Defensa"));
        francia.agregarJugador(new Jugador("Anthony Martial", 25, "Delantero"));
        francia.agregarJugador(new Jugador("Mike Maignan", 26, "Portero"));
        francia.agregarJugador(new Jugador("Ferland Mendy", 26, "Defensa"));
        francia.agregarJugador(new Jugador("Jules Koundé", 22, "Defensa"));
        francia.agregarJugador(new Jugador("Moussa Sissoko", 31, "Centrocampista"));
        francia.agregarJugador(new Jugador("Lucas Digne", 27, "Defensa"));
        francia.agregarJugador(new Jugador("Steven Nzonzi", 32, "Centrocampista"));
        return francia;
    }

    private Equipo crearEquipoChile() {
        Equipo chile = new Equipo("Chile", "Martín Lasarte");
        chile.agregarJugador(new Jugador("Arturo Vidal", 34, "Centrocampista"));
        chile.agregarJugador(new Jugador("Alexis Sánchez", 32, "Delantero"));
        chile.agregarJugador(new Jugador("Gary Medel", 34, "Defensa"));
        chile.agregarJugador(new Jugador("Claudio Bravo", 38, "Portero"));
        chile.agregarJugador(new Jugador("Charles Aránguiz", 32, "Centrocampista"));
        chile.agregarJugador(new Jugador("Eduardo Vargas", 31, "Delantero"));
        chile.agregarJugador(new Jugador("Mauricio Isla", 33, "Defensa"));
        chile.agregarJugador(new Jugador("Jean Beausejour", 37, "Defensa"));
        chile.agregarJugador(new Jugador("Erick Pulgar", 27, "Centrocampista"));
        chile.agregarJugador(new Jugador("Fabián Orellana", 35, "Extremo"));
        chile.agregarJugador(new Jugador("Guillermo Maripán", 27, "Defensa"));
        chile.agregarJugador(new Jugador("Enzo Roco", 28, "Defensa"));
        chile.agregarJugador(new Jugador("Gabriel Arias", 34, "Portero"));
        chile.agregarJugador(new Jugador("Ben Brereton", 22, "Delantero"));
        chile.agregarJugador(new Jugador("Pablo Galdames", 24, "Centrocampista"));
        chile.agregarJugador(new Jugador("César Pinares", 30, "Centrocampista"));
        chile.agregarJugador(new Jugador("Tomás Alarcón", 22, "Centrocampista"));
        chile.agregarJugador(new Jugador("Sebastián Vegas", 25, "Defensa"));
        chile.agregarJugador(new Jugador("Eugenio Mena", 33, "Defensa"));
        return chile;
    }

    private Equipo crearEquipoColombia() {
        Equipo colombia = new Equipo("Colombia", "Reinaldo Rueda");
        colombia.agregarJugador(new Jugador("James Rodríguez", 29, "Centrocampista"));
        colombia.agregarJugador(new Jugador("Juan Cuadrado", 33, "Extremo"));
        colombia.agregarJugador(new Jugador("Radamel Falcao", 35, "Delantero"));
        colombia.agregarJugador(new Jugador("David Ospina", 32, "Portero"));
        colombia.agregarJugador(new Jugador("Duván Zapata", 30, "Delantero"));
        colombia.agregarJugador(new Jugador("Wilmar Barrios", 27, "Centrocampista"));
        colombia.agregarJugador(new Jugador("Yerry Mina", 26, "Defensa"));
        colombia.agregarJugador(new Jugador("Santiago Arias", 29, "Defensa"));
        colombia.agregarJugador(new Jugador("Jefferson Lerma", 26, "Centrocampista"));
        colombia.agregarJugador(new Jugador("Mateus Uribe", 30, "Centrocampista"));
        colombia.agregarJugador(new Jugador("Luis Muriel", 30, "Delantero"));
        colombia.agregarJugador(new Jugador("Juan Fernando Quintero", 28, "Centrocampista"));
        colombia.agregarJugador(new Jugador("Daniel Muñoz", 25, "Defensa"));
        colombia.agregarJugador(new Jugador("Davinson Sánchez", 25, "Defensa"));
        colombia.agregarJugador(new Jugador("Luis Díaz", 24, "Extremo"));
        colombia.agregarJugador(new Jugador("Gustavo Cuéllar", 28, "Centrocampista"));
        colombia.agregarJugador(new Jugador("Alfredo Morelos", 25, "Delantero"));
        colombia.agregarJugador(new Jugador("William Tesillo", 31, "Defensa"));
        colombia.agregarJugador(new Jugador("Camilo Vargas", 32, "Portero"));
        return colombia;
    }

    private Equipo crearEquipoPortugal() {
        Equipo portugal = new Equipo("Portugal", "Fernando Santos");
        portugal.agregarJugador(new Jugador("Cristiano Ronaldo", 36, "Delantero"));
        portugal.agregarJugador(new Jugador("Bruno Fernandes", 27, "Centrocampista"));
        portugal.agregarJugador(new Jugador("João Félix", 22, "Delantero"));
        portugal.agregarJugador(new Jugador("Rui Patrício", 33, "Portero"));
        portugal.agregarJugador(new Jugador("Pepe", 38, "Defensa"));
        portugal.agregarJugador(new Jugador("Bernardo Silva", 26, "Centrocampista"));
        portugal.agregarJugador(new Jugador("Rúben Dias", 24, "Defensa"));
        portugal.agregarJugador(new Jugador("João Cancelo", 27, "Defensa"));
        portugal.agregarJugador(new Jugador("André Silva", 26, "Delantero"));
        portugal.agregarJugador(new Jugador("Renato Sanches", 23, "Centrocampista"));
        portugal.agregarJugador(new Jugador("Raphaël Guerreiro", 28, "Defensa"));
        portugal.agregarJugador(new Jugador("Diogo Jota", 25, "Delantero"));
        portugal.agregarJugador(new Jugador("Danilo Pereira", 30, "Centrocampista"));
        portugal.agregarJugador(new Jugador("Nélson Semedo", 28, "Defensa"));
        portugal.agregarJugador(new Jugador("William Carvalho", 29, "Centrocampista"));
        portugal.agregarJugador(new Jugador("José Fonte", 37, "Defensa"));
        portugal.agregarJugador(new Jugador("Pedro Neto", 21, "Delantero"));
        portugal.agregarJugador(new Jugador("Anthony Lopes", 30, "Portero"));
        portugal.agregarJugador(new Jugador("Gonçalo Guedes", 24, "Delantero"));
        return portugal;
    }

    private Equipo crearEquipoAlemania() {
        Equipo alemania = new Equipo("Alemania", "Joachim Löw");
        alemania.agregarJugador(new Jugador("Manuel Neuer", 35, "Portero"));
        alemania.agregarJugador(new Jugador("Joshua Kimmich", 26, "Centrocampista"));
        alemania.agregarJugador(new Jugador("Toni Kroos", 31, "Centrocampista"));
        alemania.agregarJugador(new Jugador("Timo Werner", 25, "Delantero"));
        alemania.agregarJugador(new Jugador("Leroy Sané", 25, "Extremo"));
        alemania.agregarJugador(new Jugador("Serge Gnabry", 25, "Delantero"));
        alemania.agregarJugador(new Jugador("Marco Reus", 32, "Delantero"));
        alemania.agregarJugador(new Jugador("Matthias Ginter", 27, "Defensa"));
        alemania.agregarJugador(new Jugador("Niklas Süle", 25, "Defensa"));
        alemania.agregarJugador(new Jugador("Leon Goretzka", 26, "Centrocampista"));
        alemania.agregarJugador(new Jugador("Ilkay Gündogan", 31, "Centrocampista"));
        alemania.agregarJugador(new Jugador("Emre Can", 27, "Centrocampista"));
        alemania.agregarJugador(new Jugador("Julian Brandt", 25, "Centrocampista"));
        alemania.agregarJugador(new Jugador("Marcel Halstenberg", 30, "Defensa"));
        alemania.agregarJugador(new Jugador("Jonathan Tah", 25, "Defensa"));
        alemania.agregarJugador(new Jugador("Marc-André ter Stegen", 29, "Portero"));
        alemania.agregarJugador(new Jugador("Robin Gosens", 26, "Defensa"));
        alemania.agregarJugador(new Jugador("Kai Havertz", 22, "Centrocampista"));
        alemania.agregarJugador(new Jugador("Bernd Leno", 29, "Portero"));
        return alemania;
    }
}
