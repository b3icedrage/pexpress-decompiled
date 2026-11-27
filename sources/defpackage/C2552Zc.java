package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Zc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2552Zc implements InterfaceC2396Xc {

    @NotNull
    public final List<InterfaceC1583Nc> d;

    /* JADX WARN: Multi-variable type inference failed */
    public C2552Zc(@NotNull List<? extends InterfaceC1583Nc> annotations) {
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        this.d = annotations;
    }

    @Override // defpackage.InterfaceC2396Xc
    public final boolean P(@NotNull C1758Ph0 c1758Ph0) {
        return InterfaceC2396Xc.b.b(this, c1758Ph0);
    }

    @Override // defpackage.InterfaceC2396Xc
    public final boolean isEmpty() {
        return this.d.isEmpty();
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<InterfaceC1583Nc> iterator() {
        return this.d.iterator();
    }

    @Override // defpackage.InterfaceC2396Xc
    @Nullable
    public final InterfaceC1583Nc p(@NotNull C1758Ph0 c1758Ph0) {
        return InterfaceC2396Xc.b.a(this, c1758Ph0);
    }

    @NotNull
    public final String toString() {
        return this.d.toString();
    }
}
