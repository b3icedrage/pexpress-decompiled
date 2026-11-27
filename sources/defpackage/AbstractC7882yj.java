package defpackage;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: yj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7882yj<T> implements Iterable<T>, InterfaceC6745tJ0 {
    public abstract int b();

    public abstract void c(int i, @NotNull AbstractC5022l62 abstractC5022l62);

    @Nullable
    public abstract T get(int i);

    @Override // java.lang.Iterable
    public abstract Iterator<T> iterator();
}
