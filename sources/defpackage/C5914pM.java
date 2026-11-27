package defpackage;

/* JADX INFO: renamed from: pM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C5914pM implements InterfaceC5284mM {
    public int d = 0;
    public HS0 e;
    public final Object g;

    public C5914pM(HS0 hs0, Object obj) {
        this.e = hs0;
        this.g = obj;
    }

    public final void a(String str) {
        d(new N70(str, h()));
    }

    public final void c(String str, Throwable th) {
        d(new N70(str, th, 2, h()));
    }

    public final void d(XP1 xp1) {
        HS0 hs0 = this.e;
        if (hs0 != null) {
            C4538ir c4538ir = hs0.g;
            if (c4538ir != null) {
                c4538ir.a((YP1) xp1);
                return;
            }
            return;
        }
        int i = this.d;
        this.d = i + 1;
        if (i == 0) {
            System.out.println("LOGBACK: No context given for " + this);
        }
    }

    public Object h() {
        return this.g;
    }

    @Override // defpackage.InterfaceC5284mM
    public final void j(HS0 hs0) {
        HS0 hs1 = this.e;
        if (hs1 == null) {
            this.e = hs0;
        } else if (hs1 != hs0) {
            throw new IllegalStateException("Context has been already set");
        }
    }
}
