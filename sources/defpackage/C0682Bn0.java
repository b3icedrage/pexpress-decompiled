package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Bn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0682Bn0 {

    @Nullable
    private static volatile Choreographer choreographer;

    static {
        Object objA;
        try {
            C1717Ot1.a aVar = C1717Ot1.e;
            objA = new C7899yn0(b(Looper.getMainLooper()), false);
        } catch (Throwable th) {
            C1717Ot1.a aVar2 = C1717Ot1.e;
            objA = C1795Pt1.a(th);
        }
        if (objA instanceof C1717Ot1.b) {
            objA = null;
        }
    }

    public static final void a(C6251qy c6251qy) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            choreographer2 = Choreographer.getInstance();
            Intrinsics.checkNotNull(choreographer2);
            choreographer = choreographer2;
        }
        choreographer2.postFrameCallback(new ChoreographerFrameCallbackC0604An0(c6251qy));
    }

    @NotNull
    public static final Handler b(@NotNull Looper looper) throws IllegalAccessException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 28) {
            Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            Intrinsics.c(objInvoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) objInvoke;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }

    @Nullable
    public static final Object c(@NotNull AW1 frame) {
        Choreographer choreographer2 = choreographer;
        int i = 1;
        if (choreographer2 != null) {
            C6251qy c6251qy = new C6251qy(1, C5885pC0.b(frame));
            c6251qy.r();
            choreographer2.postFrameCallback(new ChoreographerFrameCallbackC0604An0(c6251qy));
            Object objQ = c6251qy.q();
            if (objQ == MN.d) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
            return objQ;
        }
        C6251qy c6251qy2 = new C6251qy(1, C5885pC0.b(frame));
        c6251qy2.r();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            a(c6251qy2);
        } else {
            RV rv = C6266r20.a;
            QV0.a.c1(c6251qy2.i, new RunnableC4535iq(c6251qy2, i));
        }
        Object objQ2 = c6251qy2.q();
        if (objQ2 == MN.d) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objQ2;
    }
}
