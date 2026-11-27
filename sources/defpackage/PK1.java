package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class PK1 implements RJ0<Short> {

    @NotNull
    public static final PK1 a = new PK1();

    @NotNull
    public static final C5986ph1 b = new C5986ph1("kotlin.Short", AbstractC5356mh1.h.a);

    @Override // defpackage.RJ0
    public final void a(C3783fS1 encoder, Object obj) {
        short sShortValue = ((Number) obj).shortValue();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.h(sShortValue);
    }

    @Override // defpackage.RJ0
    @NotNull
    public final MH1 c() {
        return b;
    }

    @Override // defpackage.RJ0
    public final Object d(InterfaceC7828yU decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Short.valueOf(decoder.A());
    }
}
