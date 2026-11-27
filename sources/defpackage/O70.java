package defpackage;

import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class O70 extends AbstractC5706oM1 {

    @NotNull
    public final InterfaceC6494s62 e;

    @NotNull
    public final J70 g;

    @NotNull
    public final Q70 h;

    @NotNull
    public final List<N62> i;
    public final boolean j;

    @NotNull
    public final String[] k;

    @NotNull
    public final String l;

    public O70(@NotNull InterfaceC6494s62 constructor, @NotNull J70 memberScope, @NotNull Q70 kind, @NotNull List arguments, boolean z, @NotNull String... formatParams) {
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(memberScope, "memberScope");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(formatParams, "formatParams");
        this.e = constructor;
        this.g = memberScope;
        this.h = kind;
        this.i = arguments;
        this.j = z;
        this.k = formatParams;
        String str = kind.d;
        Object[] objArrCopyOf = Arrays.copyOf(formatParams, formatParams.length);
        String str2 = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        this.l = str2;
    }

    @Override // defpackage.AbstractC4649jL0
    @NotNull
    public final List<N62> T0() {
        return this.i;
    }

    @Override // defpackage.AbstractC4649jL0
    @NotNull
    public final C5655o62 U0() {
        C5655o62.e.getClass();
        return C5655o62.g;
    }

    @Override // defpackage.AbstractC4649jL0
    @NotNull
    public final InterfaceC6494s62 V0() {
        return this.e;
    }

    @Override // defpackage.AbstractC4649jL0
    public final boolean W0() {
        return this.j;
    }

    @Override // defpackage.AbstractC4649jL0
    public final AbstractC4649jL0 X0(AbstractC6331rL0 kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // defpackage.P92
    /* JADX INFO: renamed from: a1 */
    public final P92 X0(AbstractC6331rL0 kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // defpackage.AbstractC5706oM1, defpackage.P92
    public final P92 b1(C5655o62 newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return this;
    }

    @Override // defpackage.AbstractC5706oM1
    @NotNull
    /* JADX INFO: renamed from: c1 */
    public final AbstractC5706oM1 Z0(boolean z) {
        String[] strArr = this.k;
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        return new O70(this.e, this.g, this.h, this.i, z, strArr2);
    }

    @Override // defpackage.AbstractC5706oM1
    @NotNull
    /* JADX INFO: renamed from: d1 */
    public final AbstractC5706oM1 b1(@NotNull C5655o62 newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return this;
    }

    @Override // defpackage.AbstractC4649jL0
    @NotNull
    public final QY0 v() {
        return this.g;
    }
}
