package defpackage;

import java.io.IOException;

/* JADX INFO: renamed from: f20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3696f20 extends AbstractC6578sX1 {
    public final /* synthetic */ C3277d20 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3696f20(C3277d20 c3277d20, String str) {
        super(str, true);
        this.e = c3277d20;
    }

    @Override // defpackage.AbstractC6578sX1
    public final long a() {
        C3277d20 c3277d20 = this.e;
        synchronized (c3277d20) {
            if (!c3277d20.p || c3277d20.q) {
                return -1L;
            }
            try {
                c3277d20.C();
            } catch (IOException unused) {
                c3277d20.r = true;
            }
            try {
                if (c3277d20.p()) {
                    c3277d20.v();
                    c3277d20.m = 0;
                }
            } catch (IOException unused2) {
                c3277d20.s = true;
                c3277d20.k = Cm2.c(new C1398Ks());
            }
            return -1L;
        }
    }
}
