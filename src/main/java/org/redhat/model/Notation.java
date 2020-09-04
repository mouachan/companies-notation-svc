package org.redhat.model;


public class Notation {
    private double score;
    private String note;
    private String orientation;
    private double decoupageSectoriel;
    private String typeAiguillage;
      /**
     * @return String return the Orientation
     */
    public String getOrientation() {
        return orientation;
    }

    /**
     * @param Orientation the Orientation to set
     */
    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    /**
     * @return double return the decoupageSectoriel
     */
    public double getDecoupageSectoriel() {
        return decoupageSectoriel;
    }

    /**
     * @param decoupageSectoriel the decoupageSectoriel to set
     */
    public void setDecoupageSectoriel(double decoupageSectoriel) {
        this.decoupageSectoriel = decoupageSectoriel;
    }

    /**
     * @return String return the typeAiguillage
     */
    public String getTypeAiguillage() {
        return typeAiguillage;
    }

    /**
     * @param typeAiguillage the typeAiguillage to set
     */
    public void setTypeAiguillage(String typeAiguillage) {
        this.typeAiguillage = typeAiguillage;
    }


    /**
     * @return double return the score
     */
    public double getScore() {
        return score;
    }

    /**
     * @param score the score to set
     */
    public void setScore(double score) {
        this.score = score;
    }

    /**
     * @return String return the note
     */
    public String getNote() {
        return note;
    }

    /**
     * @param note the note to set
     */
    public void setNote(String note) {
        this.note = note;
    }




	@Override
	public String toString() {
		return "Notation [decoupageSectoriel=" + decoupageSectoriel + ", note=" + note
				+ ", orientation=" + orientation + ", score=" + score + ", typeAiguillage=" + typeAiguillage + "]";
    }
    
   /* public void toNotation(HashMap<String,Object> map){
        for (String key : map.keySet()) {
            System.out.println("key "+key+ " value "+map.get(key));
            if(key.equals("decoupageSectoriel"))
                this.setDecoupageSectoriel(((BigDecimal)map.get(key)).doubleValue());
            else if(key.equals("note"))
                this.setNote((String)map.get(key));
            else if(key.equals("typeAiguillage"))
                 this.setTypeAiguillage((String)map.get(key));
            if(key.equals("score"))
                 this.setScore(((BigDecimal)map.get(key)).doubleValue());
            else if(key.equals("orientation"))
                 this.setOrientation((String)map.get(key));
      
        }

    }*/




}