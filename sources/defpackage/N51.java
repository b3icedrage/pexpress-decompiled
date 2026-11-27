package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class N51 implements RJ0 {

    @NotNull
    public static final N51 a = new N51();

    @NotNull
    public static final M51 b = M51.a;

    @Override // defpackage.RJ0
    public final void a(C3783fS1 encoder, Object obj) {
        Void value = (Void) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        throw new ZH1("'kotlin.Nothing' cannot be serialized");
    }

    @Override // defpackage.RJ0
    @NotNull
    public final MH1 c() {
        return b;
    }

    @Override // defpackage.RJ0
    public final Object d(InterfaceC7828yU decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        throw new ZH1("'kotlin.Nothing' does not have instances");
    }
}
