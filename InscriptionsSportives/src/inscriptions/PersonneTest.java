package inscriptions;

import static org.junit.Assert.*;


import org.junit.Test;
import java.time.LocalDate;

import inscriptions.Competition;
import inscriptions.Inscriptions;
import inscriptions.Personne;
import inscriptions.Equipe;
//import inscriptions.Candidat;

public class PersonneTest {

//	@Before
//	public void setUp() throws Exception {
//	}
//
//	@After
//	public void tearDown() throws Exception {
//	}

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}
		
		
	Inscriptions inscriptions ;

	
	    Personne personneTestA ;
	    Personne personneTestB ;

	    Equipe equipeTestA; 
	    Equipe equipeTestB;
	    
	    Competition competitionTestA ;
	    Competition competitionTestB ;
	   

	    final String input = "31-01-2019";
	    final LocalDate localDate = LocalDate.now();

//	    Inscriptions inscriptions = Inscriptions.getInscriptions();
//	    Competition foot = inscriptions.createCompetition("Mondial de foot", localDate, false);
	//
	    Personne testP = inscriptions.createPersonne("Test", "Test", "test");
	    
	    Equipe lesmanouches = inscriptions.createEquipe("Les Manouches");

	    @Test
	    public void testPersonne() {
	    	
	inscriptions = Inscriptions.getInscriptions();
			
			personneTestA = inscriptions.createPersonne("nomTestA", "prenomTestA", "mailTestA");
			personneTestB = inscriptions.createPersonne("nomTestB", "prenomTestB", "mailTestB");

			competitionTestA = inscriptions.createCompetition("nomcompetitionTestA",null, false);
			competitionTestB = inscriptions.createCompetition("nomcompetitionTestB", null, true);
			
			equipeTestA = inscriptions.createEquipe("nomequipeTestA");
			equipeTestB = inscriptions.createEquipe("nomequipeTestB");
			



	      
	    }

	    @Test
	    public void testGetPrenom() {
	    	
			
	        String prenom = personneTestA.getPrenom();
			assertEquals("prenomTestA", prenom );
//	        assertEquals("Get : " + prenom + " , Dent de plomb", prenom, "Dent de plomb");
	    }
	@Test
	    public void testSetPrenom() {
//	        String prenom = "testSet";
	//
//	        Personne testSet = inscriptions.createPersonne("test", prenom, "azerty");
	//
//	        assertEquals("Set : " + prenom + " , " + testSet.getPrenom(), testSet.getPrenom(), prenom);

		personneTestA.setPrenom("testPrenomSet");
		
		String testSetPrenom = personneTestA.getPrenom();
		assertEquals("testPrenomSet", testSetPrenom );
	}

	    @Test
	    public void testGetMail() {
	    	
	        String mail = personneTestA.getMail();

	        assertEquals("mailTestA", mail);
	    }

	    @Test
	    public void testSetMail() {
	        String mail = "1234";

	        Personne personneTestA = inscriptions.createPersonne("test", "test", mail);

	        assertEquals("SetMail : " + mail + " , " + personneTestA.getMail(), personneTestA.getMail(), mail);
	    }

	    @Test
	    public void testGetEquipes() {
	    	Equipe lesmanouches = inscriptions.createEquipe("Les Manouches");
	    	Personne tony = inscriptions.createPersonne("Tony", "Dent de plomb", "azerty");
	    	lesmanouches.add(tony);
	    	
	    	assertEquals("getEquipes : " + lesmanouches + " ont pour membres : " + tony, lesmanouches);
	    }

	    @Test
	    public void testAdd() {
	    	equipeTestA.add(personneTestA);
			assertEquals(true,equipeTestA.getMembres().contains(personneTestA));    
		}

	    
	    
	    @Test
	    public void testDelete() {
	    	
	    	personneTestA.delete();
			assertEquals(true,!inscriptions.getCandidats().contains(personneTestA));
			assertEquals(true,!equipeTestA.getMembres().contains(personneTestA));
			assertEquals(true,!competitionTestA.getCandidats().contains(personneTestA));
			
//			
//			competitionTestA.delete();
//			assertFalse(personneTestA.getCompetitions().contains(competitionTestA));
		}

	}

