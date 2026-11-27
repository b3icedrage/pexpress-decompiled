package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: androidx.recyclerview.widget.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2804c<T> {

    @NonNull
    public final ExecutorService a;

    @NonNull
    public final p.e<T> b;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.c$a */
    public static final class a<T> {
        public static final Object a = new Object();
        public static ExecutorService b;
    }

    public C2804c(@NonNull ExecutorService executorService, @NonNull p.e eVar) {
        this.a = executorService;
        this.b = eVar;
    }
}
