package defpackage;

import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class JY1 {

    @NotNull
    public final CoroutineContext a;

    @NotNull
    public final Object[] b;

    @NotNull
    public final BY1<Object>[] c;
    public int d;

    public JY1(int i, @NotNull CoroutineContext coroutineContext) {
        this.a = coroutineContext;
        this.b = new Object[i];
        this.c = new BY1[i];
    }
}
