package defpackage;

import android.os.Handler;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: As1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0620As1<T> implements Runnable {

    @NonNull
    public CallableC2996bh0 d;

    @NonNull
    public C3205ch0 e;

    @NonNull
    public Handler g;

    /* JADX INFO: renamed from: As1$a */
    public class a implements Runnable {
        public final /* synthetic */ C3205ch0 d;
        public final /* synthetic */ Object e;

        public a(C3205ch0 c3205ch0, Object obj) {
            this.d = c3205ch0;
            this.e = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            this.d.a(this.e);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objCall;
        try {
            objCall = this.d.call();
        } catch (Exception unused) {
            objCall = null;
        }
        this.g.post(new a(this.e, objCall));
    }
}
