/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.stream.IntStream;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Dish;
import util.ImageUtil;

/**
 *
 * @author admin
 */
public class DishManager extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public DishManager() {
        initComponents();
        prepareCombobox();
        prepareJTables();
        prepareJButtons();
    }
    
    private List<Dish> allDishes = new ArrayList<Dish>();
    
    // date and number formatter
    private final DecimalFormat df = new DecimalFormat("#,###");
    
    // image utility
    ImageUtil imageUtil = new ImageUtil();
    
    // font instance
    private final Color BACKGROUND_COLOR = new Color(250, 247, 230);
    private final Font boldFont = new Font("Lucida Grande", Font.BOLD, 13);
    private final Font italicFont = new Font("Lucida Grande", Font.ITALIC, 13);

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSearchedName = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtSelectedName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSelectedCapital = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbxSelectedType = new javax.swing.JComboBox<>();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        lblAdd = new javax.swing.JLabel();
        lblEdit = new javax.swing.JLabel();
        lblRemove = new javax.swing.JLabel();
        lblExit = new javax.swing.JLabel();
        lblSearch = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtSelectedPrice = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Quản lý món");

        jLabel2.setText("Tên món:");

        txtSearchedName.setToolTipText("");
        txtSearchedName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchedNameActionPerformed(evt);
            }
        });

        btnSearch.setPreferredSize(new java.awt.Dimension(50, 50));
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSearchMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSearchMouseEntered(evt);
            }
        });
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        resultTable.setModel(new javax.swing.table.DefaultTableModel(
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
        resultTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resultTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(resultTable);

        jLabel3.setText("Tên:");

        txtSelectedName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSelectedNameActionPerformed(evt);
            }
        });

        jLabel4.setText("Giá nhập:");

        txtSelectedCapital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSelectedCapitalActionPerformed(evt);
            }
        });

        jLabel5.setText("Loại:");

        btnAdd.setPreferredSize(new java.awt.Dimension(50, 50));
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddMouseEntered(evt);
            }
        });
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnEdit.setPreferredSize(new java.awt.Dimension(50, 50));
        btnEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEditMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEditMouseEntered(evt);
            }
        });
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnExit.setPreferredSize(new java.awt.Dimension(50, 50));
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExitMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExitMouseEntered(evt);
            }
        });
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnRemove.setPreferredSize(new java.awt.Dimension(50, 50));
        btnRemove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRemoveMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRemoveMouseEntered(evt);
            }
        });
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        lblAdd.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblAdd.setText(" Thêm Mới");

        lblEdit.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblEdit.setText("Chỉnh Sửa");

        lblRemove.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblRemove.setText("Xoá Món");

        lblExit.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblExit.setText("Thoát");

        lblSearch.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblSearch.setText("Tìm Kiếm");

        jLabel6.setText("Giá bán:");

        txtSelectedPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSelectedPriceActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSearchedName, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(220, 220, 220)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(71, 71, 71)
                                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addComponent(lblAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(46, 46, 46)
                                        .addComponent(lblEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(lblExit, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 2, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSelectedName, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSelectedCapital, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSelectedPrice)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxSelectedType, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtSearchedName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblSearch)
                        .addGap(22, 22, 22)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSelectedName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtSelectedCapital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(cbxSelectedType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtSelectedPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAdd)
                    .addComponent(lblEdit)
                    .addComponent(lblRemove)
                    .addComponent(lblExit))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchedNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchedNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchedNameActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        this.allDishes = Dish.findByName(txtSearchedName.getText());
        prepareTable();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // insert into DB
        Dish dish = new Dish();
        dish.setName(txtSelectedName.getText());
        dish.setCapital(Float.parseFloat(txtSelectedCapital.getText()));
        dish.setPrice(Float.parseFloat(txtSelectedPrice.getText()));
        dish.setType((short) cbxSelectedType.getSelectedIndex());
        dish.setCreatedAt(new Date());
        dish.setUpdatedAt(new Date());
        dish.setCreatedBy("Lai");
        dish.setUpdatedBy("Lai");
        if (!dish.insert()) {
            return;
        }
        
        // update UI
        DefaultTableModel tableModel = (DefaultTableModel) resultTable.getModel();
        Vector<Object> oneRow = new Vector<Object>();
        oneRow.add(dish.getName());
        oneRow.add(df.format(dish.getCapital()));
        oneRow.add(df.format(dish.getPrice()));
        oneRow.add(Dish.TYPE_DEFINITION.get(dish.getType()));
        oneRow.add(dish.getCreatedBy());
        tableModel.addRow(oneRow);
        resultTable.setModel(tableModel);
        
        // update memory data
        allDishes.add(dish);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // update into DB
        int selectedRow = resultTable.getSelectedRow();
        Dish dish = this.allDishes.get(selectedRow);
        dish.setName(txtSelectedName.getText());
        dish.setCapital(Float.parseFloat(txtSelectedCapital.getText()));
        dish.setPrice(Float.parseFloat(txtSelectedPrice.getText()));
        dish.setType((short) cbxSelectedType.getSelectedIndex());
        dish.setUpdatedAt(new Date());
        dish.setUpdatedBy("Lai");
        dish.update();
        
        // update UI
        resultTable.getModel().setValueAt(dish.getName(), selectedRow, 0);
        resultTable.getModel().setValueAt(df.format(dish.getCapital()), selectedRow, 1);
        resultTable.getModel().setValueAt(df.format(dish.getPrice()), selectedRow, 2);
        resultTable.getModel().setValueAt(Dish.TYPE_DEFINITION.get(dish.getType()), selectedRow, 3);
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
//        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void txtSelectedNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSelectedNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSelectedNameActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        int[] selectedRows = resultTable.getSelectedRows();
        int[] removedIds = new int[selectedRows.length];
        // remove from DB
        for (int i = 0; i < selectedRows.length; i++) {
            int selectedIndex = selectedRows[i];
            Dish dish = this.allDishes.get(selectedIndex);
            dish.delete();
            removedIds[i] = dish.getId();
        }
        
        // update memory data
        for (Iterator<Dish> iterator = this.allDishes.iterator(); iterator.hasNext();) {
            Dish dish = iterator.next();
            if (IntStream.of(removedIds).anyMatch(i -> i == dish.getId())) {
                // Remove the current element from the iterator and the list.
                iterator.remove();
            }
        }
        
        // updare UI
        prepareTable();
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void resultTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resultTableMouseClicked
        JTable table = (JTable) evt.getSource();
        Point p = evt.getPoint();
        int row = table.rowAtPoint(p);
        Dish dish = allDishes.get(row);
        txtSelectedName.setText(dish.getName());
        txtSelectedCapital.setText(String.valueOf(dish.getCapital()));
        txtSelectedPrice.setText(String.valueOf(dish.getPrice()));
        cbxSelectedType.setSelectedIndex(dish.getType());
    }//GEN-LAST:event_resultTableMouseClicked

    private void txtSelectedCapitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSelectedCapitalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSelectedCapitalActionPerformed

    private void btnAddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseEntered
        lblAdd.setFont(italicFont);
    }//GEN-LAST:event_btnAddMouseEntered

    private void btnAddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseExited
        lblAdd.setFont(boldFont);
    }//GEN-LAST:event_btnAddMouseExited

    private void btnEditMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseEntered
        lblEdit.setFont(italicFont);
    }//GEN-LAST:event_btnEditMouseEntered

    private void btnEditMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseExited
        lblEdit.setFont(boldFont);
    }//GEN-LAST:event_btnEditMouseExited

    private void btnRemoveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoveMouseEntered
        lblRemove.setFont(italicFont);
    }//GEN-LAST:event_btnRemoveMouseEntered

    private void btnRemoveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoveMouseExited
        lblRemove.setFont(boldFont);
    }//GEN-LAST:event_btnRemoveMouseExited

    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered
        lblExit.setFont(italicFont);
    }//GEN-LAST:event_btnExitMouseEntered

    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseExited
        lblExit.setFont(boldFont);
    }//GEN-LAST:event_btnExitMouseExited

    private void btnSearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseEntered
        lblSearch.setFont(italicFont);
    }//GEN-LAST:event_btnSearchMouseEntered

    private void btnSearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseExited
        lblSearch.setFont(boldFont);
    }//GEN-LAST:event_btnSearchMouseExited

    private void txtSelectedPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSelectedPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSelectedPriceActionPerformed
    
    private void prepareCombobox() {
        Dish.TYPE_DEFINITION.entrySet().forEach((entry) -> {
            cbxSelectedType.addItem(entry.getValue());
        });
    }
    
    private void prepareJButtons() {
        // deco search button
        btnSearch.setIcon(imageUtil.prepareIcon("dish_manager/search.png"));
        btnSearch.setFocusable(false);
        
        // deco add button
        btnAdd.setIcon(imageUtil.prepareIcon("dish_manager/add.png"));
        btnAdd.setFocusable(false);
        
        // deco edit button
        btnEdit.setIcon(imageUtil.prepareIcon("dish_manager/edit.png"));
        btnEdit.setFocusable(false);
        
        // deco remove button
        btnRemove.setIcon(imageUtil.prepareIcon("dish_manager/remove.png"));
        btnRemove.setFocusable(false);
        
        // deco exit button
        btnExit.setIcon(imageUtil.prepareIcon("dish_manager/exit.png"));
        btnExit.setFocusable(false);
    }
    
    private void prepareJTables() {
        prapareData();
        prepareTable();
        this.getContentPane().setBackground(BACKGROUND_COLOR);
    }
    
    private void prapareData() {
        this.allDishes = Dish.getAll();
    }
    
    private void prepareTable() {
        Vector<String> dishHeaders = new Vector<String>();
        Vector dishData = new Vector();
        dishHeaders.add("Tên món");
        dishHeaders.add("Giá nhập");
        dishHeaders.add("Giá bán");
        dishHeaders.add("Loại");
        dishHeaders.add("Người tạo");
        for (Object o : this.allDishes) {
            Dish dish = (Dish) o;
            Vector<Object> oneRow = new Vector<Object>();
            oneRow.add(dish.getName());
            oneRow.add(df.format(dish.getCapital()));
            oneRow.add(df.format(dish.getPrice()));
            oneRow.add(Dish.TYPE_DEFINITION.get(dish.getType()));
            oneRow.add(dish.getCreatedBy());
            dishData.add(oneRow);
        }
        resultTable.setModel(new DefaultTableModel(dishData, dishHeaders) {
            @Override
            public boolean isCellEditable(int row, int column) {
                //all cells false
                return false;
            }
        });
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
            java.util.logging.Logger.getLogger(DishManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DishManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DishManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DishManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DishManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cbxSelectedType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAdd;
    private javax.swing.JLabel lblEdit;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblRemove;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JTable resultTable;
    private javax.swing.JTextField txtSearchedName;
    private javax.swing.JTextField txtSelectedCapital;
    private javax.swing.JTextField txtSelectedName;
    private javax.swing.JTextField txtSelectedPrice;
    // End of variables declaration//GEN-END:variables

}