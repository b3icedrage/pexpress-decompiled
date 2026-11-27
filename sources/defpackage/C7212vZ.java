package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: vZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7212vZ extends AC implements InterfaceC7002uZ {

    @NotNull
    public final C2155Uj1 J;

    @NotNull
    public final InterfaceC5848p21 K;

    @NotNull
    public final C2656a72 L;

    @NotNull
    public final C5761od2 M;

    @Nullable
    public final BI0 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7212vZ(@NotNull FC containingDeclaration, @Nullable InterfaceC3550eL interfaceC3550eL, @NotNull InterfaceC2396Xc annotations, boolean z, @NotNull InterfaceC1490Lx.a kind, @NotNull C2155Uj1 proto, @NotNull InterfaceC5848p21 nameResolver, @NotNull C2656a72 typeTable, @NotNull C5761od2 versionRequirementTable, @Nullable BI0 bi0, @Nullable VN1 vn1) {
        super(containingDeclaration, interfaceC3550eL, annotations, z, kind, vn1 == null ? VN1.a : vn1);
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        Intrinsics.checkNotNullParameter(versionRequirementTable, "versionRequirementTable");
        this.J = proto;
        this.K = nameResolver;
        this.L = typeTable;
        this.M = versionRequirementTable;
        this.N = bi0;
    }

    @Override // defpackage.AbstractC2314Wj0, defpackage.GY0
    public final boolean D() {
        return false;
    }

    @Override // defpackage.QZ
    public final HZ0 J() {
        return this.J;
    }

    @Override // defpackage.AbstractC2314Wj0, defpackage.InterfaceC2076Tj0
    public final boolean V() {
        return false;
    }

    @Override // defpackage.AC, defpackage.AbstractC2314Wj0
    public final /* bridge */ /* synthetic */ AbstractC2314Wj0 V0(InterfaceC2396Xc interfaceC2396Xc, InterfaceC1490Lx.a aVar, InterfaceC4675jU interfaceC4675jU, InterfaceC2076Tj0 interfaceC2076Tj0, C5638o21 c5638o21, VN1 vn1) {
        return i1(interfaceC4675jU, interfaceC2076Tj0, aVar, interfaceC2396Xc, vn1);
    }

    @Override // defpackage.QZ
    @NotNull
    public final C2656a72 Z() {
        return this.L;
    }

    @Override // defpackage.AC
    /* JADX INFO: renamed from: e1 */
    public final /* bridge */ /* synthetic */ AC V0(InterfaceC2396Xc interfaceC2396Xc, InterfaceC1490Lx.a aVar, InterfaceC4675jU interfaceC4675jU, InterfaceC2076Tj0 interfaceC2076Tj0, C5638o21 c5638o21, VN1 vn1) {
        return i1(interfaceC4675jU, interfaceC2076Tj0, aVar, interfaceC2396Xc, vn1);
    }

    @Override // defpackage.QZ
    @NotNull
    public final InterfaceC5848p21 i0() {
        return this.K;
    }

    @NotNull
    public final C7212vZ i1(@NotNull InterfaceC4675jU newOwner, @Nullable InterfaceC2076Tj0 interfaceC2076Tj0, @NotNull InterfaceC1490Lx.a kind, @NotNull InterfaceC2396Xc annotations, @NotNull VN1 source) {
        Intrinsics.checkNotNullParameter(newOwner, "newOwner");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(source, "source");
        C7212vZ c7212vZ = new C7212vZ((FC) newOwner, (InterfaceC3550eL) interfaceC2076Tj0, annotations, this.I, kind, this.J, this.K, this.L, this.M, this.N, source);
        c7212vZ.A = this.A;
        return c7212vZ;
    }

    @Override // defpackage.QZ
    @Nullable
    public final MZ k0() {
        return this.N;
    }

    @Override // defpackage.AbstractC2314Wj0, defpackage.InterfaceC2076Tj0
    public final boolean m() {
        return false;
    }

    @Override // defpackage.AbstractC2314Wj0, defpackage.InterfaceC2076Tj0
    public final boolean z() {
        return false;
    }
}
