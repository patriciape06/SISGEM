package sisgem;
import java.sql.*;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static sisgem.empleados.rs;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;

public class contratos extends javax.swing.JFrame {
    MySQL db = new MySQL();
    String estado="1";
    static ResultSet rs=null;
    static ResultSet rs2=null;
    DefaultTableModel dtm=new DefaultTableModel();
    int B=0;
    
    public contratos() {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(230,244,244));
        String Titulos[]={"ID","DNI","Nombre y Apellido","Fecha Ingreso","Filial"};
        dtm.setColumnIdentifiers(Titulos);
        tbContratos.setModel(dtm);
        FrmNuevo.setVisible(false);
        FrmBuscar.setVisible(false);
    }
   
    
    
    public boolean Vacio(){
        boolean[] field = new boolean[7];
        boolean r=false;
        field[0]=dni.getText().isEmpty();
        field[1]=fechinicio.getText().isEmpty();
        field[2]=fechIngreso.getText().isEmpty();
        field[3]=categoria.getText().isEmpty();
        //field[4]=filial.getSelectedItem().equals("");
        field[5]=horas.getText().isEmpty();
        field[6]=sueldo.getText().isEmpty();
        if(field[0] || field[1] || field[2] || field[3]|| field[5]|| field[6]){
            r=true;
        }else{
            r=false;
        }
        return r;
    }
    
    
    
    public String DateToString(Date fecha){
        //Calendar cal=Calendar.getInstance(); 
       // Date fechaDate = null;
        //String fecha=cal.get(cal.DATE)+"-"+cal.get((cal.MONTH)+1) +"-"+cal.get(cal.YEAR);
        //java.util.Date date = new java.util.Date();
        java.text.SimpleDateFormat sdf=new java.text.SimpleDateFormat("dd/MM/yyyy");
        //try {
            String fecha1 = sdf.format(fecha);
            return fecha1;
            /*/
        } catch (ParseException ex) {
            ex.printStackTrace();
            //return fechaDate;
        }/*/	
        
    }
    
    
 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        FrmNuevo = new javax.swing.JInternalFrame();
        jLabel54 = new javax.swing.JLabel();
        dni = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        nomyape = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        fechinicio = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        categoria = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        horas = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        sueldo = new javax.swing.JTextField();
        BGuardar = new javax.swing.JButton();
        BCancelar = new javax.swing.JButton();
        BBuscar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        filial = new javax.swing.JComboBox();
        id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fechIngreso = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fechFin = new javax.swing.JTextField();
        idcontrato = new javax.swing.JTextField();
        FrmBuscar = new javax.swing.JInternalFrame();
        jLabel2 = new javax.swing.JLabel();
        cbBuscar = new javax.swing.JComboBox();
        txtCampo = new javax.swing.JTextField();
        btBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbContratos = new javax.swing.JTable();
        jButton9 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SisGEmp");
        setBackground(new java.awt.Color(200, 240, 240));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(230, 244, 244));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton6.setText("Fichadas");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton5.setText("Gestionar Sueldos");

        jButton4.setText("Estadisticas");

        jButton3.setText("Informes");

        jButton2.setText("Gestionar Filiar");

        jButton1.setText("Gestionar Empleados");
        jButton1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jButton1FocusLost(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton10.setText("Gestionar Contratos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addGap(18, 18, 18)
                .addComponent(jButton10)
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton7.setText("Nuevo Contrato");
        jButton7.setActionCommand("");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Buscar Contrato");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel1.setText("Gestión de Contratos");

        FrmNuevo.setVisible(true);

        jLabel54.setText("DNI de Empleado:");

        dni.setPreferredSize(new java.awt.Dimension(6, 22));

        jLabel55.setText("Nombre y Apellido:");

        nomyape.setEditable(false);
        nomyape.setMinimumSize(new java.awt.Dimension(6, 22));

        jLabel57.setText("Fecha de Inicio de Actividades:");

        fechinicio.setEditable(false);
        fechinicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoActionPerformed(evt);
            }
        });

        jLabel59.setText("Categoría:");

        categoria.setEditable(false);
        categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoActionPerformed(evt);
            }
        });

        jLabel60.setText("Horas:");

        horas.setEditable(false);
        horas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                celularActionPerformed(evt);
            }
        });

        jLabel61.setText("Sueldo Básico:");

        sueldo.setEditable(false);
        sueldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correoActionPerformed(evt);
            }
        });

        BGuardar.setText("Guardar");
        BGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        BCancelar.setText("Cancelar");
        BCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        BBuscar.setText("Buscar");
        BBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBuscarActionPerformed(evt);
            }
        });

        id.setEditable(false);
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        jLabel3.setText("Id Empleado");

        fechIngreso.setEditable(false);

        jLabel4.setText("Fecha de Ingreso:");

        jLabel5.setText("Filial:");

        jLabel6.setText("Fecha de Final de Actividades:");

        fechFin.setEditable(false);

        idcontrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idcontratoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FrmNuevoLayout = new javax.swing.GroupLayout(FrmNuevo.getContentPane());
        FrmNuevo.getContentPane().setLayout(FrmNuevoLayout);
        FrmNuevoLayout.setHorizontalGroup(
            FrmNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(FrmNuevoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(FrmNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FrmNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FrmNuevoLayout.createSequentialGroup()
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(FrmNuevoLayout.createSequentialGroup()
                        .addComponent(dni, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BBuscar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(FrmNuevoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FrmNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FrmNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrmNuevoLayout.createSequentialGroup()
                            .addComponent(idcontrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(49, 49, 49)
                            .addComponent(BCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(FrmNuevoLayout.createSequentialGroup()
                            .addGroup(FrmNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(FrmNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(fechFin, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                                .addComponent(fechinicio)))
                        .addGroup(FrmNuevoLayout.createSequentialGroup()
                            .addComponent(jLabel55)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(nomyape, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(FrmNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(FrmNuevoLayout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(fechIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(42, 42, 42)
                            .addComponent(jLabel59)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(FrmNuevoLayout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(filial, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel60)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(horas, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel61)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(sueldo))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        FrmNuevoLayout.setVerticalGroup(
            FrmNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrmNuevoLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(FrmNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(jLabel54)
                    .addComponent(BBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FrmNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(FrmNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(nomyape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FrmNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57)
                    .addComponent(fechinicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(FrmNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(fechFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FrmNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(fechIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel59)
                    .addComponent(categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(FrmNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(filial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(horas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel61)
                    .addComponent(sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(FrmNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FrmNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(BCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                        .addComponent(BGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(idcontrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        FrmBuscar.setVisible(true);

        jLabel2.setText("Buscar Por :");

        cbBuscar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "dni", "apellidoEmpleado" }));

        btBuscar.setText("Buscar");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        tbContratos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbContratos);

        jButton9.setText("Modificar");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton11.setText("Dar de Baja");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed1(evt);
            }
        });

        jButton12.setText("Cancelar");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FrmBuscarLayout = new javax.swing.GroupLayout(FrmBuscar.getContentPane());
        FrmBuscar.getContentPane().setLayout(FrmBuscarLayout);
        FrmBuscarLayout.setHorizontalGroup(
            FrmBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrmBuscarLayout.createSequentialGroup()
                .addGroup(FrmBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FrmBuscarLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(FrmBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addGroup(FrmBuscarLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btBuscar))))
                    .addGroup(FrmBuscarLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jButton9)
                        .addGap(27, 27, 27)
                        .addComponent(jButton11)
                        .addGap(18, 18, 18)
                        .addComponent(jButton12)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FrmBuscarLayout.setVerticalGroup(
            FrmBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrmBuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FrmBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FrmBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(FrmBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addComponent(txtCampo))
                    .addComponent(btBuscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(FrmBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jMenu1.setLabel("Usuarios");
        jMenuBar1.add(jMenu1);

        jMenu2.setLabel("Salir");
        jMenu2.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu2MenuSelected(evt);
            }
        });
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });
        jMenu2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenu2KeyPressed(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(FrmNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FrmBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(176, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FrmBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FrmNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1FocusLost

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       FrmNuevo.setVisible(true);
       FrmBuscar.setVisible(false);
       
     
        dni.setText("");
        id.setText("");

       nomyape.setText("");
       fechinicio.setText("");
       fechIngreso.setText("");
       categoria.setText("");
       //filial.set;
       horas.setText("");
       sueldo.setText("");
       BBuscar.setVisible(true);
       B=0;
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        //buscar_empleado be= new buscar_empleado();
        //be.setVisible(true);
        FrmBuscar.setVisible(true);
        FrmNuevo.setVisible(false);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        
        try{
            int f, i;
            db.MySQLConnection();
            String v =(String)cbBuscar.getSelectedItem();
            String campo=txtCampo.getText();
            String id="0";
            String dni="0";
            String apeNom="0";
            if (!(txtCampo.getText().isEmpty())){
                rs2=db.BuscarDatos2(rs2,"empleados",v,campo);
                while(rs2.next()) {
                         id =(String) rs2.getString(1);
                         
                }
                rs=db.BuscarDatos2(rs,"contratos","idEmpleado",id);
            }else{
                
                rs=db.BuscarDatos(rs, "contratos");
            }
            String datos[]=new String[6];
            if(rs.first()){
                
                rs.beforeFirst();
                f=dtm.getRowCount();
                if(f>0)
                    for(i=0;i<f;i++)
                    dtm.removeRow(0);
                    while(rs.next()) {
                        rs2=db.BuscarDatos2(rs2,"empleados","idEmpleado",rs.getString(2));
                        while(rs2.next()) {
                            
                            datos[2]= (String)rs2.getString(4)+' '+(String)rs2.getString(5);
                            dni= (String) rs2.getString(2);
                        }
                        datos[0]=(String)rs.getString(1);
                        
                        datos[1]=dni;
                        datos[3]=(String)rs.getString(4);
                        datos[4]=(String)rs.getString(3);
                        dtm.addRow(datos);

                    }
            }else{
                JOptionPane.showMessageDialog(null, "No se encontro el registro");
                txtCampo.setText("");
            }
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "No se encontro el registro");
        }
        db.closeConnection();
    }//GEN-LAST:event_btBuscarActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
       
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenu2MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu2MenuSelected
        
    }//GEN-LAST:event_jMenu2MenuSelected

    private void jMenu2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenu2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2KeyPressed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        //empleados.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        if(!(Vacio())) {      
                db.MySQLConnection();
               // Date  F=new java.sql.Date((fechIngreso.getText()).getTime()));
                if(B==0){
                        db.insertContrato("contratos", id.getText(),
                            filial.getSelectedItem().toString(),
                            fechIngreso.getText(),
                            fechinicio.getText(),
                            fechFin.getText(),

                            categoria.getText(),
                            horas.getText(),
                            sueldo.getText());

                            
                }else{
                    int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea modificar los datos actuales?");
                    if(confirmar == JOptionPane.YES_OPTION){

                        db.UpdateContratos("contratos", 
                        idcontrato.getText(),
                        filial.getSelectedItem().toString(),
                        fechIngreso.getText(),
                        fechinicio.getText(),

                        fechFin.getText(),
                        categoria.getText(),
                        horas.getText(),
                        sueldo.getText());
                        B=0;
                        FrmBuscar.setVisible(true);
                        FrmNuevo.setVisible(false);
                        
                    }
                }
                db.closeConnection();
        }else{
              JOptionPane.showMessageDialog(null, "Debe completar todos los campos");
        }
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correoActionPerformed

    private void celularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_celularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_celularActionPerformed

    private void telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoActionPerformed

    private void apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoActionPerformed

    private void BBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBuscarActionPerformed
        
        try{
            db.MySQLConnection();
            //String v = (String)BBuscar.getS
            String dniemp=dni.getText();
            
            if (!(dni.getText().isEmpty())){
                
                rs=db.BuscarDatos2(rs,"empleados", "dni", dniemp);
                //System.out.print(dniemp);
                if(rs.first()){
                   System.out.print(dni);
                    rs.beforeFirst();
                    while (rs.next()){
                        String nom=rs.getString(4);
                        String Ape=rs.getString(5);
                        String id2=rs.getString(1);
                        nomyape.setText(nom+ " "+Ape);
                        id.setText(id2);
                        
                    }
                    fechinicio.setEditable(true);
                    filial.setEditable(true);
                    categoria.setEditable(true);
                    horas.setEditable(true);
                    sueldo.setEditable(true);
                    fechIngreso.setEditable(true);
                    fechFin.setEditable(true);
                    
                    rs=db.BuscarDatos(rs, "filiales");
                    while(rs.next()) {
                         String f = rs.getString("idFilial");   
                         filial.addItem(f); 
                    } 
                    
                    
                }else{
                JOptionPane.showMessageDialog(null, "El Dni ingresado no se encuentra en la Base de Datos de Empleados");
                txtCampo.setText("");
                }
                db.closeConnection();
            }else{
               JOptionPane.showMessageDialog(null, "Ingrese el DNI del Empleado"); 
            }
            
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "No se encontro el registro");
        }
        
    }//GEN-LAST:event_BBuscarActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void jButton11ActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed1
        int filaseleccionada = tbContratos.getSelectedRow();
        //int seleccion=tbEmpleados.getSelectedColumn();
        if(filaseleccionada!= -1){
        
            int confirmar = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea dar de baja a este contrato?");
            //int filaseleccionada = tbEmpleados.getSelectedRow();
            String idContrato = tbContratos.getValueAt(filaseleccionada, 0).toString();
                if(confirmar == JOptionPane.YES_OPTION){
                    db.MySQLConnection();
                    db.DarBaja("contratos", idContrato, "idContrato");
                    db.closeConnection();   
                    //System.out.print(idEmpleado);

            }// TODO add your handling code here:
        }else{
           JOptionPane.showMessageDialog(null, "Debe selecionar el contrato que desea dar de baja");
          }
                                          
         
    }//GEN-LAST:event_jButton11ActionPerformed1

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        try{
         int filaseleccionada = tbContratos.getSelectedRow();
         //int seleccion=tbContratos.getSelectedColumn();
         if(filaseleccionada!= -1){   
            String idContr = tbContratos.getValueAt(filaseleccionada, 0).toString();
            String dniEm = tbContratos.getValueAt(filaseleccionada, 1).toString();
            String nomApe = tbContratos.getValueAt(filaseleccionada, 2).toString();
            //System.out.print(filaseleccionada);

            FrmBuscar.setVisible(false);
            FrmNuevo.setVisible(true);
          
            db.MySQLConnection();
            rs=db.BuscarDatos2(rs,"contratos","idContrato",idContr);
            while (rs.next()){
                String fechinici= DateToString(rs.getDate("fechaInicioActividades"));
                String fechIngres= DateToString(rs.getDate("fechaIngreso"));
                String fechFinal= DateToString(rs.getDate("fechaFinActividades"));
                String cat= rs.getString("categoria");
                String hs= rs.getString("cantidadHoras");
                String f= rs.getString("idFilial");
                String sueldoB= rs.getString("sueldoBasico");
                String idEmp=rs.getString("idEmpleado");
                //String idCont=rs.getString("idContrato");
                
                fechinicio.setText(fechinici);
                fechIngreso.setText(fechIngres);
                fechFin.setText(fechFinal);
                categoria.setText(cat);
                idcontrato.setText(idContr);               
                horas.setText(hs);
                sueldo.setText(sueldoB);
                dni.setText(dniEm);
                id.setText(idEmp);
                nomyape.setText(nomApe);
                
                rs=db.BuscarDatos(rs, "filiales");
                    while(rs.next()) {
                         String fi = rs.getString("idFilial");   
                         filial.addItem(fi); 
                } 
                filial.setSelectedItem(f);
                
                fechinicio.setEditable(true);
                fechFin.setEditable(true);
                filial.setEditable(true);
                categoria.setEditable(true);
                horas.setEditable(true);
                sueldo.setEditable(true);
                fechIngreso.setEditable(true);
                dni.setEditable(false);
                BBuscar.setVisible(false);
                
               
                B=1;
            }
                
            db.closeConnection();   
          }else{
           JOptionPane.showMessageDialog(null, "Debe selecionar un contrato");
          }
           
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "No no se encontro el registro");
        }                                           

     
    }//GEN-LAST:event_jButton9ActionPerformed

    private void idcontratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idcontratoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idcontratoActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new contratos().setVisible(true);      
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BBuscar;
    private javax.swing.JButton BCancelar;
    private javax.swing.JButton BGuardar;
    private javax.swing.JInternalFrame FrmBuscar;
    private javax.swing.JInternalFrame FrmNuevo;
    private javax.swing.JButton btBuscar;
    private javax.swing.JTextField categoria;
    private javax.swing.JComboBox cbBuscar;
    private javax.swing.JTextField dni;
    private javax.swing.JTextField fechFin;
    private javax.swing.JTextField fechIngreso;
    private javax.swing.JTextField fechinicio;
    private javax.swing.JComboBox filial;
    private javax.swing.JTextField horas;
    private javax.swing.JTextField id;
    private javax.swing.JTextField idcontrato;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField nomyape;
    private javax.swing.JTextField sueldo;
    private javax.swing.JTable tbContratos;
    private javax.swing.JTextField txtCampo;
    // End of variables declaration//GEN-END:variables
 }
