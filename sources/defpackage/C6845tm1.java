package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: tm1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6845tm1 extends SA<C7896ym1> {

    @NotNull
    public final InterfaceC0836Dm1 e;

    @NotNull
    public final EY0 f;

    public C6845tm1(@NotNull EK1 storage, @NotNull InterfaceC0836Dm1 ratingRepository) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(ratingRepository, "ratingRepository");
        this.e = ratingRepository;
        EY0 ey0A = C7747y42.a(this.d, new C1039Gc0(6));
        Intrinsics.checkNotNullExpressionValue(ey0A, "map(_entry) { entry ->\n        entry.state\n    }");
        EY0 ey0A2 = C7747y42.a(ey0A, new C5491nL(2));
        Intrinsics.checkNotNullExpressionValue(ey0A2, "map(state) {\n        it\n    }");
        this.f = ey0A2;
        Intrinsics.checkNotNullExpressionValue(C7747y42.a(ey0A, new C2983be(4)), "map(state) {\n        it.…ttings?.customTitle\n    }");
        Intrinsics.checkNotNullExpressionValue(C7747y42.a(ey0A, new C5244m9(5)), "map(state) {\n        it.…ettings?.type?.type\n    }");
        Intrinsics.checkNotNullExpressionValue(C7747y42.a(ey0A, new C4694ja0(2)), "map(state) {\n        it.…ettings?.icon?.icon\n    }");
    }
}
