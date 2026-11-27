package defpackage;

import android.content.Context;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: renamed from: c52, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3081c52 {
    public static volatile C4411iS e;
    public final InterfaceC3529eE a;
    public final InterfaceC3529eE b;
    public final InterfaceC4626jD1 c;
    public final C7639xa2 d;

    public C3081c52(InterfaceC3529eE interfaceC3529eE, InterfaceC3529eE interfaceC3529eE2, InterfaceC4626jD1 interfaceC4626jD1, C7639xa2 c7639xa2, C4058gk2 c4058gk2) {
        this.a = interfaceC3529eE;
        this.b = interfaceC3529eE2;
        this.c = interfaceC4626jD1;
        this.d = c7639xa2;
        c4058gk2.getClass();
        c4058gk2.a.execute(new RunnableC3848fk2(c4058gk2, 0));
    }

    public static C3081c52 a() {
        C4411iS c4411iS = e;
        if (c4411iS != null) {
            return c4411iS.k.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (e == null) {
            synchronized (C3081c52.class) {
                try {
                    if (e == null) {
                        C4411iS.a aVar = new C4411iS.a();
                        context.getClass();
                        aVar.a = context;
                        e = aVar.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final X42 c(C2612Zw c2612Zw) {
        byte[] bytes;
        Set setUnmodifiableSet = c2612Zw != null ? Collections.unmodifiableSet(C2612Zw.d) : Collections.singleton(new H60("proto"));
        EnumC6825th1 enumC6825th1 = EnumC6825th1.d;
        c2612Zw.getClass();
        String str = c2612Zw.a;
        String str2 = c2612Zw.b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            bytes = BX.c("1$", str, "\\", str2 != null ? str2 : "").getBytes(Charset.forName("UTF-8"));
        }
        return new X42(setUnmodifiableSet, new C1778Po("cct", bytes, enumC6825th1), this);
    }
}
