package ProxtDemo4;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyUtil {
    //创建一个明星对象的代理对象返回
    public static StarService createProxy(Star s){
                    /*
            参数一：用于执行用哪个类加载器去加载代理对象
            参数二：用于指定代理类需要实现的接口：明星类实现哪些接口，代理类实现哪些接口
            参数三：用于指定代理类需要如何去代理（代理要做的事）
            * */

        StarService proxy = (StarService) Proxy.newProxyInstance(ProxyUtil.class.getClassLoader()
                , s.getClass().getInterfaces(), new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //声明代理类要做的事
                        //参数一：proxy接收到代理对象本身
                        //参数二：method代表正在被代理的方法
                        String methodName = method.getName();
                        if("sing".equals(methodName)){
                            System.out.println("准备唱歌，准备麦克风");
                        }else if ("dance".equals(methodName)){
                            System.out.println("准备跳舞，准备场地");
                        }
                        //真正干活（把真正明星对象叫来干活）
                        //找真正的明星对象来执行被代理行为：method
                        Object result = method.invoke(s, args);
                        return result;
                    }
                });{
        return proxy;

        }
    }
}
