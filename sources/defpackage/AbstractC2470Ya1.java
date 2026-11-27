package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Ya1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2470Ya1 extends AbstractC5308mU implements InterfaceC2392Xa1 {

    @NotNull
    public final C1758Ph0 i;

    @NotNull
    public final String j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2470Ya1(@NotNull S01 module, @NotNull C1758Ph0 fqName) {
        super(module, InterfaceC2396Xc.a.a, fqName.g(), VN1.a);
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        this.i = fqName;
        this.j = "package " + fqName + " of " + module;
    }

    @Override // defpackage.InterfaceC2392Xa1
    @NotNull
    public final C1758Ph0 c() {
        return this.i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC4675jU
    public final <R, D> R e0(@NotNull InterfaceC5518nU<R, D> visitor, D d) {
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        StringBuilder builder = (StringBuilder) d;
        Intrinsics.checkNotNullParameter(this, "descriptor");
        Intrinsics.checkNotNullParameter(builder, "builder");
        C2964bZ c2964bZ = C2964bZ.this;
        c2964bZ.getClass();
        c2964bZ.U(this.i, "package-fragment", builder);
        if (c2964bZ.d.n()) {
            builder.append(" in ");
            c2964bZ.Q(e(), builder, false);
        }
        return (R) Unit.a;
    }

    @Override // defpackage.AbstractC5308mU, defpackage.InterfaceC5728oU
    @NotNull
    public VN1 i() {
        VN1.a NO_SOURCE = VN1.a;
        Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
        return NO_SOURCE;
    }

    @Override // defpackage.AbstractC4885kU
    @NotNull
    public String toString() {
        return this.j;
    }

    @Override // defpackage.AbstractC5308mU, defpackage.InterfaceC4675jU
    @NotNull
    public final S01 e() {
        InterfaceC4675jU interfaceC4675jUE = super.e();
        Intrinsics.c(interfaceC4675jUE, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ModuleDescriptor");
        return (S01) interfaceC4675jUE;
    }
}
