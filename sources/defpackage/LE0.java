package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class LE0 extends UD0 {
    public static final /* synthetic */ IJ0<Object>[] h;

    @NotNull
    public final I51 g;

    static {
        C2251Vp1 c2251Vp1 = C2017Sp1.a;
        h = new IJ0[]{c2251Vp1.g(new C1373Kj1(c2251Vp1.b(LE0.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LE0(@NotNull QD0 annotation, @NotNull LO0 c) {
        super(c, annotation, C4194hP1.a.w);
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        Intrinsics.checkNotNullParameter(c, "c");
        C2720aS0 c2720aS0 = c.a.a;
        C5842p1 c5842p1 = new C5842p1(this, 2);
        c2720aS0.getClass();
        this.g = new C2720aS0.h(c2720aS0, c5842p1);
    }

    @Override // defpackage.UD0, defpackage.InterfaceC1583Nc
    @NotNull
    public final Map<C5638o21, CK<?>> j() {
        return (Map) Nm2.f(this.g, h[0]);
    }
}
