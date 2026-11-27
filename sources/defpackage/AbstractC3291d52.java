package defpackage;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: renamed from: d52, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3291d52 implements Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ((C4411iS) this).j.get().close();
    }
}
