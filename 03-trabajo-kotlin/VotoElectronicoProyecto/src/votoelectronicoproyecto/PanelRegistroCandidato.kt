/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votoelectronicoproyecto

import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent
import java.awt.event.MouseListener
import javax.swing.JOptionPane
import modelo.Candidato
import modelo.Votos

/**
 *
 * @author Hp
 */
class PanelRegistroCandidato : javax.swing.JPanel(), MouseListener {

    /**
     * Creates new form PanelRegistroCandidato
     */
    internal var mod = Candidato()


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private var butBorrarCandidatos: javax.swing.JButton? = null
    private var butBuscarCandidato: javax.swing.JButton? = null
    private var butInfo: javax.swing.JButton? = null
    private var butLimpiarDatosCandidato: javax.swing.JButton? = null
    private var butRegistrarCandidato: javax.swing.JButton? = null
    private var cboTipoIdCandidato: javax.swing.JComboBox<String>? = null
    private var labApellidoCandidato: javax.swing.JLabel? = null
    private var labCarreraCandidato: javax.swing.JLabel? = null
    private var labDatosCandidato: javax.swing.JLabel? = null
    private var labFondoSistema: javax.swing.JLabel? = null
    private var labIdCandidato: javax.swing.JLabel? = null
    private var labNivelCandidato: javax.swing.JLabel? = null
    private var labNombreCandidato: javax.swing.JLabel? = null
    private var labTipoIdCandidato: javax.swing.JLabel? = null
    private var txtApellidoCandidato: javax.swing.JTextField? = null
    private var txtCarreraCandidato: javax.swing.JTextField? = null
    private var txtIdCandidato: javax.swing.JTextField? = null
    private var txtNivelCandidato: javax.swing.JTextField? = null
    private var txtNombreCandidato: javax.swing.JTextField? = null

    init {
        initComponents()
        butInfo!!.addMouseListener(object : MouseAdapter() {

            override fun mouseEntered(e: MouseEvent) {
                JOptionPane.showMessageDialog(null, "Por favor ingrese solo el id del candidato para buscar y para eliminar")
            }

        })
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private// <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    fun initComponents() {

        labDatosCandidato = javax.swing.JLabel()
        labNombreCandidato = javax.swing.JLabel()
        labApellidoCandidato = javax.swing.JLabel()
        labIdCandidato = javax.swing.JLabel()
        labTipoIdCandidato = javax.swing.JLabel()
        labNivelCandidato = javax.swing.JLabel()
        butRegistrarCandidato = javax.swing.JButton()
        butBuscarCandidato = javax.swing.JButton()
        butLimpiarDatosCandidato = javax.swing.JButton()
        butBorrarCandidatos = javax.swing.JButton()
        txtNombreCandidato = javax.swing.JTextField()
        txtApellidoCandidato = javax.swing.JTextField()
        txtIdCandidato = javax.swing.JTextField()
        txtNivelCandidato = javax.swing.JTextField()
        cboTipoIdCandidato = javax.swing.JComboBox()
        labCarreraCandidato = javax.swing.JLabel()
        txtCarreraCandidato = javax.swing.JTextField()
        butInfo = javax.swing.JButton()
        labFondoSistema = javax.swing.JLabel()

        setMinimumSize(java.awt.Dimension(543, 4700))
        setOpaque(false)
        setLayout(null)

        labDatosCandidato!!.setFont(java.awt.Font("Times New Roman", 1, 18)) // NOI18N
        labDatosCandidato!!.setText("DATOS DEL CANDIDATO")
        add(labDatosCandidato)
        labDatosCandidato!!.setBounds(182, 28, 217, 22)

        labNombreCandidato!!.setFont(java.awt.Font("Times New Roman", 1, 18)) // NOI18N
        labNombreCandidato!!.setText("Nombre:")
        add(labNombreCandidato)
        labNombreCandidato!!.setBounds(52, 98, 68, 22)

        labApellidoCandidato!!.setFont(java.awt.Font("Times New Roman", 1, 18)) // NOI18N
        labApellidoCandidato!!.setText("Apellido:")
        add(labApellidoCandidato)
        labApellidoCandidato!!.setBounds(52, 148, 71, 22)

        labIdCandidato!!.setFont(java.awt.Font("Times New Roman", 1, 18)) // NOI18N
        labIdCandidato!!.setText("Id:")
        add(labIdCandidato)
        labIdCandidato!!.setBounds(52, 200, 22, 22)

        labTipoIdCandidato!!.setFont(java.awt.Font("Times New Roman", 1, 18)) // NOI18N
        labTipoIdCandidato!!.setText("Tipo Id:")
        add(labTipoIdCandidato)
        labTipoIdCandidato!!.setBounds(50, 250, 63, 22)

        labNivelCandidato!!.setFont(java.awt.Font("Times New Roman", 1, 18)) // NOI18N
        labNivelCandidato!!.setText("Nivel:")
        add(labNivelCandidato)
        labNivelCandidato!!.setBounds(50, 340, 45, 22)

        butRegistrarCandidato!!.setFont(java.awt.Font("Times New Roman", 1, 14)) // NOI18N
        butRegistrarCandidato!!.setText("Registrar")
        butRegistrarCandidato!!.addActionListener { evt -> butRegistrarCandidatoActionPerformed(evt) }
        add(butRegistrarCandidato)
        butRegistrarCandidato!!.setBounds(380, 130, 88, 33)

        butBuscarCandidato!!.setFont(java.awt.Font("Times New Roman", 1, 14)) // NOI18N
        butBuscarCandidato!!.setText("Buscar")
        butBuscarCandidato!!.addActionListener { evt -> butBuscarCandidatoActionPerformed(evt) }
        add(butBuscarCandidato)
        butBuscarCandidato!!.setBounds(380, 190, 91, 33)

        butLimpiarDatosCandidato!!.setFont(java.awt.Font("Times New Roman", 1, 14)) // NOI18N
        butLimpiarDatosCandidato!!.setText("Limpiar")
        butLimpiarDatosCandidato!!.addActionListener { evt -> butLimpiarDatosCandidatoActionPerformed(evt) }
        add(butLimpiarDatosCandidato)
        butLimpiarDatosCandidato!!.setBounds(380, 320, 91, 33)

        butBorrarCandidatos!!.setFont(java.awt.Font("Times New Roman", 1, 14)) // NOI18N
        butBorrarCandidatos!!.setText("Borrar")
        butBorrarCandidatos!!.addActionListener { evt -> butBorrarCandidatosActionPerformed(evt) }
        add(butBorrarCandidatos)
        butBorrarCandidatos!!.setBounds(380, 250, 91, 33)
        add(txtNombreCandidato)
        txtNombreCandidato!!.setBounds(138, 101, 101, 24)
        add(txtApellidoCandidato)
        txtApellidoCandidato!!.setBounds(141, 151, 98, 24)
        add(txtIdCandidato)
        txtIdCandidato!!.setBounds(140, 200, 98, 24)
        add(txtNivelCandidato)
        txtNivelCandidato!!.setBounds(140, 340, 98, 24)

        cboTipoIdCandidato!!.setModel(javax.swing.DefaultComboBoxModel(arrayOf("cedula", "pasaporte")))
        add(cboTipoIdCandidato)
        cboTipoIdCandidato!!.setBounds(140, 250, 100, 30)

        labCarreraCandidato!!.setFont(java.awt.Font("Times New Roman", 1, 18)) // NOI18N
        labCarreraCandidato!!.setText("Carrera:")
        add(labCarreraCandidato)
        labCarreraCandidato!!.setBounds(50, 300, 70, 30)
        add(txtCarreraCandidato)
        txtCarreraCandidato!!.setBounds(140, 300, 100, 24)

        butInfo!!.setBounds(440, 380, 30, 32)

    }// </editor-fold>//GEN-END:initComponents

    private fun butRegistrarCandidatoActionPerformed(evt: java.awt.event.ActionEvent) {//GEN-FIRST:event_butRegistrarCandidatoActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_butRegistrarCandidatoActionPerformed

    private fun butBuscarCandidatoActionPerformed(evt: java.awt.event.ActionEvent) {//GEN-FIRST:event_butBuscarCandidatoActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_butBuscarCandidatoActionPerformed

    private fun butBorrarCandidatosActionPerformed(evt: java.awt.event.ActionEvent) {//GEN-FIRST:event_butBorrarCandidatosActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_butBorrarCandidatosActionPerformed

    private fun butLimpiarDatosCandidatoActionPerformed(evt: java.awt.event.ActionEvent) {//GEN-FIRST:event_butLimpiarDatosCandidatoActionPerformed
        // TODO add your handling code here:
        limpiar()
    }//GEN-LAST:event_butLimpiarDatosCandidatoActionPerformed

    private fun limpiar() {
        txtNombreCandidato!!.setText("")
        txtApellidoCandidato!!.setText("")
        txtIdCandidato!!.setText("")
        txtCarreraCandidato!!.setText("")
        txtNivelCandidato!!.setText("")
    }
    // End of variables declaration//GEN-END:variables


    override fun mouseClicked(e: MouseEvent) {
        throw UnsupportedOperationException("Not supported yet.") //To change body of generated methods, choose Tools | Templates.
    }

    override fun mousePressed(e: MouseEvent) {
        throw UnsupportedOperationException("Not supported yet.") //To change body of generated methods, choose Tools | Templates.
    }

    override fun mouseReleased(e: MouseEvent) {
        throw UnsupportedOperationException("Not supported yet.") //To change body of generated methods, choose Tools | Templates.
    }

    override fun mouseEntered(e: MouseEvent) {
        throw UnsupportedOperationException("Not supported yet.") //To change body of generated methods, choose Tools | Templates.
    }

    override fun mouseExited(e: MouseEvent) {
        throw UnsupportedOperationException("Not supported yet.") //To change body of generated methods, choose Tools | Templates.
    }
}
