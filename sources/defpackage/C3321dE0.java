package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: dE0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3321dE0 implements CC {

    @NotNull
    public final C1705Op1 a;

    @NotNull
    public final PZ b;

    public C3321dE0(@NotNull PZ deserializedDescriptorResolver, @NotNull C1705Op1 kotlinClassFinder) {
        Intrinsics.checkNotNullParameter(kotlinClassFinder, "kotlinClassFinder");
        Intrinsics.checkNotNullParameter(deserializedDescriptorResolver, "deserializedDescriptorResolver");
        this.a = kotlinClassFinder;
        this.b = deserializedDescriptorResolver;
    }

    @Override // defpackage.CC
    @Nullable
    public final BC a(@NotNull QC classId) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        PZ pz = this.b;
        InterfaceC2699aL0 interfaceC2699aL0A = TK0.a(this.a, classId, C5027l8.t(pz.c().c));
        if (interfaceC2699aL0A == null) {
            return null;
        }
        C4753jp1.a(((C1627Np1) interfaceC2699aL0A).a).equals(classId);
        return pz.f(interfaceC2699aL0A);
    }
}
