package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class G50 extends C1273Jc0 {

    @NotNull
    public final C4923kf e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G50(@NotNull C4923kf appData, @NotNull Oc2 validator) {
        super(validator);
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(validator, "validator");
        this.e = appData;
    }

    @Override // defpackage.C1273Jc0
    @NotNull
    public final EnumC6594sc0 b() {
        C6945uG c6945uG = (C6945uG) this.e.k.getValue();
        return Intrinsics.a(c6945uG != null ? c6945uG.b : null, this.c) ? EnumC6594sc0.e : EnumC6594sc0.d;
    }

    @Override // defpackage.C1273Jc0
    @NotNull
    public final AbstractC0961Fc0 c() {
        C6945uG c6945uG = (C6945uG) this.e.k.getValue();
        return Intrinsics.a(c6945uG != null ? c6945uG.b : null, this.c) ? new L51(EnumC6594sc0.e) : super.c();
    }
}
