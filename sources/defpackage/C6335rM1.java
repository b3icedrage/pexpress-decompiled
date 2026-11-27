package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: rM1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6335rM1 extends AbstractC4426iX {

    @NotNull
    public final C5655o62 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6335rM1(@NotNull AbstractC5706oM1 delegate, @NotNull C5655o62 attributes) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.g = attributes;
    }

    @Override // defpackage.AbstractC4216hX, defpackage.AbstractC4649jL0
    @NotNull
    public final C5655o62 U0() {
        return this.g;
    }

    @Override // defpackage.AbstractC4216hX
    public final AbstractC4216hX g1(AbstractC5706oM1 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        return new C6335rM1(delegate, this.g);
    }
}
