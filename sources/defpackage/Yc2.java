package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public class Yc2 extends AbstractC3191cd2 implements Xc2 {
    public final int j;
    public final boolean k;
    public final boolean l;
    public final boolean m;

    @Nullable
    public final AbstractC4649jL0 n;

    @NotNull
    public final Xc2 o;

    public static final class a extends Yc2 {

        @NotNull
        public final KW1 p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull InterfaceC2076Tj0 containingDeclaration, @Nullable Xc2 xc2, int i, @NotNull InterfaceC2396Xc annotations, @NotNull C5638o21 name, @NotNull AbstractC4649jL0 outType, boolean z, boolean z2, boolean z3, @Nullable AbstractC4649jL0 abstractC4649jL0, @NotNull VN1 source, @NotNull Function0 destructuringVariables) {
            super(containingDeclaration, xc2, i, annotations, name, outType, z, z2, z3, abstractC4649jL0, source);
            Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
            Intrinsics.checkNotNullParameter(annotations, "annotations");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(outType, "outType");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(destructuringVariables, "destructuringVariables");
            this.p = XO0.b(destructuringVariables);
        }

        @Override // defpackage.Yc2, defpackage.Xc2
        @NotNull
        public final Xc2 c0(@NotNull C2496Yj0 newOwner, @NotNull C5638o21 newName, int i) {
            Intrinsics.checkNotNullParameter(newOwner, "newOwner");
            Intrinsics.checkNotNullParameter(newName, "newName");
            InterfaceC2396Xc interfaceC2396XcK = k();
            Intrinsics.checkNotNullExpressionValue(interfaceC2396XcK, "<get-annotations>(...)");
            AbstractC4649jL0 type = getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            boolean zZ0 = z0();
            VN1.a NO_SOURCE = VN1.a;
            Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
            WI0 wi0 = new WI0(this, 2);
            return new a(newOwner, null, i, interfaceC2396XcK, newName, type, zZ0, this.l, this.m, this.n, NO_SOURCE, wi0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Yc2(@NotNull InterfaceC1335Jx containingDeclaration, @Nullable Xc2 xc2, int i, @NotNull InterfaceC2396Xc annotations, @NotNull C5638o21 name, @NotNull AbstractC4649jL0 outType, boolean z, boolean z2, boolean z3, @Nullable AbstractC4649jL0 abstractC4649jL0, @NotNull VN1 source) {
        super(containingDeclaration, annotations, name, outType, source);
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(outType, "outType");
        Intrinsics.checkNotNullParameter(source, "source");
        this.j = i;
        this.k = z;
        this.l = z2;
        this.m = z3;
        this.n = abstractC4649jL0;
        this.o = xc2 == null ? this : xc2;
    }

    @Override // defpackage.IU1
    public final InterfaceC5095lU b(X62 substitutor) {
        Intrinsics.checkNotNullParameter(substitutor, "substitutor");
        if (substitutor.a.f()) {
            return this;
        }
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.Xc2
    @NotNull
    public Xc2 c0(@NotNull C2496Yj0 newOwner, @NotNull C5638o21 newName, int i) {
        Intrinsics.checkNotNullParameter(newOwner, "newOwner");
        Intrinsics.checkNotNullParameter(newName, "newName");
        InterfaceC2396Xc interfaceC2396XcK = k();
        Intrinsics.checkNotNullExpressionValue(interfaceC2396XcK, "<get-annotations>(...)");
        AbstractC4649jL0 type = getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        boolean zZ0 = z0();
        VN1.a NO_SOURCE = VN1.a;
        Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
        return new Yc2(newOwner, null, i, interfaceC2396XcK, newName, type, zZ0, this.l, this.m, this.n, NO_SOURCE);
    }

    @Override // defpackage.InterfaceC5938pU, defpackage.GY0
    @NotNull
    public final AbstractC5533nZ d() {
        C5323mZ.i LOCAL = C5323mZ.f;
        Intrinsics.checkNotNullExpressionValue(LOCAL, "LOCAL");
        return LOCAL;
    }

    @Override // defpackage.InterfaceC2982bd2
    public final /* bridge */ /* synthetic */ CK d0() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC4675jU
    public final <R, D> R e0(@NotNull InterfaceC5518nU<R, D> visitor, D d) {
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        StringBuilder builder = (StringBuilder) d;
        Intrinsics.checkNotNullParameter(this, "descriptor");
        Intrinsics.checkNotNullParameter(builder, "builder");
        C2964bZ.this.h0(this, true, builder, true);
        return (R) Unit.a;
    }

    @Override // defpackage.Xc2
    public final boolean f0() {
        return this.m;
    }

    @Override // defpackage.Xc2
    public final boolean j0() {
        return this.l;
    }

    @Override // defpackage.Xc2
    public final int l() {
        return this.j;
    }

    @Override // defpackage.InterfaceC2982bd2
    public final boolean p0() {
        return false;
    }

    @Override // defpackage.Xc2
    @Nullable
    public final AbstractC4649jL0 q0() {
        return this.n;
    }

    @Override // defpackage.InterfaceC1335Jx
    @NotNull
    public final Collection<Xc2> u() {
        Collection<? extends InterfaceC1335Jx> collectionU = e().u();
        Intrinsics.checkNotNullExpressionValue(collectionU, "getOverriddenDescriptors(...)");
        Collection<? extends InterfaceC1335Jx> collection = collectionU;
        ArrayList arrayList = new ArrayList(XE.m(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC1335Jx) it.next()).j().get(this.j));
        }
        return arrayList;
    }

    @Override // defpackage.Xc2
    public final boolean z0() {
        if (!this.k) {
            return false;
        }
        InterfaceC1490Lx.a aVarH = ((InterfaceC1490Lx) e()).h();
        aVarH.getClass();
        return aVarH != InterfaceC1490Lx.a.e;
    }

    @Override // defpackage.AbstractC5308mU, defpackage.InterfaceC4675jU
    @NotNull
    public final InterfaceC1335Jx e() {
        InterfaceC4675jU interfaceC4675jUE = super.e();
        Intrinsics.c(interfaceC4675jUE, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        return (InterfaceC1335Jx) interfaceC4675jUE;
    }

    @Override // defpackage.AbstractC5308mU, defpackage.AbstractC4885kU, defpackage.InterfaceC4675jU, defpackage.InterfaceC1335Jx
    @NotNull
    /* JADX INFO: renamed from: a */
    public final Xc2 U0() {
        Xc2 xc2 = this.o;
        return xc2 == this ? this : xc2.U0();
    }
}
