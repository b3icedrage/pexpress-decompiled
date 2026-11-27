package defpackage;

import com.impl.core.backend.responseModels.Deposit;
import java.util.Comparator;

/* JADX INFO: renamed from: nM0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5495nM0<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return BG.a(Long.valueOf(((Deposit) t2).getServerTimeMs()), Long.valueOf(((Deposit) t).getServerTimeMs()));
    }
}
