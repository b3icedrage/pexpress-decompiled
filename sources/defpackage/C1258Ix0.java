package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Ix0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1258Ix0 extends T62 {

    @NotNull
    public final H62[] b;

    @NotNull
    public final N62[] c;
    public final boolean d;

    public C1258Ix0() {
        throw null;
    }

    public C1258Ix0(@NotNull H62[] parameters, @NotNull N62[] arguments, boolean z) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        this.b = parameters;
        this.c = arguments;
        this.d = z;
        int length = parameters.length;
        int length2 = arguments.length;
    }

    @Override // defpackage.T62
    public final boolean b() {
        return this.d;
    }

    @Override // defpackage.T62
    @Nullable
    public final N62 e(@NotNull AbstractC4649jL0 key) {
        Intrinsics.checkNotNullParameter(key, "key");
        InterfaceC5044lD interfaceC5044lDC = key.V0().c();
        H62 h62 = interfaceC5044lDC instanceof H62 ? (H62) interfaceC5044lDC : null;
        if (h62 != null) {
            int iL = h62.l();
            H62[] h62Arr = this.b;
            if (iL < h62Arr.length && Intrinsics.a(h62Arr[iL].p(), h62.p())) {
                return this.c[iL];
            }
        }
        return null;
    }

    @Override // defpackage.T62
    public final boolean f() {
        return this.c.length == 0;
    }
}
