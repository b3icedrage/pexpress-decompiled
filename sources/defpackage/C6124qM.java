package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: qM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6124qM extends Y0 implements InterfaceC1488Lw0 {

    @NotNull
    public final FC c;

    @Nullable
    public final C5638o21 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6124qM(@NotNull FC classDescriptor, @NotNull AbstractC4649jL0 receiverType, @Nullable C5638o21 c5638o21) {
        super(receiverType, null);
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        Intrinsics.checkNotNullParameter(receiverType, "receiverType");
        this.c = classDescriptor;
        this.d = c5638o21;
    }

    @Override // defpackage.InterfaceC1488Lw0
    @Nullable
    public final C5638o21 a() {
        return this.d;
    }

    @NotNull
    public final String toString() {
        return getType() + ": Ctx { " + this.c + " }";
    }
}
