package defpackage;

import java.io.IOException;

/* JADX INFO: renamed from: vp0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7274vp0 extends AbstractC6578sX1 {
    public final /* synthetic */ C6644sp0 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7274vp0(String str, C6644sp0 c6644sp0, int i, int i2) {
        super(str, true);
        this.e = c6644sp0;
        this.f = i;
        this.g = i2;
    }

    @Override // defpackage.AbstractC6578sX1
    public final long a() {
        int i = this.f;
        int i2 = this.g;
        C6644sp0 c6644sp0 = this.e;
        c6644sp0.getClass();
        try {
            c6644sp0.B.p(i, true, i2);
            return -1L;
        } catch (IOException e) {
            c6644sp0.f(e);
            return -1L;
        }
    }
}
