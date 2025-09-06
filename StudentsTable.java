import javax.swing.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel;
class StudentsTable
{
  StudentsTable()
  {
    JFrame f=new JFrame();
	String columnnames[]={"ID","First Name","Last Name","Phone","Address","Course","Username","Password"};
	DefaultTableModel model=new DefaultTableModel();
	model.setColumnIdentifiers(columnnames);
	JTable table=new JTable();
	f.add(new ScrollPane(table));
    table.setModel(model);
	f.setSize(700,700);
	f.setVisible(true);
	f.setLayout(null);
  }
  public static void main(String... kjfzx)
  {
    new StudentsTable();
  }
}  