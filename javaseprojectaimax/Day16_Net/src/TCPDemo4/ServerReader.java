package TCPDemo4;

import java.io.DataInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

public class ServerReader extends Thread {
    private Socket socket;
    public ServerReader(Socket socket) {
        this.socket = socket;
    }
    @Override
    public void run() {
        try {
            //给当前对应的浏览器管道响应一个网页数据回去。
            OutputStream os = socket.getOutputStream();
            //通过字节输出流包装写出去数据给浏览器
            //把字节输出流包装成打印流
            PrintStream ps = new PrintStream(os);
            //写响应的网页数据出去
            ps.println("HTTP/1.1 200 OK");//
            ps.println("Content-Type:text/html;charset=utf-8");//
            ps.println();//空行
            ps.println("<html>");
            ps.println("<head>");
            ps.println("<meta charset='uft-8'>");
            ps.println("<title>");
            ps.println("<h1>欢迎来到服务器</h1>");
            ps.println("</title>");
            ps.println("</head>");
            ps.println("<body>");
            ps.println("<a href='http://www.baidu.com'>百度一下</a>");
            ps.println("</body>");
            ps.println("</html>");
            ps.close();
            socket.close();
        } catch (Exception e) {
            System.out.println("客户端下线了" + socket.getInetAddress().getHostAddress());
        }
    }

}
