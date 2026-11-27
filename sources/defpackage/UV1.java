package defpackage;

import androidx.lifecycle.e;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class UV1 extends ML0 implements Function0<VP> {
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UV1(InterfaceC3770fO0 interfaceC3770fO0) {
        super(0);
        this.d = interfaceC3770fO0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [fO0, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final VP invoke() {
        Wd2 wd2 = (Wd2) this.d.getValue();
        e eVar = wd2 instanceof e ? (e) wd2 : null;
        return eVar != null ? eVar.getDefaultViewModelCreationExtras() : VP.a.b;
    }
}
