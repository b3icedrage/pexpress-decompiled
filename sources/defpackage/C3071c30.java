package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: c30, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3071c30 implements RJ0<Double> {

    @NotNull
    public static final C3071c30 a = new C3071c30();

    @NotNull
    public static final C5986ph1 b = new C5986ph1("kotlin.Double", AbstractC5356mh1.d.a);

    @Override // defpackage.RJ0
    public final void a(C3783fS1 encoder, Object obj) {
        double dDoubleValue = ((Number) obj).doubleValue();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.g(dDoubleValue);
    }

    @Override // defpackage.RJ0
    @NotNull
    public final MH1 c() {
        return b;
    }

    @Override // defpackage.RJ0
    public final Object d(InterfaceC7828yU decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Double.valueOf(decoder.E());
    }
}
