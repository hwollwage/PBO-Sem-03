
package frontend;

import backend.Customer;
import backend.Medicine;
import backend.Receipt;
import backend.ReceiptItem;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormTransaction extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormTransaction.class.getName());
    private DefaultTableModel tableModel;
    private ArrayList<Customer> customers;
    private ArrayList<Medicine> medicines;
    private Receipt currentReceipt;

    public FormTransaction() {
        initComponents();
        setLocationRelativeTo(null); // Center the form on screen
        setupTable();
        loadCustomers();
        loadMedicines();
        initializeReceipt();
    }

    private void setupTable() {
        String[] columns = {"Medicine", "Quantity", "Price", "Subtotal"};
        tableModel = new DefaultTableModel(columns, 0);
        tblReceiptItems.setModel(tableModel);
    }

    private void loadCustomers() {
        customers = Customer.getAll();
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        for (Customer customer : customers) {
            model.addElement(customer.getId() + " - " + customer.getName());
        }
        comboCustomer.setModel(model);
    }

    private void loadMedicines() {
        medicines = Medicine.getAll();
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        for (Medicine med : medicines) {
            model.addElement(med.getId() + " - " + med.getName() + " (Stock: " + med.getStock() + ")");
        }
        comboMedicine.setModel(model);
    }

    private void initializeReceipt() {
        if (customers.size() > 0) {
            currentReceipt = new Receipt(customers.get(0));
        }
        txtTotal.setText("0.0");
        txtReceiptId.setText("New Receipt");
    }

    private void updateMedicinePrice() {
        if (comboMedicine.getSelectedIndex() >= 0) {
            Medicine selectedMedicine = medicines.get(comboMedicine.getSelectedIndex());
            txtPrice.setText(String.valueOf(selectedMedicine.getPrice()));
            calculateSubtotal();
        }
    }

    private void calculateSubtotal() {
        try {
            double price = Double.parseDouble(txtPrice.getText());
            int qty = Integer.parseInt(txtQty.getText());
            double subtotal = price * qty;
            txtSubtotal.setText(String.valueOf(subtotal));
        } catch (NumberFormatException e) {
            txtSubtotal.setText("0.0");
        }
    }

    private void calculateTotal() {
        double total = 0;
        for (int i = 0; i < tableModel.getRowCount(); i++) {
            total += Double.parseDouble(tableModel.getValueAt(i, 3).toString());
        }
        txtTotal.setText(String.valueOf(total));
        currentReceipt.setTotal(total);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        btnBackToMainMenu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblReceiptItems = new javax.swing.JTable();
        txtTotal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtReceiptId = new javax.swing.JTextField();
        comboCustomer = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtQty = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtSubtotal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        comboMedicine = new javax.swing.JComboBox<>();
        btnDeleteItem = new javax.swing.JButton();
        btnAddItem = new javax.swing.JButton();
        btnSaveReceipt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setText("Customer");

        btnBackToMainMenu.setText("BACK TO MAIN MENU");
        btnBackToMainMenu.addActionListener(this::btnBackToMainMenuActionPerformed);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("TRANSACTION / RECEIPT MANAGEMENT");

        tblReceiptItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Customer ID", "Customer Name", "Customer Phone"
            }
        ));
        jScrollPane2.setViewportView(tblReceiptItems);

        txtTotal.addActionListener(this::txtTotalActionPerformed);

        jLabel2.setText("Price");

        jLabel5.setText("Total");

        txtReceiptId.addActionListener(this::txtReceiptIdActionPerformed);

        comboCustomer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboCustomer.addActionListener(this::comboCustomerActionPerformed);

        jLabel6.setText("ADD ITEM SECTION : ");

        jLabel7.setText("Receipt ID");

        txtQty.addActionListener(this::txtQtyActionPerformed);

        jLabel8.setText("Quantity");

        jLabel9.setText("Medicine");

        txtSubtotal.addActionListener(this::txtSubtotalActionPerformed);

        jLabel4.setText("Subtotal");

        txtPrice.addActionListener(this::txtPriceActionPerformed);

        comboMedicine.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboMedicine.addActionListener(this::comboMedicineActionPerformed);

        txtQty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                calculateSubtotal();
            }
        });

        btnDeleteItem.setText("DELETE ITEM");
        btnDeleteItem.addActionListener(this::btnDeleteItemActionPerformed);

        btnAddItem.setText("ADD ITEM");
        btnAddItem.addActionListener(this::btnAddItemActionPerformed);

        btnSaveReceipt.setText("SAVE RECEIPT");
        btnSaveReceipt.addActionListener(this::btnSaveReceiptActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(comboCustomer, 0, 287, Short.MAX_VALUE)
                                        .addComponent(txtReceiptId)
                                        .addComponent(txtTotal))
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnSaveReceipt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDeleteItem)
                                .addGap(96, 96, 96)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAddItem, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtQty, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                                    .addComponent(txtSubtotal, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                                    .addComponent(txtPrice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                                    .addComponent(comboMedicine, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(84, 84, 84))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBackToMainMenu)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnBackToMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtReceiptId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboMedicine))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAddItem, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 42, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnDeleteItem, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSaveReceipt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddItemActionPerformed
        try {
            if (comboMedicine.getSelectedIndex() < 0) {
                JOptionPane.showMessageDialog(this, "Please select a medicine!");
                return;
            }

            int qty = Integer.parseInt(txtQty.getText());
            if (qty <= 0) {
                JOptionPane.showMessageDialog(this, "Please enter a valid quantity!");
                return;
            }

            Medicine selectedMedicine = medicines.get(comboMedicine.getSelectedIndex());
            if (qty > selectedMedicine.getStock()) {
                JOptionPane.showMessageDialog(this, "Not enough stock! Available: " + selectedMedicine.getStock());
                return;
            }

            double price = Double.parseDouble(txtPrice.getText());
            double subtotal = price * qty;

            // Add to table
            Object[] row = {selectedMedicine.getName(), qty, price, subtotal};
            tableModel.addRow(row);

            // Create receipt item
            ReceiptItem item = new ReceiptItem(selectedMedicine, qty);
            currentReceipt.addItem(item);

            calculateTotal();
            
            // Clear item fields
            txtQty.setText("");
            txtSubtotal.setText("");
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers!");
        }
    }//GEN-LAST:event_btnAddItemActionPerformed

    private void btnDeleteItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteItemActionPerformed
        int selectedRow = tblReceiptItems.getSelectedRow();
        if (selectedRow >= 0) {
            tableModel.removeRow(selectedRow);
            currentReceipt.getItems().remove(selectedRow);
            calculateTotal();
        } else {
            JOptionPane.showMessageDialog(this, "Please select an item to delete!");
        }
    }//GEN-LAST:event_btnDeleteItemActionPerformed

    private void btnSaveReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveReceiptActionPerformed
        if (currentReceipt.getItems().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please add at least one item!");
            return;
        }

        if (comboCustomer.getSelectedIndex() >= 0) {
            Customer selectedCustomer = customers.get(comboCustomer.getSelectedIndex());
            currentReceipt.setCustomer(selectedCustomer);
        }

        currentReceipt.calculateTotal();
        
        if (currentReceipt.insert()) {
            JOptionPane.showMessageDialog(this, "Receipt saved successfully! Receipt ID: " + currentReceipt.getId());
            
            // Reset form
            tableModel.setRowCount(0);
            initializeReceipt();
            txtQty.setText("");
            txtPrice.setText("");
            txtSubtotal.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Failed to save receipt!");
        }
    }//GEN-LAST:event_btnSaveReceiptActionPerformed

    private void comboCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCustomerActionPerformed
        if (comboCustomer.getSelectedIndex() >= 0) {
            Customer selectedCustomer = customers.get(comboCustomer.getSelectedIndex());
            currentReceipt.setCustomer(selectedCustomer);
        }
    }//GEN-LAST:event_comboCustomerActionPerformed

    private void comboMedicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMedicineActionPerformed
        updateMedicinePrice();
    }//GEN-LAST:event_comboMedicineActionPerformed

    private void btnBackToMainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackToMainMenuActionPerformed
        new FormMainMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackToMainMenuActionPerformed

    private void txtReceiptIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReceiptIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReceiptIdActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void txtQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtyActionPerformed
        calculateSubtotal();
    }//GEN-LAST:event_txtQtyActionPerformed

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        calculateSubtotal();
    }//GEN-LAST:event_txtPriceActionPerformed

    private void txtSubtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSubtotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSubtotalActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> new FormTransaction().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddItem;
    private javax.swing.JButton btnBackToMainMenu;
    private javax.swing.JButton btnDeleteItem;
    private javax.swing.JButton btnSaveReceipt;
    private javax.swing.JComboBox<String> comboCustomer;
    private javax.swing.JComboBox<String> comboMedicine;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblReceiptItems;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtQty;
    private javax.swing.JTextField txtReceiptId;
    private javax.swing.JTextField txtSubtotal;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

}
