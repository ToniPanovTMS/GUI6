/*
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GUI6 extends Canvas {
    static int dx = 0, dy = 0;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JTextField textField = new JTextField(20);
        frame.getContentPane().add(textField, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Не хитрое движение");
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setBounds(dim.width / 2 - 1000 / 2, dim.height / 2 - 1000 / 2, 1000, 1000);
        frame.setVisible(true);
        KeyListener listener = new KeyListener() {
            @Override
            public void keyReleased(KeyEvent keyEvent) {
            }

            @Override
            public void keyTyped(KeyEvent keyEvent) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                int key = e.getKeyCode();
                if (key == KeyEvent.VK_LEFT) {
                    dx -= 20;
                    if (dx < 0) {
                        dx = 0;
                    }
                    System.out.println(dx+" "+dy);

                }

                if (key == KeyEvent.VK_RIGHT) {
                    dx += 20;
                    if (dx > 1000) {
                        dx = 1000;
                    }
                    System.out.println(dx+" "+dy);
                }

                if (key == KeyEvent.VK_UP) {
                    dy -= 20;
                    if (dy < 0) {
                        dy = 0;
                    }
                    System.out.println(dx+" "+dy);
                }

                if (key == KeyEvent.VK_DOWN) {
                    dy += 20;
                    if (dy > 1000) {
                        dy = 1000;
                    }
                    System.out.println(dx+" "+dy);
                }
            }
        };
        textField.addKeyListener(listener);

    }

}
 */
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class KeyboardEvent {
    static int dx = 0, dy = 0;

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        JTextField textField = new JTextField(20);
        frame.getContentPane().add(textField, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Не хитрое движение");
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setBounds(dim.width / 2 - 1000 / 2, dim.height / 2 - 1000 / 2, 1000, 1000);
        frame.setVisible(true);
        JPanel jpanel = new JPanel();
        jpanel.setLayout(null);
        frame.add(jpanel);

        JLabel j1 = new JLabel((Icon) getImage());
        jpanel.add(j1);
        j1.setLocation(dx,dy);


        j1.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                int key = e.getKeyCode();
                if (key == KeyEvent.VK_LEFT) {
                    dx -= 20;
                    if (dx < 0) {
                        dx = 0;
                    }
                    j1.setLocation(dx,dy);
                    System.out.println(dx+" "+dy);

                }

                if (key == KeyEvent.VK_RIGHT) {
                    dx += 20;
                    if (dx > 1000) {
                        dx = 1000;
                    }
                    j1.setLocation(dx,dy);
                    System.out.println(dx+" "+dy);
                }

                if (key == KeyEvent.VK_UP) {
                    dy -= 20;
                    if (dy < 0) {
                        dy = 0;
                    }
                    j1.setLocation(dx,dy);
                    System.out.println(dx+" "+dy);
                }

                if (key == KeyEvent.VK_DOWN) {
                    dy += 20;
                    if (dy > 1000) {
                        dy = 1000;
                    }
                    j1.setLocation(dx,dy);
                    System.out.println(dx+" "+dy);
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
        frame.setVisible(true);
    }
    public static Image getImage() {
        try {
            Image image = ImageIO.read(new File("C:\\Users\\user\\Documents\\java\\делаю штуки\\GUI6\\src\\Son.ico"));
            return image;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
