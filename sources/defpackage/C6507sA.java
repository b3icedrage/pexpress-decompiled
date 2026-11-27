package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: sA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6507sA implements RJ0<Character> {

    @NotNull
    public static final C6507sA a = new C6507sA();

    @NotNull
    public static final C5986ph1 b = new C5986ph1("kotlin.Char", AbstractC5356mh1.c.a);

    @Override // defpackage.RJ0
    public final void a(C3783fS1 encoder, Object obj) {
        char cCharValue = ((Character) obj).charValue();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.r(cCharValue);
    }

    @Override // defpackage.RJ0
    @NotNull
    public final MH1 c() {
        return b;
    }

    @Override // defpackage.RJ0
    public final Object d(InterfaceC7828yU decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Character.valueOf(decoder.g());
    }
}
