package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Ia0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1189Ia0 extends Y0 {
    public final AbstractC5308mU c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1189Ia0(@NotNull InterfaceC1335Jx interfaceC1335Jx, @NotNull AbstractC4649jL0 abstractC4649jL0, @Nullable InterfaceC1232Io1 interfaceC1232Io1) {
        super(abstractC4649jL0, interfaceC1232Io1);
        if (abstractC4649jL0 == null) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "receiverType", "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver", "<init>"));
        }
        this.c = (AbstractC5308mU) interfaceC1335Jx;
    }

    public final String toString() {
        return getType() + ": Ext {" + this.c + "}";
    }
}
