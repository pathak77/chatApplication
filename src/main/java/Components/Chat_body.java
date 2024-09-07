
package Components;

import swing.JscrollBar;
import java.awt.Color;
import net.miginfocom.swing.MigLayout;


public class Chat_body extends javax.swing.JPanel {

   
    public Chat_body() {
        initComponents();
        init();
        addItemLeft("alfjsdfh kldsfakls jdfhaklsdjfbd");
    }
    
    private void init(){
        body.setLayout(new MigLayout("fillx"));
        sp.setVerticalScrollBar(new JscrollBar());
        sp.getVerticalScrollBar().setBackground(Color.WHITE);
    }
    
     public void addItemLeft(String text) {
           Chat_Left item = new Chat_Left();
        item.setText(text);
        body.add(item, "wrap, w ::80%");
        //  ::80% set max with 80%
        body.repaint();
        body.revalidate();
     }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        sp = new javax.swing.JScrollPane();
        body = new javax.swing.JLayeredPane();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        sp.setBackground(new java.awt.Color(255, 255, 255));
        sp.setBorder(null);

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 365, Short.MAX_VALUE)
        );

        sp.setViewportView(body);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sp)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sp)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane body;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane sp;
    // End of variables declaration//GEN-END:variables
}
