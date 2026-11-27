package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: qw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC6246qw0 {

    /* JADX INFO: renamed from: qw0$a */
    public static final class a {
        public final Context a;
        public final KV b;
        public final double c;
        public final boolean d;
        public final boolean e;
        public final boolean f;
        public final boolean g;

        public a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Context context2 = context.getApplicationContext();
            this.a = context2;
            this.b = KV.i;
            Intrinsics.checkNotNullExpressionValue(context2, "applicationContext");
            Intrinsics.checkNotNullParameter(context2, "context");
            double d = 0.2d;
            try {
                Object systemService = C6333rM.getSystemService(context2, ActivityManager.class);
                if (systemService == null) {
                    throw new IllegalStateException(("System service of type " + ActivityManager.class + " was not found.").toString());
                }
                if (((ActivityManager) systemService).isLowRamDevice()) {
                    d = 0.15d;
                }
                this.c = d;
                this.d = true;
                this.e = true;
                this.f = true;
                this.g = true;
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: qw0$b */
    public static final class b {
        @NotNull
        public static C4750jo1 a(@NotNull Context context) {
            int largeMemoryClass;
            OS1 c1602Nh0;
            Intrinsics.checkNotNullParameter(context, "context");
            a aVar = new a(context);
            Context context2 = aVar.a;
            Intrinsics.checkNotNullExpressionValue(context2, "applicationContext");
            Intrinsics.checkNotNullParameter(context2, "context");
            try {
                Object systemService = C6333rM.getSystemService(context2, ActivityManager.class);
                if (systemService == null) {
                    throw new IllegalStateException(("System service of type " + ActivityManager.class + " was not found.").toString());
                }
                ActivityManager activityManager = (ActivityManager) systemService;
                largeMemoryClass = (context2.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                double d = aVar.c * ((double) largeMemoryClass);
                double d2 = UserVerificationMethods.USER_VERIFY_ALL;
                long j = (long) (d * d2 * d2);
                int i = (int) (0.0d * j);
                int i2 = (int) (j - ((long) i));
                C2509Yn1 c2509Yn1 = new C2509Yn1(i);
                Kf2 weakMemoryCache = aVar.g ? new C7272vo1() : C3686f.d;
                InterfaceC1086Gs referenceCounter = aVar.e ? new C2587Zn1(weakMemoryCache, c2509Yn1) : C3712f60.a;
                Intrinsics.checkNotNullParameter(weakMemoryCache, "weakMemoryCache");
                Intrinsics.checkNotNullParameter(referenceCounter, "referenceCounter");
                if (i2 > 0) {
                    c1602Nh0 = new C6642so1(weakMemoryCache, referenceCounter, i2);
                } else {
                    c1602Nh0 = weakMemoryCache instanceof C7272vo1 ? new C1602Nh0(weakMemoryCache) : MP0.d;
                }
                OS1 os1 = c1602Nh0;
                Context applicationContext = aVar.a;
                Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
                C6036pw0 initializer = new C6036pw0(aVar);
                C2813ao0 c2813ao0 = C4316i.a;
                Intrinsics.checkNotNullParameter(initializer, "initializer");
                C4106h c4106h = new C4106h(XO0.b(initializer));
                C7551x80 c7551x80 = InterfaceC7761y80.a.a;
                C5653o60 c5653o60 = C5653o60.d;
                return new C4750jo1(applicationContext, aVar.b, c2509Yn1, referenceCounter, os1, weakMemoryCache, c4106h, new C5899pH(c5653o60, c5653o60, c5653o60, c5653o60), aVar.d, aVar.f);
            } catch (Exception unused) {
                largeMemoryClass = UserVerificationMethods.USER_VERIFY_HANDPRINT;
            }
        }
    }

    @NotNull
    InterfaceC7527x20 a(@NotNull C7716xw0 c7716xw0);
}
