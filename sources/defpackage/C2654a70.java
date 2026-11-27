package defpackage;

import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: a70, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2654a70 implements InterfaceC1583Nc {

    @NotNull
    public static final C2654a70 a = new C2654a70();

    @Override // defpackage.InterfaceC1583Nc
    @Nullable
    public final C1758Ph0 c() {
        FC fcD = C4900kZ.d(this);
        if (fcD != null) {
            if (R70.f(fcD)) {
                fcD = null;
            }
            if (fcD != null) {
                return C4900kZ.c(fcD);
            }
        }
        return null;
    }

    @Override // defpackage.InterfaceC1583Nc
    @NotNull
    public final AbstractC4649jL0 getType() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    @Override // defpackage.InterfaceC1583Nc
    @NotNull
    public final VN1 i() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    @Override // defpackage.InterfaceC1583Nc
    @NotNull
    public final Map<C5638o21, CK<?>> j() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    @NotNull
    public final String toString() {
        return "[EnhancedType]";
    }
}
