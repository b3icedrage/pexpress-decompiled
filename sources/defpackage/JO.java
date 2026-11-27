package defpackage;

import io.sentry.android.ndk.c;
import io.sentry.android.replay.capture.w;
import io.sentry.ndk.NativeScope;
import io.sentry.util.f;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class JO implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;

    public /* synthetic */ JO(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.g = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                LO lo = (LO) this.e;
                MO moB = lo.b((QZ1) this.g);
                if (moB != null) {
                    lo.a.add(moB);
                }
                break;
            case 1:
                ((c) this.e).b.getClass();
                NativeScope.nativeRemoveExtra((String) this.g);
                break;
            default:
                f.a((File) this.e);
                ((w) this.g).i(-1);
                break;
        }
    }
}
