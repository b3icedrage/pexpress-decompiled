package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ad, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2755ad extends AbstractC5022l62<C2755ad> {

    @NotNull
    public final InterfaceC2396Xc a;

    public C2755ad(@NotNull InterfaceC2396Xc annotations) {
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        this.a = annotations;
    }

    @Override // defpackage.AbstractC5022l62
    public final C2755ad a(AbstractC5022l62 abstractC5022l62) {
        C2755ad c2755ad = (C2755ad) abstractC5022l62;
        return c2755ad == null ? this : new C2755ad(C5208m0.g(this.a, c2755ad.a));
    }

    @Override // defpackage.AbstractC5022l62
    @NotNull
    public final RI0<? extends C2755ad> b() {
        return C2017Sp1.a.b(C2755ad.class);
    }

    @Override // defpackage.AbstractC5022l62
    public final C2755ad c(AbstractC5022l62 abstractC5022l62) {
        if (Intrinsics.a((C2755ad) abstractC5022l62, this)) {
            return this;
        }
        return null;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof C2755ad) {
            return Intrinsics.a(((C2755ad) obj).a, this.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
