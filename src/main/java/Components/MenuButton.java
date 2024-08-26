
package Components;

import java.awt.Graphics;
import javax.swing.Icon;
import javax.swing.JButton;


public class MenuButton extends JButton { 
   
    
    
    private Icon iconSimple;
    private Icon iconSelected;

    public void setIconSimple(Icon iconSimple) {
        this.iconSimple = iconSimple;
    }

    public void setIconSelected(Icon iconSelected) {
        this.iconSelected = iconSelected;
    }
    public Icon getIconSimple() {
        return iconSimple;
    }

    public Icon getIconSelected() {
        return iconSelected;
    }
    
    
    public MenuButton(){
        setContentAreaFilled(false);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }

    
   
    @Override
    public void setSelected(boolean bln){
        super.setSelected(bln);
        if(bln){
            setIcon(iconSelected);
        }
        else{
            setIcon(iconSimple);
        }
    }
    
  

}
