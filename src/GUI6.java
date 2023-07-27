import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.*;

public class GUI6 {
    static JFrame frame = new JFrame();
    static JLabel l;
    static int dx = 0, dy = 0;

    static public void move(KeyEvent e) {//метод движения по клавиатуре
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            dx -= 20;
            if (dx < 0) {
                dx = 1000;
            }
            l.setLocation(dx, dy);
            System.out.println(dx + " " + dy);

        }

        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            dx += 20;
            if (dx > 1000) {
                dx = -50;
            }
            l.setLocation(dx, dy);
            System.out.println(dx + " " + dy);
        }

        if (e.getKeyCode() == KeyEvent.VK_UP) {
            dy -= 20;
            if (dy < 0) {
                dy = 1000;
            }
            l.setLocation(dx, dy);
            System.out.println(dx + " " + dy);
        }

        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            dy += 20;
            if (dy > 1000) {
                dy = -50;
            }
            l.setLocation(dx, dy);
            System.out.println(dx + " " + dy);
        }
    }

    public static void main(String[] args) throws IOException {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Более хитрое перемещение");
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setBounds(dim.width / 2 - 1000 / 2, dim.height / 2 - 1000 / 2, 1000, 1000);
        BufferedImage im = ImageIO.read(new File("src/Son.png"));
        JPanel panel = new JPanel (new FlowLayout(FlowLayout.LEFT));
        panel.setFocusable(true);
        l = new JLabel(new ImageIcon(im),JLabel.RIGHT);
        panel.add(l, BorderLayout.NORTH);
        frame.add(panel);
        panel.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                move(e);
            }
        });
        frame.setVisible(true);//делаем форму видимой
    }
}


/*import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class T330004 {
    static JFrame frame = new JFrame();//создаем форму
    static JLabel l;//объект с картинкой
    static int dx=0, dy=0;//задаем размер окна


    static public void move(KeyEvent e) {//метод движения по клавиатуре
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            dx -= 20;
            if (dx < 0) {
                dx = 0;
            }
            l.setLocation(dx, dy);
            System.out.println(dx + " " + dy);

        }

        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            dx += 20;
            if (dx > 1000) {
                dx = 1000;
            }
            l.setLocation(dx, dy);
            System.out.println(dx + " " + dy);
        }

        if (e.getKeyCode() == KeyEvent.VK_UP) {
            dy -= 20;
            if (dy < 0) {
                dy = 0;
            }
            l.setLocation(dx, dy);
            System.out.println(dx + " " + dy);
        }

        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            dy += 20;
            if (dy > 1000) {
                dy = 1000;
            }
            l.setLocation(dx, dy);
            System.out.println(dx + " " + dy);
        }
    }

    public static void main(String[] args) throws IOException {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Простое перемещение клавиатурой");
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setBounds(dim.width / 2 - 1000 / 2, dim.height / 2 - 1000 / 2, 1000, 1000);
        BufferedImage im = ImageIO.read(new File("src/Son.png"));
        JPanel panel = new JPanel (new FlowLayout(FlowLayout.LEFT));
        panel.setFocusable(true);
        l = new JLabel(new ImageIcon(im),JLabel.RIGHT);
        panel.add(l, BorderLayout.NORTH);
        frame.add(panel);
        panel.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                move(e);
            }
        });
        frame.setVisible(true);//делаем форму видимой
    }
}

 */
