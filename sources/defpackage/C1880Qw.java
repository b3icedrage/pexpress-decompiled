package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Qw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1880Qw extends MB0 {
    public C1880Qw(byte b) {
        super(Byte.valueOf(b));
    }

    @Override // defpackage.CK
    public final AbstractC4649jL0 a(S01 module) {
        Intrinsics.checkNotNullParameter(module, "module");
        RK0 rk0T = module.t();
        rk0T.getClass();
        AbstractC5706oM1 abstractC5706oM1S = rk0T.s(EnumC6405rh1.BYTE);
        Intrinsics.checkNotNullExpressionValue(abstractC5706oM1S, "getByteType(...)");
        return abstractC5706oM1S;
    }

    @Override // defpackage.CK
    @NotNull
    public final String toString() {
        return ((Number) this.a).intValue() + ".toByte()";
    }
}
