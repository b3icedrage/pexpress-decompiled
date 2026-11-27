package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: b00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2850b00 extends C0749Cj1 implements InterfaceC7002uZ {

    @NotNull
    public final C3637ek1 E;

    @NotNull
    public final InterfaceC5848p21 F;

    @NotNull
    public final C2656a72 G;

    @NotNull
    public final C5761od2 H;

    @Nullable
    public final BI0 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2850b00(@NotNull InterfaceC4675jU containingDeclaration, @Nullable InterfaceC0671Bj1 interfaceC0671Bj1, @NotNull InterfaceC2396Xc annotations, @NotNull C01 modality, @NotNull AbstractC5533nZ visibility, boolean z, @NotNull C5638o21 name, @NotNull InterfaceC1490Lx.a kind, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, @NotNull C3637ek1 proto, @NotNull InterfaceC5848p21 nameResolver, @NotNull C2656a72 typeTable, @NotNull C5761od2 versionRequirementTable, @Nullable BI0 bi0) {
        super(containingDeclaration, interfaceC0671Bj1, annotations, modality, visibility, z, name, kind, VN1.a, z2, z3, z6, z4, z5);
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(modality, "modality");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        Intrinsics.checkNotNullParameter(versionRequirementTable, "versionRequirementTable");
        this.E = proto;
        this.F = nameResolver;
        this.G = typeTable;
        this.H = versionRequirementTable;
        this.I = bi0;
    }

    @Override // defpackage.C0749Cj1, defpackage.GY0
    public final boolean D() {
        return C1742Pc.f(C2061Te0.E, this.E.h, "get(...)");
    }

    @Override // defpackage.QZ
    public final HZ0 J() {
        return this.E;
    }

    @Override // defpackage.C0749Cj1
    @NotNull
    public final C0749Cj1 X0(@NotNull InterfaceC4675jU newOwner, @NotNull C01 newModality, @NotNull AbstractC5533nZ newVisibility, @Nullable InterfaceC0671Bj1 interfaceC0671Bj1, @NotNull InterfaceC1490Lx.a kind, @NotNull C5638o21 newName) {
        VN1.a source = VN1.a;
        Intrinsics.checkNotNullParameter(newOwner, "newOwner");
        Intrinsics.checkNotNullParameter(newModality, "newModality");
        Intrinsics.checkNotNullParameter(newVisibility, "newVisibility");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(newName, "newName");
        Intrinsics.checkNotNullParameter(source, "source");
        return new C2850b00(newOwner, interfaceC0671Bj1, k(), newModality, newVisibility, this.j, newName, kind, this.r, this.s, D(), this.v, this.t, this.E, this.F, this.G, this.H, this.I);
    }

    @Override // defpackage.QZ
    @NotNull
    public final C2656a72 Z() {
        return this.G;
    }

    @Override // defpackage.QZ
    @NotNull
    public final InterfaceC5848p21 i0() {
        return this.F;
    }

    @Override // defpackage.QZ
    @Nullable
    public final MZ k0() {
        return this.I;
    }
}
