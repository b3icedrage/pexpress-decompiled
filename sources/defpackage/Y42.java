package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class Y42<T> implements T42<T> {
    public final C1778Po a;
    public final String b;
    public final H60 c;
    public final A42<T, byte[]> d;
    public final C3081c52 e;

    public Y42(C1778Po c1778Po, String str, H60 h60, A42 a42, C3081c52 c3081c52) {
        this.a = c1778Po;
        this.b = str;
        this.c = h60;
        this.d = a42;
        this.e = c3081c52;
    }

    public final void a(C6850to c6850to, InterfaceC3710f52 interfaceC3710f52) {
        C1778Po c1778Po = this.a;
        String str = this.b;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        A42<T, byte[]> a42 = this.d;
        if (a42 == null) {
            throw new NullPointerException("Null transformer");
        }
        C1230Io c1230Io = new C1230Io(c1778Po, str, c6850to, a42, this.c);
        C3081c52 c3081c52 = this.e;
        C6850to c6850to2 = c1230Io.c;
        C1778Po c1778PoD = c1230Io.a.d(c6850to2.b);
        C7060uo.a aVar = new C7060uo.a();
        aVar.f = new HashMap();
        aVar.d = Long.valueOf(c3081c52.a.d());
        aVar.e = Long.valueOf(c3081c52.b.d());
        String str2 = c1230Io.b;
        if (str2 == null) {
            throw new NullPointerException("Null transportName");
        }
        aVar.a = str2;
        aVar.c = new B60(c1230Io.e, c1230Io.d.apply(c6850to2.a));
        c6850to2.getClass();
        aVar.b = null;
        c3081c52.c.a(c1778PoD, aVar.b(), interfaceC3710f52);
    }
}
