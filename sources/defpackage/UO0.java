package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class UO0 extends QO0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UO0(@NotNull LO0 c) {
        super(null, c);
        Intrinsics.checkNotNullParameter(c, "c");
    }

    @Override // defpackage.QO0
    public void n(@NotNull C5638o21 name, @NotNull ArrayList result) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(result, "result");
    }

    @Override // defpackage.QO0
    @Nullable
    public final InterfaceC1076Go1 p() {
        return null;
    }

    @Override // defpackage.QO0
    @NotNull
    public final QO0.a s(@NotNull InterfaceC7991zE0 method, @NotNull ArrayList methodTypeParameters, @NotNull AbstractC4649jL0 returnType, @NotNull List valueParameters) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(methodTypeParameters, "methodTypeParameters");
        Intrinsics.checkNotNullParameter(returnType, "returnType");
        Intrinsics.checkNotNullParameter(valueParameters, "valueParameters");
        return new QO0.a(returnType, valueParameters, methodTypeParameters, C5653o60.d);
    }
}
