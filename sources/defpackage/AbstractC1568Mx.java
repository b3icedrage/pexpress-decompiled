package defpackage;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: renamed from: Mx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1568Mx implements JI0, Serializable {
    public transient JI0 d;
    protected final Object e;
    private final Class g;
    private final String h;
    private final String i;
    private final boolean j;

    /* JADX INFO: renamed from: Mx$a */
    public static class a implements Serializable {
        public static final a d = new a();
    }

    public AbstractC1568Mx() {
        this(a.d, null, null, null, false);
    }

    @Override // defpackage.JI0
    public final List<GJ0> b() {
        return m().b();
    }

    @Override // defpackage.JI0
    public final Object d(C5863p60 c5863p60) {
        return m().d(c5863p60);
    }

    public JI0 e() {
        JI0 ji0 = this.d;
        if (ji0 != null) {
            return ji0;
        }
        JI0 ji0H = h();
        this.d = ji0H;
        return ji0H;
    }

    @Override // defpackage.JI0
    public String getName() {
        return this.h;
    }

    public abstract JI0 h();

    public final Object i() {
        return this.e;
    }

    public InterfaceC5486nJ0 j() {
        Class cls = this.g;
        if (cls == null) {
            return null;
        }
        return this.j ? C2017Sp1.a.c(cls, "") : C2017Sp1.a.b(cls);
    }

    public JI0 m() {
        JI0 ji0E = e();
        if (ji0E != this) {
            return ji0E;
        }
        throw new C3971gL0();
    }

    @Override // defpackage.JI0
    public final SJ0 n() {
        return m().n();
    }

    public String o() {
        return this.i;
    }

    public AbstractC1568Mx(Object obj, Class cls, String str, String str2, boolean z) {
        this.e = obj;
        this.g = cls;
        this.h = str;
        this.i = str2;
        this.j = z;
    }
}
