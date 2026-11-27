package androidx.lifecycle;

import defpackage.C7279vr;
import defpackage.InterfaceC3770fO0;
import defpackage.ML0;
import defpackage.Qd2;
import defpackage.RI0;
import defpackage.VP;
import defpackage.Vd2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class v<VM extends Qd2> implements InterfaceC3770fO0<VM> {

    @NotNull
    public final RI0<VM> d;

    @NotNull
    public final ML0 e;

    @NotNull
    public final Function0<x.b> g;

    @NotNull
    public final ML0 h;

    @Nullable
    public VM i;

    /* JADX WARN: Multi-variable type inference failed */
    public v(@NotNull RI0<VM> viewModelClass, @NotNull Function0<? extends Vd2> storeProducer, @NotNull Function0<? extends x.b> factoryProducer, @NotNull Function0<? extends VP> extrasProducer) {
        Intrinsics.checkNotNullParameter(viewModelClass, "viewModelClass");
        Intrinsics.checkNotNullParameter(storeProducer, "storeProducer");
        Intrinsics.checkNotNullParameter(factoryProducer, "factoryProducer");
        Intrinsics.checkNotNullParameter(extrasProducer, "extrasProducer");
        this.d = viewModelClass;
        this.e = (ML0) storeProducer;
        this.g = factoryProducer;
        this.h = (ML0) extrasProducer;
    }

    @Override // defpackage.InterfaceC3770fO0
    public final boolean d() {
        return this.i != null;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ML0, kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r3v0, types: [ML0, kotlin.jvm.functions.Function0] */
    @Override // defpackage.InterfaceC3770fO0
    public final Object getValue() {
        VM vm = this.i;
        if (vm != null) {
            return vm;
        }
        VM vm2 = (VM) new x((Vd2) this.e.invoke(), this.g.invoke(), (VP) this.h.invoke()).a(C7279vr.g(this.d));
        this.i = vm2;
        return vm2;
    }
}
