package androidx.emoji2.text;

import androidx.annotation.NonNull;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public final class d extends c.g {
    public final /* synthetic */ c.g a;
    public final /* synthetic */ ThreadPoolExecutor b;

    public d(c.g gVar, ThreadPoolExecutor threadPoolExecutor) {
        this.a = gVar;
        this.b = threadPoolExecutor;
    }

    @Override // androidx.emoji2.text.c.g
    public final void a(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.b;
        try {
            this.a.a(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // androidx.emoji2.text.c.g
    public final void b(@NonNull g gVar) {
        ThreadPoolExecutor threadPoolExecutor = this.b;
        try {
            this.a.b(gVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
