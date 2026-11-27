package androidx.emoji2.text;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import androidx.annotation.NonNull;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.emoji2.text.a;
import androidx.emoji2.text.c;
import androidx.emoji2.text.d;
import androidx.emoji2.text.f;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.ProcessLifecycleInitializer;
import defpackage.C7454wh;
import defpackage.FP0;
import defpackage.G02;
import defpackage.InterfaceC5879pA0;
import defpackage.RH;
import defpackage.SH;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements InterfaceC5879pA0<Boolean> {

    public static class a extends androidx.emoji2.text.c.AbstractC0231c {
    }

    public static class b implements androidx.emoji2.text.c.f {
        public final Context a;

        public b(Context context) {
            this.a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.c.f
        public final void a(@NonNull final androidx.emoji2.text.c.g gVar) {
            final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new RH("EmojiCompatInitializer"));
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            threadPoolExecutor.execute(new Runnable() { // from class: N50
                @Override // java.lang.Runnable
                public final void run() {
                    EmojiCompatInitializer.b bVar = this.d;
                    c.g gVar2 = gVar;
                    ThreadPoolExecutor threadPoolExecutor2 = threadPoolExecutor;
                    bVar.getClass();
                    try {
                        f fVarA = a.a(bVar.a);
                        if (fVarA == null) {
                            throw new RuntimeException("EmojiCompat font provider not available on this device.");
                        }
                        f.b bVar2 = (f.b) fVarA.a;
                        synchronized (bVar2.d) {
                            bVar2.f = threadPoolExecutor2;
                        }
                        fVarA.a.a(new d(gVar2, threadPoolExecutor2));
                    } catch (Throwable th) {
                        gVar2.a(th);
                        threadPoolExecutor2.shutdown();
                    }
                }
            });
        }
    }

    public static class c implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            try {
                int i = G02.a;
                Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                if (androidx.emoji2.text.c.j != null) {
                    androidx.emoji2.text.c.a().c();
                }
            } finally {
                int i2 = G02.a;
                Trace.endSection();
            }
        }
    }

    @Override // defpackage.InterfaceC5879pA0
    @NonNull
    public final List<Class<? extends InterfaceC5879pA0<?>>> a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // defpackage.InterfaceC5879pA0
    @NonNull
    public final Boolean b(@NonNull Context context) {
        Object objB;
        a aVar = new a(new b(context));
        aVar.b = 1;
        if (androidx.emoji2.text.c.j == null) {
            synchronized (androidx.emoji2.text.c.i) {
                try {
                    if (androidx.emoji2.text.c.j == null) {
                        androidx.emoji2.text.c.j = new androidx.emoji2.text.c(aVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        C7454wh c7454whC = C7454wh.c(context);
        c7454whC.getClass();
        synchronized (C7454wh.e) {
            try {
                objB = c7454whC.a.get(ProcessLifecycleInitializer.class);
                if (objB == null) {
                    objB = c7454whC.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        final androidx.lifecycle.g lifecycle = ((FP0) objB).getLifecycle();
        lifecycle.a(new DefaultLifecycleObserver(this) { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final void onResume(@NonNull FP0 fp0) {
                (Build.VERSION.SDK_INT >= 28 ? SH.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new c(), 500L);
                lifecycle.c(this);
            }
        });
        return Boolean.TRUE;
    }
}
