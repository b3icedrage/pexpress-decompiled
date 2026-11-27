package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: v82, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7132v82<Output> implements InterfaceC7015uc1<Output> {

    @NotNull
    public final C3388da1.d a;

    public C7132v82(@NotNull C3388da1.d operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        this.a = operation;
    }

    @Override // defpackage.InterfaceC7015uc1
    @NotNull
    public final Object a(InterfaceC2928bN interfaceC2928bN, @NotNull String input, int i) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.a.invoke(interfaceC2928bN);
        return Integer.valueOf(i);
    }
}
