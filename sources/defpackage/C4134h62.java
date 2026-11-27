package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: h62, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4134h62 {

    @Nullable
    public final C4134h62 a;

    @NotNull
    public final InterfaceC3714f62 b;

    @NotNull
    public final List<N62> c;

    @NotNull
    public final Map<H62, N62> d;

    public C4134h62(C4134h62 c4134h62, InterfaceC3714f62 interfaceC3714f62, List list, Map map) {
        this.a = c4134h62;
        this.b = interfaceC3714f62;
        this.c = list;
        this.d = map;
    }

    public final boolean a(@NotNull InterfaceC3714f62 descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (Intrinsics.a(this.b, descriptor)) {
            return true;
        }
        C4134h62 c4134h62 = this.a;
        return c4134h62 != null ? c4134h62.a(descriptor) : false;
    }
}
