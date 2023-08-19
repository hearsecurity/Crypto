import org.json.JSONArray;
import org.json.JSONObject;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;

class getJsonInfo {

      public String bitcoin(String currency) throws MalformedURLException, IOException {

         StringBuilder bitinfo = new StringBuilder();
         URL url = new URL("https://api.coingecko.com/api/v3/coins/markets?vs_currency="+currency+"&ids=bitcoin");
         HttpURLConnection con = (HttpURLConnection) url.openConnection();
         BufferedReader reader = new BufferedReader(
         new InputStreamReader(con.getInputStream()));

         for (String line; (line = reader.readLine()) != null; ) {
                bitinfo.append(line);
         }
         String info = bitinfo.toString();
         return info;

      }

      public String ethereum(String currency) throws MalformedURLException, IOException {

         StringBuilder etherinfo = new StringBuilder();
         URL url = new URL("https://api.coingecko.com/api/v3/coins/markets?vs_currency="+currency+"&ids=ethereum");
         HttpURLConnection con = (HttpURLConnection) url.openConnection();
         BufferedReader reader = new BufferedReader(
         new InputStreamReader(con.getInputStream()));

         for (String line; (line = reader.readLine()) != null; ) {
                etherinfo.append(line);
         }
         String info = etherinfo.toString();
         return info;

      }

      public String monero(String currency) throws MalformedURLException, IOException {

         StringBuilder monerinfo = new StringBuilder();
         URL url = new URL("https://api.coingecko.com/api/v3/coins/markets?vs_currency="+currency+"&ids=monero");
         HttpURLConnection con = (HttpURLConnection) url.openConnection();
         BufferedReader reader = new BufferedReader(
         new InputStreamReader(con.getInputStream()));

         for (String line; (line = reader.readLine()) != null; ) {
                monerinfo.append(line);
         }
         String info = monerinfo.toString();
         return info;

      }

      public String litecoin(String currency) throws MalformedURLException, IOException {

         StringBuilder liteinfo = new StringBuilder();
         URL url = new URL("https://api.coingecko.com/api/v3/coins/markets?vs_currency="+currency+"&ids=litecoin");
         HttpURLConnection con = (HttpURLConnection) url.openConnection();
         BufferedReader reader = new BufferedReader(
         new InputStreamReader(con.getInputStream()));

         for (String line; (line = reader.readLine()) != null; ) {
                liteinfo.append(line);
         }
         String info = liteinfo.toString();
         return info;

      }
}



class MyFrame extends JFrame implements ActionListener {

     private Container c;
     private JLabel title;
     private JLabel bitcoin;
     private JLabel ethereum;
     private JLabel monero;
     private JLabel litecoin;
     private JLabel bitcoin_text;
     private JLabel ethereum_text;
     private JLabel monero_text;
     private JLabel litecoin_text;

     private JTextField bitfield;
     private JTextField etherfield;
     private JTextField monerfield;
     private JTextField litefield;

     private JLabel currencyb;
     private JLabel currencye;
     private JLabel currencym;
     private JLabel currencyl;

     private String bitsymbols[] = {"USD","BRL"};
     private String ethersymbols[] = {"USD","BRL"};
     private String monsymbols[] = {"USD","BRL"};
     private String litesymbols[] = {"USD","BRL"};

     private JComboBox currencybfield;
     private JComboBox currencyefield;
     private JComboBox currencymfield;
     private JComboBox currencylfield;

     private JButton sub;
     private JButton reset;


     public MyFrame() {

         setTitle("Cryptocurrency Information");
         setBounds(400, 400, 700, 600);
         setDefaultCloseOperation(EXIT_ON_CLOSE);
         setResizable(false);
         c = getContentPane();
         c.setLayout(null);

         title = new JLabel("Cryptocurrencies");
         title.setForeground(Color.black);
         title.setFont(new Font("monospaced", Font.BOLD, 20));
         title.setSize(300,30);
         title.setLocation(250,30);
         c.add(title);

         URL url1 = this.getClass().getResource("/images/bitcoin.png");
         ImageIcon bit = new ImageIcon(url1);
         bitcoin = new JLabel(bit);
         bitcoin.setSize(200,300);
         c.add(bitcoin);

         bitcoin_text = new JLabel("Bitcoin");
         bitcoin_text.setFont(new Font("monospaced", Font.BOLD, 20));
         bitcoin_text.setSize(100,100);
         bitcoin_text.setLocation(160,100);
         c.add(bitcoin_text);

         bitfield = new JTextField();
         bitfield.setFont(new Font("Arial", Font.PLAIN, 15));
         bitfield.setSize(140, 20);
         bitfield.setLocation(260, 145);
         bitfield.setEditable(false);
         bitfield.setHorizontalAlignment(JTextField.CENTER);
         c.add(bitfield);

         currencyb = new JLabel("Currency:");
         currencyb.setFont(new Font("monospaced", Font.BOLD, 20));
         currencyb.setSize(200,100);
         currencyb.setLocation(410,100);
         c.add(currencyb);

         currencybfield = new JComboBox(bitsymbols);
         currencybfield.setFont(new Font("Arial", Font.PLAIN, 15));
         currencybfield.setSize(80, 20);
         currencybfield.setLocation(520, 145);
         c.add(currencybfield);

         URL url2 = this.getClass().getResource("/images/ethereum.png");
         ImageIcon ether = new ImageIcon(url2);
         ethereum = new JLabel(ether);
         ethereum.setSize(200,500);
         c.add(ethereum);

         ethereum_text = new JLabel("Ethereum");
         ethereum_text.setFont(new Font("monospaced", Font.BOLD, 20));
         ethereum_text.setSize(100,100);
         ethereum_text.setLocation(160,200);
         c.add(ethereum_text);

         etherfield = new JTextField();
         etherfield.setFont(new Font("Arial", Font.PLAIN, 15));
         etherfield.setSize(140, 20);
         etherfield.setLocation(260, 245);
         etherfield.setEditable(false);
         etherfield.setHorizontalAlignment(JTextField.CENTER);
         c.add(etherfield);

         currencye = new JLabel("Currency:");
         currencye.setFont(new Font("monospaced", Font.BOLD, 20));
         currencye.setSize(200,100);
         currencye.setLocation(410,200);
         c.add(currencye);

         currencyefield = new JComboBox(ethersymbols);
         currencyefield.setFont(new Font("Arial", Font.PLAIN, 15));
         currencyefield.setSize(80, 20);
         currencyefield.setLocation(520, 245);
         c.add(currencyefield);

         URL url3 = this.getClass().getResource("/images/monero.png");
         ImageIcon mon = new ImageIcon(url3);
         monero = new JLabel(mon);
         monero.setSize(200,700);
         c.add(monero);

         monero_text = new JLabel("Monero");
         monero_text.setFont(new Font("monospaced", Font.BOLD, 20));
         monero_text.setSize(100,100);
         monero_text.setLocation(160,300);
         c.add(monero_text);

         monerfield = new JTextField();
         monerfield.setFont(new Font("Arial", Font.PLAIN, 15));
         monerfield.setSize(140, 20);
         monerfield.setLocation(240, 345);
         monerfield.setEditable(false);
         monerfield.setHorizontalAlignment(JTextField.CENTER);
         c.add(monerfield);

         currencym = new JLabel("Currency:");
         currencym.setFont(new Font("monospaced", Font.BOLD, 20));
         currencym.setSize(200,100);
         currencym.setLocation(390,300);
         c.add(currencym);

         currencymfield = new JComboBox(monsymbols);
         currencymfield.setFont(new Font("Arial", Font.PLAIN, 15));
         currencymfield.setSize(80, 20);
         currencymfield.setLocation(500, 345);
         c.add(currencymfield);

         URL url4 = this.getClass().getResource("/images/litecoin.png");
         ImageIcon lite = new ImageIcon(url4);
         litecoin = new JLabel(lite);
         litecoin.setSize(200, 900);
         c.add(litecoin);

         litecoin_text = new JLabel("Litecoin");
         litecoin_text.setFont(new Font("monospaced", Font.BOLD, 20));
         litecoin_text.setSize(100,100);
         litecoin_text.setLocation(160,400);
         c.add(litecoin_text);

         litefield = new JTextField();
         litefield.setFont(new Font("Arial", Font.PLAIN, 15));
         litefield.setSize(140, 20);
         litefield.setLocation(260, 445);
         litefield.setEditable(false);
         litefield.setHorizontalAlignment(JTextField.CENTER);
         c.add(litefield);

         currencyl = new JLabel("Currency:");
         currencyl.setFont(new Font("monospaced", Font.BOLD, 20));
         currencyl.setSize(200,100);
         currencyl.setLocation(410,400);
         c.add(currencyl);

         currencylfield = new JComboBox(litesymbols);
         currencylfield.setFont(new Font("Arial", Font.PLAIN, 15));
         currencylfield.setSize(80, 20);
         currencylfield.setLocation(520, 445);
         c.add(currencylfield);

         sub = new JButton("Submit");
         sub.setFont(new Font("Arial", Font.PLAIN, 15));
         sub.setSize(100, 20);
         sub.setLocation(250, 500);
         sub.addActionListener(this);
         c.add(sub);

         reset = new JButton("Reset");
         reset.setFont(new Font("Arial", Font.PLAIN, 15));
         reset.setSize(100, 20);
         reset.setLocation(350, 500);
         reset.addActionListener(this);
         c.add(reset);

         setVisible(true);
     }

     public float json_decoder(String object) {

       float price = 00f;
       JSONArray jsonArr = new JSONArray(object);

       for (int i = 0; i < jsonArr.length(); i++)
        {
            JSONObject jsonObj = jsonArr.getJSONObject(i);
            price = jsonObj.getFloat("current_price");
        }

        return price;

     }

     public void actionPerformed(ActionEvent e) {

          if(e.getSource() == sub) {

               String bcurrency = (String) currencybfield.getSelectedItem();
               String ecurrency = (String) currencyefield.getSelectedItem();
               String mcurrency = (String) currencymfield.getSelectedItem();
               String lcurrency = (String) currencylfield.getSelectedItem();

               getJsonInfo json = new getJsonInfo();
               String jbitcoin = null;
               String jethereum = null;
               String jmonero = null;
               String jlitecoin = null;

               try {
                 jbitcoin = json.bitcoin(bcurrency);
                 jethereum = json.ethereum(ecurrency);
                 jmonero = json.monero(mcurrency);
                 jlitecoin = json.litecoin(lcurrency);
               }catch(MalformedURLException a) {
                  System.out.println("MALFORMED URL.");
               }catch(IOException b) {
                  System.out.println("IO ERROR.");
               }

               float bitcoin_price = json_decoder(jbitcoin);
               float ethereum_price = json_decoder(jethereum);
               float monero_price = json_decoder(jmonero);
               float litecoin_price = json_decoder(jlitecoin);

               bitfield.setText(Float.toString(bitcoin_price));
               etherfield.setText(Float.toString(ethereum_price));
               monerfield.setText(Float.toString(monero_price));
               litefield.setText(Float.toString(litecoin_price));


          } else if(e.getSource() == reset) {
               bitfield.setText("");
               etherfield.setText("");
               monerfield.setText("");
               litefield.setText("");

          }
     }
}


public class Crypto {

       public static void main(String[] args) {

            MyFrame frame = new MyFrame();
       }
}
