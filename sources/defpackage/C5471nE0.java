package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: nE0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5471nE0 extends UD0 {
    public static final /* synthetic */ IJ0<Object>[] h;

    @NotNull
    public final I51 g;

    static {
        C2251Vp1 c2251Vp1 = C2017Sp1.a;
        h = new IJ0[]{c2251Vp1.g(new C1373Kj1(c2251Vp1.b(C5471nE0.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5471nE0(@Nullable QD0 qd0, @NotNull LO0 c) {
        super(c, qd0, C4194hP1.a.m);
        Intrinsics.checkNotNullParameter(c, "c");
        C2720aS0 c2720aS0 = c.a.a;
        C5261mE0 c5261mE0 = C5261mE0.d;
        c2720aS0.getClass();
        this.g = new C2720aS0.h(c2720aS0, c5261mE0);
    }

    @Override // defpackage.UD0, defpackage.InterfaceC1583Nc
    @NotNull
    public final Map<C5638o21, CK<?>> j() {
        return (Map) Nm2.f(this.g, h[0]);
    }
}
