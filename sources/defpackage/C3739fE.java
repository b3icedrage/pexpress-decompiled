package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: fE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3739fE extends AbstractC1770Pl0 {

    @NotNull
    public static final C5638o21 e;

    static {
        C5638o21 c5638o21K = C5638o21.k("clone");
        Intrinsics.checkNotNullExpressionValue(c5638o21K, "identifier(...)");
        e = c5638o21K;
    }

    @Override // defpackage.AbstractC1770Pl0
    @NotNull
    public final List<InterfaceC2076Tj0> h() {
        InterfaceC1490Lx.a aVar = InterfaceC1490Lx.a.d;
        VN1.a aVar2 = VN1.a;
        C5638o21 c5638o21 = e;
        V v = this.b;
        C3975gM1 c3975gM1F1 = C3975gM1.f1(v, c5638o21, aVar, aVar2);
        InterfaceC1076Go1 interfaceC1076Go1S0 = v.S0();
        C5653o60 c5653o60 = C5653o60.d;
        c3975gM1F1.Y0(null, interfaceC1076Go1S0, c5653o60, c5653o60, c5653o60, C4900kZ.e(v).e(), C01.h, C5323mZ.c);
        return VE.c(c3975gM1F1);
    }
}
