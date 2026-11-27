package defpackage;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class KB0 implements InterfaceC6494s62 {

    @NotNull
    public final LinkedHashSet a;

    @NotNull
    public final KW1 b;

    public KB0() {
        throw null;
    }

    public KB0(LinkedHashSet linkedHashSet) {
        C5655o62.e.getClass();
        C5655o62 attributes = C5655o62.g;
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(this, "constructor");
        C5492nL0.d(R70.a(K70.INTEGER_LITERAL_TYPE_SCOPE, true, "unknown integer literal type"), attributes, this, C5653o60.d, false);
        this.b = XO0.b(new U(this, 1));
        this.a = linkedHashSet;
    }

    @Override // defpackage.InterfaceC6494s62
    @NotNull
    public final Collection<AbstractC4649jL0> a() {
        return (List) this.b.getValue();
    }

    @Override // defpackage.InterfaceC6494s62
    @NotNull
    public final List<H62> b() {
        return C5653o60.d;
    }

    @Override // defpackage.InterfaceC6494s62
    @Nullable
    public final InterfaceC5044lD c() {
        return null;
    }

    @Override // defpackage.InterfaceC6494s62
    public final boolean e() {
        return false;
    }

    @Override // defpackage.InterfaceC6494s62
    @NotNull
    public final RK0 t() {
        throw null;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("IntegerLiteralType");
        sb.append("[" + CollectionsKt.J(this.a, ",", null, null, C8138zx.g, 30) + ']');
        return sb.toString();
    }
}
