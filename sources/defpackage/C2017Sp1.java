package defpackage;

import java.util.Collections;

/* JADX INFO: renamed from: Sp1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2017Sp1 {
    public static final C2251Vp1 a;
    public static final RI0[] b;

    static {
        C2251Vp1 c2251Vp1 = null;
        try {
            c2251Vp1 = (C2251Vp1) C2333Wp1.class.newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (c2251Vp1 == null) {
            c2251Vp1 = new C2251Vp1();
        }
        a = c2251Vp1;
        b = new RI0[0];
    }

    public static SJ0 a(Class cls) {
        C2251Vp1 c2251Vp1 = a;
        return c2251Vp1.j(c2251Vp1.b(cls), Collections.EMPTY_LIST);
    }
}
