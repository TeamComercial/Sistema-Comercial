package Frm;
import javax.swing.table.DefaultTableModel;
import Controladores.MostrarCliente;
import Entidades.Clientes;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

import javax.swing.table.JTableHeader;

/**
 *
 * @author ittov
 */
public class Tpersona extends javax.swing.JFrame {
 public static String cliente,direccion,dui,id2;
    /**
     * Creates new form Tpersona
     */
    public Tpersona() {
        initComponents();
        this.setLocationRelativeTo(null);
        buscar();
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        btnCancelar = new javax.swing.JButton();
        txtBuscador = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnSeleccionar = new javax.swing.JButton();
        pnbarra = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tblCliente.setBackground(new java.awt.Color(11, 55, 68));
        tblCliente.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        tblCliente.setForeground(new java.awt.Color(255, 255, 255));
        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblCliente.setGridColor(new java.awt.Color(255, 255, 255));
        tblCliente.setInheritsPopupMenu(true);
        tblCliente.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblCliente.getTableHeader().setResizingAllowed(false);
        tblCliente.getTableHeader().setReorderingAllowed(false);
        tblCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClienteMouseClicked(evt);
            }
        });
        tblCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblClienteKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblCliente);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 700, 290));

        btnCancelar.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 410, 200, 50));

        txtBuscador.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        txtBuscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscadorKeyReleased(evt);
            }
        });
        jPanel1.add(txtBuscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 410, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, -1));

        btnSeleccionar.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        btnSeleccionar.setForeground(new java.awt.Color(255, 255, 255));
        btnSeleccionar.setText("Seleccionar");
        btnSeleccionar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btnSeleccionar.setContentAreaFilled(false);
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });
        jPanel1.add(btnSeleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 200, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 800, 500));

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
        pnbarra.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        getContentPane().add(pnbarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 30));

        lblFondo.setBackground(new java.awt.Color(153, 153, 153));
        lblFondo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblFondo.setMaximumSize(new java.awt.Dimension(1111, 800));
        lblFondo.setOpaque(true);
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
      seleccionar();
    }//GEN-LAST:event_btnSeleccionarActionPerformed

    void seleccionar(){
 int fila = tblCliente.getSelectedRow();
 if(fila>=0){
       id2 = String.valueOf(tblCliente.getModel().getValueAt(tblCliente.getSelectedRow(), 0));
       cliente = String.valueOf(tblCliente.getModel().getValueAt(tblCliente.getSelectedRow(), 1));
       direccion = String.valueOf(tblCliente.getModel().getValueAt(tblCliente.getSelectedRow(), 5));
       dui = String.valueOf(tblCliente.getModel().getValueAt(tblCliente.getSelectedRow(), 2));
       inicio.cambio();
          this.dispose();}
 else{
           JOptionPane.showMessageDialog(null,"Seleccione una fila");
       }
}
    
  public static  void buscar(){
     String Titulo[]={"ID","Cliente","Dui","Edad","Telefono","Direccion"};
DefaultTableModel bc = new DefaultTableModel(null, Titulo){
    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }
};
        Clientes cl = new Clientes();
    cl.setNombre(txtBuscador.getText());
    MostrarCliente mc = new MostrarCliente();
    ArrayList<Clientes> Cl= mc.BuscarClientes(cl);
    Iterator i =  Cl.iterator();
    String Filas[] = new String[6];
    while (i.hasNext()) {        
        Clientes c;
        c= (Clientes)i.next();
        Filas[0]=String.valueOf(c.getId_Cliente());
        Filas[1]= c.getNombre();
        Filas[2]=c.getDui();
        Filas[3]=String.valueOf(c.getEdad());
        Filas[4]=c.getTelefono();
        Filas[5]=c.getDireccion();
        bc.addRow(Filas);
         
    }
  
tblCliente.setModel(bc);
        tabla();
}
    
    
    
    int xx,yy;
    private void pnbarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnbarraMousePressed
        xx=evt.getX();
        yy=evt.getY();
    }//GEN-LAST:event_pnbarraMousePressed

    private void pnbarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnbarraMouseDragged
    int x = evt.getXOnScreen();
    int y = evt.getYOnScreen();
    
       this.setLocation(x-xx, y-yy);
    
    }//GEN-LAST:event_pnbarraMouseDragged

    private void txtBuscadorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscadorKeyReleased
        buscar();
    }//GEN-LAST:event_txtBuscadorKeyReleased

    private void tblClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClienteMouseClicked
      if(evt.getClickCount()==2){
         seleccionar();
       }
    }//GEN-LAST:event_tblClienteMouseClicked

    private void tblClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblClienteKeyPressed
       tblCliente.getInputMap(tblCliente.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT).put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0,false), "selectColumnCell");
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            seleccionar();}
    }//GEN-LAST:event_tblClienteKeyPressed

    
    public static void tabla(){
        JTableHeader th = tblCliente.getTableHeader();
        Font fuente = new Font("Century Schoolbook", Font.PLAIN, 14);
th.setFont(fuente); 
tblCliente.getColumnModel().getColumn(1).setPreferredWidth(150);
tblCliente.getColumnModel().getColumn(5).setPreferredWidth(200);
tblCliente.getColumnModel().getColumn(3).setPreferredWidth(10);
tblCliente.getColumnModel().getColumn(2).setPreferredWidth(50);
tblCliente.removeColumn(tblCliente.getColumnModel().getColumn(0));
    }
     
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
            java.util.logging.Logger.getLogger(Tpersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tpersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tpersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tpersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tpersona().setVisible(true);
            }
        });
    }
  
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JPanel pnbarra;
    public static javax.swing.JTable tblCliente;
    public static javax.swing.JTextField txtBuscador;
    // End of variables declaration//GEN-END:variables
}
