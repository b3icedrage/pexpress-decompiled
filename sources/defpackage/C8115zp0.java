package defpackage;

import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: zp0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8115zp0 extends AbstractC6578sX1 {
    public final /* synthetic */ C6644sp0 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ List g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8115zp0(String str, C6644sp0 c6644sp0, int i, List list) {
        super(str, true);
        this.e = c6644sp0;
        this.f = i;
        this.g = list;
    }

    @Override // defpackage.AbstractC6578sX1
    public final long a() {
        C7652xe c7652xe = this.e.o;
        List requestHeaders = this.g;
        c7652xe.getClass();
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        try {
            this.e.B.q(this.f, EnumC7967z70.CANCEL);
            synchronized (this.e) {
                this.e.D.remove(Integer.valueOf(this.f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
