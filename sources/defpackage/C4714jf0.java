package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: jf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4714jf0 implements RJ0<Float> {

    @NotNull
    public static final C4714jf0 a = new C4714jf0();

    @NotNull
    public static final C5986ph1 b = new C5986ph1("kotlin.Float", AbstractC5356mh1.e.a);

    @Override // defpackage.RJ0
    public final void a(C3783fS1 encoder, Object obj) {
        float fFloatValue = ((Number) obj).floatValue();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.o(fFloatValue);
    }

    @Override // defpackage.RJ0
    @NotNull
    public final MH1 c() {
        return b;
    }

    @Override // defpackage.RJ0
    public final Object d(InterfaceC7828yU decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Float.valueOf(decoder.B());
    }
}
