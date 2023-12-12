import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

class Contact {
    String name;
    String address;
    String phone;

    public Contact(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }
}

public class dsacontact extends JFrame {

    private PriorityQueue<Contact> contactQueue = new PriorityQueue<>((c1, c2) -> c1.name.compareTo(c2.name));
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;

    public dsacontact() {
        setTitle("Contact Management System");
        initComponents();
    }

    private void initComponents() {
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButtonReset = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Name");
        jLabel2.setText("Phone");
        jLabel3.setText("Email");

        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButtonReset.setText("CLEAR");
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });

        jButtonExit.setText("EXIT");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        jButtonDelete.setText("DELETE");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jButtonUpdate.setText("UPDATE CONTACTS");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jButtonSearch.setText("SEARCH");
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Name", "Phone", "Email"
                }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().setBackground(new java.awt.Color(255, 182, 193));

        jButton1.setBackground(new java.awt.Color(50, 205, 50));
        jButtonReset.setBackground(new java.awt.Color(50, 205, 50));
        jButtonExit.setBackground(new java.awt.Color(50, 205, 50));
        jButtonDelete.setBackground(new java.awt.Color(50, 205, 50));
        jButtonUpdate.setBackground(new java.awt.Color(50, 205, 50));
        jButtonSearch.setBackground(new java.awt.Color(50, 205, 50));

        jTable1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel1)
                                                        .addComponent(jLabel2))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(t1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                                        .addComponent(t2, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(t3, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(110, 110, 110))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(182, 182, 182)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jButton1)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jButtonReset)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jButtonExit))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jButtonDelete)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jButtonUpdate)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jButtonSearch)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(37, 37, 37)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton1)
                                        .addComponent(jButtonReset)
                                        .addComponent(jButtonExit))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButtonDelete)
                                        .addComponent(jButtonUpdate)
                                        .addComponent(jButtonSearch))
                                .addGap(23, 23, 23)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        String name = t1.getText();
        String address = t2.getText();
        String phone = t3.getText();

        Contact contact = new Contact(name, address, phone);

        contactQueue.add(contact);

        refreshTable();
    }

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {
        t1.setText("");
        t2.setText("");
        t3.setText("");
    }

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {
        int confirm = JOptionPane.showOptionDialog(
                null,
                "Are you sure you want to exit?",
                "Exit Confirmation",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                null,
                null
        );
        if (confirm == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        // Get the selected row index
        int selectedRowIndex = jTable1.getSelectedRow();

        if (selectedRowIndex != -1) {
            // Get the contact information from the selected row
            String nameToDelete = (String) model.getValueAt(selectedRowIndex, 0);
            String addressToDelete = (String) model.getValueAt(selectedRowIndex, 1);
            String phoneToDelete = (String) model.getValueAt(selectedRowIndex, 2);

            // Create a temporary contact with the selected information for comparison
            Contact contactToDelete = new Contact(nameToDelete, addressToDelete, phoneToDelete);

            // Remove the selected contact from the PriorityQueue
            contactQueue.remove(contactToDelete);

            // Remove the selected row from the table
            model.removeRow(selectedRowIndex);
        } else {
            // If no row is selected, show a message
            JOptionPane.showMessageDialog(this, "Please select a contact to delete.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {
        updateContact();
    }

    private void updateContact() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        // Get the selected row index
        int selectedRowIndex = jTable1.getSelectedRow();

        if (selectedRowIndex != -1) {
            // Get the contact information from the selected row
            String nameToUpdate = (String) model.getValueAt(selectedRowIndex, 0);
            String addressToUpdate = (String) model.getValueAt(selectedRowIndex, 1);
            String phoneToUpdate = (String) model.getValueAt(selectedRowIndex, 2);

            // Create a temporary contact with the selected information for comparison
            Contact contactToUpdate = new Contact(nameToUpdate, addressToUpdate, phoneToUpdate);

            // Remove the selected contact from the PriorityQueue
            contactQueue.remove(contactToUpdate);

            // Prompt the user for updated information
            String newName = JOptionPane.showInputDialog(this, "Enter new name:", nameToUpdate);
            String newAddress = JOptionPane.showInputDialog(this, "Enter new address:", addressToUpdate);
            String newPhone = JOptionPane.showInputDialog(this, "Enter new phone:", phoneToUpdate);

            // Create a new contact with updated information
            Contact updatedContact = new Contact(newName, newAddress, newPhone);

            // Add the updated contact to the PriorityQueue
            contactQueue.add(updatedContact);

            // Update the table with the new information
            model.setValueAt(updatedContact.name, selectedRowIndex, 0);
            model.setValueAt(updatedContact.address, selectedRowIndex, 1);
            model.setValueAt(updatedContact.phone, selectedRowIndex, 2);
        } else {
            // If no row is selected, show a message
            JOptionPane.showMessageDialog(this, "Please select a contact to update.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {
        searchContact();
    }

    private void searchContact() {
        String searchName = JOptionPane.showInputDialog(this, "Enter name to search:");

        for (Contact contact : contactQueue) {
            if (contact.name.equalsIgnoreCase(searchName)) {
                JOptionPane.showMessageDialog(this,
                        "Contact found:\nName: " + contact.name + "\nAddress: " + contact.address + "\nPhone: " + contact.phone,
                        "Contact Information", JOptionPane.INFORMATION_MESSAGE);
                return; // Stop searching after finding the first match
            }
        }

        JOptionPane.showMessageDialog(this, "Contact not found.", "Error", JOptionPane.ERROR_MESSAGE);
    }

    private void refreshTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        // Convert PriorityQueue to a list for sorting
        List<Contact> sortedContacts = new ArrayList<>(contactQueue);

        // Perform Bubble Sort for alphabetical order based on contact names
        for (int i = 0; i < sortedContacts.size() - 1; i++) {
            for (int j = 0; j < sortedContacts.size() - i - 1; j++) {
                if (sortedContacts.get(j).name.compareToIgnoreCase(sortedContacts.get(j + 1).name) > 0) {
                    // Swap if the current contact is greater than the next one
                    Collections.swap(sortedContacts, j, j + 1);
                }
            }
        }

        // Update the table with the sorted contacts
        for (Contact contact : sortedContacts) {
            model.addRow(new Object[]{contact.name, contact.address, contact.phone});
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dsacontact frame = new dsacontact();
                frame.setVisible(true);
                frame.setLocationRelativeTo(null);
            }
        });
    }
}
