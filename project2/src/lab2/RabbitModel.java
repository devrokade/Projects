package lab2;
import java.util.Random;
/**
 * A RabbitModel is used to simulate the growth
 * of a population of rabbits. 
 */
public class RabbitModel
{
  private int initialPop;
  private int lastYear;
  private int yearBefore;
  public RabbitModel()
  {
    initialPop=0;
    lastYear=1;
    yearBefore=0;  
    // TODO
  }  
 
  /**
   * Returns the current number of rabbits.
   * @return
   *   current rabbit population
   */
  public int getPopulation()
  {
    return initialPop;
  }
  
  /**
   * Updates the population to simulate the
   * passing of one year.
   */
  public void simulateYear()
  {
	 
	  initialPop=lastYear + yearBefore;
	  yearBefore=lastYear;
	  lastYear=lastYear+1;
  }
  
  /**
   * Sets or resets the state of the model to the 
   * initial conditions.
   */
  public void reset()
  {
	  initialPop=0;
  }
}
