/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package actividad_6_poo;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author Sara Castaño
 */
public class InterfazCrud extends javax.swing.JFrame {

    /**
     * Creates new form InterfazCrud
     */
    public InterfazCrud() {
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

        textArea1 = new java.awt.TextArea();
        nombreLabel = new java.awt.Label();
        txtTelefono = new javax.swing.JTextField();
        telefonoLabel = new java.awt.Label();
        txtNombre = new javax.swing.JTextField();
        addButton = new java.awt.Button();
        updateButton = new java.awt.Button();
        addDelete = new java.awt.Button();
        readButton = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nombreLabel.setAlignment(java.awt.Label.CENTER);
        nombreLabel.setText("Nombre");

        telefonoLabel.setAlignment(java.awt.Label.CENTER);
        telefonoLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        telefonoLabel.setName(""); // NOI18N
        telefonoLabel.setText("Telefono");

        addButton.setLabel("Crear");
        addButton.setName("Crear"); // NOI18N
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        updateButton.setLabel("Actualizar");
        updateButton.setName(""); // NOI18N
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        addDelete.setLabel("Eliminar");
        addDelete.setName(""); // NOI18N
        addDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDeleteActionPerformed(evt);
            }
        });

        readButton.setLabel("Leer");
        readButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                readButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(telefonoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(60, Short.MAX_VALUE)
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(readButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(addDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(telefonoLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(updateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(readButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(62, 62, 62))
        );

        addButton.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        try {

			// Get the name of the contact to be updated
			// from the Command line argument
			String newName = String.valueOf(txtNombre.getText());

			// Get the number to be updated
			// from the Command line argument
			long newNumber = Long.parseLong(txtTelefono.getText());

			String nameNumberString;
			String name;
			long number;
			int index;

			// Using file pointer creating the file.
			File file = new File("C:\\Users\\JUAN PABLO\\Desktop\\Juan Manuel U\\Semestre 2024-1\\Programación orientada a objetos\\Actividad 6\\Actividad6_POO-main\\Actividad6_POO-main\\Archivos\\A6FriendsContacts.txt");

			if (!file.exists()==false) {

				// Create a new file if not exists.
				file.createNewFile();
			}

			// Opening file in reading and write mode.

			RandomAccessFile raf
				= new RandomAccessFile(file, "rw");
			boolean found = false;

			// Checking whether the name
			// of contact already exists.
			// getFilePointer() give the current offset
			// value from start of the file.
			while (raf.getFilePointer() < raf.length()) {

				// reading line from the file.
				nameNumberString = raf.readLine();

				// splitting the string to get name and
				// number
				String[] lineSplit
					= nameNumberString.split("!");

				// separating name and number.
				name = lineSplit[0];
				number = Long.parseLong(lineSplit[1]);

				// if condition to find existence of record.
				if (name.equals(newName)
					|| number == newNumber) {
					found = true;
					break;
				}
			}

			if (found == false) {

				// Enter the if block when a record
				// is not already present in the file.
				nameNumberString
					= newName + "!" + String.valueOf(newNumber);

				// writeBytes function to write a string
				// as a sequence of bytes.
				raf.writeBytes(nameNumberString);

				// To insert the next record in new line.
				raf.writeBytes(System.lineSeparator());

				// Print the message
				System.out.println(" Friend added. ");

				// Closing the resources.
				raf.close();
			}
			// The contact to be updated
			// could not be found
			else {

				// Closing the resources.
				raf.close();

				// Print the message
				System.out.println(" The contact exists ");
			}
		}

		catch (IOException ioe) {

			System.out.println(ioe);
		}
		catch (NumberFormatException nef) {

			System.out.println(nef);
		}
	
    }//GEN-LAST:event_addButtonActionPerformed

    private void readButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_readButtonActionPerformed
        	try {

			String nameNumberString;
			String name;
                        String newName = String.valueOf(txtNombre.getText());
			long number;
			int index;

			// Using file pointer creating the file.
			File file = new File("C:\\Users\\JUAN PABLO\\Desktop\\Juan Manuel U\\Semestre 2024-1\\Programación orientada a objetos\\Actividad 6\\Actividad6_POO-main\\Actividad6_POO-main\\Archivos\\A6FriendsContacts.txt");

			if (!file.exists()) {

				// Create a new file if not exists.
				file.createNewFile();
			}

			// Opening file in reading and write mode.

			RandomAccessFile raf
				= new RandomAccessFile(file, "rw");
			boolean found = false;

			// Traversing the file
			// getFilePointer() give the current offset
			// value from start of the file.
			while (raf.getFilePointer() < raf.length()) {

				// reading line from the file.
				nameNumberString = raf.readLine();

				// splitting the string to get name and
				// number
				String[] lineSplit
					= nameNumberString.split("!");

				// separating name and number.
				name = lineSplit[0];
				number = Long.parseLong(lineSplit[1]);
                                
                                if (name.equals(newName)) {
                                    txtNombre.setText(String.valueOf(name));
                                    txtTelefono.setText(String.valueOf(number));
                                    System.out.println("The name is " + name);
                                    System.out.println("The number is " + number);
                                raf.close(); 
					found = true;
				
				}
                                

                        }
                }

			catch (IOException ioe)
			{

				System.out.println(ioe);
			}
			catch (NumberFormatException nef)
			{

				System.out.println(nef);
			}
		
	
		
		
    }//GEN-LAST:event_readButtonActionPerformed

    private void addDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDeleteActionPerformed
        	try {

			// Get the name of the contact to be updated
			// from the Command line argument
			String newName = String.valueOf(txtNombre.getText());

			String nameNumberString;
			String name;
			long number;
			int index;

			// Using file pointer creating the file.
			File file = new File("C:\\Users\\JUAN PABLO\\Desktop\\Juan Manuel U\\Semestre 2024-1\\Programación orientada a objetos\\Actividad 6\\Actividad6_POO-main\\Actividad6_POO-main\\Archivos\\A6FriendsContacts.txt");

			if (!file.exists()) {

				// Create a new file if not exists.
				file.createNewFile();
			}

			// Opening file in reading and write mode.
			RandomAccessFile raf
				= new RandomAccessFile(file, "rw");
			boolean found = false;

			// Checking whether the name of contact exists.
			// getFilePointer() give the current offset
			// value from start of the file.
			while (raf.getFilePointer() < raf.length()) {

				// reading line from the file.
				nameNumberString = raf.readLine();

				// splitting the string to get name and
				// number
				String[] lineSplit
					= nameNumberString.split("!");

				// separating name and number.
				name = lineSplit[0];
				number = Long.parseLong(lineSplit[1]);

				// if condition to find existence of record.
				if (name.equals(newName)) {
                                    System.out.println("variables name has the name" +name);
                                    System.out.println("variables newName has the name to delete" +newName);
					found = true;
					break;
				}
			}

			// Delete the contact if record exists.
			if (found == true) {

				// Creating a temporary file
				// with file pointer as tmpFile.
				File tmpFile = new File("C:\\Users\\JUAN PABLO\\Desktop\\Juan Manuel U\\Semestre 2024-1\\Programación orientada a objetos\\Actividad 6\\Actividad6_POO-main\\Actividad6_POO-main\\Archivos\\temp.txt");

				// Opening this temporary file
				// in ReadWrite Mode
				RandomAccessFile tmpraf
					= new RandomAccessFile(tmpFile, "rw");

				// Set file pointer to start
				raf.seek(0);

				// Traversing the friendsContact.txt file
				while (raf.getFilePointer()
					< raf.length()) {

					// Reading the contact from the file
					nameNumberString = raf.readLine();

					index = nameNumberString.indexOf('!');
					name = nameNumberString.substring(
						0, index);

					// Check if the fetched contact
					// is the one to be deleted
					if (name.equals(newName)) {

						// Skip inserting this contact
						// into the temporary file
						continue;
					}

					// Add this contact in the temporary
					// file
					tmpraf.writeBytes(nameNumberString);

					// Add the line separator in the
					// temporary file
					tmpraf.writeBytes(
						System.lineSeparator());
				}

				// The contact has been deleted now
				// So copy the updated content from
				// the temporary file to original file.

				// Set both files pointers to start
				raf.seek(0);
				tmpraf.seek(0);

				// Copy the contents from
				// the temporary file to original file.
				while (tmpraf.getFilePointer()
					< tmpraf.length()) {
					raf.writeBytes(tmpraf.readLine());
					raf.writeBytes(System.lineSeparator());
				}

				// Set the length of the original file
				// to that of temporary.
				raf.setLength(tmpraf.length());

				// Closing the resources.
				tmpraf.close();
				raf.close();

				// Deleting the temporary file
				tmpFile.delete();

				System.out.println(" Friend deleted. ");
			}

			// The contact to be deleted
			// could not be found
			else {

				// Closing the resources.
				raf.close();

				// Print the message
				System.out.println(" Input name does not exists. ");
			}
		}

		catch (IOException ioe) {
			System.out.println(ioe);
		}
	
    }//GEN-LAST:event_addDeleteActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        try {
 
            // Get the name of the contact to be updated
            // from the Command line argument
       
            String newName = String.valueOf(txtNombre.getText());

	    // Get the number to be updated
	    // from the Command line argument
	    long newNumber = Long.parseLong(txtTelefono.getText());
 
            String nameNumberString;
            String name;
            long number;
            int index;
 
            // Using file pointer creating the file.
            File file = new File("C:\\Users\\JUAN PABLO\\Desktop\\Juan Manuel U\\Semestre 2024-1\\Programación orientada a objetos\\Actividad 6\\Actividad6_POO-main\\Actividad6_POO-main\\Archivos\\A6FriendsContacts.txt");

 
            if (!file.exists()) {
 
                // Create a new file if not exists.
                file.createNewFile();
            }
 
            // Opening file in reading and write mode.
            RandomAccessFile raf
                = new RandomAccessFile(file, "rw");
            boolean found = false;
 
            // Checking whether the name
            // of contact already exists.
            // getFilePointer() give the current offset
            // value from start of the file.
            while (raf.getFilePointer() < raf.length()) {
 
                // reading line from the file.
                nameNumberString = raf.readLine();
 
                // splitting the string to get name and
                // number
                String[] lineSplit
                    = nameNumberString.split("!");
 
                // separating name and number.
                name = lineSplit[0];
                number = Long.parseLong(lineSplit[1]);
 
                // if condition to find existence of record.
                if (name.equals(newName)
                    || number == newNumber) {
                    found = true;
                    break;
                }
            }
 
            // Update the contact if record exists.
            if (found == true) {
 
                // Creating a temporary file
                // with file pointer as tmpFile.
                File tmpFile = new File("C:\\Users\\JUAN PABLO\\Desktop\\Juan Manuel U\\Semestre 2024-1\\Programación orientada a objetos\\Actividad 6\\Actividad6_POO-main\\Actividad6_POO-main\\Archivos\\temp.txt");

 
                // Opening this temporary file
                // in ReadWrite Mode
                RandomAccessFile tmpraf
                    = new RandomAccessFile(tmpFile, "rw");
 
                // Set file pointer to start
                raf.seek(0);
 
                // Traversing the friendsContact.txt file
                while (raf.getFilePointer()
                       < raf.length()) {
 
                    // Reading the contact from the file
                    nameNumberString = raf.readLine();
 
                    index = nameNumberString.indexOf('!');
                    name = nameNumberString.substring(
                        0, index);
 
                    // Check if the fetched contact
                    // is the one to be updated
                    if (name.equals(newName)) {
 
                        // Update the number of this contact
                        nameNumberString
                            = name + "!"
                              + String.valueOf(newNumber);
                    }
 
                    // Add this contact in the temporary
                    // file
                    tmpraf.writeBytes(nameNumberString);
 
                    // Add the line separator in the
                    // temporary file
                    tmpraf.writeBytes(
                        System.lineSeparator());
                }
 
                // The contact has been updated now
                // So copy the updated content from
                // the temporary file to original file.
 
                // Set both files pointers to start
                raf.seek(0);
                tmpraf.seek(0);
 
                // Copy the contents from
                // the temporary file to original file.
                while (tmpraf.getFilePointer()
                       < tmpraf.length()) {
                    raf.writeBytes(tmpraf.readLine());
                    raf.writeBytes(System.lineSeparator());
                }
 
                // Set the length of the original file
                // to that of temporary.
                raf.setLength(tmpraf.length());
 
                // Closing the resources.
                tmpraf.close();
                raf.close();
 
                // Deleting the temporary file
                tmpFile.delete();
 
                System.out.println(" Friend updated. ");
            }
 
            // The contact to be updated
            // could not be found
            else {
 
                // Closing the resources.
                raf.close();
 
                // Print the message
                System.out.println(" Input name does not exists. ");
            }
        }
 
        catch (IOException ioe) {
            System.out.println(ioe);
        }
 
        catch (NumberFormatException nef) {
            System.out.println(nef);
        }
    
    }//GEN-LAST:event_updateButtonActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazCrud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazCrud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazCrud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazCrud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazCrud().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button addButton;
    private java.awt.Button addDelete;
    private java.awt.Label nombreLabel;
    private java.awt.Button readButton;
    private java.awt.Label telefonoLabel;
    private java.awt.TextArea textArea1;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    private java.awt.Button updateButton;
    // End of variables declaration//GEN-END:variables
}
