package androidx.profileinstaller;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.annotation.NonNull;
import defpackage.InterfaceC5879pA0;
import defpackage.RunnableC6528sH;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements InterfaceC5879pA0<c> {

    public static class a {
        public static void a(final Runnable runnable) {
            Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: ki1
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j) {
                    runnable.run();
                }
            });
        }
    }

    public static class b {
        public static Handler a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    public static class c {
    }

    @Override // defpackage.InterfaceC5879pA0
    @NonNull
    public final List<Class<? extends InterfaceC5879pA0<?>>> a() {
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.InterfaceC5879pA0
    @NonNull
    public final c b(@NonNull Context context) {
        a.a(new RunnableC6528sH(1, this, context.getApplicationContext()));
        return new c();
    }
}
