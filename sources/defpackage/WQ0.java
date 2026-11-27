package defpackage;

import androidx.lifecycle.LiveData;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class WQ0<T> implements InterfaceC1179Hx<T, LiveData<C4705jd<T>>> {

    @NotNull
    public final Type a;

    @NotNull
    public final InterfaceC5889pD1 b;

    @NotNull
    public final C4705jd.a c;

    public WQ0(@NotNull Type responseType, @NotNull InterfaceC5889pD1 schedulers, @NotNull C4705jd.a responseFactory) {
        Intrinsics.checkNotNullParameter(responseType, "responseType");
        Intrinsics.checkNotNullParameter(schedulers, "schedulers");
        Intrinsics.checkNotNullParameter(responseFactory, "responseFactory");
        this.a = responseType;
        this.b = schedulers;
        this.c = responseFactory;
    }

    @Override // defpackage.InterfaceC1179Hx
    @NotNull
    public final Type a() {
        return this.a;
    }

    @Override // defpackage.InterfaceC1179Hx
    public final Object b(C6291r81 call) {
        Intrinsics.checkNotNullParameter(call, "call");
        return new VQ0(this, call);
    }
}
