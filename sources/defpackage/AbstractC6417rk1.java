package defpackage;

import java.util.HashMap;

/* JADX INFO: renamed from: rk1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6417rk1 {
    public static final C1142Hk1 a;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        C1064Gk1 c1064Gk1 = C1142Hk1.a.a;
        map.put(AbstractC6417rk1.class, C1227In.a);
        map2.remove(AbstractC6417rk1.class);
        map.put(WZ0.class, C1149Hn.a);
        map2.remove(WZ0.class);
        map.put(VZ0.class, C1071Gn.a);
        map2.remove(VZ0.class);
        a = new C1142Hk1(new HashMap(map), new HashMap(map2), c1064Gk1);
    }

    public abstract WZ0 a();
}
