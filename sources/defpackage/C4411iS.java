package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: iS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4411iS extends AbstractC3291d52 {
    public InterfaceC1531Mk1<Executor> d;
    public UA0 e;
    public InterfaceC1531Mk1 g;
    public GD1 h;
    public InterfaceC1531Mk1<String> i;
    public InterfaceC1531Mk1<SB1> j;
    public InterfaceC1531Mk1<C3081c52> k;

    /* JADX INFO: renamed from: iS$a */
    public static final class a {
        public Context a;

        public final C4411iS a() {
            Context context = this.a;
            if (context == null) {
                throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
            }
            C4411iS c4411iS = new C4411iS();
            c4411iS.d = Z20.a(S90.a.a);
            UA0 ua0 = new UA0(context);
            c4411iS.e = ua0;
            c4411iS.g = Z20.a(new C2851b01(ua0, new UP(ua0)));
            UA0 ua1 = c4411iS.e;
            c4411iS.h = new GD1(ua1);
            InterfaceC1531Mk1<String> interfaceC1531Mk1A = Z20.a(new V80(ua1));
            c4411iS.i = interfaceC1531Mk1A;
            InterfaceC1531Mk1<SB1> interfaceC1531Mk1A2 = Z20.a(new TB1(c4411iS.h, interfaceC1531Mk1A));
            c4411iS.j = interfaceC1531Mk1A2;
            C7358wD1 c7358wD1 = new C7358wD1();
            UA0 ua2 = c4411iS.e;
            C7569xD1 c7569xD1 = new C7569xD1(ua2, interfaceC1531Mk1A2, c7358wD1);
            InterfaceC1531Mk1<Executor> interfaceC1531Mk1 = c4411iS.d;
            InterfaceC1531Mk1 interfaceC1531Mk2 = c4411iS.g;
            c4411iS.k = Z20.a(new C3500e52(new TV(interfaceC1531Mk1, interfaceC1531Mk2, c7569xD1, interfaceC1531Mk1A2, interfaceC1531Mk1A2), new C7849ya2(ua2, interfaceC1531Mk2, interfaceC1531Mk1A2, c7569xD1, interfaceC1531Mk1, interfaceC1531Mk1A2, interfaceC1531Mk1A2), new C4268hk2(interfaceC1531Mk1, interfaceC1531Mk1A2, c7569xD1, interfaceC1531Mk1A2)));
            return c4411iS;
        }
    }
}
