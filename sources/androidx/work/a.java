package androidx.work;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import defpackage.C5027l8;
import defpackage.KI;
import defpackage.OV;
import defpackage.Wk2;
import defpackage.Xk2;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    @NonNull
    public final ExecutorService a = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new KI(false));

    @NonNull
    public final ExecutorService b = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new KI(true));

    @NonNull
    public final Xk2 c;

    @NonNull
    public final C5027l8 d;

    @NonNull
    public final OV e;
    public final int f;
    public final int g;
    public final int h;

    /* JADX INFO: renamed from: androidx.work.a$a, reason: collision with other inner class name */
    public static final class C0241a {
        public Xk2 a;
    }

    public interface b {
        @NonNull
        a a();
    }

    public a(@NonNull C0241a c0241a) {
        Xk2 xk2 = c0241a.a;
        if (xk2 == null) {
            String str = Xk2.a;
            this.c = new Wk2();
        } else {
            this.c = xk2;
        }
        this.d = new C5027l8();
        this.e = new OV();
        this.f = 4;
        this.g = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.h = 20;
    }
}
