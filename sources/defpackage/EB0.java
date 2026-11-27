package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class EB0 implements RJ0<Integer> {

    @NotNull
    public static final EB0 a = new EB0();

    @NotNull
    public static final C5986ph1 b = new C5986ph1("kotlin.Int", AbstractC5356mh1.f.a);

    @Override // defpackage.RJ0
    public final void a(C3783fS1 encoder, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.y(iIntValue);
    }

    @Override // defpackage.RJ0
    @NotNull
    public final MH1 c() {
        return b;
    }

    @Override // defpackage.RJ0
    public final Object d(InterfaceC7828yU decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Integer.valueOf(decoder.o());
    }
}
