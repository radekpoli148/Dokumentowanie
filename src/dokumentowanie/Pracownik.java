/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dokumentowanie;

/**
 * Obiekt <code>Pracownik</code> reprezentuje Pracownika, jest to nadklasa dla...
 * opis
 * opis
 * opis
 * 
 * @author Radosław Potyrała
 * @version 1.0.1 20/01/2023
 * @see dokumentowanie.Pracownik#getWynagrodzenie() 
 */
public class Pracownik 
{
    /**
     * Konstuktor domyślny
     */
    public Pracownik(){}
    
    /**
     * Konstruktor tworzący obiekt <code>Pracownik</code> z imieniem i nazwiskiem
     * @param imie ustawia imie
     * @param nazwisko ustawia nazwisko
     */
    public Pracownik(String imie, String nazwisko)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
    /**
     * Konstruktor tworzący obiekt <code>Pracownik</code> z imieniem i nazwiskiem 
     * @param imie ustawia imie
     * @param nazwisko ustawia nazwisko
     * @param wynagrodzenie ustawia wynagrodzenie
     */
    public Pracownik(String imie, String nazwisko, double wynagrodzenie)
    {
        this(imie, nazwisko);
        this.wynagrodzenie = wynagrodzenie;
    }
    
    /**
     * <pre>
     * Jak używać:
     * Pracownik p = new Pracownik();
     * p.setWynagrodzenie(3500);
     * </pre>
     * @param nPensja - ustawia pracownikowi nowe wynagrodzenie
     */
    public void setWynagrodzenie(double nPensja)
    {
        this.wynagrodzenie = nPensja;
    }
    
    /**
     * @since 1.0.0
     * @return zwraca pensje typu double w zł
     */
    public double getWynagrodzenie()
    {
        return this.wynagrodzenie;
    }
    /**
     * Imie pracownika
     */
    private String imie;
    /**
     * nazwisko pracownika
     */
    private String nazwisko;
    /**
     * wynagrodzenie pracownika
     */
    private double wynagrodzenie;
}
