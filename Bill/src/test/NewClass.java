package test;

import java.awt.*;
import java.awt.event.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;

import javax.swing.*;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

/**
 * A JList of JButtons.
 */
public class NewClass implements Runnable
{
  private JList jlist;

  public static void main(String args[])
  {
    SwingUtilities.invokeLater(new NewClass());
  }

  public void run()
  {
    Object[] items = new ButtonItem[] {
        new ButtonItem("Apple"),
        new ButtonItem("Banana"),
        new ButtonItem("Carrot"),
        new ButtonItem("Date"),
        new ButtonItem("Eggplant"),
        new ButtonItem("Fig"),
        new ButtonItem("Guava"),
    };

    jlist = new JList(items);
    jlist.setCellRenderer(new ButtonListRenderer());
    jlist.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    jlist.setVisibleRowCount(5);
    jlist.addMouseListener(new MouseAdapter()
    {
      @Override
      public void mouseClicked(MouseEvent event)
      {
        clickButtonAt(event.getPoint());
      }
    });
    
    JButton jButton1 = new JButton("btn1");
    jButton1.setText("Mở Bàn");
    JButton jButton2 = new JButton("btn2");
    jButton2.setText("Tính Tiền");
    JButton jButton3 = new JButton("btn3");
    jButton3.setText("Sửa Món");
    JButton jButton4 = new JButton("btn4");
    jButton4.setText("Sửa Bàn");
    
    UtilDateModel model = new UtilDateModel();
    Properties p = new Properties();
    p.put("text.today", "Today");
    p.put("text.month", "Month");
    p.put("text.year", "Year");
    JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
    JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());

    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    frame.getContentPane().add(new JScrollPane(jlist));
    frame.getContentPane().add(datePicker);
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }

  private void clickButtonAt(Point point)
  {
    int index = jlist.locationToIndex(point);
    ButtonItem item = (ButtonItem) jlist.getModel().getElementAt(index);
    item.getButton().doClick();
//    jlist.repaint(jlist.getCellBounds(index, index));
  }

  public class ButtonItem
  {
    private JButton button;

    public ButtonItem(String name)
    {
      this.button = new JButton(name);
      button.addActionListener(new ActionListener()
      {
        @Override
        public void actionPerformed(ActionEvent e)
        {
          System.out.println(button.getText() + " was clicked.");
        }
      });
    }

    public JButton getButton()
    {
      return button;
    }

    @Override
    public String toString()
    {
      return button.getText();
    }
  }

  class ButtonListRenderer extends JButton implements ListCellRenderer
  {
    public Component getListCellRendererComponent(JList comp, Object value, int index,
                                                  boolean isSelected, boolean hasFocus)
    {
      setEnabled(comp.isEnabled());
      setFont(comp.getFont());
      setText(value.toString());

      if (isSelected)
      {
        setBackground(comp.getSelectionBackground());
        setForeground(comp.getSelectionForeground());
      }
      else
      {
        setBackground(comp.getBackground());
        setForeground(comp.getForeground());
      }

      return this;
    }
  }
  
    public class DateLabelFormatter extends JFormattedTextField.AbstractFormatter {

        private final String datePattern = "yyyy-MM-dd";
        private final SimpleDateFormat dateFormatter = new SimpleDateFormat(datePattern);

        @Override
        public Object stringToValue(String text) throws ParseException {
            return dateFormatter.parseObject(text);
        }

        @Override
        public String valueToString(Object value) throws ParseException {
            if (value != null) {
                Calendar cal = (Calendar) value;
                return dateFormatter.format(cal.getTime());
            }

            return "";
        }

    }
}