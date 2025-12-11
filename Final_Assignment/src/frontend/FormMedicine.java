
package frontend;

import backend.Category;
import backend.Medicine;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormMedicine extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormMedicine.class.getName());
    private DefaultTableModel tableModel;
    private ArrayList<Category> categories;

    public FormMedicine() {
        initComponents();
        setLocationRelativeTo(null); // Center the form on screen
        setupTable();
        loadCategories();
        loadData();
    }

    private void setupTable() {
        String[] columns = {"ID", "Name", "Price", "Stock", "Category"};
        tableModel = new DefaultTableModel(columns, 0);
        tblMedicine.setModel(tableModel);
        
        tblMedicine.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                int selectedRow = tblMedicine.getSelectedRow();
                if (selectedRow >= 0) {
                    txtId.setText(tableModel.getValueAt(selectedRow, 0).toString());
                    txtName.setText(tableModel.getValueAt(selectedRow, 1).toString());
                    txtPrice.setText(tableModel.getValueAt(selectedRow, 2).toString());
                    txtStock.setText(tableModel.getValueAt(selectedRow, 3).toString());
                    
                    String categoryName = tableModel.getValueAt(selectedRow, 4).toString();
                    for (int i = 0; i < comboCategory.getItemCount(); i++) {
                        if (comboCategory.getItemAt(i).toString().contains(categoryName)) {
                            comboCategory.setSelectedIndex(i);
                            break;
                        }
                    }
                }
            }
        });
    }

    private void loadCategories() {
        categories = Category.getAll();
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        for (Category cat : categories) {
            model.addElement(cat.getId() + " - " + cat.getName());
        }
        comboCategory.setModel(model);
    }

    private void loadData() {
        tableModel.setRowCount(0);
        ArrayList<Medicine> medicines = Medicine.getAll();
        for (Medicine med : medicines) {
            Object[] row = {med.getId(), med.getName(), med.getPrice(), 
                           med.getStock(), med.getCategory().getName()};
            tableModel.addRow(row);
        }
    }

    private void clearFields() {
        txtId.setText("");
        txtName.setText("");
        txtPrice.setText("");
        txtStock.setText("");
        if (comboCategory.getItemCount() > 0) {
            comboCategory.setSelectedIndex(0);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnBackToMainMenu = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMedicine = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        comboCategory = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setText("Medicine Name");

        jLabel4.setText("Search");

        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(this::btnUpdateActionPerformed);

        btnBackToMainMenu.setText("BACK TO MAIN MENU");
        btnBackToMainMenu.addActionListener(this::btnBackToMainMenuActionPerformed);

        btnAdd.addActionListener(this::btnAddActionPerformed);
        btnDelete.addActionListener(this::btnDeleteActionPerformed);
        btnClear.addActionListener(this::btnClearActionPerformed);
        btnSearch.addActionListener(this::btnSearchActionPerformed);

        btnDelete.setText("DELETE");

        btnClear.setText("CLEAR");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("MEDICINE MANAGEMENT");

        tblMedicine.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Medicine ID", "Medicine Name", "Price", "Stock", "Category"
            }
        ));
        jScrollPane2.setViewportView(tblMedicine);

        jLabel2.setText("Medicine ID");

        btnSearch.setText("SEARCH");

        btnAdd.setText("ADD");

        jLabel5.setText("Price");

        jLabel6.setText("Category");

        jLabel7.setText("Stock");

        comboCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBackToMainMenu))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(btnAdd)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnUpdate)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnDelete)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnClear))
                                    .addComponent(txtSearch, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSearch)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnBackToMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {
        String name = txtName.getText().trim();
        String priceText = txtPrice.getText().trim();
        String stockText = txtStock.getText().trim();
        
        if (name.isEmpty() || priceText.isEmpty() || stockText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill all fields!");
            return;
        }

        try {
            double price = Double.parseDouble(priceText);
            int stock = Integer.parseInt(stockText);
            
            String selectedCategory = comboCategory.getSelectedItem().toString();
            int categoryId = Integer.parseInt(selectedCategory.split(" - ")[0]);
            
            Category category = new Category();
            category.setId(categoryId);
            
            Medicine medicine = new Medicine();
            medicine.setName(name);
            medicine.setPrice(price);
            medicine.setStock(stock);
            medicine.setCategory(category);
            
            if (medicine.insert()) {
                JOptionPane.showMessageDialog(this, "Medicine added successfully!");
                loadData();
                clearFields();
            } else {
                JOptionPane.showMessageDialog(this, "Failed to add medicine!");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers for price and stock!");
        }
    }

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        String idText = txtId.getText().trim();
        String name = txtName.getText().trim();
        String priceText = txtPrice.getText().trim();
        String stockText = txtStock.getText().trim();
        
        if (idText.isEmpty() || name.isEmpty() || priceText.isEmpty() || stockText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please select a medicine and fill all fields!");
            return;
        }

        try {
            int id = Integer.parseInt(idText);
            double price = Double.parseDouble(priceText);
            int stock = Integer.parseInt(stockText);
            
            String selectedCategory = comboCategory.getSelectedItem().toString();
            int categoryId = Integer.parseInt(selectedCategory.split(" - ")[0]);
            
            Category category = new Category();
            category.setId(categoryId);
            
            Medicine medicine = new Medicine();
            medicine.setId(id);
            medicine.setName(name);
            medicine.setPrice(price);
            medicine.setStock(stock);
            medicine.setCategory(category);
            
            if (medicine.update()) {
                JOptionPane.showMessageDialog(this, "Medicine updated successfully!");
                loadData();
                clearFields();
            } else {
                JOptionPane.showMessageDialog(this, "Failed to update medicine!");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers for price and stock!");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {
        String idText = txtId.getText().trim();
        if (idText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please select a medicine to delete!");
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this medicine?", "Confirm Delete", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            Medicine medicine = new Medicine();
            medicine.setId(Integer.parseInt(idText));
            
            if (medicine.delete()) {
                JOptionPane.showMessageDialog(this, "Medicine deleted successfully!");
                loadData();
                clearFields();
            } else {
                JOptionPane.showMessageDialog(this, "Failed to delete medicine!");
            }
        }
    }

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {
        clearFields();
    }

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {
        String searchText = txtSearch.getText().trim().toLowerCase();
        if (searchText.isEmpty()) {
            loadData();
            return;
        }

        tableModel.setRowCount(0);
        ArrayList<Medicine> medicines = Medicine.getAll();
        for (Medicine med : medicines) {
            if (med.getName().toLowerCase().contains(searchText) || 
                med.getCategory().getName().toLowerCase().contains(searchText)) {
                Object[] row = {med.getId(), med.getName(), med.getPrice(), 
                               med.getStock(), med.getCategory().getName()};
                tableModel.addRow(row);
            }
        }
    }

    private void btnBackToMainMenuActionPerformed(java.awt.event.ActionEvent evt) {
        new FormMainMenu().setVisible(true);
        this.dispose();
    }

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

        java.awt.EventQueue.invokeLater(() -> new FormMedicine().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBackToMainMenu;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> comboCategory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblMedicine;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables

}
