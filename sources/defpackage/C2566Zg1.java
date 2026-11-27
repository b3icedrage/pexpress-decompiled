package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: Zg1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2566Zg1<Z> extends ER<Z> {
    public static final Handler i = new Handler(Looper.getMainLooper(), new a());
    public final ComponentCallbacks2C1166Hs1 h;

    /* JADX INFO: renamed from: Zg1$a */
    public class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            C2566Zg1 c2566Zg1 = (C2566Zg1) message.obj;
            c2566Zg1.h.l(c2566Zg1);
            return true;
        }
    }

    public C2566Zg1(ComponentCallbacks2C1166Hs1 componentCallbacks2C1166Hs1) {
        this.h = componentCallbacks2C1166Hs1;
    }

    @Override // defpackage.InterfaceC5529nX1
    public final void j(@NonNull Z z, H42<? super Z> h42) {
        InterfaceC4762js1 interfaceC4762js1 = this.g;
        if (interfaceC4762js1 == null || !interfaceC4762js1.l()) {
            return;
        }
        i.obtainMessage(1, this).sendToTarget();
    }

    @Override // defpackage.InterfaceC5529nX1
    public final void k(Drawable drawable) {
    }
}
