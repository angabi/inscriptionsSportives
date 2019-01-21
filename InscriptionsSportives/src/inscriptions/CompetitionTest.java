package inscriptions;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.time.LocalDate;
import java.time.Month;



import inscriptions.Competition;
import inscriptions.Inscriptions;
import inscriptions.Personne;
import inscriptions.Equipe;



public class CompetitionTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	

	Inscriptions inscriptions ;

    Personne personneTestA ;
    Personne personneTestB ;

    Equipe equipeTestA; 
    Equipe equipeTestB;
    
    Competition competitionTestA ;
    Competition competitionTestB ;
   
	
	@Test
    public void testCompetition() {
		inscriptions = Inscriptions.getInscriptions();
		
		personneTestA = inscriptions.createPersonne("nomTestA", "prenomTestA", "mailTestA");
		personneTestB = inscriptions.createPersonne("nomTestB", "prenomTestB", "mailTestB");

		competitionTestA = inscriptions.createCompetition("nomcompetitionTestA",null, false);
		competitionTestB = inscriptions.createCompetition("nomcompetitionTestB", null, true);
		
		equipeTestA = inscriptions.createEquipe("nomequipeTestA");
		equipeTestB = inscriptions.createEquipe("nomequipeTestB");
       
    }


	@Test
	public void testgetNomCompetition()
	{
		assertEquals("nomcompetitionTestA",competitionTestA.getNom());
	}
	
	@Test
	public void testsetNomCompetition()
	 {
		competitionTestA.setNom("setnomcompetitionTestA");
		
		String setNom = competitionTestA.getNom();
		assertEquals("setnomcompetitionTestA", setNom );
	 }
	
	@Test
	public void testinscritionsOuverte()
	{
		assertEquals(true,competitionTestA.inscriptionsOuvertes());
	}
	
	@Test
	public void testgetDateColture()
	{
		assertEquals(null,competitionTestA.getDateCloture());
	}
	
	@Test
	public void testestEnEquipe()
	{
		assertEquals(true,competitionTestB.estEnEquipe());
	}
	
	@Test
	public void testsetDateCloture()
	{
		LocalDate testDate = LocalDate.of(2018, Month.DECEMBER, 13);
		competitionTestA.setDateCloture(testDate);
		assertEquals(testDate,competitionTestA.getDateCloture());
	}
	
	@Test
	public void testgetCandidat()
	{
		competitionTestA.add(personneTestA);
		assertTrue(competitionTestA.getCandidats().contains(personneTestA));
	}
	
	@Test
	public void testaddpersonne()
	{
		competitionTestB.add(personneTestB);
//		assertTrue(competitiontest.getCandidats().contains(personnetest2));
		assertEquals(personneTestB, competitionTestB.getCandidats());

	}
	
	@Test
	public void testaddequipe()	
	{
		competitionTestB.add(equipeTestA);
		assertTrue(competitionTestB.getCandidats().contains(equipeTestA));
	}
	

	@Test
	public void testremove()
	{
		competitionTestB.add(personneTestB);
		assertTrue(competitionTestB.getCandidats().contains(personneTestB));
		competitionTestB.remove(personneTestB);
		assertFalse(competitionTestB.getCandidats().contains(personneTestB));
	}
	
	@Test
	public void testdelete() {
		competitionTestA.add(personneTestA);
		competitionTestA.delete();
		assertFalse(personneTestA.getCompetitions().contains(competitionTestA));
	}
	
	@Test
	public void testcompareTocompetition() {
		Competition LIGUE1 = inscriptions.createCompetition("nomcompetitionTestA",null, false);
		assertEquals(0, competitionTestA.compareTo(LIGUE1));
	}

}
	
	
//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}



