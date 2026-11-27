package defpackage;

/* JADX INFO: renamed from: nM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C5494nM implements InterfaceC5284mM {
    public int d;
    public HS0 e;
    public final InterfaceC5284mM g;

    public C5494nM() {
        this.d = 0;
        this.g = this;
    }

    @Override // defpackage.InterfaceC5284mM
    public void j(HS0 hs0) {
        HS0 hs1 = this.e;
        if (hs1 == null) {
            this.e = hs0;
        } else if (hs1 != hs0) {
            throw new IllegalStateException("Context has been already set");
        }
    }

    public final void l(String str) {
        o(new N70(str, this.g));
    }

    public final void m(String str, Throwable th) {
        o(new N70(str, th, 2, this.g));
    }

    public final void n(String str) {
        o(new C1968Rz0(str, this.g));
    }

    public final void o(XP1 xp1) {
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

    public final void p(String str) {
        o(new Ff2(str, this.g));
    }

    public C5494nM(AbstractC3946gD abstractC3946gD) {
        this.d = 0;
        this.g = abstractC3946gD;
    }
}
