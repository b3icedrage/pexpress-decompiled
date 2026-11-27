package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class L72 extends MB0 {
    public L72(byte b) {
        super(Byte.valueOf(b));
    }

    @Override // defpackage.CK
    @NotNull
    public final AbstractC4649jL0 a(@NotNull S01 module) {
        AbstractC5706oM1 abstractC5706oM1Y;
        Intrinsics.checkNotNullParameter(module, "module");
        FC fcA = C7859yd0.a(module, C4194hP1.a.S);
        return (fcA == null || (abstractC5706oM1Y = fcA.y()) == null) ? R70.c(Q70.NOT_FOUND_UNSIGNED_TYPE, "UByte") : abstractC5706oM1Y;
    }

    @Override // defpackage.CK
    @NotNull
    public final String toString() {
        return ((Number) this.a).intValue() + ".toUByte()";
    }
}
