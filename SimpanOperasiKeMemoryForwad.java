
/**
 * Write a description of class SimpanOperasiKeMemoryForwad here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SimpanOperasiKeMemoryForwad implements SimpanOperasiCalculator
{
    private String[] dataMemori = new String[10];
    private int pointer = 0;
    private String tampilMemori;
    public SimpanOperasiKeMemoryForwad()
    {
        
    }

    /**
     * simpanOperasi
     *
     * @param  String data
     * @return void
     */
    public void simpanOperasi(String data)
    {
        this.dataMemori[pointer] = data;
        this.pointer = this.pointer + 1;
        if (this.pointer > 9) this.pointer = 0;
        //this.pointer = this.pointer > 9 ? 0 : this.pointer; 
       
    }
    
    /**
     * bacaOperasi
     *
     * @param  void
     * @return StringArray
     */
    public String bacaOperasi()
    {
        dataMemoriKeTampil();
        return this.tampilMemori;
       
    }
    
     /**
     * dataMemoriKeTampil
     *
     * @param  void
     * @return void
     */
    public void dataMemoriKeTampil()
    {
        this.tampilMemori = "";
        for(int i=0; i<this.pointer; i++)
        {
            this.tampilMemori = this.tampilMemori + " " + this.dataMemori[i] + "\n" ;
        }
       
    }
    
}
