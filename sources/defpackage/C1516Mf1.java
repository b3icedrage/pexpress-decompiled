package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Mf1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1516Mf1<T> extends C1361Kf1<T> {

    @NotNull
    public final Object c;

    public C1516Mf1(int i) {
        super(i);
        this.c = new Object();
    }

    @Override // defpackage.C1361Kf1
    @Nullable
    public final T a() {
        T t;
        synchronized (this.c) {
            t = (T) super.a();
        }
        return t;
    }

    @Override // defpackage.C1361Kf1
    public final boolean b(@NotNull T instance) {
        boolean zB;
        Intrinsics.checkNotNullParameter(instance, "instance");
        synchronized (this.c) {
            zB = super.b(instance);
        }
        return zB;
    }
}
