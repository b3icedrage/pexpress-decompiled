package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Hw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1176Hw implements RJ0<Byte> {

    @NotNull
    public static final C1176Hw a = new C1176Hw();

    @NotNull
    public static final C5986ph1 b = new C5986ph1("kotlin.Byte", AbstractC5356mh1.b.a);

    @Override // defpackage.RJ0
    public final void a(C3783fS1 encoder, Object obj) {
        byte bByteValue = ((Number) obj).byteValue();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.k(bByteValue);
    }

    @Override // defpackage.RJ0
    @NotNull
    public final MH1 c() {
        return b;
    }

    @Override // defpackage.RJ0
    public final Object d(InterfaceC7828yU decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Byte.valueOf(decoder.z());
    }
}
