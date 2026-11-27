package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class DM extends Y0 implements InterfaceC1488Lw0 {

    @NotNull
    public final AbstractC5308mU c;

    @Nullable
    public final C5638o21 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DM(@NotNull InterfaceC1335Jx declarationDescriptor, @NotNull AbstractC4649jL0 receiverType, @Nullable C5638o21 c5638o21, @Nullable InterfaceC1232Io1 interfaceC1232Io1) {
        super(receiverType, interfaceC1232Io1);
        Intrinsics.checkNotNullParameter(declarationDescriptor, "declarationDescriptor");
        Intrinsics.checkNotNullParameter(receiverType, "receiverType");
        this.c = (AbstractC5308mU) declarationDescriptor;
        this.d = c5638o21;
    }

    @Override // defpackage.InterfaceC1488Lw0
    @Nullable
    public final C5638o21 a() {
        return this.d;
    }

    @NotNull
    public final String toString() {
        return "Cxt { " + this.c + " }";
    }
}
