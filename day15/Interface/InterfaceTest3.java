package Interface;

//接口的应用，代理模式（屏蔽对真实角色的直接访问）

public class InterfaceTest3 {
    public static void main(String[] args){
        Server server = new Server();
        ProxyServer proxyServer = new ProxyServer(server);
        proxyServer.browse();
    }
}

interface NetWork{
    void browse();
}

//被代理类
class Server implements NetWork{

    @Override
    public void browse() {
        System.out.println("真正的服务器访问网络");
        
    }
    
}

//代理类
class ProxyServer implements NetWork{

    private NetWork work;

    public ProxyServer(NetWork work){
        this.work=work;
    }
    public void check(){
        System.out.println("联网之前的检查");
    }
    @Override
    public void browse() {
        check();
        work.browse();
        
    }
    
}