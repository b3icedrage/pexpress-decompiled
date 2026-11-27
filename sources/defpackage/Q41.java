package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class Q41 implements InterfaceC6510sB {

    @NotNull
    public static final Q41 a = new Q41();

    @Override // defpackage.InterfaceC6510sB
    public final boolean a(@NotNull AE0 functionDescriptor) {
        Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
        List<Xc2> listJ = functionDescriptor.j();
        Intrinsics.checkNotNullExpressionValue(listJ, "getValueParameters(...)");
        if (listJ != null && listJ.isEmpty()) {
            return true;
        }
        for (Xc2 xc2 : listJ) {
            Intrinsics.checkNotNull(xc2);
            if (C4900kZ.a(xc2) || xc2.q0() != null) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.InterfaceC6510sB
    @Nullable
    public final String b(@NotNull AE0 ae0) {
        return InterfaceC6510sB.a.a(this, ae0);
    }

    @Override // defpackage.InterfaceC6510sB
    @NotNull
    public final String getDescription() {
        return "should not have varargs or parameters with default values";
    }
}
