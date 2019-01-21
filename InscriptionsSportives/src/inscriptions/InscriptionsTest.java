package inscriptions;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.time.LocalDate;
import inscriptions.Competition;
import inscriptions.Inscriptions;
import inscriptions.Personne;
import inscriptions.Equipe;

public class InscriptionsTest {

//	@Before
//	public void setUp() throws Exception {
//	}
//
//	@After
//	public void tearDown() throws Exception {
//	}
//
//	@Test
//	public void test() {
//		fail("Not yet implemented");
		
		Inscriptions inscriptions ;

	    Personne Neymar ;
	    Personne Balotelli ;

	    Equipe ogcnice;
	    Equipe PSG;
	    
	    Competition Ligue1 ;
	    Competition Ligue2;
	   
		
		@Before
	    public void setUp() {
			inscriptions = Inscriptions.getInscriptions();

			Inscriptions inscriptions = Inscriptions.getInscriptions();
			ogcnice = inscriptions.createEquipe("OGCNICE");
			PSG = inscriptions.createEquipe("PSG");
			Balotelli = inscriptions.createPersonne("balotelli", "mario"," mario.balotelli@hotmail.fr");
			Neymar = inscriptions.createPersonne("Neymar", "Neymar", "Neymar@hotmail.fr");

	       
	    }

	    @After
	    public void tearDown() {
	    }

		
		@Test
		public void testgetCompetitions() {
			assertTrue(inscriptions.getCompetitions().contains(Ligue1));
			assertTrue(inscriptions.getCompetitions().contains(Ligue2));

		}
		
		@Test
		public void testgetCandidats() {
			assertEquals(true,inscriptions.getCandidats().contains(Neymar));
			assertEquals(true,inscriptions.getCandidats().contains(PSG));
		}
		
		@Test
		public void testgetPersonnes() {
			assertEquals(true,inscriptions.getPersonnes().contains(Balotelli));
		}
		
		@Test
		public void testgetEquipes() {
			assertTrue(inscriptions.getEquipes().contains(ogcnice));
		}
		
		@Test
		public void testcreateCompetition() {
			Competition Liga = inscriptions.createCompetition("Liga", LocalDate.now().plusDays(20), true);
			assertTrue(inscriptions.getCompetitions().contains(Liga));
		}
		
		@Test
		public void testcreatePersonne() {
			Personne Mbappe = inscriptions.createPersonne("Mbappe", "Kyllian", "killyan@hotmail.fr");
			assertTrue(inscriptions.getPersonnes().contains(Mbappe));
		}
		
		@Test
		public void testcreateEquipe() {
			Equipe OM = inscriptions.createEquipe("OLYMPIQUEDEMARSEILLE");
			assertTrue(inscriptions.getEquipes().contains(OM));
		}
		
		@Test
		public void testgetInscriptions()
		{
			assertEquals(inscriptions, Inscriptions.getInscriptions());
		}
		
		
	
	
	}


