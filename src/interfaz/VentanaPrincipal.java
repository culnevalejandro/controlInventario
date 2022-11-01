package interfaz;
import dominio.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author culne
 */
public class VentanaPrincipal extends javax.swing.JFrame implements ActionListener{
    private Sistema modelo;
    private boolean existeVentanaEliminar = false;
    private boolean existeVentanaAgregar = false;
    /**
     * Creates new form VentanaPrincipal
     * @param existe
     */
    
    public void setExisteVentanaEliminar(boolean existe){
        this.existeVentanaEliminar = existe;
    }
    
    public void setExisteVentanaAgregar(boolean existe){
        this.existeVentanaAgregar = existe;
    }
    
    public VentanaPrincipal(Sistema unSistema) {
        this.modelo = unSistema;
        
        initComponents();
        radioChina.addActionListener(this);
        radioRusia.addActionListener(this);
        radioEEUU.addActionListener(this);
        radioLanzadera.addActionListener(this);
        radioTripulada.addActionListener(this);
        radioNoTripulada.addActionListener(this);
        actualizar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        btnGroup = new javax.swing.ButtonGroup();
        jMenuItem2 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        resetFiltros = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        radioRusia = new javax.swing.JRadioButton();
        radioEEUU = new javax.swing.JRadioButton();
        radioChina = new javax.swing.JRadioButton();
        radioLanzadera = new javax.swing.JRadioButton();
        radioNoTripulada = new javax.swing.JRadioButton();
        radioTripulada = new javax.swing.JRadioButton();
        radioNinguno = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        menuBorrarDatos = new javax.swing.JMenuItem();
        menuResetearDatos = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        agregarLanzadera = new javax.swing.JMenuItem();
        menuEliminar = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menuPrepararLanzamiento = new javax.swing.JMenuItem();
        menuCombustible = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inventario naves");
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("Inventario naves"); // NOI18N
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setText("Filtrar por:");

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo de nave", "Modelo", "País", "Condiciones óptimas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabla.getTableHeader().setReorderingAllowed(false);
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tablaMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tabla);
        tabla.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setResizable(false);
            tabla.getColumnModel().getColumn(1).setResizable(false);
            tabla.getColumnModel().getColumn(2).setResizable(false);
            tabla.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel2.setText("Países");

        jLabel3.setText("Tipo de nave");

        resetFiltros.setText("Resetear filtros");
        resetFiltros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetFiltrosActionPerformed(evt);
            }
        });

        jLabel4.setText("Buscar modelo");

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });

        btnGroup.add(radioRusia);
        radioRusia.setText("Rusia");

        btnGroup.add(radioEEUU);
        radioEEUU.setText("EEUU");

        btnGroup.add(radioChina);
        radioChina.setText("China");

        btnGroup.add(radioLanzadera);
        radioLanzadera.setText("Lanzadera");
        radioLanzadera.setActionCommand("");

        btnGroup.add(radioNoTripulada);
        radioNoTripulada.setText("No tripulada");
        radioNoTripulada.setActionCommand("");

        btnGroup.add(radioTripulada);
        radioTripulada.setText("Tripulada");
        radioTripulada.setActionCommand("");

        btnGroup.add(radioNinguno);
        radioNinguno.setSelected(true);
        radioNinguno.setText("Ninguno");
        radioNinguno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioNingunoActionPerformed(evt);
            }
        });

        jLabel5.setText("Características nave");

        txtArea.setEditable(false);
        txtArea.setColumns(20);
        txtArea.setRows(1);
        jScrollPane3.setViewportView(txtArea);

        jMenu2.setText("Archivo");

        menuBorrarDatos.setText("Borrar datos");
        menuBorrarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBorrarDatosActionPerformed(evt);
            }
        });
        jMenu2.add(menuBorrarDatos);

        menuResetearDatos.setText("Resetear datos");
        menuResetearDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuResetearDatosActionPerformed(evt);
            }
        });
        jMenu2.add(menuResetearDatos);

        jMenuBar1.add(jMenu2);

        jMenu1.setText("Nave");

        agregarLanzadera.setText("Añadir");
        agregarLanzadera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarLanzaderaActionPerformed(evt);
            }
        });
        jMenu1.add(agregarLanzadera);

        menuEliminar.setText("Eliminar");
        menuEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEliminarActionPerformed(evt);
            }
        });
        jMenu1.add(menuEliminar);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Acciones");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        menuPrepararLanzamiento.setText("Realizar mantenimiento");
        menuPrepararLanzamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPrepararLanzamientoActionPerformed(evt);
            }
        });
        jMenu3.add(menuPrepararLanzamiento);

        menuCombustible.setText("Combustible a usar");
        menuCombustible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCombustibleActionPerformed(evt);
            }
        });
        jMenu3.add(menuCombustible);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtBuscar)
                                .addComponent(resetFiltros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(radioEEUU, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(radioRusia, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(radioChina, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(radioLanzadera)
                                                .addComponent(radioNoTripulada)
                                                .addComponent(radioTripulada)))))
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(radioNinguno)))
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioNinguno)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioRusia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioEEUU)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioChina)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioLanzadera)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioNoTripulada)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioTripulada)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(resetFiltros)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarLanzaderaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarLanzaderaActionPerformed
        if(!existeVentanaAgregar){
            AnadirNave ventana = new AnadirNave(modelo,this);
            ventana.setVisible(true);
            setExisteVentanaAgregar(true);
        }
    }//GEN-LAST:event_agregarLanzaderaActionPerformed

    private void resetFiltrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetFiltrosActionPerformed
        resetear();
        this.txtBuscar.setText("");
        this.txtArea.setText("");
        actualizar();
    }//GEN-LAST:event_resetFiltrosActionPerformed

    private void menuEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEliminarActionPerformed

        if(!existeVentanaEliminar){
            EliminarNave ventana = new EliminarNave(modelo,this, tabla.getModel());
            ventana.setVisible(true);
            setExisteVentanaEliminar(true);
        }
        
        
    }//GEN-LAST:event_menuEliminarActionPerformed

    private void radioNingunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioNingunoActionPerformed
        actualizar();
    }//GEN-LAST:event_radioNingunoActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        FileOutputStream archivo = null;
        try {
            archivo = new FileOutputStream("datos.sis");
            ObjectOutputStream serializador = null;
            try {
                serializador = new ObjectOutputStream(archivo);
            } catch (IOException ex) {
                Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                serializador.writeObject(modelo);
            } catch (IOException ex) {
                Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                archivo.close();
            } catch (IOException ex) {
                Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_formWindowClosing

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        ordenarTabla();
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void menuBorrarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBorrarDatosActionPerformed
        int i = JOptionPane.showConfirmDialog(this,"¿Realmente desea eliminar todas las naves?");
        if(i==0){
            modelo.borrarListaNaves();
            resetear();
            actualizar();
            this.txtBuscar.setText("");
        }
    }//GEN-LAST:event_menuBorrarDatosActionPerformed

    private void menuResetearDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuResetearDatosActionPerformed
        int i = JOptionPane.showConfirmDialog(this,"¿Realmente desea volver a las naves predeterminadas?");
        if(i==0){
            modelo.borrarListaNaves();
            modelo.agregarNavesPredeterminadas();
            resetear();
            actualizar();
            this.txtBuscar.setText("");
        }
    }//GEN-LAST:event_menuResetearDatosActionPerformed

    private void tablaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseReleased
        int fila = tabla.getSelectedRow();
        int filaOriginal = tabla.convertRowIndexToModel(fila);
        
        TableModel tableModel = tabla.getModel();
        tableModel.getValueAt(filaOriginal, 1);
        for(Nave nave : modelo.getListaNaves()){
            if(nave.getModelo().equals(tableModel.getValueAt(filaOriginal, 1))){
                txtArea.setText(nave.toString());
            }
        }
        
    }//GEN-LAST:event_tablaMouseReleased

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
 
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void menuPrepararLanzamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPrepararLanzamientoActionPerformed
        int fila = tabla.getSelectedRow();
        if(fila !=-1){
        int filaOriginal = tabla.convertRowIndexToModel(fila);
            TableModel tableModel = tabla.getModel();
            tableModel.getValueAt(filaOriginal, 1);

            for(Nave nave : modelo.getListaNaves()){
                if(nave.getModelo().equals(tableModel.getValueAt(filaOriginal, 1))){
                    JFrame jf=new JFrame();
                    jf.setAlwaysOnTop(true);
                    JOptionPane.showMessageDialog(jf,nave.realizarMantenimiento());
                }
            }
            
        }else{
            JFrame jf=new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf,"Seleccione una nave de la lista");
        }
    }//GEN-LAST:event_menuPrepararLanzamientoActionPerformed

    private void menuCombustibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCombustibleActionPerformed
        int fila = tabla.getSelectedRow();
        if(fila !=-1){
        int filaOriginal = tabla.convertRowIndexToModel(fila);
            TableModel tableModel = tabla.getModel();
            tableModel.getValueAt(filaOriginal, 1);

            for(Nave nave : modelo.getListaNaves()){
                if(nave.getModelo().equals(tableModel.getValueAt(filaOriginal, 1))){
                    JFrame jf=new JFrame();
                    jf.setAlwaysOnTop(true);
                    JOptionPane.showMessageDialog(jf,nave.tipoCombustible());
                }
            }
            
        }else{
            JFrame jf=new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf,"Seleccione una nave de la lista");
        }
    }//GEN-LAST:event_menuCombustibleActionPerformed


    
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem agregarLanzadera;
    private javax.swing.ButtonGroup btnGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JMenuItem menuBorrarDatos;
    private javax.swing.JMenuItem menuCombustible;
    private javax.swing.JMenuItem menuEliminar;
    private javax.swing.JMenuItem menuPrepararLanzamiento;
    private javax.swing.JMenuItem menuResetearDatos;
    private javax.swing.JRadioButton radioChina;
    private javax.swing.JRadioButton radioEEUU;
    private javax.swing.JRadioButton radioLanzadera;
    private javax.swing.JRadioButton radioNinguno;
    private javax.swing.JRadioButton radioNoTripulada;
    private javax.swing.JRadioButton radioRusia;
    private javax.swing.JRadioButton radioTripulada;
    private javax.swing.JButton resetFiltros;
    private javax.swing.JTable tabla;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables

    
    public void actualizar(){
        DefaultTableModel tableModel = (DefaultTableModel) tabla.getModel();
        tableModel.setRowCount(0);
        for (Nave nave : modelo.getListaNaves()) {
            String tipoNave = "";
            
            if(nave instanceof Lanzadera){
                tipoNave = "Lanzadera";
            }else if(nave instanceof NoTripulada){
                tipoNave = "No tripulada";
            }else if(nave instanceof Tripulada){
                tipoNave = "Tripulada";
            }
            
            Object[] fila = {
                tipoNave,
                nave.getModelo(),
                nave.getPais(),
                nave.getCondicionesOptimas()};
            tableModel.addRow(fila);
        }
        
        tabla.setModel(tableModel);
        ordenarTabla();
    }
    
    public void ordenarTabla(){
        DefaultTableModel tableModel = (DefaultTableModel) tabla.getModel();
        TableRowSorter sorter = new TableRowSorter(tableModel);
        tabla.setRowSorter(sorter);
        
        txtBuscar.getDocument().addDocumentListener(new DocumentListener(){
            @Override
            public void insertUpdate(DocumentEvent e) {
                tableModel.fireTableDataChanged();
                resetear();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                tableModel.fireTableDataChanged();
                resetear();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                tableModel.fireTableDataChanged();
                resetear();
            }
            
        });
        
        //BUSQUEDA
        sorter.setRowFilter(new RowFilter(){
            @Override
            public boolean include(Entry entry) {
                String modeloNave = entry.getValue(1).toString().toUpperCase();
                String busqueda = txtBuscar.getText().toUpperCase();
                return modeloNave.startsWith(busqueda);
            }
            
        });
        
        String filtro = null;
        
        if(radioLanzadera.isSelected()){
            filtro = "Lanzadera";
        }else if(radioNoTripulada.isSelected()){
            filtro = "No tripulada";
        }else if(radioTripulada.isSelected()){
            filtro = "Tripulada";
        }else if(radioRusia.isSelected()){
            filtro = "Rusia";
        }else if(radioEEUU.isSelected()){
            filtro = "EEUU";
        }else if(radioChina.isSelected()){
            filtro = "China";
        }else if (radioNinguno.isSelected()){
            filtro = null;
        }
        
        if(filtro!=null){
            sorter.setRowFilter(RowFilter.regexFilter(filtro));
        }
        
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        ordenarTabla();
        this.txtBuscar.setText("");
    }

    private void resetear() {
        this.radioNinguno.setSelected(true);
        this.radioChina.setSelected(false);
        this.radioRusia.setSelected(false);
        this.radioEEUU.setSelected(false);
        this.radioLanzadera.setSelected(false);
        this.radioTripulada.setSelected(false);
        this.radioNoTripulada.setSelected(false);
    }
}