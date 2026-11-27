package defpackage;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: nU0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CallableC5519nU0 implements Callable {
    public final /* synthetic */ WeakReference d;
    public final /* synthetic */ Context e;
    public final /* synthetic */ int g;
    public final /* synthetic */ String h;

    public /* synthetic */ CallableC5519nU0(WeakReference weakReference, Context context, int i, String str) {
        this.d = weakReference;
        this.e = context;
        this.g = i;
        this.h = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Context context = (Context) this.d.get();
        if (context == null) {
            context = this.e;
        }
        return C5729oU0.e(context, this.g, this.h);
    }
}
