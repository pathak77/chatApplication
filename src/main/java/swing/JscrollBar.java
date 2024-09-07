
package swing;

import swing.ModernScrollBarUI;
import java.awt.Dimension;
import javax.swing.JScrollBar;

/**
 *
 * @author aayus
 */
public class JscrollBar extends JScrollBar{
      public JscrollBar(){
           setUI(new ModernScrollBarUI());
           setSize(new Dimension(5,5));
       }
}
