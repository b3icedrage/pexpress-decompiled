package defpackage;

import java.io.IOException;

/* JADX INFO: renamed from: up0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7064up0 extends AbstractC6578sX1 {
    public final /* synthetic */ C6644sp0 e;
    public final /* synthetic */ C0922Ep0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7064up0(String str, C6644sp0 c6644sp0, C0922Ep0 c0922Ep0) {
        super(str, true);
        this.e = c6644sp0;
        this.f = c0922Ep0;
    }

    @Override // defpackage.AbstractC6578sX1
    public final long a() {
        try {
            this.e.d.c(this.f);
            return -1L;
        } catch (IOException e) {
            C1903Rd1 c1903Rd1 = C1903Rd1.a;
            C1903Rd1 c1903Rd2 = C1903Rd1.a;
            String str = "Http2Connection.Listener failure for " + this.e.g;
            c1903Rd2.getClass();
            C1903Rd1.i(4, str, e);
            try {
                this.f.c(EnumC7967z70.PROTOCOL_ERROR, e);
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }
}
