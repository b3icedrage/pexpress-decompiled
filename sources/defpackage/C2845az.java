package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: az, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2845az extends T62 {

    @NotNull
    public final T62 b;

    public C2845az(@NotNull T62 substitution) {
        Intrinsics.checkNotNullParameter(substitution, "substitution");
        this.b = substitution;
    }

    @Override // defpackage.T62
    public final boolean a() {
        return this.b.a();
    }

    @Override // defpackage.T62
    public final boolean b() {
        return true;
    }

    @Override // defpackage.T62
    @NotNull
    public final InterfaceC2396Xc d(@NotNull InterfaceC2396Xc annotations) {
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        return this.b.d(annotations);
    }

    @Override // defpackage.T62
    public final N62 e(AbstractC4649jL0 key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(key, "key");
        N62 n62E = this.b.e(key);
        if (n62E == null) {
            return null;
        }
        InterfaceC5044lD interfaceC5044lDC = key.V0().c();
        return LE.d(n62E, interfaceC5044lDC instanceof H62 ? (H62) interfaceC5044lDC : null);
    }

    @Override // defpackage.T62
    public final boolean f() {
        return this.b.f();
    }

    @Override // defpackage.T62
    @NotNull
    public final AbstractC4649jL0 g(@NotNull AbstractC4649jL0 topLevelType, @NotNull EnumC3610ed2 position) {
        Intrinsics.checkNotNullParameter(topLevelType, "topLevelType");
        Intrinsics.checkNotNullParameter(position, "position");
        return this.b.g(topLevelType, position);
    }
}
