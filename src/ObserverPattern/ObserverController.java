package ObserverPattern;



/**
 * 有一个雷达负责扫描目标，一旦发现目标，就会通知攻击序列对目标进行摧毁，攻击序列中的所有武器会向目标发动攻击。
 * 现有的武器可以加入攻击序列，也可以退出攻击序列。
 * 雷达扮演Subject，大炮和导弹扮演Observer，大炮和导弹通过attach加入到雷达的攻击序列，一旦雷达发现目标，启动攻击序列摧毁目标。
 */
public class ObserverController {
    public static void main(String[] args) {
        Radar radar = new Radar();
        Cannon cannon = new Cannon();
        Missile missile = new Missile();
        radar.register(cannon);
        radar.register(missile);
        radar.setState(100);
        radar.notifyAllObserver();
        radar.cancel(cannon);
    }
}
