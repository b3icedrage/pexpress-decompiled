package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class EU<T, R> extends DU<T, R> implements JM<R> {

    @NotNull
    public OH0 d;

    @Nullable
    public Unit e;

    @Nullable
    public JM<Object> g;

    @NotNull
    public Object h;

    @Override // defpackage.DU
    @Nullable
    public final void a(Unit unit, @NotNull PH0 frame) {
        this.g = frame;
        this.e = unit;
        MN mn = MN.d;
        Intrinsics.checkNotNullParameter(frame, "frame");
    }

    @Override // defpackage.JM
    @NotNull
    public final CoroutineContext getContext() {
        return e.d;
    }

    @Override // defpackage.JM
    public final void resumeWith(@NotNull Object obj) {
        this.g = null;
        this.h = obj;
    }
}
