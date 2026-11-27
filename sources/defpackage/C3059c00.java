package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: c00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3059c00 extends C3975gM1 implements InterfaceC7002uZ {

    @NotNull
    public final C2575Zj1 I;

    @NotNull
    public final InterfaceC5848p21 J;

    @NotNull
    public final C2656a72 K;

    @NotNull
    public final C5761od2 L;

    @Nullable
    public final BI0 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3059c00(@NotNull InterfaceC4675jU containingDeclaration, @Nullable InterfaceC3765fM1 interfaceC3765fM1, @NotNull InterfaceC2396Xc annotations, @NotNull C5638o21 name, @NotNull InterfaceC1490Lx.a kind, @NotNull C2575Zj1 proto, @NotNull InterfaceC5848p21 nameResolver, @NotNull C2656a72 typeTable, @NotNull C5761od2 versionRequirementTable, @Nullable BI0 bi0, @Nullable VN1 vn1) {
        super(containingDeclaration, interfaceC3765fM1, annotations, name, kind, vn1 == null ? VN1.a : vn1);
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        Intrinsics.checkNotNullParameter(versionRequirementTable, "versionRequirementTable");
        this.I = proto;
        this.J = nameResolver;
        this.K = typeTable;
        this.L = versionRequirementTable;
        this.M = bi0;
    }

    @Override // defpackage.QZ
    public final HZ0 J() {
        return this.I;
    }

    @Override // defpackage.C3975gM1, defpackage.AbstractC2314Wj0
    @NotNull
    public final AbstractC2314Wj0 V0(@NotNull InterfaceC2396Xc annotations, @NotNull InterfaceC1490Lx.a kind, @NotNull InterfaceC4675jU newOwner, @Nullable InterfaceC2076Tj0 interfaceC2076Tj0, @Nullable C5638o21 c5638o21, @NotNull VN1 source) {
        C5638o21 c5638o22;
        Intrinsics.checkNotNullParameter(newOwner, "newOwner");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(source, "source");
        InterfaceC3765fM1 interfaceC3765fM1 = (InterfaceC3765fM1) interfaceC2076Tj0;
        if (c5638o21 == null) {
            C5638o21 name = getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            c5638o22 = name;
        } else {
            c5638o22 = c5638o21;
        }
        C3059c00 c3059c00 = new C3059c00(newOwner, interfaceC3765fM1, annotations, c5638o22, kind, this.I, this.J, this.K, this.L, this.M, source);
        c3059c00.A = this.A;
        return c3059c00;
    }

    @Override // defpackage.QZ
    @NotNull
    public final C2656a72 Z() {
        return this.K;
    }

    @Override // defpackage.QZ
    @NotNull
    public final InterfaceC5848p21 i0() {
        return this.J;
    }

    @Override // defpackage.QZ
    @Nullable
    public final MZ k0() {
        return this.M;
    }
}
