package inscriptions;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import inscriptions.Competition;
import inscriptions.Inscriptions;
import inscriptions.Personne;
import inscriptions.Equipe;

public class EquipeTest {
	
	Inscriptions inscriptions;
	
	Equipe ogcnice;
	Personne Dante;
	Personne Balotelli;
	Competition Ligue1;
	
	


	@Before
	public void setUp() throws Exception {
		
		Inscriptions inscriptions = Inscriptions.getInscriptions();
		ogcnice = inscriptions.createEquipe("OGCNICE");
		Balotelli = inscriptions.createPersonne("balotelli", "mario"," mario.balotelli@hotmail.fr");
		Dante = inscriptions.createPersonne("Dante", "Dante", "dante@hotmail.fr");

		
	}

	@After
	public void tearDown() throws Exception {
		
	}
	
//	@Test
//	public void test() {
//		fail("Not yet implemented");
//		
//	}
//	
	
		
		@Test
		public void testEquipe() {
			Equipe NGABI = inscriptions.createEquipe("NGABI TEAM");
			assertEquals(true,NGABI.getNom().contains("NGABI TEAM"));
		}
		

		
		
		@Test
		public void testGetMembres() {
			ogcnice.add(Balotelli);
	    	assertEquals(true,ogcnice.getMembres().contains(Balotelli));
		}
		
		@Test
	    public void add() {
			
			ogcnice.add(Dante);
			assertEquals(true,ogcnice.getMembres().contains(Dante));
			
		}

		
		
//		@Test
//	    public void testSetMail() {
//	        String mail = "mario.balotelli@hotmail.fr";
	//
//	        Personne Balotelli = inscriptions.createPersonne("BALOTELLI", "Mario", mail);
	//
//	        assertEquals("Le mail est : " + mail + " , " + Balotelli.getMail(), Balotelli.getMail(), mail);
//	    }
		
		
		@Test
		public void testDelete() {
			
			Ligue1.add(Balotelli);
			assertEquals(true,Ligue1.getCandidats().contains(Balotelli));
			ogcnice.add(Balotelli);
			assertEquals(true,ogcnice.getMembres().contains(Balotelli));
			Balotelli.delete();
			assertEquals(true,!Ligue1.getCandidats().contains(Balotelli));
			assertEquals(true,!ogcnice.getMembres().contains(Balotelli));
			
			
//			assertEquals(true,inscriptions.getCandidats().contains(ogcnice));
//			ogcnice.delete();
//			assertEquals(false, inscriptions.getCandidats().contains(ogcnice));

			
		}
		
		@Test
		public void testRemove() {
			
			ogcnice.add(Dante);
			assertEquals(true,ogcnice.getMembres().contains(Dante));
			ogcnice.remove(Dante);
			assertEquals(false,ogcnice.getMembres().contains(Dante));

				
			
		}
		
		@Test
		public void testToString() {
			
//A FAIRE
			
			
		}

	}

