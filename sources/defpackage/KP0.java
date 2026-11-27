package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.lifecycle.g;
import androidx.lifecycle.u;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LKP0;", "Landroid/app/Service;", "LFP0;", "<init>", "()V", "lifecycle-service_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class KP0 extends Service implements FP0 {

    @NotNull
    public final u d = new u(this);

    @Override // defpackage.FP0
    @NotNull
    public final g getLifecycle() {
        return this.d.a;
    }

    @Override // android.app.Service
    @Nullable
    public final IBinder onBind(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        this.d.a(g.a.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.d.a(g.a.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        g.a aVar = g.a.ON_STOP;
        u uVar = this.d;
        uVar.a(aVar);
        uVar.a(g.a.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(@Nullable Intent intent, int i) {
        this.d.a(g.a.ON_START);
        super.onStart(intent, i);
    }
}
