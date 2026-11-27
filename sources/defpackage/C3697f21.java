package defpackage;

import java.lang.ref.SoftReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: f21, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3697f21<T> {

    @NotNull
    public volatile SoftReference<T> a = new SoftReference<>(null);

    public final synchronized T a(@NotNull Function0<? extends T> factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        T t = this.a.get();
        if (t != null) {
            return t;
        }
        T tInvoke = factory.invoke();
        this.a = new SoftReference<>(tInvoke);
        return tInvoke;
    }
}
