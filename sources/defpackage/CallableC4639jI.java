package defpackage;

import java.io.FileOutputStream;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: jI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CallableC4639jI implements Callable {
    public final /* synthetic */ C5059lI d;
    public final /* synthetic */ C5272mI e;

    public /* synthetic */ CallableC4639jI(C5059lI c5059lI, C5272mI c5272mI) {
        this.d = c5059lI;
        this.e = c5272mI;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C5059lI c5059lI = this.d;
        C5272mI c5272mI = this.e;
        AI ai = c5059lI.b;
        synchronized (ai) {
            FileOutputStream fileOutputStreamOpenFileOutput = ai.a.openFileOutput(ai.b, 0);
            try {
                fileOutputStreamOpenFileOutput.write(c5272mI.a.toString().getBytes("UTF-8"));
                fileOutputStreamOpenFileOutput.close();
            } catch (Throwable th) {
                fileOutputStreamOpenFileOutput.close();
                throw th;
            }
        }
        return null;
    }
}
