package defpackage;

import java.io.IOException;

/* JADX INFO: renamed from: Bp0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0688Bp0 extends AbstractC6578sX1 {
    public final /* synthetic */ C6644sp0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0688Bp0(String str, C6644sp0 c6644sp0) {
        super(str, true);
        this.e = c6644sp0;
    }

    @Override // defpackage.AbstractC6578sX1
    public final long a() {
        C6644sp0 c6644sp0 = this.e;
        c6644sp0.getClass();
        try {
            c6644sp0.B.p(2, false, 0);
            return -1L;
        } catch (IOException e) {
            c6644sp0.f(e);
            return -1L;
        }
    }
}
