package command;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CommandMain extends JFrame implements ActionListener, MouseMotionListener, WindowListener {
    private MacroCommand history = new MacroCommand();
    private DrawCanvas canvas = new DrawCanvas(2500,2000,history);
    private JButton clearBtn = new JButton("清除画布");
    public CommandMain(String title) {
        super(title);
        this.addWindowListener(this);
        clearBtn.addActionListener(this);
        canvas.addMouseMotionListener(this);
        Box btnBox = new Box(BoxLayout.X_AXIS);
        btnBox.add(clearBtn);
        Box mainBox = new Box(BoxLayout.Y_AXIS);
        mainBox.add(btnBox);
        mainBox.add(canvas);
        getContentPane().add(mainBox);
        pack();
        show();
    }

    public void actionPerformed(ActionEvent event) {
        if(event.getSource()==clearBtn) {
            history.clear();
            canvas.repaint();
        }
    }

    public void mouseMoved(MouseEvent event) {}

    public void mouseDragged(MouseEvent mouseEvent) {
        Command command = new DrawCommand(canvas,mouseEvent.getPoint());
        history.append(command);
        command.execute();
    }

    public void windowClosing(WindowEvent event) {
        System.exit(0);
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }

    public static void main(String[] args) {
        new CommandMain("XLT");
    }
}
