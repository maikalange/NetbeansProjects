/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit211residentialhashmaptutorial;

/**
 *
 * @author MARCUS
 */
public class PensionRecord {
    private String pensionNumber;
    private String currentEmployer;
    private String fullName;
    private String nrc;
    
    public PensionRecord(String nrc,String pensionNumber){
        this.pensionNumber = pensionNumber;
        this.nrc = nrc;
        
        getPensionData();
    }
    
   
    private void getPensionData(){
        //load information from database
        fullName = "Tedious Chinkuli";
        currentEmployer = "Tazama Pipe Lines Ltd";
    }
    
    @Override
    public String toString(){
        return "Full name:" + fullName + " Employer:" + currentEmployer + " NRC:" + nrc;
    }
}
