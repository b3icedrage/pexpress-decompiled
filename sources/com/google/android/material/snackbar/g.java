package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class g {
    public static g e;

    @NonNull
    public final Object a = new Object();

    @NonNull
    public final Handler b = new Handler(Looper.getMainLooper(), new a());
    public c c;
    public c d;

    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(@NonNull Message message) {
            if (message.what != 0) {
                return false;
            }
            g gVar = g.this;
            c cVar = (c) message.obj;
            synchronized (gVar.a) {
                try {
                    if (gVar.c == cVar || gVar.d == cVar) {
                        gVar.a(cVar, 2);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
    }

    public interface b {
        void a(int i);

        void b();
    }

    public static class c {

        @NonNull
        public final WeakReference<b> a;
        public int b;
        public boolean c;

        public c(int i, BaseTransientBottomBar.c cVar) {
            this.a = new WeakReference<>(cVar);
            this.b = i;
        }
    }

    public static g b() {
        if (e == null) {
            e = new g();
        }
        return e;
    }

    public final boolean a(@NonNull c cVar, int i) {
        b bVar = cVar.a.get();
        if (bVar == null) {
            return false;
        }
        this.b.removeCallbacksAndMessages(cVar);
        bVar.a(i);
        return true;
    }

    public final boolean c(b bVar) {
        c cVar = this.c;
        return (cVar == null || bVar == null || cVar.a.get() != bVar) ? false : true;
    }

    public final void d(BaseTransientBottomBar.c cVar) {
        synchronized (this.a) {
            try {
                if (c(cVar)) {
                    c cVar2 = this.c;
                    if (!cVar2.c) {
                        cVar2.c = true;
                        this.b.removeCallbacksAndMessages(cVar2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(BaseTransientBottomBar.c cVar) {
        synchronized (this.a) {
            try {
                if (c(cVar)) {
                    c cVar2 = this.c;
                    if (cVar2.c) {
                        cVar2.c = false;
                        f(cVar2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(@NonNull c cVar) {
        int i = cVar.b;
        if (i == -2) {
            return;
        }
        if (i <= 0) {
            i = i == -1 ? ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED : 2750;
        }
        Handler handler = this.b;
        handler.removeCallbacksAndMessages(cVar);
        handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), i);
    }
}
