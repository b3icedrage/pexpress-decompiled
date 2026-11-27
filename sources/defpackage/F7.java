package defpackage;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class F7<T> {
    public final int a;

    @Nullable
    public final RA b;

    public F7() {
        this(4, null);
    }

    public final T a() {
        T t = (T) this.b;
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("There is no data in ".concat(getClass().getSimpleName()));
    }

    public F7(int i, @Nullable RA ra) {
        this.a = i;
        this.b = ra;
    }
}
