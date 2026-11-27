package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import androidx.annotation.NonNull;
import defpackage.C1332Jw;
import defpackage.C2409Xg0;
import defpackage.C2487Yg0;
import defpackage.C3834fh0;
import defpackage.C4044gh0;
import defpackage.RH;
import defpackage.RunnableC2555Zd;
import defpackage.U0;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class f extends c.AbstractC0231c {
    public static final a d = new a();

    public static class a {
    }

    public static class b implements c.f {

        @NonNull
        public final Context a;

        @NonNull
        public final C2487Yg0 b;

        @NonNull
        public final a c;

        @NonNull
        public final Object d;
        public Handler e;
        public ThreadPoolExecutor f;
        public ThreadPoolExecutor g;
        public c.g h;

        public b(@NonNull Context context, @NonNull C2487Yg0 c2487Yg0) {
            a aVar = f.d;
            this.d = new Object();
            U0.f(context, "Context cannot be null");
            this.a = context.getApplicationContext();
            this.b = c2487Yg0;
            this.c = aVar;
        }

        @Override // androidx.emoji2.text.c.f
        public final void a(@NonNull c.g gVar) {
            synchronized (this.d) {
                this.h = gVar;
            }
            synchronized (this.d) {
                try {
                    if (this.h == null) {
                        return;
                    }
                    if (this.f == null) {
                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new RH("emojiCompat"));
                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                        this.g = threadPoolExecutor;
                        this.f = threadPoolExecutor;
                    }
                    this.f.execute(new RunnableC2555Zd(this, 4));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void b() {
            synchronized (this.d) {
                try {
                    this.h = null;
                    Handler handler = this.e;
                    if (handler != null) {
                        handler.removeCallbacks(null);
                    }
                    this.e = null;
                    ThreadPoolExecutor threadPoolExecutor = this.g;
                    if (threadPoolExecutor != null) {
                        threadPoolExecutor.shutdown();
                    }
                    this.f = null;
                    this.g = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final C4044gh0 c() {
            try {
                a aVar = this.c;
                Context context = this.a;
                C2487Yg0 c2487Yg0 = this.b;
                aVar.getClass();
                C3834fh0 c3834fh0A = C2409Xg0.a(context, c2487Yg0);
                int i = c3834fh0A.a;
                if (i != 0) {
                    throw new RuntimeException(C1332Jw.a(i, "fetchFonts failed (", ")"));
                }
                C4044gh0[] c4044gh0Arr = c3834fh0A.b;
                if (c4044gh0Arr == null || c4044gh0Arr.length == 0) {
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                return c4044gh0Arr[0];
            } catch (PackageManager.NameNotFoundException e) {
                throw new RuntimeException("provider not found", e);
            }
        }
    }
}
