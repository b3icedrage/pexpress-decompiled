package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import java.util.ArrayList;

/* JADX INFO: renamed from: Jl0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1300Jl0 {
    public final C3774fP1 a;
    public final Handler b;
    public final ArrayList c;
    public final ComponentCallbacks2C1166Hs1 d;
    public final InterfaceC0930Es e;
    public boolean f;
    public boolean g;
    public C6025ps1<Bitmap> h;
    public a i;
    public boolean j;
    public a k;
    public Bitmap l;
    public InterfaceC6486s42<Bitmap> m;
    public a n;
    public int o;
    public int p;
    public int q;

    /* JADX INFO: renamed from: Jl0$a */
    public static class a extends ER<Bitmap> {
        public final Handler h;
        public final int i;
        public final long j;
        public Bitmap k;

        public a(Handler handler, int i, long j) {
            this.h = handler;
            this.i = i;
            this.j = j;
        }

        @Override // defpackage.InterfaceC5529nX1
        public final void j(@NonNull Object obj, H42 h42) {
            this.k = (Bitmap) obj;
            Handler handler = this.h;
            handler.sendMessageAtTime(handler.obtainMessage(1, this), this.j);
        }

        @Override // defpackage.InterfaceC5529nX1
        public final void k(Drawable drawable) {
            this.k = null;
        }
    }

    /* JADX INFO: renamed from: Jl0$b */
    public interface b {
        void b();
    }

    /* JADX INFO: renamed from: Jl0$c */
    public class c implements Handler.Callback {
        public c() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i = message.what;
            C1300Jl0 c1300Jl0 = C1300Jl0.this;
            if (i == 1) {
                c1300Jl0.b((a) message.obj);
                return true;
            }
            if (i != 2) {
                return false;
            }
            c1300Jl0.d.l((a) message.obj);
            return false;
        }
    }

    public C1300Jl0(com.bumptech.glide.a aVar, C3774fP1 c3774fP1, int i, int i2, K82 k82, Bitmap bitmap) {
        InterfaceC0930Es interfaceC0930Es = aVar.d;
        C2082Tl0 c2082Tl0 = aVar.g;
        ComponentCallbacks2C1166Hs1 componentCallbacks2C1166Hs1C = com.bumptech.glide.a.c(c2082Tl0.getBaseContext());
        C6025ps1<Bitmap> c6025ps1J = com.bumptech.glide.a.c(c2082Tl0.getBaseContext()).f().a(((C1400Ks1) ((C1400Ks1) new C1400Ks1().h(AbstractC2634a20.b).H()).A()).s(i, i2));
        this.c = new ArrayList();
        this.d = componentCallbacks2C1166Hs1C;
        Handler handler = new Handler(Looper.getMainLooper(), new c());
        this.e = interfaceC0930Es;
        this.b = handler;
        this.h = c6025ps1J;
        this.a = c3774fP1;
        c(k82, bitmap);
    }

    public final void a() {
        int i;
        int i2;
        if (!this.f || this.g) {
            return;
        }
        a aVar = this.n;
        if (aVar != null) {
            this.n = null;
            b(aVar);
            return;
        }
        this.g = true;
        C3774fP1 c3774fP1 = this.a;
        C1456Ll0 c1456Ll0 = c3774fP1.l;
        int i3 = c1456Ll0.c;
        if (i3 <= 0 || (i2 = c3774fP1.k) < 0) {
            i = 0;
        } else {
            i = (i2 < 0 || i2 >= i3) ? -1 : ((C1222Il0) c1456Ll0.e.get(i2)).i;
        }
        long jUptimeMillis = SystemClock.uptimeMillis() + ((long) i);
        c3774fP1.b();
        this.k = new a(this.b, c3774fP1.k, jUptimeMillis);
        C6025ps1 c6025ps1P = this.h.a(new C1400Ks1().z(new M71(Double.valueOf(Math.random())))).P(c3774fP1);
        c6025ps1P.M(this.k, null, c6025ps1P, C3387da0.a);
    }

    public final void b(a aVar) {
        this.g = false;
        boolean z = this.j;
        Handler handler = this.b;
        if (z) {
            handler.obtainMessage(2, aVar).sendToTarget();
            return;
        }
        if (!this.f) {
            this.n = aVar;
            return;
        }
        if (aVar.k != null) {
            Bitmap bitmap = this.l;
            if (bitmap != null) {
                this.e.c(bitmap);
                this.l = null;
            }
            a aVar2 = this.i;
            this.i = aVar;
            ArrayList arrayList = this.c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((b) arrayList.get(size)).b();
            }
            if (aVar2 != null) {
                handler.obtainMessage(2, aVar2).sendToTarget();
            }
        }
        a();
    }

    public final void c(InterfaceC6486s42<Bitmap> interfaceC6486s42, Bitmap bitmap) {
        UE.e(interfaceC6486s42, "Argument must not be null");
        this.m = interfaceC6486s42;
        UE.e(bitmap, "Argument must not be null");
        this.l = bitmap;
        this.h = this.h.a(new C1400Ks1().F(interfaceC6486s42, true));
        this.o = C6177qc2.c(bitmap);
        this.p = bitmap.getWidth();
        this.q = bitmap.getHeight();
    }
}
