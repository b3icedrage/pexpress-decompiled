package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: cL0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3132cL0 implements MZ {

    @NotNull
    public final InterfaceC2699aL0 b;

    public C3132cL0(@NotNull InterfaceC2699aL0 binaryClass, @NotNull LZ abiStability) {
        Intrinsics.checkNotNullParameter(binaryClass, "binaryClass");
        Intrinsics.checkNotNullParameter(abiStability, "abiStability");
        this.b = binaryClass;
    }

    @Override // defpackage.VN1
    @NotNull
    public final void a() {
        WN1.a NO_SOURCE_FILE = WN1.a;
        Intrinsics.checkNotNullExpressionValue(NO_SOURCE_FILE, "NO_SOURCE_FILE");
    }

    @NotNull
    public final String toString() {
        return C3132cL0.class.getSimpleName() + ": " + this.b;
    }
}
