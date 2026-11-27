package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class A51 extends C6792tZ {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A51(@NotNull C2720aS0 storageManager, @NotNull Function0 compute) {
        super(storageManager, compute);
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(compute, "compute");
    }

    @Override // defpackage.C6792tZ, defpackage.InterfaceC2396Xc
    public final boolean isEmpty() {
        return false;
    }
}
