package defpackage;

import androidx.lifecycle.LiveData;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class Z31 {

    @NotNull
    public final EY0<C3457dt1<Object>> a;
    public final /* synthetic */ ML0 b;
    public final /* synthetic */ ML0 c;

    /* JADX WARN: Multi-variable type inference failed */
    public Z31(Function0<? extends LiveData<C4705jd<Object>>> function0, Function1<Object, Object> function1, InterfaceC5889pD1 schedulers) {
        this.b = (ML0) function0;
        this.c = (ML0) function1;
        Intrinsics.checkNotNullParameter(schedulers, "schedulers");
        this.a = new EY0<>();
        schedulers.b().execute(new DF0(this, 1));
    }
}
