package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: renamed from: st1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6657st1 {
    public boolean a;
    public final Handler b = new Handler(Looper.getMainLooper(), new a());

    /* JADX INFO: renamed from: st1$a */
    public static final class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((InterfaceC3667et1) message.obj).b();
            return true;
        }
    }

    public final synchronized void a(InterfaceC3667et1<?> interfaceC3667et1, boolean z) {
        try {
            if (this.a || z) {
                this.b.obtainMessage(1, interfaceC3667et1).sendToTarget();
            } else {
                this.a = true;
                interfaceC3667et1.b();
                this.a = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
