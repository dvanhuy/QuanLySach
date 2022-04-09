/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import Service.BookService;
import define.Book;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class BookInfor extends javax.swing.JFrame {

    DefaultTableModel defaultTableModel;
    BookService bookService;
    
    public BookInfor() {
        initComponents();
        getContentPane().setBackground(new Color(240,240,240));
        
        defaultTableModel = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        
        bookService = new BookService();
        tabledata.setModel(defaultTableModel);
        defaultTableModel.addColumn("ID Sách");
        defaultTableModel.addColumn("Tên sách");
        defaultTableModel.addColumn("Giá sách");
        
        List<Book> books = bookService.getAllBook();
        showdata(books);
    }
    
    public final void showdata(List<Book> books)
    {

        books.forEach(i -> {
            defaultTableModel.addRow(new Object[]{i.getId(),i.getTitle(),i.getPrice()});
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Flilter = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TextSearch = new javax.swing.JTextField();
        Searchbt = new javax.swing.JButton();
        Exitbt = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabledata = new javax.swing.JTable();
        deletabt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Book Information");
        setBackground(new java.awt.Color(255, 255, 255));

        Flilter.setBackground(new java.awt.Color(241, 240, 240));
        Flilter.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Filter", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Title");

        TextSearch.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        TextSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FlilterLayout = new javax.swing.GroupLayout(Flilter);
        Flilter.setLayout(FlilterLayout);
        FlilterLayout.setHorizontalGroup(
            FlilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FlilterLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(TextSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                .addContainerGap())
        );
        FlilterLayout.setVerticalGroup(
            FlilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FlilterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FlilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TextSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        Searchbt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Searchbt.setText("Search");
        Searchbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchbtActionPerformed(evt);
            }
        });

        Exitbt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Exitbt.setText("Exit");
        Exitbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitbtActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(240, 241, 240));

        tabledata.setAutoCreateRowSorter(true);
        tabledata.setBackground(new java.awt.Color(240, 240, 240));
        tabledata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabledata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabledataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabledata);

        deletabt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        deletabt.setText("Delete");
        deletabt.setEnabled(false);
        deletabt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletabtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(deletabt, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Flilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Searchbt, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Exitbt, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 20, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Searchbt)
                            .addComponent(Exitbt)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(Flilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deletabt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ExitbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitbtActionPerformed
        new Main().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ExitbtActionPerformed

    private void SearchbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchbtActionPerformed
        String tenSach=TextSearch.getText();
        defaultTableModel.setRowCount(0);
        List<Book> books = bookService.getSelectBook(tenSach);
        showdata(books);
    }//GEN-LAST:event_SearchbtActionPerformed

    private void TextSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextSearchActionPerformed
        SearchbtActionPerformed(evt);
    }//GEN-LAST:event_TextSearchActionPerformed

    private void tabledataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabledataMouseClicked
        int x= tabledata.getSelectedRow();
        if (x >= 0) deletabt.setEnabled(true);
    }//GEN-LAST:event_tabledataMouseClicked

    private void deletabtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletabtActionPerformed
        int x = tabledata.getSelectedRow();
        int idxoa=Integer.parseInt(String.valueOf(tabledata.getValueAt(x, 0)));
        int confirm = JOptionPane.showConfirmDialog(this,"Bạn có chắc muốn xóa hay không","Cảnh báo",JOptionPane.WARNING_MESSAGE);
        if (confirm == JOptionPane.YES_OPTION)
            bookService.deleteBook(idxoa);
        defaultTableModel.setRowCount(0);
        List<Book> books = bookService.getAllBook();
        showdata(books);
    }//GEN-LAST:event_deletabtActionPerformed

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
            java.util.logging.Logger.getLogger(BookInfor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookInfor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookInfor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookInfor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookInfor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exitbt;
    private javax.swing.JPanel Flilter;
    private javax.swing.JButton Searchbt;
    private javax.swing.JTextField TextSearch;
    private javax.swing.JButton deletabt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabledata;
    // End of variables declaration//GEN-END:variables
}
