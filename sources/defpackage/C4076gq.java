package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: gq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4076gq {

    @NotNull
    public final Context a;

    @Nullable
    public final ViewOnTouchListenerC3656eq b;

    /* JADX INFO: renamed from: gq$a */
    public static final class a {

        @Nullable
        public String a;

        @Nullable
        public String b;
        public boolean c;
        public boolean d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;
        public int j;
        public int k;
        public int l;

        @Nullable
        public C6634sm0 m;
    }

    public C4076gq(Context context, a aVar) {
        this.a = context;
        Intrinsics.checkNotNullParameter(context, "context");
        ViewOnTouchListenerC3656eq viewOnTouchListenerC3656eq = new ViewOnTouchListenerC3656eq(context, null, 0);
        viewOnTouchListenerC3656eq.k = 2000L;
        viewOnTouchListenerC3656eq.l = 80;
        Looper looperMyLooper = Looper.myLooper();
        Intrinsics.checkNotNull(looperMyLooper);
        viewOnTouchListenerC3656eq.z = new Handler(looperMyLooper);
        this.b = viewOnTouchListenerC3656eq;
        viewOnTouchListenerC3656eq.setParams(aVar);
    }
}
