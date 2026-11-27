package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: pM1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5916pM1 extends AbstractC5706oM1 {

    @NotNull
    public final InterfaceC6494s62 e;

    @NotNull
    public final List<N62> g;
    public final boolean h;

    @NotNull
    public final QY0 i;

    @NotNull
    public final Function1<AbstractC6331rL0, AbstractC5706oM1> j;

    /* JADX WARN: Multi-variable type inference failed */
    public C5916pM1(@NotNull InterfaceC6494s62 constructor, @NotNull List<? extends N62> arguments, boolean z, @NotNull QY0 memberScope, @NotNull Function1<? super AbstractC6331rL0, ? extends AbstractC5706oM1> refinedTypeFactory) {
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(memberScope, "memberScope");
        Intrinsics.checkNotNullParameter(refinedTypeFactory, "refinedTypeFactory");
        this.e = constructor;
        this.g = arguments;
        this.h = z;
        this.i = memberScope;
        this.j = refinedTypeFactory;
        if (!(memberScope instanceof J70) || (memberScope instanceof UY1)) {
            return;
        }
        throw new IllegalStateException("SimpleTypeImpl should not be created for error type: " + memberScope + '\n' + constructor);
    }

    @Override // defpackage.AbstractC4649jL0
    @NotNull
    public final List<N62> T0() {
        return this.g;
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
        return this.h;
    }

    @Override // defpackage.AbstractC4649jL0
    public final AbstractC4649jL0 X0(AbstractC6331rL0 kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        AbstractC5706oM1 abstractC5706oM1Invoke = this.j.invoke(kotlinTypeRefiner);
        return abstractC5706oM1Invoke == null ? this : abstractC5706oM1Invoke;
    }

    @Override // defpackage.P92
    /* JADX INFO: renamed from: a1 */
    public final P92 X0(AbstractC6331rL0 kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        AbstractC5706oM1 abstractC5706oM1Invoke = this.j.invoke(kotlinTypeRefiner);
        return abstractC5706oM1Invoke == null ? this : abstractC5706oM1Invoke;
    }

    @Override // defpackage.AbstractC5706oM1
    @NotNull
    /* JADX INFO: renamed from: c1 */
    public final AbstractC5706oM1 Z0(boolean z) {
        if (z == this.h) {
            return this;
        }
        if (z) {
            Intrinsics.checkNotNullParameter(this, "delegate");
            return new C6287r71(this);
        }
        Intrinsics.checkNotNullParameter(this, "delegate");
        return new J51(this);
    }

    @Override // defpackage.AbstractC5706oM1
    @NotNull
    /* JADX INFO: renamed from: d1 */
    public final AbstractC5706oM1 b1(@NotNull C5655o62 newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return newAttributes.isEmpty() ? this : new C6335rM1(this, newAttributes);
    }

    @Override // defpackage.AbstractC4649jL0
    @NotNull
    public final QY0 v() {
        return this.i;
    }
}
