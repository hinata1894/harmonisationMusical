package projet;

public class Note {
	protected int note;
	protected int duree = 1; //par d�faut c'est la dur�e d'une noire

	public Note(String nomNote){
		note = noteStringEnNoteInt(nomNote);
	}
	
	public Note(String nomNote, int temps){
		duree = temps;
		note = noteStringEnNoteInt(nomNote);
	}
	
	public Note(int nom){
		note = nom;
	}
	
	public Note(int nom, int temps){
		duree = temps;
		note = nom;
	}

	public int getDuree() {
		return duree;
	}
	public void setDuree(int duree) {
		this.duree = duree;
	}

	public int getNote() {
		return note;
	}

	public void setNote(int note) {
		this.note = note;
	}
	
	public boolean noteValide(int n, int min, int max){
		if (n != 28){//si note diff�rente d'un silence
			if (n >= min && n <= max)
				return true;
			return false;
		}
		return true;
	}
	
	public int noteStringEnNoteInt(String nomNote){
		switch (nomNote){
		case "do1":
			return 0;
		case "do2":
			return 7;
		case "do3":
			return 14;
		case "do4":
			return 21;
		case "re1":
			return 1;
		case "re2":
			return 8;
		case "re3":
			return 15;
		case "re4":
			return 22;
		case "mi1":
			return 2;
		case "mi2":
			return 9;
		case "mi3":
			return 16;
		case "mi4":
			return 23;
		case "fa1":
			return 3;
		case "fa2":
			return 10;
		case "fa3":
			return 17;
		case "fa4":
			return 24;
		case "sol1":
			return 4;
		case "sol2":
			return 11;
		case "sol3":
			return 18;
		case "sol4":
			return 25;
		case "la1":
			return 5;
		case "la2":
			return 12;
		case "la3":
			return 19;
		case "la4":
			return 26;
		case "si1":
			return 6;
		case "si2":
			return 13;
		case "si3":
			return 20;
		case "si4":
			return 27;
		case "-":
			return 28;//silence
		default:
			return -1;
		}
	}

	public String toString(){
		String nomNote = "";
		switch (note){
		case 0:
			nomNote = "do1";
			break;
		case 7:
			nomNote = "do2";
			break;
		case 14:
			nomNote = "do3";
			break;
		case 21:
			nomNote = "do4";
			break;
		case 1:
			nomNote = "re1";
			break;
		case 8:
			nomNote = "re2";
			break;
		case 15:
			nomNote = "re3";
			break;
		case 22:
			nomNote = "re4";
			break;
		case 2:
			nomNote = "mi1";
			break;
		case 9:
			nomNote = "mi2";
			break;
		case 16:
			nomNote = "mi3";
			break;
		case 23:
			nomNote = "mi4";
			break;
		case 3:
			nomNote = "fa1";
			break;
		case 10:
			nomNote = "fa2";
			break;
		case 17:
			nomNote = "fa3";
			break;
		case 24:
			nomNote = "fa4";
			break;
		case 4:
			nomNote = "sol1";
			break;
		case 11:
			nomNote = "sol2";
			break;
		case 18:
			nomNote = "sol3";
			break;
		case 25:
			nomNote = "sol4";
			break;
		case 5:
			nomNote = "la1";
			break;
		case 12:
			nomNote = "la2";
			break;
		case 19:
			nomNote = "la3";
			break;
		case 26:
			nomNote = "la4";
			break;
		case 6:
			nomNote = "si1";
			break;
		case 13:
			nomNote = "si2";
			break;
		case 20:
			nomNote = "si3";
			break;
		case 27:
			nomNote = "si4";
			break;
		case 28:
			nomNote = "-";
			break;
		}
		
		return nomNote;
	}
	
	public static String noteIntEnNoteString(int nomNote){
		switch (nomNote) {
		case 0: case 7: case 14: case 21:
			return "do";
		case 1: case 8: case 15: case 22:
			return "re";
		case 2: case 9: case 16: case 23:
			return "mi";
		case 3: case 10: case 17: case 24:
			return "fa";
		case 4: case 11: case 18: case 25:
			return "sol";
		case 5: case 12: case 19: case 26:
			return "la";
		case 6: case 13: case 20: case 27:
			return "si";
		case 28:
			return "-";
		default:
			System.err.println("Erreur de note");
			return "";
		}
	}
	
	public static int[] noteStringSimpleEnNoteInt(String nom){
		int[] tab = new int[4];
		switch(nom){
		case "do":
			tab[0] = 0;
			tab[1] = 7;
			tab[2] = 14;
			tab[3] = 21;
			break;
		case "re":
			tab[0] = 1;
			tab[1] = 8;
			tab[2] = 15;
			tab[3] = 22;
			break;
		case "mi":
			tab[0] = 2;
			tab[1] = 9;
			tab[2] = 16;
			tab[3] = 23;
			break;
		case "fa":
			tab[0] = 3;
			tab[1] = 10;
			tab[2] = 17;
			tab[3] = 24;
			break;
		case "sol":
			tab[0] = 4;
			tab[1] = 11;
			tab[2] = 18;
			tab[3] = 25;
			break;
		case "la":
			tab[0] = 5;
			tab[1] = 12;
			tab[2] = 19;
			tab[3] = 26;
			break;
		case "si":
			tab[0] = 6;
			tab[1] = 13;
			tab[2] = 20;
			tab[3] = 27;
			break;
		}
		return tab;
	}
	
	public boolean equals(Note n){
		if (note == n.note)
			return true;
		return false;
	}
	
	public boolean equals(int n){
		if (note == n)
			return true;
		return false;
	}
	
	public boolean superieur(Note n){
		if (note >= n.note)
			return true;
		return false;
	}
	
	public boolean inferieur(Note n){
		if (note <= n.note)
			return true;
		return false;
	}

}
