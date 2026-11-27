package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class C6 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ C6(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new B6((InterfaceC4407iQ1) ((SC0) this.b).get());
            case 1:
                return new C1452Lk((M8) ((InterfaceC1454Lk1) this.b).get());
            case 2:
                Context context = ((C7700xr) this.b).a;
                C0957Fb.i(context);
                return context;
            case 3:
                return new C1902Rd0((AbstractC1276Jd0) ((C3523eC) this.b).get());
            case 4:
                C6102qE1 c6102qE1 = ((C6731tE1) this.b).a;
                C0957Fb.i(c6102qE1);
                return c6102qE1;
            default:
                return new Sd2(((IW0) this.b).a);
        }
    }
}
