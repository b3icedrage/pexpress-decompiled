package defpackage;

import android.os.Handler;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: Vx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2273Vx {

    @NonNull
    public final C4606j72.a a;

    @NonNull
    public final Handler b;

    public C2273Vx(@NonNull C4606j72.a aVar, @NonNull Handler handler) {
        this.a = aVar;
        this.b = handler;
    }

    public final void a(@NonNull C3415dh0.a aVar) {
        int i = aVar.b;
        Handler handler = this.b;
        C4606j72.a aVar2 = this.a;
        if (i == 0) {
            handler.post(new RunnableC2117Tx(aVar2, aVar.a));
        } else {
            handler.post(new RunnableC2195Ux(aVar2, i));
        }
    }
}
