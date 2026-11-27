package defpackage;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: b70, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2878b70 implements InterfaceC2396Xc {

    @NotNull
    public final C1758Ph0 d;

    public C2878b70(@NotNull C1758Ph0 fqNameToMatch) {
        Intrinsics.checkNotNullParameter(fqNameToMatch, "fqNameToMatch");
        this.d = fqNameToMatch;
    }

    @Override // defpackage.InterfaceC2396Xc
    public final boolean P(@NotNull C1758Ph0 c1758Ph0) {
        return InterfaceC2396Xc.b.b(this, c1758Ph0);
    }

    @Override // defpackage.InterfaceC2396Xc
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<InterfaceC1583Nc> iterator() {
        C5653o60.d.getClass();
        return C5443n60.d;
    }

    @Override // defpackage.InterfaceC2396Xc
    public final InterfaceC1583Nc p(C1758Ph0 fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        if (Intrinsics.a(fqName, this.d)) {
            return C2654a70.a;
        }
        return null;
    }
}
