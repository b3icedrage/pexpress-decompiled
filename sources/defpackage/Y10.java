package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class Y10 extends T62 {
    public static final /* synthetic */ int d = 0;

    @NotNull
    public final T62 b;

    @NotNull
    public final T62 c;

    public Y10(T62 t62, T62 t63) {
        this.b = t62;
        this.c = t63;
    }

    @Override // defpackage.T62
    public final boolean a() {
        return this.b.a() || this.c.a();
    }

    @Override // defpackage.T62
    public final boolean b() {
        return this.b.b() || this.c.b();
    }

    @Override // defpackage.T62
    @NotNull
    public final InterfaceC2396Xc d(@NotNull InterfaceC2396Xc annotations) {
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        return this.c.d(this.b.d(annotations));
    }

    @Override // defpackage.T62
    @Nullable
    public final N62 e(@NotNull AbstractC4649jL0 key) {
        Intrinsics.checkNotNullParameter(key, "key");
        N62 n62E = this.b.e(key);
        return n62E == null ? this.c.e(key) : n62E;
    }

    @Override // defpackage.T62
    @NotNull
    public final AbstractC4649jL0 g(@NotNull AbstractC4649jL0 topLevelType, @NotNull EnumC3610ed2 position) {
        Intrinsics.checkNotNullParameter(topLevelType, "topLevelType");
        Intrinsics.checkNotNullParameter(position, "position");
        return this.c.g(this.b.g(topLevelType, position), position);
    }
}
