
package Frm;
import Controladores.MostrarCliente;
import Entidades.Clientes;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class ICliente extends javax.swing.JFrame {

    /**
     * Creates new form ICliente
     */
    public ICliente() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnbarra = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDui = new javax.swing.JTextField();
        TxtTelefono = new javax.swing.JTextField();
        TxtDireccion = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnbarra.setBackground(new java.awt.Color(255, 166, 33));
        pnbarra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        pnbarra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnbarraMouseDragged(evt);
            }
        });
        pnbarra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnbarraMousePressed(evt);
            }
        });
        pnbarra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Clientes");
        pnbarra.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(pnbarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 30));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        txtNombre.setBackground(new java.awt.Color(102, 102, 102));
        txtNombre.setFont(new java.awt.Font("Century Schoolbook", 0, 12)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setCaretColor(new java.awt.Color(255, 255, 255));
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 54, 275, 30));

        jLabel3.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Edad");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Telefono:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Dirección:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        txtDui.setBackground(new java.awt.Color(102, 102, 102));
        txtDui.setForeground(new java.awt.Color(255, 255, 255));
        txtDui.setCaretColor(new java.awt.Color(255, 255, 255));
        txtDui.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDuiKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDuiKeyTyped(evt);
            }
        });
        jPanel1.add(txtDui, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 275, 30));

        TxtTelefono.setBackground(new java.awt.Color(102, 102, 102));
        TxtTelefono.setForeground(new java.awt.Color(255, 255, 255));
        TxtTelefono.setCaretColor(new java.awt.Color(255, 255, 255));
        TxtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtTelefonoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtTelefonoKeyTyped(evt);
            }
        });
        jPanel1.add(TxtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 275, 30));

        TxtDireccion.setBackground(new java.awt.Color(102, 102, 102));
        TxtDireccion.setForeground(new java.awt.Color(255, 255, 255));
        TxtDireccion.setCaretColor(new java.awt.Color(255, 255, 255));
        TxtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtDireccionKeyReleased(evt);
            }
        });
        jPanel1.add(TxtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 275, 30));

        btnGuardar.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 110, 30));

        btnCancelar.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 110, 30));

        jLabel6.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Dui");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        txtEdad.setBackground(new java.awt.Color(102, 102, 102));
        txtEdad.setForeground(new java.awt.Color(255, 255, 255));
        txtEdad.setCaretColor(new java.awt.Color(255, 255, 255));
        txtEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEdadKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEdadKeyTyped(evt);
            }
        });
        jPanel1.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 275, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 470, 370));

        lblFondo.setBackground(new java.awt.Color(153, 153, 153));
        lblFondo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblFondo.setMaximumSize(new java.awt.Dimension(1111, 800));
        lblFondo.setOpaque(true);
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

            int xx,yy;
                    
    private void pnbarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnbarraMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x-xx, y-yy);

    }//GEN-LAST:event_pnbarraMouseDragged

    private void pnbarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnbarraMousePressed
        xx=evt.getX();
        yy=evt.getY();
    }//GEN-LAST:event_pnbarraMousePressed

     void guardar(){
     Clientes cl = new Clientes();
        MostrarCliente mc = new MostrarCliente();
       cl.setNombre(txtNombre.getText());
       cl.setDui(txtDui.getText());
       cl.setEdad(Integer.parseInt(txtEdad.getText()));
       cl.setTelefono(TxtTelefono.getText());
       cl.setDireccion(TxtDireccion.getText());
          
       try {
            mc.InsertarPersona(cl);
        } catch (SQLException ex) {
            System.err.println(ex);
            
        }
       this.dispose();
    
     }
     
     void comprobado(){
     String dui= txtDui.getText();
     String telefono = TxtTelefono.getText();
     Boolean Telefonocorrecto1=telefono.matches("\\d{8}");
   Boolean Telefonocorrecto2=telefono.matches("\\d{4}+-\\d{4}");
        Boolean DuiCorrecto=dui.matches("\\d{8}+-\\d");
          
        if((txtNombre.getText().equals("")||TxtTelefono.getText().equals("")||txtDui.getText().equals("")||txtEdad.getText().equals("")||TxtDireccion.getText().equals(""))==false){
        if(DuiCorrecto){
            if(Telefonocorrecto1 || Telefonocorrecto2){
 guardar(); 
   }
            else{
            JOptionPane.showMessageDialog(null, "Ingrese un telefono correcto, Formato ejemplo: 12345678 o 1234-5678");
            } 
        }
        else{
            JOptionPane.showMessageDialog(null, "Ingrese un Dui correcto Formato ejemplo: 12345678kñ79jm-1 ");
        }
        }
        else{
        JOptionPane.showMessageDialog(null, "Por favor ingrese datos en los campos vacios ");
        }
        
     }
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
       comprobado();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
      this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
if(evt.getKeyCode()== KeyEvent.VK_ENTER){
          comprobado();
       } 
if(evt.getKeyCode()== KeyEvent.VK_ESCAPE){
          this.dispose();
       } 
    }//GEN-LAST:event_txtNombreKeyReleased

    private void txtDuiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDuiKeyReleased
       if(evt.getKeyCode()== KeyEvent.VK_ENTER){
           comprobado();
       } 
       if(evt.getKeyCode()== KeyEvent.VK_ESCAPE){
          this.dispose();
       }  
           
    }//GEN-LAST:event_txtDuiKeyReleased

    private void txtEdadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadKeyReleased
if(evt.getKeyCode()== KeyEvent.VK_ENTER){
           comprobado();
       }  
if(evt.getKeyCode()== KeyEvent.VK_ESCAPE){
          this.dispose();
       }  
    }//GEN-LAST:event_txtEdadKeyReleased

    private void TxtTelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtTelefonoKeyReleased

        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            comprobado();
       } 
if(evt.getKeyCode()== KeyEvent.VK_ESCAPE){
          this.dispose();
       }  // TODO add your handling code here:
    }//GEN-LAST:event_TxtTelefonoKeyReleased

    private void TxtDireccionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtDireccionKeyReleased
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
           comprobado();
       }  
         if(evt.getKeyCode()== KeyEvent.VK_ESCAPE){
          this.dispose();
       }   
    }//GEN-LAST:event_TxtDireccionKeyReleased

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
       char validacion = evt.getKeyChar();
       int letras = (int)evt.getKeyChar();
       if((letras>=65 && letras<=90 ||letras>=97 && letras<=122|| letras==32  )==false){
evt.consume();
}
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadKeyTyped
        char validacion = evt.getKeyChar();
    if((Character.isDigit(validacion))==false){
     evt.consume();
    }
      int tamaño = txtEdad.getText().length();
    if(tamaño>=3){
         evt.consume();
  
}
    }//GEN-LAST:event_txtEdadKeyTyped

    private void txtDuiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDuiKeyTyped
    char validacion = evt.getKeyChar();
    int letras = (int)evt.getKeyChar();
    if((Character.isDigit(validacion))==false && letras != 45 ){
     evt.consume();
}
      int tamaño = txtDui.getText().length();
    if(tamaño>=10){
         evt.consume();
    }
    }//GEN-LAST:event_txtDuiKeyTyped

    private void TxtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtTelefonoKeyTyped
    char validacion = evt.getKeyChar();
    int letras = (int)evt.getKeyChar();
    if((Character.isDigit(validacion))==false && letras != 45 ){
     evt.consume();
    }
     int tamaño = TxtTelefono.getText().length();
    if(tamaño>=9){
         evt.consume();
    }
    }//GEN-LAST:event_TxtTelefonoKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ICliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ICliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ICliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ICliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ICliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtDireccion;
    private javax.swing.JTextField TxtTelefono;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JPanel pnbarra;
    private javax.swing.JTextField txtDui;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
