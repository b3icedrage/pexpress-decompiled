package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class UP1 {
    public static final UP1 d;
    public static final Object e;
    public boolean a = false;
    public final HS0 b;
    public final GM c;

    /* JADX WARN: Code duplicated, block: B:19:0x003b A[Catch: Exception -> 0x004b, TryCatch #1 {Exception -> 0x004b, blocks: (B:3:0x0010, B:7:0x001f, B:19:0x003b, B:20:0x003e, B:10:0x0025, B:11:0x0027, B:14:0x0030, B:24:0x004a, B:6:0x001a, B:12:0x0028, B:13:0x002f), top: B:28:0x0010, inners: #0, #2 }] */
    static {
        ArrayList arrayList;
        boolean z;
        UP1 up1 = new UP1();
        d = up1;
        e = new Object();
        HS0 hs0 = up1.b;
        try {
            try {
                new C7173vM(hs0).b();
            } catch (C5054lG0 e2) {
                C7016uc2.b("Failed to auto configure default logger context", e2);
            }
            C4538ir c4538ir = hs0.g;
            if (c4538ir != null) {
                synchronized (c4538ir.f) {
                    arrayList = new ArrayList(c4538ir.e);
                }
                if (arrayList.size() != 0) {
                    z = true;
                }
                if (!z) {
                    C3567eQ1.b(hs0);
                }
                up1.c.a(hs0, e);
                up1.a = true;
            }
            z = false;
            if (!z) {
                C3567eQ1.b(hs0);
            }
            up1.c.a(hs0, e);
            up1.a = true;
        } catch (Exception e3) {
            C7016uc2.b("Failed to instantiate [" + HS0.class.getName() + "]", e3);
        }
    }

    public UP1() {
        HS0 hs0 = new HS0();
        this.b = hs0;
        this.c = GM.c;
        hs0.b("default");
    }
}
