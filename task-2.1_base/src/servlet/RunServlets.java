package servlet;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletHandler;

public class RunServlets
{
    public static void main( String[] args ) throws Exception
    {
        Server server = new Server(8083);
        ServletHandler handler = new ServletHandler();
        
        server.setHandler(handler);
        handler.addServletWithMapping(MultiplierServlet.class, "/multiply");
        handler.addServletWithMapping(CurrencyServlet.class, "/getCurrencyUnit");

        server.start();
        server.join();
    }

}