/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votoelectronicoproyecto

import java.util.StringTokenizer
import modelo.Candidato
import modelo.SqlCandidato
import modelo.SqlVotos
import modelo.Votos

/**
 *
 * @author Hp
 */
class PanelTResultados : javax.swing.JPanel() {

    /**
     * Creates new form PanelTResultados
     */

    internal var votos = Votos()
    internal var cand = Candidato()


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private var jButton1: javax.swing.JButton? = null
    private var jFrame1: javax.swing.JFrame? = null
    private var jFrame2: javax.swing.JFrame? = null
    private var jFrame3: javax.swing.JFrame? = null
    private var jLabel1: javax.swing.JLabel? = null
    private var labBlanco: javax.swing.JLabel? = null
    private var labCandidatoA: javax.swing.JLabel? = null
    private var labCandidatoB: javax.swing.JLabel? = null
    private var labCandidatoC: javax.swing.JLabel? = null
    private var labNumero: javax.swing.JLabel? = null
    private var labPorcentaje: javax.swing.JLabel? = null
    private var labResultados: javax.swing.JLabel? = null
    private var labTotalVotos: javax.swing.JLabel? = null
    private var txtNumCandidatoA: javax.swing.JTextField? = null
    private var txtNumCandidatoB: javax.swing.JTextField? = null
    private var txtNumCandidatoC: javax.swing.JTextField? = null
    private var txtNumTotalVotos: javax.swing.JTextField? = null
    private var txtNumVotosBlanco: javax.swing.JTextField? = null
    private var txtPorcCandidatoA: javax.swing.JTextField? = null
    private var txtPorcCandidatoB: javax.swing.JTextField? = null
    private var txtPorcCandidatoC: javax.swing.JTextField? = null
    private var txtPorcTotalVotos: javax.swing.JTextField? = null
    private var txtPorcVotosBlanco: javax.swing.JTextField? = null

    init {
        initComponents()
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private// <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    fun initComponents() {

        jFrame1 = javax.swing.JFrame()
        jFrame2 = javax.swing.JFrame()
        jFrame3 = javax.swing.JFrame()
        labResultados = javax.swing.JLabel()
        labTotalVotos = javax.swing.JLabel()
        labBlanco = javax.swing.JLabel()
        labCandidatoA = javax.swing.JLabel()
        labCandidatoB = javax.swing.JLabel()
        labCandidatoC = javax.swing.JLabel()
        labNumero = javax.swing.JLabel()
        labPorcentaje = javax.swing.JLabel()
        txtNumTotalVotos = javax.swing.JTextField()
        txtNumVotosBlanco = javax.swing.JTextField()
        txtNumCandidatoA = javax.swing.JTextField()
        txtNumCandidatoB = javax.swing.JTextField()
        txtNumCandidatoC = javax.swing.JTextField()
        txtPorcTotalVotos = javax.swing.JTextField()
        txtPorcVotosBlanco = javax.swing.JTextField()
        txtPorcCandidatoA = javax.swing.JTextField()
        txtPorcCandidatoB = javax.swing.JTextField()
        txtPorcCandidatoC = javax.swing.JTextField()
        jButton1 = javax.swing.JButton()
        jLabel1 = javax.swing.JLabel()

        setMinimumSize(java.awt.Dimension(650, 651))
        setLayout(null)

        labResultados!!.setFont(java.awt.Font("Times New Roman", 1, 24)) // NOI18N
        labResultados!!.setText("RESULTADOS")
        add(labResultados)
        labResultados!!.setBounds(195, 11, 171, 28)

        labTotalVotos!!.setFont(java.awt.Font("Times New Roman", 1, 14)) // NOI18N
        labTotalVotos!!.setText("Total Votos:")
        add(labTotalVotos)
        labTotalVotos!!.setBounds(54, 104, 75, 17)

        labBlanco!!.setFont(java.awt.Font("Times New Roman", 1, 14)) // NOI18N
        labBlanco!!.setText("En Blanco:")
        add(labBlanco)
        labBlanco!!.setBounds(60, 170, 78, 17)

        labCandidatoA!!.setFont(java.awt.Font("Times New Roman", 1, 14)) // NOI18N
        labCandidatoA!!.setText("Veronica Zambrano")
        add(labCandidatoA)
        labCandidatoA!!.setBounds(11, 230, 130, 17)

        labCandidatoB!!.setFont(java.awt.Font("Times New Roman", 1, 14)) // NOI18N
        labCandidatoB!!.setText("Alberto Plaza")
        add(labCandidatoB)
        labCandidatoB!!.setBounds(40, 290, 90, 17)

        labCandidatoC!!.setFont(java.awt.Font("Times New Roman", 1, 14)) // NOI18N
        labCandidatoC!!.setText("Carla Salas")
        add(labCandidatoC)
        labCandidatoC!!.setBounds(54, 347, 70, 17)

        labNumero!!.setFont(java.awt.Font("Times New Roman", 1, 14)) // NOI18N
        labNumero!!.setText("N°")
        add(labNumero)
        labNumero!!.setBounds(165, 73, 15, 17)

        labPorcentaje!!.setFont(java.awt.Font("Times New Roman", 1, 14)) // NOI18N
        labPorcentaje!!.setText("%")
        add(labPorcentaje)
        labPorcentaje!!.setBounds(274, 67, 15, 17)

        txtNumTotalVotos!!.setFont(java.awt.Font("Times New Roman", 1, 14)) // NOI18N
        add(txtNumTotalVotos)
        txtNumTotalVotos!!.setBounds(150, 101, 48, 25)

        txtNumVotosBlanco!!.setFont(java.awt.Font("Times New Roman", 1, 14)) // NOI18N
        add(txtNumVotosBlanco)
        txtNumVotosBlanco!!.setBounds(150, 170, 48, 25)

        txtNumCandidatoA!!.setFont(java.awt.Font("Times New Roman", 1, 14)) // NOI18N
        add(txtNumCandidatoA)
        txtNumCandidatoA!!.setBounds(150, 230, 45, 25)

        txtNumCandidatoB!!.setFont(java.awt.Font("Times New Roman", 1, 14)) // NOI18N
        txtNumCandidatoB!!.addActionListener(object : java.awt.event.ActionListener() {
            fun actionPerformed(evt: java.awt.event.ActionEvent) {
                txtNumCandidatoBActionPerformed(evt)
            }
        })
        add(txtNumCandidatoB)
        txtNumCandidatoB!!.setBounds(150, 290, 44, 25)

        txtNumCandidatoC!!.setFont(java.awt.Font("Times New Roman", 1, 14)) // NOI18N
        add(txtNumCandidatoC)
        txtNumCandidatoC!!.setBounds(150, 344, 46, 25)

        txtPorcTotalVotos!!.setFont(java.awt.Font("Times New Roman", 1, 14)) // NOI18N
        add(txtPorcTotalVotos)
        txtPorcTotalVotos!!.setBounds(262, 102, 60, 25)

        txtPorcVotosBlanco!!.setFont(java.awt.Font("Times New Roman", 1, 14)) // NOI18N
        add(txtPorcVotosBlanco)
        txtPorcVotosBlanco!!.setBounds(260, 170, 60, 25)

        txtPorcCandidatoA!!.setFont(java.awt.Font("Times New Roman", 1, 14)) // NOI18N
        add(txtPorcCandidatoA)
        txtPorcCandidatoA!!.setBounds(260, 230, 60, 25)

        txtPorcCandidatoB!!.setFont(java.awt.Font("Times New Roman", 1, 14)) // NOI18N
        txtPorcCandidatoB!!.addActionListener(object : java.awt.event.ActionListener() {
            fun actionPerformed(evt: java.awt.event.ActionEvent) {
                txtPorcCandidatoBActionPerformed(evt)
            }
        })
        add(txtPorcCandidatoB)
        txtPorcCandidatoB!!.setBounds(260, 290, 60, 25)

        txtPorcCandidatoC!!.setFont(java.awt.Font("Times New Roman", 1, 14)) // NOI18N
        add(txtPorcCandidatoC)
        txtPorcCandidatoC!!.setBounds(260, 340, 60, 25)

        jButton1!!.setText("Mostrar Resultados")
        jButton1!!.addActionListener(object : java.awt.event.ActionListener() {
            fun actionPerformed(evt: java.awt.event.ActionEvent) {
                jButton1ActionPerformed(evt)
            }
        })
        add(jButton1)
        jButton1!!.setBounds(350, 340, 150, 40)

        jLabel1!!.setIcon(javax.swing.ImageIcon(getClass().getResource("/Logos/FondoSistema.jpg"))) // NOI18N
        add(jLabel1)
        jLabel1!!.setBounds(0, 0, 530, 430)
    }// </editor-fold>//GEN-END:initComponents

    private fun txtNumCandidatoBActionPerformed(evt: java.awt.event.ActionEvent) {//GEN-FIRST:event_txtNumCandidatoBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumCandidatoBActionPerformed

    private fun txtPorcCandidatoBActionPerformed(evt: java.awt.event.ActionEvent) {//GEN-FIRST:event_txtPorcCandidatoBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPorcCandidatoBActionPerformed

    private fun jButton1ActionPerformed(evt: java.awt.event.ActionEvent) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        val modSql = SqlVotos()
        val candidato = SqlCandidato()

        val numVotos = modSql.votosTotales(votos)
        val numBlancos = modSql.votosEnBlanco(votos)
        // Para el candidato A
        val tokenA = StringTokenizer(labCandidatoA!!.getText())
        while (tokenA.hasMoreTokens()) {
            cand.nombre = tokenA.nextToken()
            cand.apellido = tokenA.nextToken()
        }
        candidato.buscarPorNombreApellido(cand)
        votos.idCandidato = cand.identificacion
        val numVotosCandA = modSql.contarVotosCandidato(votos)
        val porcVotosCandA = numVotosCandA.toFloat() / numVotos
        // Para el candidato B
        val tokenB = StringTokenizer(labCandidatoB!!.getText())
        while (tokenB.hasMoreTokens()) {
            cand.nombre = tokenB.nextToken()
            cand.apellido = tokenB.nextToken()
        }
        candidato.buscarPorNombreApellido(cand)
        votos.idCandidato = cand.identificacion
        val numVotosCandB = modSql.contarVotosCandidato(votos)
        val porcVotosCandB = numVotosCandB.toFloat() / numVotos
        // Para el candidato C
        val tokenC = StringTokenizer(labCandidatoB!!.getText())
        while (tokenC.hasMoreTokens()) {
            cand.nombre = tokenC.nextToken()
            cand.apellido = tokenC.nextToken()
        }
        candidato.buscarPorNombreApellido(cand)
        votos.idCandidato = cand.identificacion
        val numVotosCandC = modSql.contarVotosCandidato(votos)
        val porcVotosCandC = numVotosCandC.toFloat() / numVotos
        val votosTotales = (numVotos + numBlancos).toFloat()
        val porcnumVotos = numVotos.toFloat() / votosTotales
        val porcnumBlancos = numBlancos.toFloat() / votosTotales
        //Asignacion de valores a los jtextbox
        txtNumTotalVotos!!.setText(String.valueOf(numVotos))
        txtNumVotosBlanco!!.setText(String.valueOf(numBlancos))
        txtNumCandidatoA!!.setText(String.valueOf(numVotosCandA))
        txtNumCandidatoB!!.setText(String.valueOf(numVotosCandB))
        txtNumCandidatoC!!.setText(String.valueOf(numVotosCandC))
        txtPorcTotalVotos!!.setText("" + porcnumVotos * 100 + "%")
        txtPorcVotosBlanco!!.setText("" + porcnumBlancos * 100 + "%")
        txtPorcCandidatoA!!.setText("" + porcVotosCandA * 100 + "%")
        txtPorcCandidatoB!!.setText("" + porcVotosCandB * 100 + "%")
        txtPorcCandidatoC!!.setText("" + porcVotosCandC * 100 + "%")
    }//GEN-LAST:event_jButton1ActionPerformed
    // End of variables declaration//GEN-END:variables
}