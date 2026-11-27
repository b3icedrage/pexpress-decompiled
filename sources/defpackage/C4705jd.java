package defpackage;

import java.util.TreeMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: jd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4705jd<T> {
    public final int a;

    @Nullable
    public final T b;

    @Nullable
    public final TreeMap c;

    @Nullable
    public final Throwable d;

    /* JADX INFO: renamed from: jd$a */
    public interface a {
        @NotNull
        <T> C4705jd<T> a(@NotNull C0935Et1<T> c0935Et1);

        @NotNull
        <T> C4705jd<T> b(@NotNull Throwable th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4705jd(int i, @Nullable Object obj, @Nullable TreeMap treeMap, @Nullable Throwable th) {
        this.a = i;
        this.b = obj;
        this.c = treeMap;
        this.d = th;
    }
}
