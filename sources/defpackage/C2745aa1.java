package defpackage;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: aa1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2745aa1<T> {
    public final T a;

    public C2745aa1() {
        this.a = null;
    }

    public final T a() {
        T t = this.a;
        if (t != null) {
            return t;
        }
        throw new NoSuchElementException("No value present");
    }

    public final boolean b() {
        return this.a != null;
    }

    public C2745aa1(T t) {
        if (t != null) {
            this.a = t;
            return;
        }
        throw new NullPointerException("value for optional is empty.");
    }
}
