package org.snake.client.gui.scores;

/**
 *
 * @author Kontagiouz
 */
public class Submission extends javax.swing.JPanel {

    /**
     * Creates new form Submission
     */
    public Submission() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        userNameField = new javax.swing.JTextPane();
        usernameIndicator = new javax.swing.JLabel();
        submitHighscore = new javax.swing.JButton();
        congratulationField = new javax.swing.JLabel();
        scoreDisplayField = new javax.swing.JLabel();
        rankingDisplayField = new javax.swing.JLabel();

        userNameField.setText("player");
        userNameField.setToolTipText("");
        jScrollPane1.setViewportView(userNameField);

        usernameIndicator.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        usernameIndicator.setText("Enter your username:");

        submitHighscore.setText("Submit");

        congratulationField.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N
        congratulationField.setText("Congratulations, you set a new highscore!");

        scoreDisplayField.setFont(new java.awt.Font("Vrinda", 1, 24)); // NOI18N
        scoreDisplayField.setText("Score:");

        rankingDisplayField.setFont(new java.awt.Font("Vrinda", 1, 24)); // NOI18N
        rankingDisplayField.setText("New Ranking:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(congratulationField))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(usernameIndicator)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(submitHighscore))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(scoreDisplayField))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(rankingDisplayField)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(congratulationField)
                .addGap(72, 72, 72)
                .addComponent(scoreDisplayField)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rankingDisplayField)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(usernameIndicator)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(submitHighscore))
                .addGap(42, 42, 42))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel congratulationField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel rankingDisplayField;
    private javax.swing.JLabel scoreDisplayField;
    private javax.swing.JButton submitHighscore;
    private javax.swing.JTextPane userNameField;
    private javax.swing.JLabel usernameIndicator;
    // End of variables declaration//GEN-END:variables
}
