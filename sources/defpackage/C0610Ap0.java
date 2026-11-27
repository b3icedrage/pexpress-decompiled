package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Ap0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0610Ap0 extends AbstractC6578sX1 {
    public final /* synthetic */ C6644sp0 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ EnumC7967z70 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0610Ap0(String str, C6644sp0 c6644sp0, int i, EnumC7967z70 enumC7967z70) {
        super(str, true);
        this.e = c6644sp0;
        this.f = i;
        this.g = enumC7967z70;
    }

    @Override // defpackage.AbstractC6578sX1
    public final long a() {
        C7652xe c7652xe = this.e.o;
        EnumC7967z70 errorCode = this.g;
        c7652xe.getClass();
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        synchronized (this.e) {
            this.e.D.remove(Integer.valueOf(this.f));
            Unit unit = Unit.a;
        }
        return -1L;
    }
}
