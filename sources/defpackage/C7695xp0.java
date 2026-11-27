package defpackage;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: xp0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7695xp0 extends AbstractC6578sX1 {
    public final /* synthetic */ C6644sp0 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ C1481Lu g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7695xp0(String str, C6644sp0 c6644sp0, int i, C1481Lu c1481Lu, int i2, boolean z) {
        super(str, true);
        this.e = c6644sp0;
        this.f = i;
        this.g = c1481Lu;
        this.h = i2;
    }

    @Override // defpackage.AbstractC6578sX1
    public final long a() {
        try {
            C7652xe c7652xe = this.e.o;
            C1481Lu source = this.g;
            int i = this.h;
            c7652xe.getClass();
            Intrinsics.checkNotNullParameter(source, "source");
            source.r(i);
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
