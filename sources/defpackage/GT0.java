package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class GT0 implements RJ0<Long> {

    @NotNull
    public static final GT0 a = new GT0();

    @NotNull
    public static final C5986ph1 b = new C5986ph1("kotlin.Long", AbstractC5356mh1.g.a);

    @Override // defpackage.RJ0
    public final void a(C3783fS1 encoder, Object obj) {
        long jLongValue = ((Number) obj).longValue();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.z(jLongValue);
    }

    @Override // defpackage.RJ0
    @NotNull
    public final MH1 c() {
        return b;
    }

    @Override // defpackage.RJ0
    public final Object d(InterfaceC7828yU decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Long.valueOf(decoder.v());
    }
}
