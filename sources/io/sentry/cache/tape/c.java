package io.sentry.cache.tape;

import java.io.Closeable;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c<T> implements Iterable<T>, Closeable {

    public interface a<T> {
        void a(T t, OutputStream outputStream);

        @Nullable
        T b(byte[] bArr);
    }

    public abstract void c(T t);

    public void clear() {
        q(size());
    }

    public final List<T> f() {
        int iMin = Math.min(size(), size());
        ArrayList arrayList = new ArrayList(iMin);
        Iterator<T> it = iterator();
        for (int i = 0; i < iMin; i++) {
            arrayList.add(it.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public abstract void q(int i);

    public abstract int size();
}
