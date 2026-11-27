package defpackage;

import java.text.NumberFormat;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Sm0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2007Sm0 extends Vc2 {
    public final NumberFormat a;

    public C2007Sm0() {
        NumberFormat numberFormat = NumberFormat.getInstance();
        numberFormat.setMaximumFractionDigits(6);
        this.a = numberFormat;
    }

    @Override // defpackage.Vc2
    @NotNull
    public final String a(float f) {
        String str = this.a.format(Float.valueOf(f));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return QO.o(str);
    }
}
